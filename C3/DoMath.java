public class DoMath {

	public static double calculateAverage(int[] givenNumbers) {
		
		double total= 0;
		for (int index: givenNumbers) { 
			total += index;
		}
		double avg = total/givenNumbers.length;
		return avg;
		
	}	
				
}