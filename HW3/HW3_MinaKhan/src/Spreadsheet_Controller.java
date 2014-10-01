public class Spreadsheet_Controller {
	Spreadsheet_Model model;
	
    public Spreadsheet_Controller(Spreadsheet_Model model) {
		this.model=model;
	}
	
	public void updateValue(int columnNum, int rowNum, int value){
		model.updateValue(columnNum, rowNum, value);
		model.updateRowTotal(rowNum);
	}
}
