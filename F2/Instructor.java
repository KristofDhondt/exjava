import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;


public class Instructor {
	
	private String firstName;
	private String lastName;
	private int age;
	private int startAge;
	private double startSalary;

	public Instructor(String firstName, String lastName, int age, int startAge, double startSalary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.startAge=startAge;
		this.startSalary=startSalary;
	}

	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}

	public void setStartAge(int startAge) {
		this.startAge = startAge;
	}	
	
	public int getStartAge() {
		return startAge;
	}
	
	public void setStartSalary(double startSalary) {
		this.startSalary=startSalary;
	}
	
	public double getStartSalary() {
		return startSalary;
	}
	

	public void printSalaryHistory()  throws IOException {
		int senority = 0;
		double salary=startSalary;
		
		FileWriter writer = new FileWriter("salaryhistory.txt");
		BufferedWriter salaryInfo =  new BufferedWriter(writer);
		for (int i=startAge; i <=age ; i+=5) {
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
			
}