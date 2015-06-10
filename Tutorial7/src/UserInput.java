import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		//Create scanner object
				Scanner input = new Scanner(System.in);
				
				//Output the prompt
				System.out.println("Enter a floating point value:");
				
				//Wait for user to enter something 
				 double Value = input.nextDouble();
				
				//Tell them what they entered.
				System.out.println("You entered : " + Value);
				
				System.out.println();
				
				System.out.println("Enter a integer value:");
				int Value1 = input.nextInt();
				System.out.println("You entered :" + Value1);
				
				System.out.println();
				
				
				System.out.println("Enter a string");
				String Line = input.nextLine();
				System.out.println("You entered :" + Line);
				
				
				

	}

}
