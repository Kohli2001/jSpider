import { useState } from "react";
import '../styles/AdminLogin.css';
import {useNavigate} from "react-router-dom";

const AdminLogin = () => {

    let navigate=useNavigate();

    let [email, setemail] = useState("");
    console.log(email);
    let [password, setpassword] = useState("");
    console.log(password);

    let validate = () => {
        if (email ==="abcd" && password === "1234") {
            // alert('Login Successfull')
            navigate('/adminhome');

        }
        else {
            alert('Invalid Credentials')
        }
    }

    return (
        <div className="adminlogin">
            <h1>Admin Login</h1>
            <img src="" alt="" />
            <form action="">
                <label htmlFor="">
                    Email:
                    <input value={email} onChange={(e) => { setemail(e.target.value) }} type="email" />
                </label>
                <label htmlFor="">
                    Password:
                    <input value={password} onChange={(p) => { setpassword(p.target.value) }} type="password" />
                </label>
                <br />
                <button onClick={validate}>Login</button>
            </form>
        </div>
    );
}

export default AdminLogin;