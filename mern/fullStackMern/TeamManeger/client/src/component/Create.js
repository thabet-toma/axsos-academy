
import React ,{useState} from 'react'
import axios from 'axios';
import { Link } from '@reach/router';

const Create = (props) => {
    const [name,setName]=useState(props.initialName)
    const [pos,setPos]=useState(props.initialName)
    
    const handleSubmet=(e)=>{
        e.preventDefault();
        // axios.post('http://localhost:8000/api/Products/new', {
        //     Title,
        //     Price,
        //     Desc
        // })
        //     .then(res=>console.log(res))
        //     .catch(err=>console.log(err))
        props.onSubmitProp({name,pos,"games.game1":0,"games.game2":0,"games.game3":0});
    }
  return (
    <div>
      <h1>Product Manager</h1>
      <form onSubmit={handleSubmet}>
        <div>
            <label>Player Name</label>
            <input type="text" value={name} onChange={(e)=>setName(e.target.value)}></input>
            {props.children}
        </div>
        <div>
            <label>preferd position</label>
            <input type="text" value={pos} onChange={(e)=>setPos(e.target.value)}></input>
        </div>
      
        <button>Add Player</button>
       
      </form>
    
    </div>
  )
}

export default Create
