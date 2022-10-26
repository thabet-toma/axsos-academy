 nimport java.util.Random;
import java.util.ArrayList;
class  PuzzleJava{
    public  ArrayList <Integer> getTenRolls(){
       ArrayList <Integer> arr=new   ArrayList <Integer>();
        Random randMachine = new Random();
        for( Integer i=0;i<11;i++){
           
            
            arr.add(randMachine.nextInt(21)) ;
         
        }
        return arr;


    }
    public char getRandomLetter(){
 char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};         Random randMachine = new Random();
       
        int x=randMachine.nextInt(25);
        return alphabet[x];
    }
    public String generatePassword(){
        String pass="";
        for(int i=0;i<8;i++){
            pass+=getRandomLetter();

        }
        return pass;
    }
    public  ArrayList <Character> getNewPasswordSet(int length){
         ArrayList <Character> passNew =new  ArrayList <Character> ();
        for (int i=0;i<length;i++){
            passNew.add(getRandomLetter());

        }
        return passNew;

    }
}