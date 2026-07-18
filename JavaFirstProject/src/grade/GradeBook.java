package grade;


public class GradeBook 
{
	//declaring an instance variable
	private String courseName; // course name for this GradeBook
	private String instructorName; 
	
	// constructor initializes courseName with String argument
	public GradeBook( String name, String instructor ) // constructor name is class name
	{
		courseName = name; // initializes courseName
		instructorName = instructor;
	} // end constructor
	
//	//method to set the course name
//	public void setCourseName( String name) {
//		courseName = name; //store the course name
//	}// end method setCourseName
	
	//method to retrieve the course name
	public String getCourseName() {
		return courseName;
	}// end method getCOurseName
	
	public String getInstructorName() {
		return instructorName;
	}// end method getInstructorName
	
	// Display a welcome message to the GradeBook user
	public void displayMessage() {
		//call the getCoursename to get the name of 
		//the course this GradeBook represents
		System.out.printf("Welcome to the Grade book for \n%s!\n", 
				getCourseName());
	} // end method displayMessage
} //end class GradeBook
