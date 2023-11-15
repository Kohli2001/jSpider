let inputTask = document.getElementById('task');
let addbtn = document.getElementById('btn');
let list=document.querySelector('list-container');


let addTask=()=>{
    if(inputTask.value==''){
        // alert('You must write your Task before add');
        inputTask.style.border="1px solid red";
    }
    else{
        let li = document.createElement('li');
        li.innerHTML=inputTask.value;
        list.appendChild(li);


    }
    inputTask.value="";
}