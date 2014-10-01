import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Spreadsheet_ActionListener implements ActionListener, FocusListener {
	Spreadsheet_Controller controller=new Spreadsheet_Controller(null);
	
	public void setController(Spreadsheet_Controller controller){
		this.controller=controller;
	}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			SS_textField field=new SS_textField(-1,-1);
			field=(SS_textField) arg0.getSource();
			String input=field.getText();
			int value=0;
			if (!input.equals("")){
				try{
				value=Integer.parseInt(input);}
				catch(NumberFormatException e){
					System.out.println("Please enter a number");
				}
			}
			int row=field.getRow();
			int column=field.getColumn();
			controller.updateValue(column, row, value);
			
		}

		@Override
		public void focusGained(FocusEvent arg0) {
			SS_textField field=new SS_textField(-1,-1);
			field=(SS_textField) arg0.getSource();
			String input=field.getText();
			int value=0;
			if (!input.equals("")){
				try{
				value=Integer.parseInt(input);}
				catch(NumberFormatException e){
					System.out.println("Please enter a number");
				}
			}
			int row=field.getRow();
			int column=field.getColumn();
			controller.updateValue(column, row, value);
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			SS_textField field=new SS_textField(-1,-1);
			field=(SS_textField) arg0.getSource();
			String input=field.getText();
			int value=0;
			if (!input.equals("")){
				try{
				value=Integer.parseInt(input);}
				catch(NumberFormatException e){
					System.out.println("Please enter a number");
				}
			}
			int row=field.getRow();
			int column=field.getColumn();
			controller.updateValue(column, row, value);			
		}

	}
