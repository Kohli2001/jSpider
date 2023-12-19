import { useEffect, useState } from 'react';
import '../styles/UpdateBooks.css';
import axios from 'axios';
import { useParams } from 'react-router-dom';
const UpdateBooks = () => {
    // let[data, setdata] = useState("")
    let param = useParams()

    let [title, settitle] = useState("")
    let [pageCount , setpageCount] = useState("")
    let [shortDescription , setshortDescription]= useState("")
    let [LongDescription , setLongDescription] = useState("")
    let [thumbnailUrl , setthumbnailUrl] = useState("")

    useEffect(()=>{

        axios.get(`http://localhost:1000/books/${param.id}`)
        .then((res)=>{
            console.log(res.data);
            // setdata(res.data);
            settitle(res.data.title)
            setpageCount(res.data.pageCount)
            setshortDescription(res.data.shortDescription)
            setLongDescription(res.data.longDescription)
            setthumbnailUrl(res.data.thumbnailUrl)

        })
        .catch((err)=>{
            console.log(err);
        })
    },[])

    let data = {title,pageCount, shortDescription, LongDescription, thumbnailUrl}

    let updateBooks =(e)=>{
        e.preventDefault();
        axios.put(`http://localhost:1000/books/${param.id}` , data)
        .then((res)=>{
            console.log(res);
            alert('Data Updataed Successfully..')
        })
        .catch((err)=>{
            console.log(err);
        })
    }

    return ( 
        <div className="updatebooks">
            <h1>Update Books</h1>

            <form action="">
                <label htmlFor="">
                    Title: <input value={title} onChange={(e)=>{settitle(e.target.value)}}  type="text" placeholder="Enter the book Title" />
                </label>
                <br />
                <label htmlFor="">
                    Page Count: <input value={pageCount} onChange={(e)=>{setpageCount(e.target.value)}} type="number" placeholder="Enter the no of pages" />
                </label> <br />
                <label htmlFor="">
                    Short Decsription: <input  value={shortDescription} onChange={(e)=>{setshortDescription(e.target.value)}} type="text" placeholder="Enter the Short description" />
                </label>
                <br />
                <label htmlFor="">
                    Long Description: <textarea value={LongDescription} onChange={(e)=>{setLongDescription(e.target.value)}} placeholder="Enter the Descriptions" cols="30" rows="10"></textarea>
                </label>
                <br />
                <label htmlFor="">
                    Image URL: <input  value={thumbnailUrl} onChange={(e)=>{setthumbnailUrl(e.target.value)}} type="text" placeholder="Enter the Image Link" />
                </label>
                <br />
                <button onClick={updateBooks}>Update Books</button>
            </form>
        </div>
     );
}
 
export default UpdateBooks;