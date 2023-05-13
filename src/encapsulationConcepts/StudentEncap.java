package encapsulationConcepts;

public class StudentEncap {
	

/*Encapsulation is about hiding the data from other classes
It is achieved by Variable declaring as Private -( not accessible outside class) & providing the public getter and setter methods
*/	
	
		private int rollNum;
		private String firstName;
		private String lastName;
		private char batch;
		private String course; 
		private boolean learningJava;
		
		
		/*
		 * getter and setter methods to get&set the values 
		 * setter- to set the values
		 * getter - to retrieve values
		 */
		
		
		public int getRollNum() {
			return rollNum;
		}
		public void setRollNum(int rollNum) {
			this.rollNum = rollNum;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public char getBatch() {
			return batch;
		}
		public void setBatch(char batch) {
			this.batch = batch;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public boolean isLearningJava() {
			return learningJava;
		}
		public void setLearningJava(boolean learningJava) {
			this.learningJava = learningJava;
		}
		
        
		 public void StudentInfo()
		    {
		    
		    	System.out.println("Student ID:"+getRollNum());
		    	System.out.println("Name: "+getFirstName()+" "+getLastName());
		    	System.out.println("Batch:"+" "+getBatch());
		    	System.out.println("Course:"+getCourse());
		    	System.out.println("Is student learning Java?:"+isLearningJava());
		    	System.out.println("======================================");
		    	
		        
		    }
        
       
        }

