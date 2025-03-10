const startScreen = document.getElementById('start-screen');
const gameScreen = document.getElementById('game-screen');
const endScreen = document.getElementById('end-screen');

const categorySelect = document.getElementById('category');
const difficultySelect = document.getElementById('difficulty');
const startBtn = document.getElementById('start-btn');
const playAgainBtn = document.getElementById('play-again-btn');

const questionElement = document.getElementById('question');
const optionButtons = document.querySelectorAll('.option-btn');
const timerElement = document.getElementById('time');
const finalScoreElement = document.getElementById('final-score');

let questions = [], currentQuestionIndex = 0, score = 0, timeLeft = 15, timer;

const categories = { general: 9, science: 17, history: 23, sports: 21, geography: 22 };

//  Start Game
startBtn.addEventListener('click', async () => {
    const category = categories[categorySelect.value], difficulty = difficultySelect.value;
    await fetchQuestions(category, difficulty);

    if (!questions.length) return alert("No questions found! Try a different category.");

    score = 0; currentQuestionIndex = 0;
    startScreen.classList.remove('active');
    gameScreen.classList.add('active');
    showQuestion();
});

//  Fetch questions
async function fetchQuestions(category, difficulty) {
    const res = await fetch(`https://opentdb.com/api.php?amount=15&category=${category}&difficulty=${difficulty}&type=multiple`);
    const data = await res.json();
    questions = data.results?.map(q => {
        let options = [...q.incorrect_answers];
        options.splice(Math.random() * 4, 0, q.correct_answer);
        return { question: decodeHTML(q.question), correctAnswer: decodeHTML(q.correct_answer), options: options.map(decodeHTML) };
    }) || [];
}

//  Decode HTML
const decodeHTML = html => { let txt = document.createElement('textarea'); txt.innerHTML = html; return txt.value; };

//  Show question
function showQuestion() {
    clearInterval(timer); clearSelection();
    document.getElementById('feedback').style.display = 'none';

    timeLeft = 15;
    timerElement.textContent = timeLeft;

    const current = questions[currentQuestionIndex];
    questionElement.textContent = current.question;

    optionButtons.forEach((button, index) => {
        button.textContent = current.options[index];
        button.onclick = () => checkAnswer(current.options[index], current.correctAnswer, button);
    });

    timer = setInterval(() => {
        if (--timeLeft === 0) { clearInterval(timer); showFeedback(`⏳ Time’s Up! 🎯 Correct: <b>${current.correctAnswer}</b>`, 'timeout'); }
        timerElement.textContent = timeLeft;
    }, 1000);
}

//  Check answer
function checkAnswer(selected, correct, button) {
    clearInterval(timer); clearSelection();
    button.classList.add(selected === correct ? 'correct' : 'wrong');
    showFeedback(selected === correct ? '✅ Correct! 🎉' : `❌ Wrong! 🎯 Correct: <b>${correct}</b>`, selected === correct ? 'correct' : 'wrong');
}

//  Show feedback
function showFeedback(message, className) {
    const feedback = document.getElementById('feedback');
    feedback.innerHTML = message; feedback.className = className; feedback.style.display = 'block';
    setTimeout(() => { feedback.style.display = 'none'; nextQuestion(); }, 1500);
}

// Clear selection
function clearSelection() {
    optionButtons.forEach(btn => btn.classList.remove('correct', 'wrong'));
}

//  Next question or end game
function nextQuestion() {
    currentQuestionIndex < questions.length - 1 ? showQuestion(++currentQuestionIndex) : endGame();
}

// End game
function endGame() {
    gameScreen.classList.remove('active');
    endScreen.classList.add('active');
    finalScoreElement.textContent = score;
}

// Restart game
playAgainBtn.addEventListener('click', () => {
    endScreen.classList.remove('active');
    startScreen.classList.add('active');
});
