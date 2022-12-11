import React, {useState} from 'react'

const Taps = (props) => {
    const [msg,setMsg]=useState("")
    const child={
        margin:"20px"

    }
    
  return (
    <div>
        <div style={{display:"flex"}}>
      {props.lists.map((item,i)=><div key={i} onMouseOver={(e)=>e.target.style.backgroundColor="red"} onMouseLeave={(e)=>e.target.style.backgroundColor="white"} onClick={(e)=>setMsg(item+"contnant is shown here")} style={{width:"100px",border:"1px solid blue",margin:"20px" }}>{item}</div>)}</div>
      <div style={{height:"100px",border:"1px solid black",width:"50%"}}>{msg}</div>
    </div>
  )
}

export default Taps
