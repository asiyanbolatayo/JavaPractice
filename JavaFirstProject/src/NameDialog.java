import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prompt user to enter name
		String name = JOptionPane.showInputDialog( "what is your name?" );
		
		//create the message
		String message = String.format( "welcome, %s, to Java programming!", name); 
		
		// display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message );
	} // end main

} // end class NameDialog
