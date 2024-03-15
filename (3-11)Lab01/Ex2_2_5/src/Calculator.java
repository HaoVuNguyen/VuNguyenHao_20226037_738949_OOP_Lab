import javax.swing.JOptionPane;
public class Calculator {
	public static void main (String[] args) {
		String Num1, Num2;
		String Noti;
		Num1=JOptionPane.showInputDialog(null,
				"Enter first number:",
				"First number: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		Num2=JOptionPane.showInputDialog(null,
				"Enter second number:",
				"The second number: ",
				JOptionPane.INFORMATION_MESSAGE);
			
		double num1 = Double.parseDouble(Num1);
		double num2 = Double.parseDouble(Num2);
		Noti = "Sum: "+(num1+num2) + "\nDifference:" + (num1-num2) + "\nProduct: "+(num1*num2)+"\nQuotient: "+ (num1/num2);
		JOptionPane.showMessageDialog(null,Noti,"Result",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
		

