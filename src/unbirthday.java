import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {

		String i = JOptionPane.showInputDialog(null, "when is your birthday?");
		if (i.equals("1/20")) {
			JOptionPane.showMessageDialog(null, "happy birthday");

		} else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
		}

	}
}
