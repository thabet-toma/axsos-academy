import axios from 'axios'
import React, { useState,useEffect } from 'react'

const Update = (props) => {
    const [Title,setTitle]=useState("")
    const [Price,setPrice]=useState("")
    const [Desc,setDesc]=useState("")
    useEffect(()=>{
        axios.get('http://localhost:8000/api/products/'+props.id)
        .then(res => {
            setTitle(res.data.Title);
            setPrice(res.data.Price);
            setDesc(res.data.Desc);
        })
}, []);
const handleSubmet=(e)=>{
    e.preventDefault();
    axios.put('http://localhost:8000/api/users/update/'+props.id, {
        Title,
        Price,
        Desc
    })
        .then(res=>console.log(res))
        .catch(err=>console.log(err))
}
    

    
  return (
    <div>
    <h1>Product Manager</h1>
    <form onSubmit={handleSubmet}>
      <div>
          <label>title</label>
          <input type="text" value={Title} onChange={(e)=>setTitle(e.target.value)}></input>
      </div>
      <div>
          <label>prive</label>
          <input type="text" value={Price} onChange={(e)=>setPrice(e.target.value)}></input>
      </div>
      <div>
          <label>description</label>
          <input type="text" value={Desc} onChange={(e)=>setDesc(e.target.value)}></input>
      </div>
      <button>submet</button>
    </form>
    </div>
  )
} 

export default Update
