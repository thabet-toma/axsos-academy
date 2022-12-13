import React from 'react'
import { useParams } from "react-router"; 
const TheIsAd = () => {
    const{str}=useParams()
    const{col1}=useParams()
    const{col2}=useParams()
  return (
    <div>
      <p style={{color:col1,backgroundColor:col2,height:"80px"}}>thw world is {str}</p>
    </div>
  )
}

export default TheIsAd
