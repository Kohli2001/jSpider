
import { useState } from "react";
//useState is the one of the HOOKS
const HooksComponent = () => {
let [a, setter] = useState(100);
// let [a, setter] = useState('Hii');
console.log(a);

    let change=()=>{
        setter(++a);
    }
    return (  
        <div className="hooks">
            <h1>Performing HOOKS</h1>
            <button onClick={change}>Changer</button>
            <h3>{a}</h3>

        </div>
    );
}
 
export default HooksComponent;
