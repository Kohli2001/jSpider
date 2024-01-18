let animationInterval;

function startGraph() {
  animationInterval = setInterval(moveBars, 500);
}

function stopGraph() {
  clearInterval(animationInterval);
}

function resetGraph() {
  stopGraph();
  document.querySelectorAll('.bar').forEach(bar => {
    bar.style.height = '0';
  });
}

function moveBars() {
  document.querySelectorAll('.bar').forEach(bar => {
    const randomHeight = Math.floor(Math.random() * 100) + 1;
    bar.style.height = `${randomHeight}% `;
  });
}