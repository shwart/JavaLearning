package encapsulationConcepts;

public class StudentEncapmain {

	public static void main(String[] args) {
		
		StudentEncap encap = new StudentEncap();
		StudentEncap encap1 = new StudentEncap();
		
		// not touching the variables directly, only using the getter&setter methods
		
		encap.setRollNum(1);
		encap.setFirstName("John");
		encap.setLastName("Mark");
		encap.setBatch('A');
		encap.setCourse("Java");
		encap.setLearningJava(true);
		encap.StudentInfo();
		
		// Calling the getter method
		
		//System.out.println("First Name: "+encap.getFirstName());
		
		encap1.setRollNum(2);
		encap1.setFirstName("Jim");
		encap1.setLastName("Bot");
		encap1.setBatch('B');
		encap1.setCourse("Python");
		encap1.setLearningJava(false);
		
		encap1.StudentInfo();
		
		

	}

}
