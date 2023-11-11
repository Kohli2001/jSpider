
let email = document.getElementById('email')
let password=document.getElementById('password')
let img = document.querySelector('img');

let login=()=>{

    if(email.value.length==""){
        alert("Please Fill the required Credentaial")
    }
    else{

        if(email.value=="kamleshkumarkohli7@gmail.com" && password.value=="Kamlesh@2001"){
            alert("Login Successfull")
    }

    else{
        // img.src ='https://media.tenor.com/GtT-M--zebwAAAAd/no-you-cant-no-youre-not-allowed.gif' 
        //alert("Login Fail")
        email.style.border="1px solid red"
        password.style.border="1px solid red"

    }
    }
}

 