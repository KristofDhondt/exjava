public class A2{

	public static void main(String[] args) {
		String[] courseTitle = new String[3];
		int [] numberOfDays = new int[3];
		double [] priceDay = new double [3];
		String [] knowledgeRequired = new String[3];
		
		courseTitle [0] = "Commandline";
		numberOfDays [0] =1;
		priceDay[0] = 124.50;
		knowledgeRequired [0] = "Not required";
		
		courseTitle [1] = "HTML";
		numberOfDays [1] =2;
		priceDay[1] = 245;
		knowledgeRequired [1] = "Not required";
		
		courseTitle [2] = "JAVA";
		numberOfDays [2] =3;
		priceDay[2] = 244.50;
		knowledgeRequired [2] = "Commandline required";
		
		System.out.println ("Course name " +courseTitle[0] + " during " + numberOfDays[0] + "day costs " + priceDay[0] + " a day. " + "knowledge needed : " +knowledgeRequired[0]);
		System.out.println ("Course name " +courseTitle[1] + " during " + numberOfDays[1] + "day costs " + priceDay[1] + " a day. " + "knowledge needed : " +knowledgeRequired[1]);
		System.out.println ("Course name " +courseTitle[2] + " during " + numberOfDays[2] + "day costs " + priceDay[2] + " a day. " + "knowledge needed : " +knowledgeRequired[2]);
	}	
			
}