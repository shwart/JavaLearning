package inheritanceConcepts;

public class StudentInheritmain {

	public static void main(String[] args) {


		Course course = new Course();

		// Parent - child 
		// Calling the parent methods with child object

		System.out.println("Single Inheritence");
		System.out.println("*************************");
		course.setRollNum(2);
		course.setFirstName("Jim");
		course.setLastName("Bot");
		course.setBatch('B');
		course.setCourse("Python");
		course.setLearningJava(false);
		course.setCourseName("Python");
		course.setInstructorName("Gill");
		course.setSeats(15);

		course.StudentInfo();
		course.CourseInfo();


		// parent-child-grand child 
		// Calling the grand parent methods & parent methods with grand child object

		System.out.println("Multilevel Inheritence");
		System.out.println("**************************");

		CourseDetails course1 = new CourseDetails();

		course1.setRollNum(3);
		course1.setFirstName("John");
		course1.setLastName("Bolt");
		course1.setBatch('A');
		course1.setCourse("Java");
		course1.setLearningJava(true);
		course1.setCourseName("Java");
		course1.setInstructorName("Mia");
		course1.setSeats(10);
		course1.setCourseTopics("Testing");
		course1.setDuration(40);
		course1.StudentInfo();
		course1.CourseInfo();
		course1.CourseDetailsInfo();

		Exams exams = new Exams();



		System.out.println("Hierarchical Inheritence");
		System.out.println("*************************");

		/*
		 * Single parent - multiple child Calling the parent methods with child objects
		 * All child classes can access the method of class StudentInherit
		 * 
		 */

		course.setSeats(15);	
		course.StudentInfo();

		exams.setRollNum(3);
		exams.setFirstName("Jo");
		exams.setLastName("Gilt");
		exams.setBatch('A');
		exams.setCourse("Testing");
		exams.setLearningJava(false);
		exams.setPassMarks(20);
		exams.StudentInfo();
		exams.ExamInfo();



	}

}
