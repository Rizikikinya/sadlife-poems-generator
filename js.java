
function generateSadPoem(event){
    event.preventDefault();
    let poemElement = document.getElementById("sad-poem-result");
    var app = document.getElementById('sad-poem-result');

var typewriter = new Typewriter(app, {
  loop: true,
  delay: 75,
});

typewriter
  .pauseFor(2500)
  .typeString('<strong>Sad Poem</strong> <br/> I am Happy')
  .pauseFor(300)
  .deleteChars(10)
  .typeString('I am sad')
  .pauseFor(1000)
  .typeString('I am sad')
  .pauseFor(1000000)
  .start();
  

}
let form = document.getElementById("sad-poem-form");
form.addEventListener("submit", generateSadPoem);