// import React from "react";




import { Component } from "react";
// let {Component} = React;     // other way of importing the Component object 

//react is an in buit libraries which have so many objcets one of them is  Component which i extended here 
//the other way of extending is let {Component} = React 
class Component5 extends Component{

    render(){
        return(
            <div className="d1">
                <h1>I am Class based Components</h1>
            </div>
        )
    }
}
export default Component5;


// it is a class based components in react which can load into the App.jsx using render 
// render is a method which can return the HTML as nomral methods 