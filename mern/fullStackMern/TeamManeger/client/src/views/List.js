import React,{useState,useEffect} from 'react'
import Table from '../component/Table'
import axios from 'axios'
import { Link } from '@reach/router'



const List = () => {
    const [players,setPlayers]=useState("")
    const [loaded,setLoaded]=useState("")
    useEffect(()=>{
        axios.get('http://localhost:8000/api/Players/')
            .then(res=>{
                setPlayers(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    });
    const removeFromDom = personId => {
        
      setPlayers(players.filter(person => person._id != personId))
  }
  return (
    <div style={{backgroundColor:"white",height:'70vh'}} >
      <h2><Link to="/players/list">List</Link>|<Link to="/players/addPlayer">Add players</Link></h2>
      {loaded &&
        <Table removefromdom={removeFromDom}  data={players} />}
    </div>
  )
}

export default List
