import java.util.ArrayList;
import java.util.Random;
public class PuzzleJavaTest {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	char randomChar = generator.getRandomLetter();
        System.out.println(randomChar);
        String pass= generator.generatePassword();
         System.out.println(pass);
         ArrayList <Character> newPass=new ArrayList <Character>();
         newPass=generator.getNewPasswordSet(5);
          System.out.println(newPass);


	}


}