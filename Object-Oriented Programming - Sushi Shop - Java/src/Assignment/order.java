package Assignment;


public class order {

	//variable
	private String prodID;
	private String orderID;
	private String sysDate;
	private String prodName;
	private double price;
	private static int count = 0;
	private int qty = 0;
	final double SST = 10.00;
	private double totalPrice;
	
	public order(){
		this("","",0.0,0,0.0,"");
	}
	public order(String prodID, String prodName, double price, int qty, double totalPrice, String sysDate) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.price = price;
		this.qty = qty;
		this.sysDate = sysDate;
		this.totalPrice = totalPrice;
	}

	public String getSysDate() {
		return sysDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public double getSST() {
		return SST;
	}
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdID() {
		return prodID;
	}

	public void setProdID(String prodID) {
		this.prodID = prodID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {//set order ID
		count++;
		this.orderID = orderID.concat(Integer.toString(count));
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
