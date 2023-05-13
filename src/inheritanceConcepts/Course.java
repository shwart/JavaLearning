package inheritanceConcepts;

// parent class - StudentInherit 
// child class - Course

public class Course extends StudentInherit {
	
	private String courseName;
	private String instructorName;
	private int seats;
	
	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getInstructorName() {
		return instructorName;
	}



	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}



	public int getSeats() {
		return seats;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}


	
	
	 public void CourseInfo()
	    {
	    
	    	System.out.println("Course:"+getCourse());
	    	System.out.println("Instructor Name: "+getInstructorName());
	    	System.out.println("No of Seats:"+" "+getSeats());
	    	System.out.println();
	    }
	    

}
