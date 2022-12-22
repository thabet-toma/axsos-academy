import React ,{useState,useEffect} from 'react'
import io from 'socket.io-client';

import Room from './Room';
import Name from './Name';

const Chat = () => {
    const [socket] = useState(() => io(':8000'));
  
    const [name,setName]=useState("")
   
    const handleName=(name)=>{setName(name);
        socket.emit("nameC",{"name":name+"has joined"})
    }
 

   
    return (
      <div className="App">
       {!name?<Name  subprop={handleName}/>
       : <Room name={name}/>


       }
      </div>
    );
}

export default Chat
