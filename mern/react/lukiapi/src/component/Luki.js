
import React, { useEffect, useState } from "react";
import { navigate } from '@reach/router'
import axios from 'axios';



const Luki = (props) => {
   
   
    const [people,setPeople]=useState("")
    const [planets,setPlanets]=useState("")

    
       
      
        useEffect(() =>{
          
        axios.get("https://swapi.dev/api/"+props.search+"/"+props.id)
           
              // not the actual JSON response body but the entire HTTP response
              
          .then(response => {
                  if(props.search=="people"){
                  setPeople(response.data)
                  
                  
                   console.log(people);
              
                  }
                  else{
                      setPlanets(response.data)}
              
             
          }).catch(()=>{
              navigate("/error")
          })},[props.id])
    
  return (
    <div>
     
     


        {props.search=="people"? <div> <h1>{people.name}</h1>
                <p>hight:{people.height}</p>
                <p>mass:{people.mass}</p>
                <p>hair color:{people.hair_color}</p>
                <p>skin color:{people.skin_color}</p></div>:props.search=="planets"?  <div>
                <h1>{planets.name}</h1>
                <p>climate:{planets.climate}</p>
                <p>terrain:{planets.terrain}</p>
                <p>surface_water:{planets.surface_water}</p>
                <p>population:{planets.population}</p>
                </div>:<></>}
          
                
                 
            
                
               
              
            
    </div>
  )
}


export default Luki
