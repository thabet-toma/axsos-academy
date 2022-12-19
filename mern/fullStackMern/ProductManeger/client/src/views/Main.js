import React ,{useState,useEffect} from 'react'

import axios from 'axios';
import Create from '../component/Create'
import ProductList from '../component/ProductList'
import DeleteButton from '../component/DeleteButton';


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
    const createProduct=product1=>{
     axios.post('http://localhost:8000/api/Products/new', product1)
            .then(res=> setProduct([...product, res.data]))
            .catch(err=>console.log(err))
    }
    const removeFromDom = personId => {
        
        setProduct(product.filter(person => person._id != personId))
    }

  return (
    <div>
      <Create onSubmitProp={createProduct} initialTitle="" initialPrice="" initialDesc=""/>
       
      <br/>
      {loaded&&<ProductList product={product} removeFromDom={removeFromDom} />}
    </div>
  )
}

export default Main
