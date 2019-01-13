 package strings_and_dialogs;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String e=JOptionPane.showInputDialog("what do you like?");
	JOptionPane.showMessageDialog(null,e+" is awesome");
}
}
