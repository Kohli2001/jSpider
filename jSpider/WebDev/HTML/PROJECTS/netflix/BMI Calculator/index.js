


let height=document.getElementById('height');
let weight=document.getElementById('weight');

let result = document.getElementById('result');
let stat= document.getElementById('status');



const calculate=()=>{
    if(height.value=='' || weight.value==''){
        alert('Kindly Fill the Fields..')
    }
    else{
     let res= (weight.value/((height.value*height.value)/10000)).toFixed(2);
     result.innerHTML=res;
     if(res<18.5){
        stat.textContent="Under Weight"
        stat.style.color="Red";
     }
     else if(res>18.5 && res<24.9){
        stat.textContent="Normal Weight"
        stat.style.color="Green";
     }
     else if(res>25 && res<29.9){
        stat.textContent="Over Weight"
        stat.style.color="Red"
     }
     else if(res>30.0){
        stat.textContent="Obesity Class"
        stat.style.color="red";
     }
    }
}



