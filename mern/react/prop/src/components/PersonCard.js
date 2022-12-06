import React, { Component } from 'react';


class PersonCard extends Component {
    constructor(props){
        super(props)
        this.state={age:this.props.age}}


    render(){
    return(
         <div>
         <h1>{this.props.firstName},{this.props.lastName}</h1>
         <p>age:{this.state.age}</p>
        <p>hairColor:{this.props.color}</p>
        <button onClick={() => { this.setState({ age: this.state.age+1 }) } }>birthday button for {this.props.firstName}</button>
        </div>)
    
 }}
export default PersonCard;