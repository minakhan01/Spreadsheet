import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Spreadsheet_Controller {
	Spreadsheet_Model model;
	
    public Spreadsheet_Controller(Spreadsheet_Model model) {
		this.model=model;
	}
	
    public ActionListener getTotalListener () {
        return new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
            	System.out.println("jj");
                model.updateTotal();
            }
        };
    }

	public int getNumRow() {
		return 10;
		
	}

	public int getNumColumns() {
		return 2;
		
	}
}
