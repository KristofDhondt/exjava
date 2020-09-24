import java.util.ArrayList;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		boolean knowledgeRequired = false;
		
		ArrayList<String> instructors = new ArrayList<String>();
		
		/* courseTitle [0] = "Commandline";
		numberOfDays [0] =1;
		priceDay[0] = 124.50;
		*/ 
		
		Scanner scan = new Scanner(System.in);  
        System.out.println("Enter Course Title : ");

        String courseTitle = scan.nextLine();  
		
	    System.out.println("Enter Number of Days : ");
        int numberOfDays = scan.nextInt();  
		
		System.out.println("Enter Price per Day : ");
        double priceDay = scan.nextDouble();  
		
		scan.close();
		
		instructors.add("Jan");
		instructors.add("Kristof");
		instructors.add("Sandy");
		
		double totalPrice = (numberOfDays * priceDay * 1.21);
		
		System.out.println ("Course name " +courseTitle + " during " + numberOfDays + "day costs " + priceDay + " a day. " + "knowledge needed : " +knowledgeRequired);
		System.out.println ("number of intstructors : " + instructors.size());
		System.out.println ("Total price for this course = " + totalPrice);
		
	}	
			
}