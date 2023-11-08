

let text = document.getElementById('text')
let email = document.getElementById('email')
let display = document.getElementById('display')
let date = new Date();

let submit=()=>{
//value

// console.log(email.value);
// console.log(text.value);

// let age = date.getFullYear()-text.value;
// alert(`Your age is ${age}`)
if (text.value.length=="") {
    alert("Plaese enter the year before Search")
    
}
else{
    let date = new Date();
    let age = date.getFullYear()-text.value;
    // display.textContent=age;
    

}


}