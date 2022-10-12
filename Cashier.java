
public class Cashier {
 private int cashierID;
 private String cashierName;
 public Cashier(int cashierID,String cashierName){
    cashierID = cashierID;
    setcashierName(cashierName);
}
 public void setcashierName(String cashierName){
     this.cashierName = cashierName;
 }
 public int getcashierID(){
     return cashierID;
 }
 public String getcashierName(){
     return cashierName;
 }

}
