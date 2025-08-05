let boxes = document.querySelectorAll(".box");
let turnO = true; // true = player (O), false = computer (X)
const msg = document.getElementById("msg");
const msgContainer = document.getElementById("msgContainer");

const winningPattern = [
    [0, 1, 2],
    [0, 3, 6],
    [0, 4, 8],
    [1, 4, 7],
    [2, 5, 8],
    [2, 4, 6],
    [3, 4, 5],
    [6, 7, 8],
];

const disabledBoxes = () => {
    for (let box of boxes) {
        box.disabled = true;
    }
};

const showWinner = (winner) => {
    msg.innerText = `Congratulations, Winner is ${winner}`;
    msgContainer.classList.remove("hide");
    disabledBoxes();
};

const checkWinner = () => {
    for (let pattern of winningPattern) {
        let pos1 = boxes[pattern[0]].innerText;
        let pos2 = boxes[pattern[1]].innerText;
        let pos3 = boxes[pattern[2]].innerText;

        if (pos1 !== "" && pos1 === pos2 && pos2 === pos3) {
            showWinner(pos1);
            return true;
        }
    }

    // Check for draw
    let allFilled = [...boxes].every(box => box.innerText !== "");
    if (allFilled) {
        msg.innerText = "It's a draw!";
        msgContainer.classList.remove("hide");
        disabledBoxes();
        return true;
    }
    return false;
};

// Minimax evaluation
const evaluateBoard = () => {
    for (let pattern of winningPattern) {
        let a = boxes[pattern[0]].innerText;
        let b = boxes[pattern[1]].innerText;
        let c = boxes[pattern[2]].innerText;

        if (a !== "" && a === b && b === c) {
            return a === "X" ? 1 : a === "O" ? -1 : 0;
        }
    }

    if ([...boxes].every(box => box.innerText !== "")) {
        return 0; // Draw
    }

    return null; // Game still going
};

// Minimax Algorithm
const minimax = (newBoxes, depth, isMaximizing) => {
    let result = evaluateBoard();
    if (result !== null) return result;

    if (isMaximizing) {
        let bestScore = -Infinity;
        newBoxes.forEach((box, i) => {
            if (box.innerText === "") {
                box.innerText = "X";
                let score = minimax(newBoxes, depth + 1, false);
                box.innerText = "";
                bestScore = Math.max(score, bestScore);
            }
        });
        return bestScore;
    } else {
        let bestScore = Infinity;
        newBoxes.forEach((box, i) => {
            if (box.innerText === "") {
                box.innerText = "O";
                let score = minimax(newBoxes, depth + 1, true);
                box.innerText = "";
                bestScore = Math.min(score, bestScore);
            }
        });
        return bestScore;
    }
};

// Computer move using Minimax
const computerMove = () => {
    let bestScore = -Infinity;
    let move;

    boxes.forEach((box, index) => {
        if (box.innerText === "") {
            box.innerText = "X";
            let score = minimax(boxes, 0, false);
            box.innerText = "";
            if (score > bestScore) {
                bestScore = score;
                move = index;
            }
        }
    });

    if (move !== undefined) {
        boxes[move].innerText = "X";
        boxes[move].disabled = true;
    }

    if (!checkWinner()) {
        turnO = true;
    }
};

// Player move
boxes.forEach((box) => {
    box.addEventListener("click", () => {
        if (turnO && box.innerText === "") {
            box.innerText = "O";
            box.disabled = true;
            turnO = false;

            if (!checkWinner()) {
                setTimeout(computerMove, 300); // Delay for realism
            }
        }
    });
});

// Reset game
const resetGame = () => {
    turnO = true;
    for (let box of boxes) {
        box.disabled = false;
        box.innerText = "";
    }
    msgContainer.classList.add("hide");
};
