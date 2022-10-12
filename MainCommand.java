import java.util.*;
public class MainCommand

{
    
  int table_counter = 0;
    ArrayList < Table > tables = new ArrayList < Table > ();
    ArrayList < Menu > menu = new ArrayList < Menu > ();
    ArrayList < Order > order = new ArrayList < Order > ();
  Menu Kapaw = new Menu ("Kapaw", 0, 25);
  {
    menu.add (Kapaw);
  }
  Menu FrieRice = new Menu ("FrieRice", 1, 30);
  {
    menu.add (FrieRice);
  }
  Menu Noodle = new Menu ("Noodle", 2, 40);
  {
    menu.add (Noodle);
  }
  Menu Drink = new Menu ("Drink", 3, 20);
  {
    menu.add (Drink);
  }

  public MainCommand ()
  {
    Scanner in = new Scanner (System.in);
    int seats = 0;
    int command = 0;
    int pay = 0;
    int tho = 0;
    int kaoee = 0;
    int zhang=0;
    int orderID = 0;
    int total = 0;
    int tableid = 0;
    int price = 0;
    int stuff = 0;
    int MAX_SEATS = 4;
    int receiptId = 0;
    ArrayList<Menu> orderMenu = new ArrayList < Menu > ();
    do
      {
	displayTables ();
	System.out.println ("Select your command" + "\n" + "1.AddTable" +
			    "\n" + "2.joinTable" + "\n" + "3.setMenu" + "\n" +
			    "4.Print Receipt");
	command = in.nextInt ();

	System.out.println (command);
	if (command == 1)// DONE
	  {
	    System.out.print ("Number of seats = ");
	    seats = in.nextInt ();
	    if(seats > 4  ){
	        System.out.println ("Seats limit is "+MAX_SEATS);
	        continue;
	    }
	    tables.add (new Table (table_counter, seats));
	    Table a = tables.get (table_counter);
	    a.setFilled (true);
	    tables.set (table_counter, a);
	    table_counter++;

	  }
	else if (command == 2) //only has Table --DONE
	  {
	    if(tables.size() == 0){
	        System.out.println ("No tables");
	        continue;
	    }
	    System.out.println ("Select Table");
	    tho = in.nextInt ();
	    System.out.println ("Number of seats");
	    kaoee = in.nextInt ();
	    if(kaoee > 4  ){
	        System.out.println ("Seats limit is "+MAX_SEATS);
	        continue;
	    }
	    Table s = tables.get (tho);
	    s.setFilled (true);
	    s.setnumberofSeats (kaoee);
	    tables.set (tho, s);

	  }
	else if (command == 3)// select menu
	  {
	    System.out.println ("Select Table");
	    tho = in.nextInt ();
	    
	    while(true){
	            try{
	                System.out.println ("Menu 0.Kapaw 25 Bath" + "\n" + "Menu 1.FrieRice 30 Bath" +
				    "\n" + "Menu 2.Noodle 40 Bath" + "\n" +
				    "Menu 3.Drink 20  Bath"+"\nEnter any characters to order.");
	                zhang = Integer.parseInt(in.next());
    	            if( zhang > menu.size()){
    	                    System.out.println("No menu");
    	                    continue;
    	            }
        	        }catch(NumberFormatException  e){
  
        	                break;
    	            }
    	            orderMenu.add(menu.get(zhang));
	                
	    }
        if(orderMenu.size()==0){
            System.out.println("No menu selected back to main function.");
            continue;
        }
        System.out.println ("CashierID");
	    stuff = in.nextInt();
	    System.out.println ("Cashier Name");
	    Cashier id = new Cashier(stuff,in.next());
	    System.out.println(id.getcashierName());
	    Table tab = tables.get(tho);
	    Order ord = new Order(orderID,orderMenu,tab);
	    Receipt rcpt = new Receipt(tab,receiptId,ord,id);
	    tab.setReceiptId(rcpt);
	    tables.set (tho, tab);
	    System.out.println("Your orderId is "+orderID);
	    receiptId += 1;
        orderID += 1;

	  }
	  

	else if (command == 4) // Print Receipt
	  {
	    System.out.println ("Select Table");
	    pay = in.nextInt ();

	    
	    Table n = tables.get (pay);
	    
	    Receipt rc = n.getReceipt();
	    rc.PrintReceipt();
	    n.setFilled (false);
	    n.setnumberofSeats (0);
	    tables.set (pay, n);
	    




	  }

      }
    while (true);



  }
  public void displayOrder ()
  {
    String orderlist = order.toString ();
    System.out.println (orderlist + "\n");

  }
  public void displayTables ()
  {
    String list = tables.toString ();
    System.out.println (list + "\n");

  }	
  
}
