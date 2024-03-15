import javax.swing.JOptionPane;
public class Ex6_1 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, 
        		"Do you wanna change to the first class ticket?", null, 0);

        JOptionPane.showMessageDialog(null, "You have chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
