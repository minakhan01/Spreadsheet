import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class RowView extends JPanel implements ActionListener{
	protected CellView[] cellView_array;
	int numColumns;
	Row row;
	
	public RowView(int rowNum,int numColumns){
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		Cell[] cell_array=new Cell[numColumns];
		this.numColumns=numColumns;
		JPanel box1=new JPanel();
		JPanel box2=new JPanel();
		JLabel rowLabel=new JLabel(rowNum+"");
		rowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		box1.setLayout(new BorderLayout());
		box2.setLayout(new BorderLayout());
		box1.add(rowLabel);
		JLabel totalLabel=new JLabel(" 0 ");
		totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(box1);
		cellView_array=new CellView[numColumns];
		for (int i=0;i<numColumns;i++){
			cellView_array[i]=new CellView();
			this.add(cellView_array[i]);
			cell_array[i]=cellView_array[i].getCell();
		}
		box2.add(totalLabel);
		this.add(box2);
		row=new Row(cell_array);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Action listener in row");
		
	}
	
}
