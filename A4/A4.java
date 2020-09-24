import java.util.ArrayList;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		int numberOfDays;
		double priceDay;
		
		boolean knowledgeRequired = false;
		
		ArrayList<String> instructors = new ArrayList<String>();
		
		String courseTitle = args[0];
		numberOfDays = Integer.parseInt(args[1]);
		priceDay = Double.parseDouble(args[2]);
		
		
		/*
		courseTitle = "Commandline";
		numberOfDays =1;
		priceDay = 124.50;
		*/
		
		instructors.add("Jan");
		instructors.add("Kristof");
		instructors.add("Sandy");
		
		double totalPrice = (numberOfDays * priceDay * 1.21);
		
		System.out.println ("Course name " +courseTitle + " during " + numberOfDays + "day costs " + priceDay + " a day. " + "knowledge needed : " +knowledgeRequired);
		System.out.println ("number of intstructors : " + instructors.size());
		System.out.println ("Total price for this course = " + totalPrice);
		
	}	
			
}