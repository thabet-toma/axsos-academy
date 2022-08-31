var hideName=document.querySelector(".name")
var hideFirst=document.querySelector(".first-request")
var hideSecond=document.querySelector(".second-request")
var add=document.querySelector(".connection-number")
var add2=document.querySelector(".your-connection-number")

var countConnectionNumber=2;
var yourCountConnectionNumber=500;



function change(){
    hideName.innerText="ameer baghadadi";
}
function removeFirst(){
hideFirst.remove();

}
function removeSecond(){
    hideSecond.remove();
    }
    function First(){
        countConnectionNumber--;
        yourCountConnectionNumber++;
       add.innerText=countConnectionNumber;
       add2.innerText="+ "+yourCountConnectionNumber

    }


    function removeNumF(){
        countConnectionNumber--;
       add.innerText=countConnectionNumber;
    }