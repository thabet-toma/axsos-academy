function ninjaBelt(ninja){
    console.log("55")
    return function belt(beltColor){ //note the closure here!
      console.log("Ninja "+ ninja + " has earned a " + beltColor +" belt.");
    }
  }
  ninjaBelt('Eileen') //note the double invocation here.