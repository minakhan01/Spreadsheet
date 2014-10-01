//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Spreadsheet_ActionListener implements ActionListener {
//	Spreadsheet_Controller controller=new Spreadsheet_Controller(null, null);
//	
//	public void setController(Spreadsheet_Controller controllerIn){
//		controller=controllerIn;
//		System.out.print("in set controller"+controller);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		SS_textField field=new SS_textField(-1,-1);
//		field=(SS_textField) arg0.getSource();
//		String input=field.getText();
//		int value=Integer.parseInt(input);
//		int row=field.getRow();
//		int column=field.getColumn();
//		System.out.print("in action performed "+this.controller);
//		controller.updateValue(column, row, value);
////		
//	}
//
//}
