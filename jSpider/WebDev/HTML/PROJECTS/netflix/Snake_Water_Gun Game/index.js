let snake = document.getElementById('snake');
let gun = document.getElementById('gun');
let water = document.getElementById('water');

let res = document.getElementById('result');

let userScore = 0;
let computerScore = 0;
let rounds = 0;

const updateScore = () => {
    console.log(`User Score: ${userScore} | Computer Score: ${computerScore}`);
};

const match = (userChoice) => {
    let computerChoice = ["snake", "gun", "water"][Math.floor(Math.random() * 3)];

    rounds++;
    if (userChoice === computerChoice) {
        res.textContent = "It's a Tie!";
        res.style.cssText = "color: blueviolet; font-size: 24px; font-weight: bold;";
    } else if (
        (userChoice === 'snake' && computerChoice === 'water') ||
        (userChoice === 'gun' && computerChoice === 'snake') ||
        (userChoice === 'water' && computerChoice === 'gun')
    ) {
        userScore++;
        res.textContent = 'You Won!';
        res.style.cssText = "color: blue; font-size: 24px; font-weight: bold;";
    } else {
        computerScore++;
        res.textContent = 'You Lost... Computer Won!';
        res.style.cssText = "color: red; font-size: 24px; font-weight: bold;";
    }
    updateScore();

  if(rounds ==10) {

        if (userScore > computerScore) {
            res.textContent = `You are the winner! Your Score: ${userScore}||Computer Score: ${computerScore}`;
            res.style.cssText = "color: blue; font-size: 28px; font-weight: bold;";
        } else if (userScore < computerScore) {
            res.textContent = `Computer is the winner! Your Score: ${userScore}||Computer Score: ${computerScore}`;
            res.style.cssText = "color: red; font-size: 28px; font-weight: bold;";
        } else {
            res.textContent = `It\'s a tie in the overall game! Your Score: ${userScore}||Computer Score: ${computerScore}`;
            res.style.cssText = "color: blueviolet; font-size: 28px; font-weight: bold;";
        }
    }
    
    
}

snake.addEventListener('click', () => match('snake'));
gun.addEventListener('click', () => match('gun'));
water.addEventListener('click', () => match('water'));
