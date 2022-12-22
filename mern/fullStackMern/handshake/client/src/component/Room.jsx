import React from 'react'
import { useState,useEffect } from 'react'
import io from 'socket.io-client';

const Room = (props) => {
    const [message,setMessage]=useState('')
    const [socket] = useState(() => io(':8000'));
    const [messages, setMessages]=useState([])
    const [names,setNames]=useState("")
    const [loaded,setLoaded]=useState(false)
    const handle=e=>{
        e.preventDefault()
        socket.emit("msg",{'name':props.name , message})
        
        }
        useEffect(() => {
     
            console.log('Is this running?');
            socket.on('nameS',data => {
                setMessages([data,...messages])
                console.log(data)
            })
            
            socket.on('msgs', data => {
              setMessages([data,...messages])
              setLoaded(true)})
             
              
              
      
            },[messages]);
         
            // note that we're returning a callback function
            // this ensures that the underlying socket will be closed if App is unmounted
            // this would be more critical if we were creating the socket in a subcomponent
           
         

    
  return (
    <div>
{messages.map((msg,i)=>{
   
    return( <p style={{backgroundColor:"#dddddd" ,width:"20%"}} key={i}>{msg.name}:
        {msg.message}</p>)}
   

)}
<form onSubmit={handle}>
    <input onChange={(e)=>setMessage(e.target.value)} type="text"  />
    <button>send</button>

</form>
    </div>
  )
}

export default Room
