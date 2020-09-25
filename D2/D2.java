import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;


public class D2 {

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
		
		double totalPrice = calculateTotalPrice(numberOfDays, priceDay, knowledgeRequired);
		printInfo(courseTitle, numberOfDays, priceDay, knowledgeRequired);
		
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
			
		instructors.add("Jan");
		instructors.add("Kristof");
		instructors.add("Sandy");
		
		System.out.println ("number of instructors : " + instructors.size());
				

		System.out.println ("Total price for this course = " + totalPrice);
		System.out.println("The price for this course is " + category);	
		
	}	
	
		
	public static void printInfo(String courseTitle, int numberOfDays, double priceDay, boolean knowledgeRequired) {	
		try {
		  FileWriter writer = new FileWriter("courseinfo.txt");
		  BufferedWriter courseInfo =  new BufferedWriter(writer);
	
		  courseInfo.write("Course name " +courseTitle + " during " + numberOfDays + "day costs " + priceDay + " a day. " + "Knowledge needed : " +knowledgeRequired);
		  //*System.out.println ("Course name " +courseTitle + " during " + numberOfDays + "day costs " + priceDay + " a day. " + "knowledge needed : " +knowledgeRequired);
		  double totalPrice = calculateTotalPrice(numberOfDays, priceDay, knowledgeRequired);
          //*System.out.println ("Total price for this course = " + totalPrice);
		  courseInfo.write ("  The total price for this course = " + totalPrice);
		  courseInfo.close();
		  System.out.println ("Info written in courseinfo.txt");
	 	  }
		catch (IOException ioe) {
	      ioe.printStackTrace();
		  System.out.println  ("Error during writing on file");
		 }
	}	
	
	      		
	public static double calculateTotalPrice(int numberOfDays, double priceDay, boolean knowledgeRequired ){
		
		double totalPrice = numberOfDays * priceDay;
		
		if (!(numberOfDays>3 && knowledgeRequired)) {
			totalPrice*=1.21;  //* also VAT should be payed
		}
		return totalPrice; 
	}
		

			
}