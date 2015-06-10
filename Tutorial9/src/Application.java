import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		System.out.println("Press 1 to start the machine :");
		System.out.println("Press 0 to stop the machine :");
		
		Scanner Value = new Scanner(System.in);
		
		int number = Value.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("Machine stsrted...");
			break;
		case 0:
            System.out.println("Machine shutdown...");
		default:
			System.out.println("improper in put");
		}

	}

}
