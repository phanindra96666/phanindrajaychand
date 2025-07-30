const target = document.getElementById('target');
const scoreEl = document.getElementById('score');
const timeEl = document.getElementById('time');
const startPauseBtn = document.getElementById('startBtn');

let score = 0;
let time = 30;
let timerInterval;
let gameStarted = false;
let gamePaused = false;

// Get random position within the window
function getRandomPosition() {
  const x = Math.floor(Math.random() * (window.innerWidth - 60)); // 60 for target width
  const y = Math.floor(Math.random() * (window.innerHeight - 60)); // 60 for target height
  return { x, y };
}

// Move target to random position
function moveTarget() {
  const { x, y } = getRandomPosition();
  target.style.left = `${x}px`;
  target.style.top = `${y}px`;
}

// Start the game
function startGame() {
  score = 0;
  time = 30;
  scoreEl.textContent = score;
  timeEl.textContent = time;
  gameStarted = true;
  gamePaused = false;
  startPauseBtn.textContent = "Pause";
  target.style.display = 'block';
  moveTarget();

  // Start the timer
  timerInterval = setInterval(() => {
    if (!gamePaused) {
      time--;
      timeEl.textContent = time;
      if (time <= 0) {
        endGame();
      }
    }
  }, 1000);
}

// End the game
function endGame() {
  clearInterval(timerInterval);
  target.style.display = 'none';
  alert(`Game over! You scored ${score} points.`);
  gameStarted = false;
  startPauseBtn.textContent = "Start Game"; // Change button text back to Start
}

// Toggle Pause/Resume
function togglePause() {
  if (!gameStarted) return;

  gamePaused = !gamePaused;
  startPauseBtn.textContent = gamePaused ? "Resume" : "Pause";
}

// Handle target click (increase score)
target.addEventListener('click', () => {
  if (!gameStarted || gamePaused) return;
  score++;
  scoreEl.textContent = score;
  moveTarget();
});

// Handle Start/Pause button click
startPauseBtn.addEventListener('click', () => {
  if (!gameStarted) {
    startGame(); // Start the game if it hasn't started yet
  } else if (gamePaused) {
    gamePaused = false; // Resume the game
    startPauseBtn.textContent = "Pause"; // Change button to Pause
  } else {
    togglePause(); // Pause the game
  }
});
