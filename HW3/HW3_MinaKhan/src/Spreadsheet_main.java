public class Spreadsheet_main {

	Spreadsheet_View view;
	Spreadsheet_Model model;
	Spreadsheet_Controller controller;
	
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
		
	Spreadsheet_ActionListener actionListener=new Spreadsheet_ActionListener();
	Spreadsheet_View view = new Spreadsheet_View(numRows,numColumns);
	Spreadsheet_Model model = new Spreadsheet_Model(numRows, numColumns, view, actionListener);
	Spreadsheet_Controller controller = new Spreadsheet_Controller(view, model);
	actionListener.setController( controller);
	System.out.print("main"+view.getMainPanel().requestFocusInWindow());
	Row_GUI[] row_view_array=model.get_row_view_array();
	for (int i=0;i<row_view_array.length;i++){
		row_view_array[i].setFocusable(true);
	}
	for (int i=0;i<row_view_array.length;i++){
		System.out.print(row_view_array[i].requestFocusInWindow());
	}
	}
}
