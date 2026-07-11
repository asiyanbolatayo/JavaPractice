import java.util.Scanner;
public class SessionManager 
{
	private Calculator calculator = null;
	
	public SessionManager(Calculator calculator)
	{
		this.calculator = calculator;
	}
	
	public void Start(Scanner scanner)
	{
		//begin
		//1. validate calculator
		if (calculator == null)	
		{
			System.out.println("Operation Error: No calculator found..");
			return;
		}
		// 2. validate scanner
		if (scanner == null)
		{
			System.out.println("Operation Error: No scanner found..");
			return;
		}
		//3. Start session
		//3.1 Display start session message
		System.out.println("\n\tCalculator Session begins...");
		System.out.println("\n\tEnter Input after the > sign in the format 'x + y' or 'end' to Terminate");
		// 3.2 Execute session loop until user terminates with end command
		while (true)
		{
			//4. ask for prompt
			System.out.print("...>");
			//5. read prompt
			String prompt = scanner.nextLine().toLowerCase();
			//6. if prompt is "end" terminate session
			if (prompt.compareTo("end") == 0)
				break;
			//7. execute prompt and continue
			calculator.Exec(prompt);
		    System.out.println("acc = " + calculator.getAcc());
;		}
		//3.3 end session
		System.out.println("\n\tSession ends...");
	}
	
	
}
