//1-print code 1-20
console.log("odd number")
for(var i=1;i<=20;i++){
    if(i%2==1){
        console.log(i);
    }
}

//2-decreasing multiples of 3
console.log("decreasing multiples of 3")
for(i=100;i>=0;i--){
    if(i%3==0){
        console.log(i)
    }
}
//3-Print the sequence
console.log("Print the sequence")

for(i=4;i>=-3.5;i-=1.5){
    console.log(i);
}
//4-Sigma
console.log("Sigms")

var sum=0;
for(i=0;i<=100;i++){
    sum+=i
}
console.log(sum);
//5-Factorial
console.log("Factorial")
var product=1;
for(i=1;i<=12;i++){
    product*=i;
}
console.log(product)