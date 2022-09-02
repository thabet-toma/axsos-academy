
var num1;
var x;



var displayDiv = document.querySelector("#display")
function press(num){
    if(displayDiv.innerText==0){
        displayDiv.innerText=""
    }
    displayDiv.innerText += num;
    num1=Number(displayDiv.innerText)
    return num1;
    
    
}


function clr(){
displayDiv.innerText=""
}
function setOP(op){

    x= Number(displayDiv.innerText);
    displayDiv.innerText="";
    op1=op
return op1
    

}
function calculate() {
    if(op1=="+"){
displayDiv.innerText=x+num1;}
    if(op1=="*"){
displayDiv.innerText=x*num1;}
    if(op1=="-"){
displayDiv.innerText=x-num1;}
    if(op1=="/"){
displayDiv.innerText=x/num1;}
}