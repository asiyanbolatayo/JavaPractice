package conditionalStatement;
import java.util.Scanner;
public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a scanner to obtain from command line
		Scanner input = new Scanner( System.in );
		
		int number1, //first number to compare
			number2; //second number to compare
		
		System.out.print( "Enter first number: "); //prompt
		number1 = input.nextInt(); //read first number and store in number1
		
		System.out.print( "Enter second number: "); //prompt
		number2 = input.nextInt(); //read second number and store in number1
		
		if ( number1 == number2 )
			System.out.printf( "%d == %d\n", number1, number2 );
		
		if ( number1 != number2 )
			System.out.printf( "%d != %d\n", number1, number2 );
		
		if ( number1 < number2 )
			System.out.printf( "%d < %d\n", number1, number2 );
		
		if ( number1 > number2 )
			System.out.printf( "%d > %d\n", number1, number2 );
		
		if ( number1 <= number2 )
			System.out.printf( "%d <= %d\n", number1, number2 );
		
		if ( number1 >= number2 )
			System.out.printf( "%d >= %d\n", number1, number2 );
	} // end method main

}// end class Comparison
