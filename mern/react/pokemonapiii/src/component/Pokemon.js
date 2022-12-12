import React, {useState} from 'react'

const Pokemon = (props) => {
    const [pokemon, setPokemon] = useState([]);
    
 
   const rtt =() => {
        fetch('https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0')
            .then(response => response.json())
            .then(response => setPokemon(response.results.map((e)=>e.name)))
    };
  return (
    <div>
      <button onClick={rtt}>fetch bokemon</button>
      {
        pokemon.map((e,i)=><p key={i}>{e}</p>)
      }
    </div>
  )
}

export default Pokemon
