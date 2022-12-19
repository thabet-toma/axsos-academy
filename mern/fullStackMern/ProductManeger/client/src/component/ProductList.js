import React from 'react'
import { Link } from '@reach/router'
import axios from "axios"
import DeleteButton from './DeleteButton'

const ProductList = (props) => {
    // const deletePerson = (personId) => {
    //     axios.delete('http://localhost:8000/api/users/delete/'+ personId)
    //         .then(res => {
    //             // removeFromDom(personId)
    //         })
    //         .catch(err => console.error(err));
    // }
    

  return (
    <div>
        {props.product.map( (pro, i) =>
        <div>
                <Link to={"/"+pro._id} key={i} >{pro.Title}</Link>
                <DeleteButton personId={pro._id} successCallback={()=>props.removeFromDom(pro._id)}/>
                <br/>
                </div>
            )}
    </div>
  )
}

export default ProductList

