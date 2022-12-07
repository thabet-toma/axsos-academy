import React ,{ useState } from 'react'
const btnStyle = {
    paddingLeft: '0px',
    margin:'0 auto',
    marginTop:'20px',
    width:'30%',

    fontFamily: 'Arial, sans-serif',
    
    background: '#f6f6f6', 
   
    border: 'none ',
    textAlign:'start'
};

const Form = (props) => {
    const [fname,setFname]=useState("")
    const [lname,setLname]=useState("")
    const [email,setEmail]=useState("")
    const [pass,setPass]=useState("")
    const [confirmPass,setconfirmPass]=useState("")
    const [fnameError,setFnameError] = useState("")
    const [lnameError,setLnameError] = useState("")
    const [emailError,setEmailError] = useState("")
    const [passError,setPassError] = useState("")
    const [ConfirmPassError,setConfirmPassError] = useState("")

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { fname,lname, email, pass,confirmPass };
        
    };
    const handleFirstName = (e) => {
        setFname(e.target.value);
        if( e.target.value==""){
            setFnameError("");
        }
        else if(e.target.value.length < 2){
            setFnameError("first name must be at least 2 char");}
        else {
            setFnameError("");
        }
    }
    const handleLastName = (e) => {
        setLname(e.target.value);
        if(e.target.value.length < 2) {
            setLnameError("last name must be at least 2 char");}
        else {
            setLnameError("");
        }
    }
    const handleEmail = (e) => {
        setEmail(e.target.value);
        if(e.target.value.length < 2) {
            setEmailError("email must be at least 2 char");}
        else {
            setEmailError("");
        }
    }
    const handlePass = (e) => {
        setPass(e.target.value);
        if(e.target.value.length <8 ) {
            setPassError("passwoed must be at least 8 char");}
       
        else{
            setPassError("")
        }
    }
    const handleconPass = (e) => {
        setconfirmPass(e.target.value);
        if(e.target.value!=pass ) {
            setConfirmPassError("password and confirm must match");}
       
        else{
            setConfirmPassError("")
        }
    }

  return (
    <div>
  <form onSubmit={ createUser }>
            <div  style={ btnStyle }>
                <label>first name: </label> 
                <input type="text" onChange={ handleFirstName } />
                {
                    fnameError ?
                    <p style={{color:'red'}}>{ fnameError }</p> :
                    ''
                }
            </div>
            <div  style={ btnStyle }>
                <label>last name: </label> 
                <input type="text" onChange={handleLastName} />
                {
                lnameError ?
                    <p style={{color:'red'}}>{ lnameError }</p> :
                    ''
                }
            </div>
            <div  style={ btnStyle }>
                <label>Email Address: </label> 
                <input type="text" onChange={ handleEmail } />
                {
                emailError ?
                    <p style={{color:'red'}}>{ emailError }</p> :
                    ''
                }
            </div>
            <div  style={ btnStyle }>
                <label>Password: </label>
                <input type="text" onChange={ handlePass } />
                {
                passError ?
                    <p style={{color:'red'}}>{ passError }</p> :
                    ''
                }
                
            </div>
            <div  style={ btnStyle }>
                <label>Confirm Password: </label>
                <input type="text" onChange={ handleconPass } />
                {
                ConfirmPassError ?
                    <p style={{color:'red'}}>{ ConfirmPassError }</p> :
                    ''
                }
            </div>
            <input type="submit" value="Create User" />
        </form>
        <p>your form data</p>
        <p>first Name: {fname}</p>
        <p>last Name: {lname}</p>
        <p>email: {email}</p>
        <p>password: {pass}</p>
        <p>confirm password: {confirmPass}</p>
    </div>
  )
}

export default Form
