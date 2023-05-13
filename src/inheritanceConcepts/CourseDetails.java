package inheritanceConcepts;


//grand parent class - StudentInherit , parent class - Course, child class -course details


public class CourseDetails extends Course{
	
	private String courseTopics;
	private int Duration;
	
	public String getCourseTopics() {
		return courseTopics;
	}


	public void setCourseTopics(String courseTopics) {
		this.courseTopics = courseTopics;
	}


	public int getDuration() {
		return Duration;
	}


	public void setDuration(int duration) {
		Duration = duration;
	}


	

	
	public void CourseDetailsInfo()
    {
		System.out.println("Course Topic:"+getCourseTopics());
    	System.out.println("Course Duration:"+getDuration());
    	System.out.println();
    	
    }

}
