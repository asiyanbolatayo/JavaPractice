package grade;
//import java.util.Scanner;

//Creating a GradeBook object and calling its displayMessage method.

public class GradeBookTest {
	//main method begins here
	public static void main(String[] args) {
		
		// create GradeBook object
		GradeBook gradeBook1 = new GradeBook(
				"CS101 Introduction to Java Programming", "Muahmmed Bibitayo" );
		GradeBook gradeBook2 = new GradeBook(
				"CS102 Data Structures in Java", "Tayo Muhammed");
		
		System.out.printf( "gradeBook1 course name is: %s\n", 
				gradeBook1.getCourseName() );
		System.out.printf( "gradeBook1 instructor name is: %s\n", 
				gradeBook1.getInstructorName() );
		System.out.printf( "gradeBook2 course name is: %s\n", 
				gradeBook2.getCourseName() );
		System.out.printf( "gradeBook2 instructor name is: %s\n", 
				gradeBook2.getInstructorName() );
		// create a scanner to obtain input
//		Scanner input = new Scanner(System.in );
//		// create a GradeBook object and assign it to myGradeBook
//		//GradeBook myGradeBook = new GradeBook();
//		
//		
//		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
//		//String nameOfCourse = input.nextLine(); //read a line of text
//		// prompt for and read course name
//		System.out.println("Please enter the course name:" );
//		String theName = input.nextLine();
//		myGradeBook.setCourseName( theName ); //set the course name
//		System.out.println(); //outputs a blank line
//		
//		// display welcome message after specifying course name
//		myGradeBook.displayMessage();
	}//end main

}//end class GradeBookTest
