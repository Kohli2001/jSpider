
let btn = document.getElementById('btn')
let h = document.getElementById('head')
let p = document.getElementById('para')


let mode=()=>{

   if(document.body.style.background="black") {
    h.style.color="white"
    p.style.color="white"
    if(btn.textContent=="Dark Mode"){
        btn.textContent="Light Mode"
    }
    else{
        btn.textContent="Dark Mode"
        document.body.style.backgroundColor="white"
        h.style.color="Black"
        p.style.color="black"

    }
    
   }
    
}