
public class Row {
	
	private Cell[] row;
	private int numColumns;
	private RowView row_view;
	private int sum;
	
	public Row(Cell[] row){
		this.numColumns=row.length;
		this.row=row;
		sum=0;
	}
	
	public int getTotal(){
		sum=0;
		for (int i=0; i<numColumns;i++){
			sum += row[i].value;
		}
		return sum;
	}
	
	public RowView getRowView(){
		return row_view;
	}

}
