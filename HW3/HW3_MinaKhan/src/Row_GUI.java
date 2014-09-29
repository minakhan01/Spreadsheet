import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


// nested class : level 1
	public class Row_GUI extends JPanel {
		Cell_GUI[] cell_GUI_array;
		int rowNum;
		int numColumns;
		JPanel rowTotalPanel;

		public Row_GUI(int rowNum, int numColumns) {
			this.rowNum = rowNum;
			this.numColumns=numColumns;
			this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

			JPanel rowIndexPanel = new JPanel();
			JLabel rowLabel = new JLabel(rowNum + "");
			rowLabel.setHorizontalAlignment(SwingConstants.CENTER);
			rowIndexPanel.setLayout(new BorderLayout());
			rowIndexPanel.add(rowLabel);
			this.add(rowIndexPanel);

		}

		public void addCell_GUI(Cell_GUI[] cell_view) {
			cell_GUI_array = cell_view;
			for (int i = 0; i < numColumns; i++) {
				this.add(cell_GUI_array[i]);
			}
			
			JPanel rowTotalPanel = new JPanel();
			rowTotalPanel.setLayout(new BorderLayout());
			JLabel totalLabel = new JLabel(" 0 ");
			totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
			rowTotalPanel.add(totalLabel);
			this.add(rowTotalPanel);
		}

	}