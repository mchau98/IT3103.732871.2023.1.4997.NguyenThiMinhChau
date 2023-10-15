import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Nguyen Thi Minh Chau, Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,"Nguyen Thi Minh Chau, You've chosen: "
				+ (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);;
	}

}
