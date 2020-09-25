import java.util.ArrayList;
import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		
		boolean knowledgeRequired = true;
		
		ArrayList<String> instructors = new ArrayList<String>();
		
		/* courseTitle [0] = "Commandline";
		numberOfDays [0] =1;
		priceDay[0] = 124.50;
		*/ 
		
		Scanner scan = new Scanner(System.in);  
        System.out.println("Enter Course Title : ");

        String courseTitle = scan.nextLine();  
		
		System.out.println("Enter Number of Days : ");
		int numberOfDays = 0;
		boolean numberDaysCorrect = false;
		while (!(numberDaysCorrect)) {
			try	{
				numberOfDays = Integer.parseInt(scan.nextLine());  
				numberDaysCorrect = true;
			}
			catch (NumberFormatException numExcept) { 
				System.out.println("Incorrect data introduced - please enter a valid Number of Days: ");
			}
		}
		
		System.out.println("Enter Price per Day : ");
		double priceDay = 0.0;
		boolean priceDayCorrect = false;
		while (!(priceDayCorrect)) {
			try {
				priceDay = Double.parseDouble(scan.nextLine()); 
				priceDayCorrect = true;
			}
			catch (NumberFormatException priceExcept) {
				System.out.println("Incorrect data introduced - please enter a valid Price per Day: ");
			}
		}	
		
		scan.close();
		
		instructors.add("Jan");
		instructors.add("Kristof");
		instructors.add("Sandy");
		
		double totalPrice = numberOfDays * priceDay;
		
		if (!(numberOfDays>3 && knowledgeRequired)) {
			totalPrice*=1.21;  //* also VAT should be payed
		}
		
		String category;
		if (totalPrice < 500) {
		   category = "CHEAP";
		}
		else if (totalPrice > 1500) {
			category = "EXPENSIVE";
		}
		else { 
			category = "OK";
		}	
	
		System.out.println ("Course name " +courseTitle + " during " + numberOfDays + "day costs " + priceDay + " a day. " + "knowledge needed : " +knowledgeRequired);
		System.out.println ("number of instructors : " + instructors.size());
		System.out.println ("Total price for this course = " + totalPrice);
		
		System.out.println("The price for this course is " + category);	
	
	}
			
}