public class Spreadsheet_Model {

	public Spreadsheet_Model() {

	}

	public void updateTotal() {
		// TODO Auto-generated method stub

	}

	public class Row {

		private Cell[] row;
		private int numColumns;
		private int sum;

		public Row(Cell[] row) {
			this.numColumns = row.length;
			this.row = row;
			sum = 0;
		}

		public int getTotal() {
			sum = 0;
			for (int i = 0; i < numColumns; i++) {
				sum += row[i].value;
			}
			return sum;
		}

		public class Cell {
			int value;

			public Cell() {
				value = 0;
			}

			public void setValue(int value) {
				this.value = value;
			}

			public int getValue() {
				return value;
			}

		}

	}

}