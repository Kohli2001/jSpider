import { useState } from 'react';
import '../styles/AddBooks.css';
import axios from 'axios';
const AddBooks = () => {
    
    let[title, settitle]=useState("");
    let[pageCount, setpageCount]=useState("");
    let[thumbnailUrl, setthumbnailUrl]=useState("");
    let[shortDescription, setshortDescription]=useState("");
    let[longDescription, setlongDescription]=useState("");

    let data ={title,pageCount,thumbnailUrl,shortDescription,longDescription};

    let addbook=(e)=>{
        e.preventDefault();
        axios.post('http://localhost:1000/books' , data)
        .then((res)=>{
            console.log(res);
            alert('Book Added Successfully');
        })
        .catch((err)=>{
            console.log(err);
            alert('Not Added!' , err)
        })
        // fetch('http://localhost:1000/books',
        // {
        //     method:"POST",
        //     headers:{"content-Type":"application/json"},
        //     body:JSON.stringify(data)
        
        // })
        // alert('Book Added Successfully');
    }
    return (  
        <div className="addbooks">
            {/* <h1>Add Books</h1> */}
            <form action="">
                <label htmlFor="">
                    Title: <input value={title} onChange={(e)=>{settitle(e.target.value)}} type="text" placeholder="Enter the book Title" />
                </label>
                <br />
                <label htmlFor="">
                    Page Count: <input type="number" value={pageCount} onChange={(e)=>{setpageCount(e.target.value)}} placeholder="Enter the no of pages" />
                </label> <br />
                <label htmlFor="">
                    Short Decsription: <input value={shortDescription} onChange={(e)=>{setshortDescription(e.target.value)}} type="text" placeholder="Enter the Short description" />
                </label>
                <br />
                <label htmlFor="">
                    Long Description: <textarea value={longDescription} onChange={(e)=>{setlongDescription(e.target.value)}} placeholder="Enter the Descriptions" cols="30" rows="10"></textarea>
                </label>
                <br />
                <label htmlFor="">
                    Image URL: <input value={thumbnailUrl} onChange={(e)=>{setthumbnailUrl(e.target.value)}} type="text" placeholder="Enter the Image Link" />
                </label>
                <br />
                <button onClick={addbook}>Add Books</button>
            </form>
        </div>
    );
}
 
export default AddBooks;