function remove(){
    document.querySelector(".cookie").remove()
}
x=document.querySelector
var max=[document.querySelector(".max1").innerText,document.querySelector(".max2").innerText,document.querySelector(".max3").innerText,document.querySelector(".max4").innerText]
var min=[document.querySelector(".min1").innerText,document.querySelector(".min2").innerText,document.querySelector(".min3").innerText,
document.querySelector(".min4").innerText]
var max1=[parseInt(max[0],10),parseInt(max[1],10),parseInt(max[2],10),parseInt(max[3],10)]
var min1=[parseInt(min[0],10),parseInt(min[1],10),parseInt(min[2],10),parseInt(min[3],10)]
var max2=[(max1[0]*(9/5)+32),(max1[1]*(9/5)+32),(max1[2]*(9/5)+32),(max1[3]*(9/5)+32)]
var min2=[(min1[0]*(9/5)+32),(min1[1]*(9/5)+32),(min1[2]*(9/5)+32),(min1[3]*(9/5)+32)]


function convert(elm){
    for(var i=0;i<4;i++){
        if(elm.value=='f'){
            document.querySelector(".max"+(i+1)).innerText=Math.floor(max1[i]*(9/5)+32)
            document.querySelector(".min"+(i+1)).innerText=Math.floor(min1[i]*(9/5)+32)
        }
        if(elm.value=='c'){
            document.querySelector(".max"+(i+1)).innerText=Math.floor((max2[i]-32)*(5/9))
            document.querySelector(".min"+(i+1)).innerText=Math.floor((min2[i]-32)*(5/9))
        }
    }
}


    

