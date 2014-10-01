import javax.swing.JTextField;

	public class SS_textField extends JTextField{
		private int row;
		private int column;
		
		public SS_textField(int row, int column){
			super();
			this.row=row;
			this.column=column;
		}
		
		public int getRow(){
			return row;
		}
		
		public int getColumn(){
			return column;
		}
	}
