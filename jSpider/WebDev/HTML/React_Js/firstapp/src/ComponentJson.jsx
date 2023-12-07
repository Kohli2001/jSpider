import { useEffect, useState } from "react";

const ComponentJson = () => {

    let [data1, setdata] =useState([]);

    useEffect(()=>{

        let datafetch=async()=>{
            let res = await fetch('http://localhost:2000/Movies')
            let data = await res.json()
            setdata(data)
            console.log(data1);
    
        }
        datafetch();
    },[])

    return ( 
        <div className="compo">

            {data1.map((data)=>{
                return(
                    <div className="display">
                        <h1>name: {data.name}</h1>
                    </div>
                )
            })}
            <h1>Json Fetching...</h1>
        </div>
     );
}
 
export default ComponentJson;