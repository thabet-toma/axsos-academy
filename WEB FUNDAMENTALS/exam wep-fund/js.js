itemCartNumber=document.querySelector(".search figure p");
// this function will increase the number of item in the cart
count=0; 
function increaseItemCart() {
    count++;  
    itemCartNumber.innerText=count;
}
// this function will alert a message about how to contact the store
function messageAlertContact (){
    alert("Alert contact us at 555-555")
}
//this function will update the text stating how the product are store
textStating=document.querySelector(".sort p span");
function sortProduct(elm){
    textStating.innerText=" "+elm.value
}