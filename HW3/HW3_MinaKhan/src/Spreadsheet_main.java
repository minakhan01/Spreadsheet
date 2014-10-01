public class Spreadsheet_main {

	Spreadsheet_View view;
	Spreadsheet_Model model;
	Spreadsheet_Controller controller;
	Spreadsheet_ActionListener actionListener;
	public Spreadsheet_main(int numRows, int numColumns){
		actionListener=new Spreadsheet_ActionListener();
		view = new Spreadsheet_View(numRows,numColumns);
		model = new Spreadsheet_Model(numRows, numColumns, view, actionListener);
		controller = new Spreadsheet_Controller(model);
		actionListener.setController(controller);
	}
	
	public static void main(String[] args){
		int numRows;
		int numColumns;
		if (args.length==0){
			numRows=10;
			numColumns=2;
			}
		else{
			numRows=Integer.parseInt(args[0]);
			numColumns=Integer.parseInt(args[1]);
			}
		new Spreadsheet_main( numRows,  numColumns);
	}
}
