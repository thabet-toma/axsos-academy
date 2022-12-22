import React,{useState} from 'react'


const Name = (props) => {
    const [name,setName]=useState("")
    const handleSubmit=(e)=>{
        e.preventDefault()
        props.subprop(name)
    }
  return (
    <div style={{border:"1px solid black" ,width:"70%",margin:"0 auto",marginTop:"70px"}}>
       <h2> Get started right now</h2>
       <p>i want to start chatting with the name</p>


      <form onSubmit={handleSubmit}>
        <label>name</label>
        <input type="text" placeholder='your name here ' onChange={(e)=>setName(e.target.value)}/>
        <button style={{backgroundColor:"green",marginLeft:"30px"}}>start Chatting</button>
      </form>
    </div>
  )
}

export default Name
