import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your language (NL/FR/EN): ");
		String language = scan.nextLine();
		
		
		scan.close();
		
		switch (language) {
			case "NL" : System.out.println("Goeiedag !");break;
			case "FR" : System.out.println("Bonjour !");break;
			case "EN" : System.out.println("Good day !");break;	
			default : System.out.println("Goeiedag, bonjour and good day !");break;
		}
		
	}	
			
}