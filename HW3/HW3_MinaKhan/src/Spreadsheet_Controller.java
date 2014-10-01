public class Spreadsheet_Controller {
	Spreadsheet_Model model;
	Spreadsheet_View view;
	
    public Spreadsheet_Controller(Spreadsheet_View view, Spreadsheet_Model model) {
		this.model=model;
		this.view=view;
		System.out.println("model "+model);
	}
    
	public int getNumRow() {
		return model.getRows();
		
	}

	public int getNumColumns() {
		return model.getColumns();
		
	}
	
	public void updateValue(int columnNum, int rowNum, int value){
		model.updateValue(columnNum, rowNum, value);
		model.updateRowTotal(rowNum);
	}
}
