import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password = ("GRANT");
String message = JOptionPane.showInputDialog(null, "what is the secret message?");
String e =	JOptionPane.showInputDialog(null, "you have to guess the password first");

if(e.equals(password)) {
	JOptionPane.showMessageDialog(null, "hi go away now");
}
}
}
