import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import '../styles/ReadBooks.css';

const ReadBooks = () => {
    let param = useParams()
    let [data, setdata] = useState("")
    useEffect(()=>{
        axios.get(`http://localhost:1000/books/${param.id}`)
        .then((res)=>{
            console.log(res);
            setdata(res.data)
        })
        .catch((e)=>{
            console.log(e);
        })
    })

    return ( 
        <div className="readbooks">
            {/* <h1>Read Books</h1> */}
            <div className="image">
            <img src={data.thumbnailUrl} alt="" />
            </div>
            <div className="description">
            <h2>Title: <span>{data.title}</span></h2> 
            <b>Page Count:</b><span>{data.pageCount}</span> <br />
            <b>Authors: </b><span>{data.authors}</span> <br />
            <b>Short Description:</b> <span>{data.shortDescription}</span>
            <br />
            <b>Long Description:</b><span>{data.longDescription}</span>
            </div>
            
           
        </div>
     );
}
 
export default ReadBooks;