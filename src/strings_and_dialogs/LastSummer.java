package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String e= JOptionPane.showInputDialog("what is your name");
	JOptionPane.showMessageDialog(null, "hi "+e);
	String i= JOptionPane.showInputDialog("what did you do last summer?");
	JOptionPane.showMessageDialog(null, "I know that you went to " +i+ " last summer Muhaha!");}
}
