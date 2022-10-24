// import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
// import java.util.Locale;  
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("hi,%s",name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date=new Date();
        return "Current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
            if (conversation.indexOf("Alexis")>=0){
                 return "Right away, sir. She certainly isn't sophisticated enough for that.";

            }
            else if(conversation.indexOf("Alfred")>=0){
                return "At your service. As you wish, naturally.";

            }
            else{
                return "Right. And with that I shall retire.";
            }
       
    }
    
	// NINJA BONUS
     public String guestGreeting(String name, String period){
        
            return "good "+period+name;
        

     }
    public String period(String name) {
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        String strDate = formatter.format(date); 
        int i=Integer.parseInt(strDate);  
         if(i>5 && i<12){
           return "good morning "+name;
         }
        else if (i>12&&i<17){
            return"good afternoon "+name;
        }
        else{
            return"good evening "+name;
        }

        }
        
    }
       
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!


