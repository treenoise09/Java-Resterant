
public class Table {

	private int numTable;
	private boolean isFilled;
	private int numberofSeats;
    private Receipt ReceiptId;
	public Table(int numTable, int numberofSeats) 
	{
		this.numTable = numTable;	
		this.numberofSeats = numberofSeats;
		isFilled = false;
	}
	public void setReceiptId(Receipt ReceiptId){
	    this.ReceiptId = ReceiptId;
	}
	public Receipt getReceipt(){
	    return this.ReceiptId;
	}
	public int getNumTable() { return this.numTable; }
	public void setNumTable(int numTable) { this.numTable = numTable; }
	
	public boolean isFilled() { return isFilled; }
	public void setFilled(boolean isFilled) { this.isFilled = isFilled; }
	
	public int getnumberofSeats() { return numberofSeats; }
	public void setnumberofSeats(int numberofSeats) { this.numberofSeats = numberofSeats; }
	
	@Override
	public String toString() {
		return "Table [numTable=" + numTable + ", isFilled=" + isFilled + ", Seats=" + numberofSeats + "]";
	}

	
	public void sitTable()
	{
		isFilled = true;
	}
	
	public void emptyTable()
	{
		isFilled = false;
	}
}
