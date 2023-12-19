import { Link } from "react-router-dom";
import '../styles/AdminNavbar.css';
const AdminNavbar = () => {
    return (
        <div className="adminnavbar">
            {/* <h1>Admin Navbar</h1> */}
            <div className="logo">
             <h1>JSP</h1>
            </div>
            <div className="navlinks">
                <Link to="/adminhome/viewlist">View BookList</Link>
                <Link to="/adminhome/addbooks">AddBooks</Link>
                <Link to="/adminhome/updatebooks">UpdateBooks</Link>
                <Link to="/">Logout</Link>
            </div>
        </div>
    );
}

export default AdminNavbar;