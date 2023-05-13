package inheritanceConcepts;

//parent class - StudentInherit 
// 2 Child - course & Exams

public class Exams extends StudentInherit{
	
	private int passMarks;

	public int getPassMarks() {
		return passMarks;
	}

	public void setPassMarks(int passMarks) {
		this.passMarks = passMarks;
	}
	
	
	public void ExamInfo()
    {
		System.out.println("Pass Mark:"+getPassMarks());
   
    	
    }

}
