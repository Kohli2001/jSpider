// let element = document.getElementById('title')

// console.log(element.textContent); // to fetch the content 


//content updations......

// element.textContent="Updated...!"  // it will chnage the content inside the tag

//content cahnges based on class name 

// let ele = document.getElementsByClassName('title');

//updating the contente using classs

// ele[0].textContent="Updated..!"
// ele[1].textContent="Updated late...!"

//content updations


// for(let i=0; i<ele.length; i++){
//     ele[i].textContent=i%3+1   
// }

//adding styles

// let element = document.getElementById('title')

// element.style.color='blue';
// element.style.backgroundColor='yellow'
// element.style.textAlign='center'


//adding functionlity

// let ele = document.getElementsByClassName('head')
// let ele = document.querySelector('.head')
let c= document.getElementById('btn')

let btn1 = document.getElementById('btn1')

let submit = ()=>{

    btn1.body.style.color="red";

    if(c.textContent=="SUBMIT"){
        c.textContent='SUBMITTED'
    }
    else{
        c.textContent="SUBMIT"
    }
     
   

    // ele[0].style.color="blue"



    // alert('You clicked')
    // console.log('You clicked');

    //changing body bg color
    // document.body.style.background="blue"

    // let ele = document.getElementById('head');
    // ele.style.color="red"
    
    
    
    

    
    
}