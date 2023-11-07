let hour = document.getElementById('hours')
let minute = document.getElementById('minutes')
let second = document.getElementById('seconds')



setInterval(() => {

    let date = new Date();
    if(date.getHours()<10){
        
        hour.textContent= "0"+date.getHours()
    }
    else{
        hour.textContent=date.getHours()
    }
    if(date.getMinutes()<10){
        minute.textContent="0"+date.getMinutes();
    }
    else{
        minute.textContent=date.getMinutes();
    }
    if(date.getSeconds()<10){
        second.textContent = "0"+date.getSeconds();
    }
    else{
        second.textContent = date.getSeconds();
    }
    //minute.textContent = date.getMinutes();
   // second.textContent = date.getSeconds();
    // hour.textContent = date.getHours();

}, 1000);






