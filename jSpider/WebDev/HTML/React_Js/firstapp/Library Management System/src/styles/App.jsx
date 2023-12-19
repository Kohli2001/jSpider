// import logo from './logo.svg';
import './App.css';
import AdminLogin from './Components/AdminLogin';
import LandingPage from './Components/LandingPage';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import UserLogin from './Components/UserLogin';
import AdminHome from './Components/AdminHome';
import UserHome from './Components/UserHome';

function App() {
  return (
    <div className="App">

     <BrowserRouter>
     <Routes>
      <Route path="/" element={<LandingPage/>}/>
      <Route path='/admin' element={<AdminLogin/>}/>
      <Route path='/user' element={<UserLogin/>}/>
      <Route path='/adminhome/*' element={<AdminHome/>}/>
      <Route path='/userhome/*' element={<UserHome/>}/>
     </Routes> 
     </BrowserRouter>
    </div>
  );
}

export default App;
