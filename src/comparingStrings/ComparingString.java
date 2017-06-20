package comparingStrings;
import java.util.Scanner;
public class ComparingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
	        Scanner sc = new Scanner(System.in);

	        System.out.println("How is the weather?");
	        String answer = sc.nextLine();

	        if (answer.equals("rain"))
	            System.out.println("Take your umbrella!");
	        else if (answer.equals("windy"))
	            System.out.println("Wear your jacket!");
	        else if (answer.equals("snow"))
	            System.out.println("Wear a coat and take a shovel!");
	        else if (answer.equals("stormy"))
	        	System.out.println("You should stay inside");
	        else
	            System.out.println("Enjoy your day!");
	     }
	}


