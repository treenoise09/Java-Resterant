import java.util.*;
public class Order {
	
	private int orderID;
	private ArrayList < Menu > menu = new ArrayList < Menu > ();;
	private Table tableid;

	public Order(int orderID,ArrayList < Menu > menu,Table tableid) {
		this.orderID = orderID;
		this.menu = menu;
		this.tableid = tableid;
	}
	
	public int getOrderID() { return orderID; }
	public void setOrderID(int orderID) { this.orderID = orderID; }
	public ArrayList < Menu > getmenu(){ return menu; }
	public void setMenu(ArrayList < Menu > menu){
	    this.menu.addAll(menu);
	}
	public Table gettableid(){return tableid;}
	public double getprice(){
	    double total = 0;
	    for (Menu m : this.menu) {
            total += m.getPrice();
        }
	    return total;}
	
	
	@Override
	public String toString() {
		return "Order orderID=" + orderID +"MenuID =" +menu+"tableid =" +tableid+"price =" +getprice()  ;
	}
}