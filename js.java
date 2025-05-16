
function generatepoem(event){
    preventDefault();
    let poemElement=document.getElementById("sad-poem-results")
    

var typewriter = new Typewriter(poemElement, {
  loop: true,
  delay: 75,
});

typewriter
  .pauseFor(2500)
  .typeString(' My sad sad story, very sad story enemies')
  .pauseFor(300)
  .deleteChars(7)
  .typeString(' friends <br/>')
  .pauseFor(300)
  .typeString('The sadness of my life, the tears of my eyes <br/>')
  .pauseFor(1000)
  .start();

}
let form=document.getElementById("sad-poem-form");
form.addEventListener("submit", generatepoem);