
let btn = document.getElementById('btn')


let mode=()=>{

   if(btn.textContent=="Dark Mode") {
    document.body.style.background="black"
    document.body.style.color="white"
    btn.textContent="Light Mode"
   }
    else{
        btn.textContent="Light Mode"
        document.body.style.backgroundColor="white"
        document.body.style.color="black"
        btn.textContent="Dark Mode"

    }
    
   }