import React from 'react'
import axios from 'axios';
    
export default props => {
    
    
    
    const deletePerson = e => {
        axios.delete('http://localhost:8000/api/Authors/delete/' + props.Id)
            .then(res=>{
                props.successCallback();
            })
    }
    
    return (
        <button onClick={deletePerson}>
            Delete
        </button>
    )
}