import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Spreadsheet_View extends JFrame {
	static String title = "Spreadsheet";
	Row_GUI[] row_gui_array;
	int numRows;
	int numColumns;
	Container containerPane;
	JPanel mainPanel;
	Spreadsheet_Controller controller;
	ActionListener action_listener;
	
	public Spreadsheet_View(int numRows, int numColumns) {
		
		super(title);
		
		this.numRows = numRows;
		this.numColumns = numColumns;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		containerPane = getContentPane();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		setSize(600, 1000);
		
		mainPanel.add(new JLabel("test"));
		containerPane.add(mainPanel);
		
		setVisible(true);
	}
	
	public void addActionListener(ActionListener actionListener){
		action_listener=actionListener;
	}
	public JPanel getMainPanel(){
		return mainPanel;
	}
	public void addRow_GUI(Row_GUI[] rows) {
		System.out.println("in add row GUI");
		row_gui_array = new Row_GUI[numRows];
		for (int i = 0; i < row_gui_array.length; i++) {
			mainPanel.add(rows[i]);
		}
		
		mainPanel.setFocusable(true);
		setVisible(true);
		System.out.println("main panel: "+mainPanel.requestFocusInWindow());



	}

}
