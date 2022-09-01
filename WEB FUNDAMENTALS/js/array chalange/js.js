//first challenge
console.log("this is the first challenge")
function alwaysHungry(arr){
for(var i=0;i<arr.length;i++){
    if(arr[i]=="food"){
        console.log("yammy")
    }
    else{
        console.log("iam hungry")
    }
}
}
alwaysHungry([5,"food",4,"food"])
//second
console.log("this is the second challenge")
function highpass(arr,cutoff){
    var newArr=[];
    for(var i=0;i<arr.length;i++){
    if(arr[i]>cutoff){
        newArr.push(arr[i])
     
    } } 
    return newArr;
}

console.log(highpass([2,5,6,5,2,3,4],4))
//third
console.log("this is the third challenge")

function betterThanAverage(arr) {
    var sum = 0;
     for(var i=0;i<arr.length;i++){
        sum+=arr[i]
     }
     var avg=sum/arr.length
     var count = 0;
     for(var i=0;i<arr.length;i++){
    if(arr[i]>avg){
        count++
    }
}
    return count;
}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); // we expect back 4
//fourth
console.log("this is the fourth challenge")

function reverse(arr) {
    var newarr=[];
    for(var i=(arr.length-1) ;i>=0;i--){
      newarr.push(arr[i]);
    }
    return newarr;
}
   
var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]
//fifth
console.log("this is the fifth challenge")
function fibonacciArray(n) {
    // the [0, 1] are the starting values of the array to calculate the rest from
    var fibArr = [0, 1];
     for(var i=2;i<n;i++){
       fibArr[i]=fibArr[i-1]+fibArr[i-2]
     }
    return fibArr;
}
   
var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]


