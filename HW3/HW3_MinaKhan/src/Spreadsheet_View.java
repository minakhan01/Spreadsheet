import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Spreadsheet_View extends JFrame {
	private static String title = "Spreadsheet";
	private Row_GUI[] row_gui_array;
	private int numRows;
	private Container containerPane;
	private JPanel mainPanel;
	
	public Spreadsheet_View(int numRows, int numColumns) {
		
		super(title);
		
		this.numRows = numRows;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		containerPane = getContentPane();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		setSize(600, 1000);
		JPanel firstPanel=new JPanel();
		GridLayout layout=new GridLayout(1, numColumns, 20, 0);
		firstPanel.setLayout(layout);
		firstPanel.add(new JLabel("Index"));
		for (int i=0; i<numColumns;i++){
			firstPanel.add(new JLabel("Columns # "+i));
		}
		firstPanel.add(new JLabel("Total"));
		mainPanel.add(firstPanel);
		containerPane.add(mainPanel);
		setFocusable(true);
		containerPane.setFocusable(true);
		setVisible(true);
		setFocusable(true);
	}

	public JPanel getMainPanel(){
		return mainPanel;
	}
	public void addRow_GUI(Row_GUI[] rows) {
		row_gui_array = new Row_GUI[numRows];
		for (int i = 0; i < row_gui_array.length; i++) {
			mainPanel.add(rows[i]);
		}
		
		mainPanel.setFocusable(true);
		setVisible(true);

	}

}
