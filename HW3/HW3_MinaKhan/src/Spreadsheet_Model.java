import java.awt.event.ActionListener;

public class Spreadsheet_Model {
	private Row[] rows;
	int numRows;
	int numColumns;
	Spreadsheet_View view;
//	ActionListener actionListener=new Spreadsheet_ActionListener();
	Row_GUI[] row_view_array;
	
	public Spreadsheet_Model(int numRows, int numColumns, Spreadsheet_View view, ActionListener actionListenerIn) {
		this.view=view;
		rows=new Row[numRows];
		row_view_array= new Row_GUI[numRows];
		for(int i=0;i<numRows;i++){
			rows[i]=new Row(i, numColumns, actionListenerIn);
			row_view_array[i]=rows[i].get_row_view();
		}
//		this.actionListener=actionListenerIn;
		System.out.print("actionListener: "+actionListenerIn);
		view.addRow_GUI(row_view_array);
	}
	
	public int getRows(){
		return numRows;
	}
	
	public int getColumns(){
		return numColumns;
	}
	
	public Row_GUI[] get_row_view_array(){
		return row_view_array;
	}
	
	public class Row {

		private Cell[] cell_array;
		private int numColumns;
		Row_GUI row_view;
		private int sum;

		public Row(int rowNum, int numColumns, ActionListener actionListenerIn) {
			this.numColumns = numColumns;
			row_view=new Row_GUI(rowNum, numColumns);
			cell_array=new Cell[numColumns];
			Cell_GUI[] cell_view=new Cell_GUI[numColumns];
			for (int i=0; i<numColumns;i++){
				cell_array[i]=new Cell(rowNum, i, actionListenerIn);
				cell_view[i]=cell_array[i].getCellGUI();
			}
			this.
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
		
		public Cell[] getCellArray(){
			return cell_array;
		}

		class Cell {
			int value;
			int row;
			int column;
			Cell_GUI cell_view;

			public Cell(int row, int column, ActionListener actionListener) {
				value = 0;
				cell_view=new Cell_GUI(row, column);
				System.out.println("in cell: "+actionListener);
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

		public void updateValue(int columnNum, int value) {
			cell_array[columnNum].setValue(value);	
		}
		
		public void updateRowTotal() {
			getTotal();
			row_view.setTotalPanel(sum);
		}

	}

	public void updateValue(int columnNum, int rowNum, int value) {
		rows[rowNum].updateValue(columnNum, value);

	}

	public void updateRowTotal(int rowNum) {
		rows[rowNum].updateRowTotal();
		
	}

}
