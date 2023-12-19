import '../styles/LandingPage.css'
import { Link } from 'react-router-dom'
const LandingPage = () => {
    
    return (
        <div className="landingpage">
            <h1 className='heading'>Library Management System</h1>
            <div className="section1">
                <Link to="/admin">
                    <img src="https://icons.iconarchive.com/icons/aha-soft/free-large-boss/512/Admin-icon.png" alt="" />
                    <h1>Admin</h1>
                </Link>
                <Link to="/user">
                    <img src="https://cdn0.iconfinder.com/data/icons/school-medicine-people-1/110/Student-3-512.png" alt="" />
                    <h1>User</h1>
                </Link>
            </div>
        </div>
    );
}
export default LandingPage;