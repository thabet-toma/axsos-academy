import React,{useState} from 'react'
import { Link, navigate } from '@reach/router'
import Create from '../component/Create'
import axios from 'axios'

const Add = () => {
    const [Authors,setAuthors]=useState("")
    const [errors, setErrors] = useState([]); 

    const handle=product1=>{
        axios.post('http://localhost:8000/api/Authors/new', product1)
               .then(res=> {setAuthors([...Authors, res.data]);navigate("/")})
               .catch(err=>{console.log(err)
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            })
       }
  return (
    <div>
      <Link to="/">Home</Link>
      <p>Add a new Author</p>
      {errors.map((err, index) => <p key={index}>{err}</p>)}
      <Create onSubmitProp={handle} initialName=""/>

    </div>
  )
}

export default Add
