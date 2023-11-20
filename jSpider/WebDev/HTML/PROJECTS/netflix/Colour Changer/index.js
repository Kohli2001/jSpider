

let body  = document.querySelector('body');
let buttons = document.querySelectorAll('.box');


        buttons.forEach(function(button){
            button.addEventListener('click' ,function(e){
               if(e.target.id=='box1'){
                body.style.backgroundColor="green";
            
               }
               if(e.target.id=='box2'){
                body.style.backgroundColor="Black";
               }
               if(e.target.id=='box3'){
                body.style.backgroundColor="yellow"
               }
               if(e.target.id=='box4'){
                body.style.backgroundColor="blue";
               }
            })
        })

