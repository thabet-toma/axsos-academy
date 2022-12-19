import React from 'react'
import { Link } from '@reach/router'
import axios from "axios"

const ProductList = (props) => {
    const deletePerson = (personId) => {
        axios.delete('http://localhost:8000/api/users/delete/'+ personId)
            .then(res => {
                // removeFromDom(personId)
            })
            .catch(err => console.error(err));
    }

  return (
    <div>
        {props.product.map( (pro, i) =>
        <div>
                <Link to={"/"+pro._id} key={i} >{pro.Title}</Link>
                <button onClick={(e)=>{deletePerson(pro._id)}}>
                        Delete
                    </button>
                <br/>
                </div>
            )}
    </div>
  )
}

export default ProductList

