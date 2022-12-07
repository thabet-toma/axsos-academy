import React from 'react'

const Art = (props) => {
    return (
        <div>
          <h1>{props.firstName},{props.lastName}</h1>
          <p>{props.age}</p>
          <p>{props.color}</p>
        </div>
      )
}

export default Art
