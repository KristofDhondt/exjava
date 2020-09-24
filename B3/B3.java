
public class B3 {

	public static void main(String[] args) {
		
		int[] numbers = {1,1,2,6,7,8,9,15,22,45,72,89,94};
		double total= 0;
		for (int index: numbers) { 
			total += index;
		}
		double avg = total/numbers.length;
			
		System.out.println("The average for numbers is " + avg);
	}	
			
}