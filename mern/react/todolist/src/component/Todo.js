
import React, {useState}from 'react'

const Todo = () => {
    const [task,setTask]=useState("")
    const[tasks,setTasks]=useState([])
    const[isDone,setIsDone]=useState(false)
    
  const  handleSubmet=(e)=>{
    e.preventDefault()
    setTasks([...tasks,{'task':task,"isdone":isDone,'lineT': "none"}])
    }
    const handleSubmet1=(e,item)=>{
        item.isdone=e.target.checked; 
        item.isdone? item.lineT="line-through":item.lineT="none"
        setTasks([...tasks])
        console.log(item.lineT)
    }
    const delete1=(e)=>{
        setTasks(tasks=>tasks.filter(p=>p!==e))
    }

  return (
    <div>
      <form onSubmit={handleSubmet}>
        <input type="text" onChange={(e)=>setTask(e.target.value)}/>
        <button style={{backgroundColor:"blue"}}>Add</button>
      </form>
      {tasks.map((item,i)=><div key={i}><p  style={{textDecorationLine:item.lineT}}>{item.task}</p>
                <input  type="checkbox" checked={item.isDone} onChange={e => {handleSubmet1(e,item)}}/><button onClick={()=>delete1(item)}>delete</button>
              
            </div>)}
    </div>
  )
}

export default Todo
