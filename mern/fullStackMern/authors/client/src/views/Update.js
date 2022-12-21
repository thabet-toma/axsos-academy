import React, { useState, useEffect } from 'react'
import axios from 'axios';

import Create from '../component/Create'
import { Link, navigate } from '@reach/router';

const Update = (props) => {
    const [author, setAuthor]=useState("")
    const [loaded,setLoaded]=useState(false)
    const [errors, setErrors] = useState([]); 

    useEffect(() => {
        axios.get('http://localhost:8000/api/Authors/' + props.id)

            .then(res => {
                setAuthor(res.data);
                setLoaded(true)
               
                // console.log(res.data)

                console.log(author)

            },)
    }, []);
    const update = (product) => {

        axios.put('http://localhost:8000/api/Authors/update/' + props.id, product

        )
            .then(res =>{ console.log(res)
                navigate("/")
            })
            .catch(err => {console.log(err)
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
            <p>Edit this Author</p>
            {errors.map((err, index) => <p key={index}>{err}</p>)}
            {loaded &&<Create onSubmitProp={update} initialName={author.name} />}
        </div>
    )
}

export default Update

