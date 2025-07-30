const target = document.getElementById('target');
const scoreEl = document.getElementById('score');
const timeEl = document.getElementById('time');  
const startBtn = document.getElementById('startBtn');

let score = 0;
let time = 30;
let timerInterval;
let gameStarted = false;

function getRandomPosition() {
  const x = Math.floor(Math.random() * (window.innerWidth - 60));
  const y = Math.floor(Math.random() * (window.innerHeight - 60));
  return { x, y };
}

function moveTarget() {
  const { x, y } = getRandomPosition();
  target.style.left = `${x}px`;
  target.style.top = `${y}px`;
}

function startGame() {
  score = 0;
  time = 30;
  scoreEl.textContent = score;
  timeEl.textContent = time;
  gameStarted = true;
  startBtn.style.visibility = 'hidden';
  target.style.display = 'block';
  moveTarget();

  timerInterval = setInterval(() => {
    time--;
    timeEl.textContent = time;
    if (time <= 0) {
      endGame();
    }
  }, 1000);
}

function endGame() {
  clearInterval(timerInterval);
  target.style.display = 'none';
  alert(`Game over! You scored ${score} points.`);
  startBtn.style.visibility = 'visible';
  gameStarted = false;
}

target.addEventListener('click', () => {
  if (!gameStarted) return;
  score++;
  scoreEl.textContent = score;
  moveTarget();
});

startBtn.addEventListener('click', () => {
  if (!gameStarted) startGame();
});
