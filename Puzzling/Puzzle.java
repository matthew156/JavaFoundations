import java.util.*;

class Puzzle {
public ArrayList<Integer> getTenRolls(){
    
    ArrayList<Integer> randomNums = new ArrayList<Integer>();
    Random rnd = new Random();
    for(int i = 1; i<=11; i++){
        randomNums.add(rnd.nextInt(21));
    }
    return randomNums;
}

    public static void main(String[] args) {
        Random random = new Random();

        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);

    }
    import java.util.Random;

public class Generator {
	public static String generateRandomPassword(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);

        
        //StringBuilder is very similar to the built in class StringBuffer. It essentially appends and inserts a given string.

        //This built in function is superior to StringBuffer in regards to speed. Use StringBuffer when handling multiple threads
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
}

