import java.awt.event.ActionListener;

public class Spreadsheet_Model {
	private Row[] rows;
	int numRows;
	int numColumns;
	Spreadsheet_View view;
	ActionListener actionListener;
	
	public Spreadsheet_Model(int numRows, int numColumns, Spreadsheet_View view, ActionListener actionListener) {
		this.view=view;
		rows=new Row[numRows];
		Row_GUI[] row_view_array= new Row_GUI[numRows];
		for(int i=0;i<numRows;i++){
			rows[i]=new Row(i, numColumns, actionListener);
			row_view_array[i]=rows[i].get_row_view();
		}
		view.addRow_GUI(row_view_array);
	}
	
	public int getRows(){
		return numRows;
	}
	
	public int getColumns(){
		return numColumns;
	}
	
	public class Row {

		private Cell[] cell_array;
		private int numColumns;
		Row_GUI row_view;
		private int sum;

		public Row(int rowNum, int numColumns, ActionListener actionListener) {
			this.numColumns = numColumns;
			row_view=new Row_GUI(rowNum, numColumns);
			cell_array=new Cell[numColumns];
			Cell_GUI[] cell_view=new Cell_GUI[numColumns];
			for (int i=0; i<numColumns;i++){
				cell_array[i]=new Cell();
				cell_view[i]=cell_array[i].getCellGUI();
			}
			row_view.addCell_GUI(cell_view);
			
			sum = 0;
		}

		public int getTotal() {
			sum = 0;
			for (int i = 0; i < numColumns; i++) {
				sum += cell_array[i].value;
			}
			return sum;
		}
		
		public Row_GUI get_row_view(){
			return row_view;
		}

		class Cell {
			int value;
			Cell_GUI cell_view;

			public Cell() {
				value = 0;
				cell_view=new Cell_GUI();
				cell_view.addListener(actionListener);
			}

			public void setValue(int value) {
				this.value = value;
			}

			public int getValue() {
				return value;
			}
			
			public Cell_GUI getCellGUI(){
				return cell_view;
			}

		}

	}

	public void updateTotal() {
		// TODO Auto-generated method stub
		
	}

}
