import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spreadsheet_Controller {
	Spreadsheet_Model model;
	Spreadsheet_View view;
	
    public Spreadsheet_Controller(Spreadsheet_View view, Spreadsheet_Model model) {
		this.model=model;
		this.view=view;
	}
    
	public int getNumRow() {
		return model.getRows();
		
	}

	public int getNumColumns() {
		return model.getColumns();
		
	}
	
	public static ActionListener getTotalListener () {
	        return new ActionListener() {
	            @Override public void actionPerformed (ActionEvent e) {
	            	System.out.println("jj");
	            }
	        };
	    }
}
