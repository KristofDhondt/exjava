
import java.io.IOException;

public class F2 {

	public static void main(String[] args) {
		
		try {
			Instructor inst1 = new Instructor("Kristof","Dhondt",47,22,2200.0);
			inst1.printSalaryHistory();
		}		
		catch (IOException ioe){
			System.out.println(ioe.getMessage());
		} 
	 
	}
}		
	