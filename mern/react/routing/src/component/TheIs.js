import React from 'react'
import { useParams } from "react-router"; 

const TheIs = () => {
    const { str } = useParams();
  return (
    <div>
      {isNaN(+str)? <h1>the world is{str}</h1>:<h1>the number is {str}</h1>}
    </div>
  )
}

export default TheIs
