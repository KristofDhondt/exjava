import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
			
		welcomeLoop();
		
	}	
	
	public static void welcomeLoop (){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome !");
		System.out.println("Would you like to be greated again ? (Y/N)");
		String greetAgain = scan.nextLine();

		if (greetAgain.equals("Y") || greetAgain.equals("y")) {
			welcomeLoop();
		}
		scan.close();
	}
	
			
}