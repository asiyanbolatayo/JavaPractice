
// Text-printing program.

import java.util.Scanner;

public class welcome
{
	// main method begins execution of Java application
	public static void main( String[] args )
	{
		//System.out.println( "Welcome \nto \nJava \nProgramming!" );
		System.out.printf( "%s\n%s\n", "Welcome to", "Java Programming!" );
		//addtwonumbers();
		//testExclusiveOROperator();
		//testCalculator();
	} // end method main
	
	
	
	// Method to add and multiple two numbers
	
	public static void addtwonumbers()
	{
	    new AddTwoNumbers();
	    AddTwoNumbers.testExclusiveOROperator();
	}

	// Method to run the calculator
	public static void testCalculator()
	{
		Scanner scanner = new Scanner( System.in );
		
		Calculator calculator = new Calculator();
		calculator.setInfo("Muhammed Asiyanbola");
		System.out.println(calculator.getInfo());
		SessionManager sessionmanager = new SessionManager(calculator);
		sessionmanager.Start(scanner);
		
		
	}
} // end class Welcome
