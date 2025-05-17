
function generateSadPoem(event){
    event.preventDefault();
    let  hiddenElement = document.querySelector(".poem-hidden");
    hiddenElement.classList.remove("poem-hidden");
    let input= document.getElementById("sad-poem-search");
    hiddenElement.innerHTML = `<div class="generating">Generating sad poem ...about ${input.value}<div>`;
     let context="please generate a sad poem following the prompt. use basic HTMl. Let the first 3 words be the topic of the poem inside a <strong>. Let poem be so sad. let Use <br/> after every comma or fullstop. The poem should be in English and short";let apiKey="6fe8tf4ae3fc290f9f3ff43213b0b7od";
       prompt=input.value;let apiUrl = `https://api.shecodes.io/ai/v1/generate?prompt=${prompt}&context=${context}&key=${apiKey}`;
       axios.get(apiUrl).then(generatePoem);
       

    
  

}
let form = document.getElementById("sad-poem-form");
form.addEventListener("submit", generateSadPoem);
 function generatePoem(response){
  
  let poemElement = document.getElementById("sad-poem-result");
  new Typewriter('#sad-poem-result', {
  strings: response.data.answer,
  autoStart: true,
});

    
  
}

    
  



