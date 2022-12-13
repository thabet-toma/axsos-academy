import React,{useState }  from 'react'
import { navigate } from '@reach/router'

const Home = () => {
    const [selectedsearch, setSelectedsearch] = useState("people");
const [selectedId, setSelectedId] = useState("");
const handleSubmit=(e)=>{
    e.preventDefault()
    navigate("/"+selectedsearch+"/"+selectedId)}
  return (
    <div>
  <label>Search for:</label>
      <form onSubmit={handleSubmit}>
      <select value={selectedsearch} onChange={(e)=>setSelectedsearch(e.target.value)}>
        <option value="people">people</option>
        <option value="planets">planets</option>
      </select>
      <input type="text" onChange={(e)=>setSelectedId(e.target.value)}/>
      <button>search</button>
      </form>
      
    </div>
  )
}

export default Home
