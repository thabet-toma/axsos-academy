  import java.util.HashMap;
  import java.util.Set;
public class Hash {
    public static void main(String[] args){
      
HashMap<String, String> trackList = new HashMap<String, String>();
trackList.put("hello","hello its me i have wondring if u are here hello");
trackList.put("my ego","i fight my ego ");
trackList.put("sky full","let the skyful when it Crumblus ");
trackList.put("unstobble","i am unstobble  ");
String secondSong = trackList.get("my ego");
System.out.println(secondSong);
 Set<String> keys = trackList.keySet();
  for(String key : keys) {
            System.out.println(key+":"+trackList.get(key));
            
        }


    }
}