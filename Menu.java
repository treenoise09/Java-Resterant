public class Menu {

	private String MenuName;
	private int MenuID;
	private double price;

	public Menu(String MenuName, int MenuID, double price) {
		this.MenuName = MenuName;
		this.MenuID = MenuID;
		this.price = price;
	}

	public String getMenuName() {
		return MenuName;
	}

	public void setMenuName(String MenuName) {
		this.MenuName = MenuName;
	}

	public int getMenuID() {
		return MenuID;
	}

	public void setMenuID(int MenuID) {
		this.MenuID = MenuID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu: MenuID=" + MenuID + ", MenuName=" + MenuName + ", price=" + price;
	}

	

}
