import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

// nested class : level 2
public class Cell_GUI extends JPanel {

	private SS_textField textField;
	private int fieldValue = 0;

	public Cell_GUI(int row, int column) {
		textField = new SS_textField(row, column);
		this.setLayout(new BorderLayout());
		this.setSize(30, 20);
		this.add(new JLabel("test"));
		this.add(textField, BorderLayout.CENTER);
		
	}

	public void addListener(ActionListener action) {
		textField.addActionListener(action);
	}

	public int getIntValue() {
		fieldValue = Integer.parseInt(textField.getText());
		return fieldValue;
	}

}