import java.util.*;
public class Receipt {
    private Table tabelID;
    private int receiptID;
    private Order orderID;
    private Cashier Acashier;
    
    public Receipt(Table tabelID,int receiptID,Order orderID,Cashier cashierID){
        this.tabelID = tabelID;
        this.receiptID = receiptID;
        this.orderID = orderID;
        this.Acashier = cashierID;
    }
    public Table gettabelID(){
        return this.tabelID;
    }
    public int getreceiptID(){
        return this.receiptID;
    }
    public Order getorderID(){
        return this.orderID;
    }
    public Cashier getAcashier(){
        return this.Acashier;
    }
	public void PrintReceipt() {
	    System.out.println ("Table Id is "+this.tabelID.getNumTable());
	     System.out.println ("Order Id is "+this.orderID.getOrderID());
	     ArrayList<Menu> menu =  this.orderID.getmenu();
	    for(Menu m : menu){
	        System.out.println (m.toString());
	    }
	    System.out.println ("Total is "+this.orderID.getprice());
	}
}
