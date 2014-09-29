
public class Spreadsheet_main {

	public static void main(String[] args){
		int numRows;
		int numColumns=0;
		if (args.length==0){
			numRows=10;
			numColumns=2;
			}
		else{
			numRows=Integer.parseInt(args[0]);
			numRows=Integer.parseInt(args[1]);
			}
		
	
	Spreadsheet_Model model = new Spreadsheet_Model();
	Spreadsheet_View view = new Spreadsheet_View(model);
	Spreadsheet_Controller controller = new Spreadsheet_Controller(model);
	Spreadsheet_GUI gui = new Spreadsheet_GUI(view, controller);
	}
}
