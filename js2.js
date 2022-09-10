function noblanks(str){
    var temp=""
    for(var i=0;i<str.length;i++){
    if(str[i]==" "){
    temp=str[i];
    str[i]=str[i+1];
    str[i+1]=temp
    
    
    }  
    }
    return str
    }
    console.log(noblanks("thabet toma,,,"))