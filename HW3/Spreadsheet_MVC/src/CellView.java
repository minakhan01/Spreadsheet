import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class CellView extends JPanel implements ActionListener{
	JTextField textField;
	Cell cell;
	public CellView(){
		textField=new JTextField();
		textField.addActionListener(this);
		this.setLayout(new BorderLayout());
		this.setSize(30, 20);
		this.add(textField, BorderLayout.CENTER);
		cell=new Cell();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Calling action listener");
		String text = textField.getText();
		System.out.println(text);
		int textValue=Integer.parseInt(text);
		cell.setValue(textValue);
	}
	
	public Cell getCell(){
		return cell;
	}
	

}
