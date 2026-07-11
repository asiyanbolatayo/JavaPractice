public class Calculator
{
	
	private double acc = 0.0;
	private String nameOfOwner = "";
	
	// declare constructor
	public Calculator()
	{
		
	}
	
	public void Configure(String configurationString)
	{
		
	}
	
	public double getAcc()
	{
		return acc;
	}
	public String getInfo()
	{
		String info = "Calculator v.1 Designed in mit804 Laboratory";
		info += "\nThis Calculator is licensed to " + nameOfOwner;
		info += "\nacc = " + acc;
		return info;
	}
	
	//declare execute method
	public void Exec(String prompt)
	{
		String[] p = prompt.split(" ");
		
		double x, y; // Initialise variable
		
		if ((p[0].compareTo("acc") == 0)) {
			x = acc;
		} else {
			x = Double.parseDouble(p[0]);
		}
		
		if ((p[2].compareTo("acc") == 0)) {
			y = acc;
		} else {
			y = Double.parseDouble(p[2]);
		}
		
		double result = 0;
		
		switch (p[1])
		{
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		
		case "*":
		    result = x * y;
		    break;

		case "/":
		    result = x / y;
		    break;
		    
		case "%":
		    result = x % y;
		    break;

		default:
		    System.out.println("Unknown operator");
		    break;
		}
		
		acc += result;
		System.out.printf("\nresult = %f\n", result);
	}
	
	public void setInfo(String nameOfOwner)
	{
		this.nameOfOwner = nameOfOwner;
	}
}