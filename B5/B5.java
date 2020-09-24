import java.util.Scanner;

public class B5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String greetAgain ;
		do {
			System.out.println("Welcome !");
			System.out.println("Would you like to be greated again ? (Y/N)");
			greetAgain = scan.nextLine();
		} while (greetAgain.equals("Y"));		
		scan.close();
	
	}	
			
}