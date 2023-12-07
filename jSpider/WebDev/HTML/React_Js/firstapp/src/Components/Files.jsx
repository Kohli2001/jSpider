
const Files = () => {

    let movies=[
        {
            id:1,
            name:"3 idots",
            imgurl:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQYvWvzQmonsjB6qHgUMbArUNyptqP4oRMrpumzUY7SQ&s"

        },
        {
            id:2,
            name:"Animal",
            imgurl:"https://bsmedia.business-standard.com/_media/bs/img/article/2023-09/28/full/1695891993-0587.jpg?im=FeatureCrop,size=(826,465)"
        },
        {
            id:3,
            name:"Sam Bahadur",
            imgurl:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpNGKsR70lWoGBZ1dt1-gGUc7wvqgWMnI3N9g0z06P4g&s"
        }
    ]
    return ( 
        <div className="Files">
            {movies.map((ele)=>{
                return(
                    <div className="movie">
                        <i>Movie Id: {ele.id}</i>
                        <h3>Movie Name: {ele.name}</h3>
                       <img src={ele.imgurl} alt="" />
                        <hr />
                    </div>
                )
            })}
        </div>
     );
}
 
export default Files;