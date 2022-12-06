import React, { Component } from 'react';


class PersonCard extends Component {
    render(){
    return(
         <div>
         <h1>{this.props.firstName},{this.props.lastName}</h1>
         <p>age:{this.props.age}</p>
        <p>hairColor:{this.props.color}</p>
        </div>)
    
 }}
export default PersonCard;