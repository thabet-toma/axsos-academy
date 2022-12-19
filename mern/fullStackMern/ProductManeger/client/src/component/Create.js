
import React ,{useState} from 'react'
import axios from 'axios';

const Create = (props) => {
    const [Title,setTitle]=useState(props.initialTitle)
    const [Price,setPrice]=useState(props.initialPrice)
    const [Desc,setDesc]=useState(props.initialDesc)
    const handleSubmet=(e)=>{
        e.preventDefault();
        // axios.post('http://localhost:8000/api/Products/new', {
        //     Title,
        //     Price,
        //     Desc
        // })
        //     .then(res=>console.log(res))
        //     .catch(err=>console.log(err))
        props.onSubmitProp({Title, Price,Desc});
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

export default Create
