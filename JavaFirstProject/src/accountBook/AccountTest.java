package accountBook;
//Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account( 50.00 ); // create Account object
		Account account2 = new Account( 500.35 ); // create Account object
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f\n",
				account1.getBalance());
		System.out.printf( "account2 balance: $%.2f\n\n",
				account2.getBalance());
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		double depositAmount; // deposit amount read from user
		double withdrawalAmount; // withdrawal amount read from user
		
		System.out.print("Do you want to deposit or withdraw money?\nEnter 1 for deposit and 2 for withdrawal:\n");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			System.out.print("Enter deposit amount for account1: "); //prompt
			depositAmount = input.nextDouble(); //obtain user input
			System.out.printf( "\naddiing %.2f to account1 balance\n\n", depositAmount);
			account1.credit(depositAmount); //add to account1 balance
			break;
		
		case 2:
			System.out.print("Enter withdrawal amount for account1: "); //prompt
			withdrawalAmount = input.nextDouble(); //obtain user input
			if (withdrawalAmount > account1.getBalance()) {
				System.out.print("Operation not allowed\nYou can't withdraw more than your balance");
				return;
			}
			System.out.printf( "\nsubtracting %.2f from account1 balance\n\n", withdrawalAmount);
			account1.debit(withdrawalAmount); //debit from account1 balance
			
		default: //Default option
			System.out.println("Operation not allowed. Please enter 1 or 2.");
			break;
		}
		
		//display balance
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());
		
		
		//Account2 credit or debit
		System.out.print("Do you want to deposit or withdraw money?\nEnter 1 for deposit and 2 for withdrawal:\n");
		choice = input.nextInt();
		
		switch (choice) {
		case 1:
			System.out.print("Enter deposit amount for account2: "); //prompt
			depositAmount = input.nextDouble(); //obtain user input
			System.out.printf( "\naddiing %.2f to account2 balance\n\n", depositAmount);
			account2.credit(depositAmount); //add to account1 balance
			break;
		
		case 2:
			System.out.print("Enter withdrawal amount for account2: "); //prompt
			withdrawalAmount = input.nextDouble(); //obtain user input
			if (withdrawalAmount > account2.getBalance()) {
				System.out.print("Operation not allowed\nYou can't withdraw more than your balance");
				return;
			}
			System.out.printf( "\nsubtracting %.2f from account2 balance\n\n", withdrawalAmount);
			account2.debit(withdrawalAmount); //debit from account1 balance
			
		default: //Default option
			System.out.println("Operation not allowed. Please enter 1 or 2.");
			break;
		}
		
		//display balance
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

	} //end main

} //end class AccountTest
