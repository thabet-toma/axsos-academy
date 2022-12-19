import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';

const Detail = (props) => {
    const [product, setProdect] = useState({})
    useEffect(() => {
        axios.get('http://localhost:8000/api/products/'+props.id)
            .then(res => setProdect(res.data))
            .catch(err => console.error(err));
    }, []);
    const deletePerson = (personId) => {
        axios.delete('http://localhost:8000/api/users/delete/'+ personId)
            .then(res => {
                // removeFromDom(personId)
            })
            .catch(err => console.error(err));
            navigate("/")
    }

  return (
    <div>
      <p>{product.Title}</p>
      <p>{product.Price}</p>
      <p>{product.Desc}</p>
      <button onClick={(e)=>{deletePerson(props.id)}}>
                        Delete
                    </button>
    </div>
  )
}

export default Detail
