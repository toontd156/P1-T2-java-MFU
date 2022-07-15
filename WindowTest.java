import javax.swing.*;
public class WindowTest {
	public static void main(String[] args) { /// code run small window program  user input number1 and number2 code will number1 + number2 and result sum
		String sNum1, sNum2;
		int num1, num2;
		// Get the first number
		sNum1 = JOptionPane.showInputDialog(null,
				"Enter your number (First number): ");
		// Convert the first string value to integer value
		num1 = Integer.parseInt(sNum1);
		
		// Get the second number
		sNum2 = JOptionPane.showInputDialog(null,"Enter your number (Second number): ");
		// Convert the second string value to integer value
		num2 = Integer.parseInt(sNum2);
		
		// Show the message dialog box to display the sum result
		JOptionPane.showMessageDialog(null, num1 + "+" + num2 + "="
				+ (num1 + num2));
	}
}
