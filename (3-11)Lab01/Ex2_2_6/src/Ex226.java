import javax.swing.JOptionPane;
public class Ex226 {
	public static void main(String[] args) {
		String str_a, str_b;
		str_a = JOptionPane.showInputDialog(null,
		"Enter the first coefficient: ",
		"First coefficient",
		JOptionPane.INFORMATION_MESSAGE);
		
		str_b = JOptionPane.showInputDialog(null,
		"Enter second coefficient: ",
		"Second coefficient",
		JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(str_a);
		double b = Double.parseDouble(str_b);
		
		if (a==0 && b==0) {
			JOptionPane.showMessageDialog(null, 
			"x = all real number", "Result",JOptionPane.INFORMATION_MESSAGE);
		} else if (a==0 && b!=0){
			JOptionPane.showMessageDialog(null,
			"No solution","Result",JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, 
			"x = "+ -b/a, "Result",JOptionPane.INFORMATION_MESSAGE);	
		}	
	}
}
