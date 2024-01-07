package Assignment;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class receipt {
	//variable
	private double totalAmount;
	private String transactionID;
        private String sysDate;
	public String staffID;
	private String prodName;
	private String prodID;
	private double grandTotal;
	int qty;
	double price;
	
	public receipt (String prodName, String prodID, int qty, double price, String orderID, double totalPrice, String staffID, String sysDate, double grandTotal){
		transactionID = orderID;
		this.grandTotal = grandTotal;
		this.sysDate = sysDate;
		totalAmount = totalPrice;
		this.staffID = staffID;
	    this.prodName=prodName;
	    this.prodID = prodID;
	    this.qty = qty;
	    this.price = price;
	}

	
	
	public double getGrandTotal() {
		return grandTotal;
	}
    public String getSysDate() {
        return sysDate;	
    }
	
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSysDate(String sysDate) {
		this.sysDate = sysDate;
	}
	
	public String toString1(){//print the details
		return String.format("%-17s %-8s %15s %14d %25.2f",sysDate, prodID, prodName, qty, totalAmount);
	}
}