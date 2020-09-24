import java.util.ArrayList;

public class A2{

	public static void main(String[] args) {
		String[] courseTitle = new String[3];
		int [] numberOfDays = new int[3];
		double [] priceDay = new double [3];
		String [] knowledgeRequired = new String[3];
		
		ArrayList<String> instructors = new ArrayList<String>();
		
		courseTitle [0] = "Commandline";
		numberOfDays [0] =1;
		priceDay[0] = 124.50;
		knowledgeRequired [0] = "Not required";
		
		instructors.add("Jan");
		instructors.add("Kristof");
		instructors.add("Sandy");
		
		
		System.out.println ("Course name " +courseTitle[0] + " during " + numberOfDays[0] + "day costs " + priceDay[0] + " a day. " + "knowledge needed : " +knowledgeRequired[0]);
		System.out.println ("number of intstructors : " + instructors.size());
		
	}	
			
}