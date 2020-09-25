import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;


public class E1 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);  
        System.out.println("Enter the first name of the instructor : ");

        String firstName = scan.nextLine();  
		
		System.out.println("Enter the last name of the instructor  : ");
		String lastName = scan.nextLine();
				
		System.out.println("Enter the age of the instructor : ");
		int instructorAge = 0;
		boolean instructorAgeCorrect = false;
		while (!(instructorAgeCorrect)) {
			try	{
				instructorAge = Integer.parseInt(scan.nextLine());  
				instructorAgeCorrect = true;
			}
			catch (NumberFormatException numExcept) { 
				System.out.println("Incorrect age introduced - please enter a valid age: ");
			}
		}
			
		scan.close();
		
		int startAge = 22;
		double startSalary = 2200.0;
		
		printSalaryHistory(firstName, lastName, instructorAge, startAge, startSalary );
			
	}	
	
	
	public static void printSalaryHistory(String firstName, String lastName, int instructorAge, int startAge, double startSalary){
		int senority = 0;
		double salary=startSalary;
		
		try {
		  FileWriter writer = new FileWriter("salaryhistory.txt");
		  BufferedWriter salaryInfo =  new BufferedWriter(writer);
		  for (int i=startAge; i <=instructorAge ; i+=5) {
			salaryInfo.write("Salary of " + firstName + " " + lastName + " at " + i + " is " + salary + ".\n");		
			if (senority < 35) {
				senority +=5;
				salary = salary * 1.03;
			} 
			else {
				salaryInfo.write ("Maximum salary reached");
				break;
			}
	 	    }
		salaryInfo.close();
		System.out.println ("Info written in salaryhistory.txt");
		}
		catch (IOException ioe) {
	      ioe.printStackTrace();
		  System.out.println  ("Error during writing on file");
		}
		
	}	
			
}