import React ,{useState,useEffect} from 'react'

import Table from '../component/Table';
import { Link } from '@reach/router';
import axios from 'axios'
const Main = () => {
    const [authors,setAuthors]=useState("")
    const [loaded, setLoaded] = useState(false);
    useEffect(()=>{
        axios.get('http://localhost:8000/api/Authors/')
            .then(res=>{
                setAuthors(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    });
    const removeFromDom = personId => {
        
        setAuthors(authors.filter(person => person._id != personId))
    }
  return (
    <div>
       
        <Link to="/new">Add new Author</Link>
        <p>we have quotes by:</p>
        {loaded &&
        <Table removefromdom={removeFromDom} data={authors} />}
       
    </div>
  )
}

export default Main
