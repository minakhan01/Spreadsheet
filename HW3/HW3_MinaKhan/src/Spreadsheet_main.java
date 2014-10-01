import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spreadsheet_main {

	Spreadsheet_View view;
	Spreadsheet_Model model;
	Spreadsheet_Controller controller;
	Spreadsheet_ActionListener actionListener;
	public Spreadsheet_main(int numRows, int numColumns){
		actionListener=new Spreadsheet_ActionListener();
		view = new Spreadsheet_View(numRows,numColumns);
		model = new Spreadsheet_Model(numRows, numColumns, view, actionListener);
		controller = new Spreadsheet_Controller(view, model);
		System.out.println("view: "+view+"\n model: "+model+"\n controller: "+controller);
	}
	public class Spreadsheet_ActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			SS_textField field=new SS_textField(-1,-1);
			field=(SS_textField) arg0.getSource();
			String input=field.getText();
			int value=Integer.parseInt(input);
			int row=field.getRow();
			int column=field.getColumn();
			System.out.println("in action performed "+controller);
			controller.updateValue(column, row, value);
			
		}

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
