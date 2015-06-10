
/*public class Application {

	public static void main(String[] args) {
		int myInt = 10;
		 
		if(myInt < 15){
			System.out.println("Yes, it's true!");
		}
		else if(myInt < 5){
			System.out.println("Yes, it's false!");
		}
		else{
			System.out.println("None of the above");
		}

	}

}*/
public class Application {
	public static void main(String[] args) {
		int loop = 0;
		while(true){
			System.out.println("Looping: " + loop);
			
			if(loop == 5){
				break;
			}
			loop++;
			
			System.out.println("Running");
			
		}
	}
}
