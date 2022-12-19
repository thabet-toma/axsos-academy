
import React ,{useState} from 'react'
import axios from 'axios';

const Create = () => {
    const [Title,setTitle]=useState("")
    const [Price,setPrice]=useState("")
    const [Desc,setDesc]=useState("")
    const handleSubmet=(e)=>{
        e.preventDefault();
        axios.post('http://localhost:8000/api/Products/new', {
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
            <input type="text" onChange={(e)=>setTitle(e.target.value)}></input>
        </div>
        <div>
            <label>prive</label>
            <input type="text" onChange={(e)=>setPrice(e.target.value)}></input>
        </div>
        <div>
            <label>description</label>
            <input type="text" onChange={(e)=>setDesc(e.target.value)}></input>
        </div>
        <button>submet</button>
      </form>
    </div>
  )
}

export default Create
