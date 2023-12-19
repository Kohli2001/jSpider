
import AdminNavbar from "./AdminNavbar";
import AdminDashboard from "./AdminDashboard";
import {Routes, Route} from "react-router-dom";
import ViewBookList from "./ViewBookList";
import UpdateBooks from "./UpdateBooks";
import AddBooks from "./AddBooks";
import ReadBooks from "./ReadBooks";

const AdminHome = () => {
    return ( 
        <div className="adminhome">
            <AdminNavbar/>
            <Routes>
                <Route path="/" element={<AdminDashboard/>}/>
                <Route path="/viewlist" element={<ViewBookList/>}/>
                <Route path="/updatebooks/:id" element={<UpdateBooks/>}/>
                <Route path="/addbooks" element={<AddBooks/>}/>
                <Route path="/viewlist/:id" element={<ReadBooks/>}/>
                

            </Routes>
        </div>
     );

}
export default AdminHome;