

const Component4 = () => {

    let m = 20;
    let n=30;
    function mul(m,n){
        console.log(m*n);
    }
    return (  
        <div className="component4">
            <button onClick={()=>{mul(m,n)}} >MUL</button>
        </div>
    );
}
 
export default Component4;