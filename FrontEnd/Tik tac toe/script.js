let boxes = document.querySelectorAll(".box");
let turnO = true; // O starts
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
            return;
        }
    }

    // Optional: Check for draw
    let allFilled = [...boxes].every(box => box.innerText !== "");
    if (allFilled) {
        msg.innerText = "It's a draw!";
        msgContainer.classList.remove("hide");
        disabledBoxes();
    }
};

boxes.forEach((box) => {
    box.addEventListener("click", () => {
        if (turnO) {
            box.innerText = "O";
            turnO = false;
        } else {
            box.innerText = "X";
            turnO = true;
        }
        box.disabled = true;
        checkWinner();
    });
});

const resetGame = () => {
    turnO = true;
    for (let box of boxes) {
        box.disabled = false;
        box.innerText = "";
    }
    msgContainer.classList.add("hide");
};
