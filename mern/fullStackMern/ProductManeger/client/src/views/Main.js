import React ,{useState,useEffect} from 'react'

import axios from 'axios';
import Create from '../component/Create'
import ProductList from '../component/ProductList'


const Main = () => {
    const [product, setProduct] = useState([]);
    const [loaded, setLoaded] = useState(false);
    useEffect(()=>{
        axios.get('http://localhost:8000/api/Products/')
            .then(res=>{
                setProduct(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    });
  return (
    <div>
      <Create/>
      <br/>
      {loaded&&<ProductList product={product}/>}
    </div>
  )
}

export default Main
