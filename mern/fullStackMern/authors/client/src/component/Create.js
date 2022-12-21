
import React ,{useState} from 'react'
import axios from 'axios';
import { Link } from '@reach/router';

const Create = (props) => {
    const [name,setName]=useState(props.initialName)
    
    const handleSubmet=(e)=>{
        e.preventDefault();
        // axios.post('http://localhost:8000/api/Products/new', {
        //     Title,
        //     Price,
        //     Desc
        // })
        //     .then(res=>console.log(res))
        //     .catch(err=>console.log(err))
        props.onSubmitProp({name});
    }
  return (
    <div>
      <h1>Product Manager</h1>
      <form onSubmit={handleSubmet}>
        <div>
            <label>Name</label>
            <input type="text" value={name} onChange={(e)=>setName(e.target.value)}></input>
        </div>
      
        <button>submet</button>
       
      </form>
      <button ><Link to="/">cansel</Link></button>
    </div>
  )
}

export default Create
