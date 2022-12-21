import React from 'react'
// import { Link } from '@reach/router'
import DeleteButton from './DeleteButton'

const Table = (props) => {
  return (
    <div>
       <table style={{margin:"0 auto"}}  border="1">
        <thead>
            <tr>
                <th>
                    Player Name
                </th>
                <th>
                    preferd position
                </th>
                <th>
                    Actions
                </th>
            </tr>
            </thead>
            <tbody>
            {props.data.map((item,i)=>
            <tr key={i}>
                <td>{item.name}</td>
                <td>{item.pos}</td>
               <td>
                <DeleteButton Id={item._id} name={item.name} successCallback={(e)=>props.removefromdom(item._id)} />
                </td>

            </tr>
            

            )
            }
            </tbody>




        </table>
      
    </div>
  )
}

export default Table
