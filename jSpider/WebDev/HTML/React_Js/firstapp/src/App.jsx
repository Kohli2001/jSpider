// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;



//above all code is already written so u can delete it also but for referance keep it at it is...


import '../src/App.css';
import Component1 from './Components/Component1';
import Component5 from './Components/Component5';
import Parent from './Components/Parent';
import Files from './Components/Files';
import HooksComponent from './Components/HooksComponent';
import ComponentJson from './ComponentJson';

function App() {
  //this is not simple function it is basically called as components  and  //we can return only one element at a time so we must create fragmenting 

  return (


    // the way of  writing multiple html inside a parent div is call as   fragmenting 
    <div className="parent">
      <h1 style={{ "color": "red", textAlign: "center" }}>Hey Welcome to  React App</h1>

      <h1>Brief about Componenets</h1>
      <Component1 />
      <hr />

      <Component5 />
      {/* calling A Class based Components */}
      <hr />

      <Parent />
      {/* Calling Parent Class to undertand the props */}
      <hr />
      <Files />
      <hr />
      <HooksComponent />
      <hr />
      <ComponentJson/>
    </div>
  )
}
export default App;
