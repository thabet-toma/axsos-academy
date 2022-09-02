var hrdeg=document.querySelector("#hour")
var mdeg=document.querySelector("#minutes")
var sdeg=document.querySelector("#seconds ")


function getSecondsSinceStartOfDay() {
    return new Date().getSeconds() + 
      new Date().getMinutes() * 60 + 
      new Date().getHours() * 3600;
  }
      
  setInterval( function() {
      var time = getSecondsSinceStartOfDay();
      
      hr=Math.floor(time/3600);
      m=Math.floor((time-hr*3600)/60)
      s=time-hr*3600-m*60
      if(hr>12){
        hr=hr-12}
        if(hr<=6){
        hrdeg1=180+hr*30;
      hrdeg.style.transform="rotate("+hrdeg1+"deg)";}
        if(hr>6){
        hrdeg1=((hr-6)*30)
      hrdeg.style.transform="rotate("+ hrdeg1+"deg)";}
      if(m<=30){
        mdeg1=180+6*m
        mdeg.style.transform="rotate("+mdeg1+"deg)";
      }
      if(m>30){
        mdeg1=(m-30)*6
        mdeg.style.transform="rotate("+mdeg1+"deg)";
      }
      if(s<=30){
        sdeg1=180+6*s
        sdeg.style.transform="rotate("+sdeg1+"deg)";

      }
      if(s>30){
        sdeg1=(s-30)*6
        sdeg.style.transform="rotate("+sdeg1+"deg)";

      }


      
   

    
    

  }, 1000);
  