import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spreadsheet {
	
	public static void main(String[] args){
		int numRows;
		int numColumns=0;
		if (args.length==0){
			numRows=10;
			numColumns=2;
			}
		else{
			numRows=Integer.parseInt(args[0]);
			numRows=Integer.parseInt(args[1]);
			}
		
		JFrame frame=new JFrame("Spreadsheet");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container containerPane=frame.getContentPane();
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		containerPane.add(mainPanel);

		RowView[] row_view_array=new RowView[numRows];
		
		for (int i=0;i<row_view_array.length;i++){
		row_view_array[i]=new RowView(i,numColumns);
		mainPanel.add(row_view_array[i]);
		}
		
		frame.pack();
		frame.setSize(600, 1000);
		frame.setVisible(true);
	}
}
