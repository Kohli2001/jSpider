import Child from "./Child";


const Parent = () => {
    return (  
        <div className="Parent">
            <h1>Baap Baap hota hai...........</h1>
            <Child bdy="16122001"/>   
            {/* Writing the bdy or any variable inside any compnenet is called Props whenever we are sending a props to the child it is in form of object so we must call as . operator */}
            
        </div>
    );
}
 
export default Parent;