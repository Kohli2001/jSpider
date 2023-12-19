import { useState } from "react";
import '../styles/UserLogin.css';
import { useNavigate } from "react-router-dom";
const UserLogin = () => {

    let navigate=useNavigate();
    let [email, setemail] =useState("");
    let [password,setpassword]=useState("");

    let validate=()=>{
        if(email==="abcd" && password==="1234"){
            // alert('Login Successfully...')
            navigate('/userhome');
        }
        else{
            alert('Login Failed... Invalid Credentails')
        }
    }
    return ( 
        <div className="userlogin">
            <h1>User Login</h1>
            <form action="">
                <label htmlFor="">
                    UserName:
                    <input value={email} onChange={(e)=>{setemail(e.target.value)}} type="text"/>
                </label>
                <label htmlFor="">
                    Password:
                    <input value={password} onChange={(p)=>{setpassword(p.target.value)}} type="password" />
                </label>
                <br />
                <button onClick={validate}>Login</button>
            </form>
        </div>
     );
}
 
export default UserLogin;