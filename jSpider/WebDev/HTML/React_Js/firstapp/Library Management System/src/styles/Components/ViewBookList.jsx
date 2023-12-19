import { useEffect, useState } from "react";
import '../styles/ViewBookList.css';
import axios from 'axios';
import { useNavigate } from "react-router-dom";
const ViewBookList = () => {

    let [data, setdata] = useState([]);
    let navigate = useNavigate();
    
    useEffect(() => {

        axios.get('http://localhost:1000/books')
            .then((res) => {
                // console.log(res.data);
                setdata(res.data)
            })
            .catch((rej) => {
                console.log(rej.data);
            })
    })




    //fetching the data using fetch()

    // useEffect(()=>{

    //     let fetchData=async()=>{
    //         let res =  await fetch('http://localhost:1000/books');
    //         let result = await res.json();
    //         setdata(result);
    //         console.log(result);
    //     }
    //     fetchData();

    // },[data]);

    let deleteData = (id) => {
        
        
        axios.delete(`http://localhost:1000/books/${id}`)
        alert('You are Deleting This Book?')
        // fetch(`http://localhost:1000/books/${id}`, {

        //     method: "DELETE"
        // })

    }
    let readData =(id)=>{
      
        navigate(`/adminhome/viewlist/${id}`)
        console.log(id);

    }
    let editBook =(id)=>{
        navigate(`/adminhome/updatebooks/${id}`)
    }
    return (
        <div className="viewbooklist">
            <h1 style={{ color: "white" }}>Book List</h1>
            {data.map((d) => {
                return (
                    <div className="viewitems">
                        <div className="bookimg">
                            <img src={d.thumbnailUrl} alt="" />
                        </div>
                        <div className="itemdescription">
                            <h3>{d.title}</h3>
                            <p>No of Pages: <b>{d.pageCount}</b></p>
                            <p><b>Short Description: </b>{d.shortDescription}</p>
                            {/* <button onClick={()=>{deleteData(d.id)}}></button> */}
                            <img id="del" onClick={() => { deleteData(d.id) }} src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHg9IjBweCIgeT0iMHB4IiB3aWR0aD0iNjQiIGhlaWdodD0iNjQiIHZpZXdCb3g9IjAgMCA3MiA3MiIKc3R5bGU9ImZpbGw6I0ZBNTI1MjsiPgo8cGF0aCBkPSJNIDMzIDEzIEMgMzEuODk1IDEzIDMxIDEzLjg5NSAzMSAxNSBMIDMxIDE2IEwgMTggMTYgQyAxNS43OTEgMTYgMTQgMTcuNzkxIDE0IDIwIEMgMTQgMjEuOTczNjQ1IDE1LjQzMjM2MSAyMy42MDI2MzQgMTcuMzEyNSAyMy45Mjk2ODggTCAxOS43MDcwMzEgNTIuNjY0MDYyIEMgMjAuMDUwMDMxIDU2Ljc3NzA2MiAyMy41NTM2NDEgNjAgMjcuNjgxNjQxIDYwIEwgNDYuMzE4MzU5IDYwIEMgNTAuNDQ2MzU5IDYwIDUzLjk0OTk2OSA1Ni43NzgwNjIgNTQuMjkyOTY5IDUyLjY2NDA2MiBMIDU2LjY4NzUgMjMuOTI5Njg4IEMgNTguNTY3NjM5IDIzLjYwMjYzNCA2MCAyMS45NzM2NDUgNjAgMjAgQyA2MCAxNy43OTEgNTguMjA5IDE2IDU2IDE2IEwgNDMgMTYgTCA0MyAxNSBDIDQzIDEzLjg5NSA0Mi4xMDUgMTMgNDEgMTMgTCAzMyAxMyB6Ij48L3BhdGg+Cjwvc3ZnPg==" alt="" />
                            {/* <br /> */}
                            <button id="readicon" onClick={()=>{readData(d.id)}}>Read More</button>
                            <button  id="edit" onClick={()=>{editBook(d.id)}} >Edit Books</button>
                        </div>
                    </div>

                )
            })}
        </div>
    );
}
export default ViewBookList;