import React from 'react'
import { Link } from '@reach/router'
import DeleteButton from './DeleteButton'

const Table = (props) => {
  return (
    <div>
       <table border="1">
        <thead>
            <tr>
                <th>
                    Author
                </th>
                <th>
                    Action avallable
                </th>
            </tr>
            </thead>
            <tbody>
            {props.data.map((item,i)=>
            <tr key={i}>
                <td>{item.name}</td>
                <td><button><Link to={"/edit/"+item._id}>Edit</Link></button>
                <DeleteButton Id={item._id} successCallback={(e)=>props.removefromdom(item._id)} />
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
