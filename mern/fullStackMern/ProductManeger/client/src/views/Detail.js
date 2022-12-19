import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
import DeleteButton from '../component/DeleteButton';

const Detail = (props) => {
    const [product, setProdect] = useState({})
    useEffect(() => {
        axios.get('http://localhost:8000/api/products/'+props.id)
            .then(res => setProdect(res.data))
            .catch(err => console.error(err));
    }, []);
    const deleteProduct = (personId) => {
      
            navigate("/")
    }

  return (
    <div>
      <p>{product.Title}</p>
      <p>{product.Price}</p>
      <p>{product.Desc}</p>
      <DeleteButton personId={props.id} successCallback={deleteProduct}/>
    </div>
  )
}

export default Detail
