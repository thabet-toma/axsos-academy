import axios from 'axios'
import React, { useState,useEffect } from 'react'
import Create from '../component/Create'

const Update = (props) => {
    const [Title,setTitle]=useState("")
    const [Price,setPrice]=useState("")
    const [Desc,setDesc]=useState("")
    const [loaded,setLoaded]=useState(false)
    useEffect(()=>{
        axios.get('http://localhost:8000/api/products/'+props.id)
        .then(res => {
            setTitle(res.data.Title);
            setPrice(res.data.Price);
            setDesc(res.data.Desc);
            setLoaded(true);
        })
}, );
const updateProduct =(product)=>{

    axios.put('http://localhost:8000/api/users/update/'+props.id,product
        
   )
        .then(res=>console.log(res))
        .catch(err=>console.log(err))
}
    

    
  return (
    // <div>
    // <h1>Product Manager</h1>
    // <form onSubmit={handleSubmet}>
    //   <div>
    //       <label>title</label>
    //       <input type="text" value={Title} onChange={(e)=>setTitle(e.target.value)}></input>
    //   </div>
    //   <div>
    //       <label>prive</label>
    //       <input type="text" value={Price} onChange={(e)=>setPrice(e.target.value)}></input>
    //   </div>
    //   <div>
    //       <label>description</label>
    //       <input type="text" value={Desc} onChange={(e)=>setDesc(e.target.value)}></input>
    //   </div>
    //   <button>submet</button>
    // </form>
    <>
   {loaded && <Create onSubmitProp={updateProduct} initialTitle={Title} initialPrice={Price} initialDesc={Desc} />}
   </>
  )
} 

export default Update
