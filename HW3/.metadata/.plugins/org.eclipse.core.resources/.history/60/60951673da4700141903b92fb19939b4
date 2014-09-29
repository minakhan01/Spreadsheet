
public class Row {
	
	Cell[] row;
	int numColumns;
	RowView row_view;
	public Row(Cell[] row){
		this.numColumns=row.length;
		this.row=row;
	}
	
	public int getTotal(){
		int sum=0;
		for (int i=0; i<numColumns;i++){
			sum += row[i].value;
		}
		return sum;
	}
	
	public RowView getRowView(){
		return row_view;
	}

}
