package Assignment;

import java.util.ArrayList;

public class product {
	//variable
	private String prodName;
    private String prodID;
    private String desc;
    private String cat;
    private int qty;
    private double price;
    public static int count = 0;
    private int qtyOrder = 0;
    	
    public product() {
    	this("","","","",0,0.0);
    }
    public product(int qtyOrder, String prodID) {
		this.qtyOrder=qtyOrder;
		this.prodID = prodID;
	}
   
	public product(String prodName, String prodID, String desc, String cat, int qty, double price) {
		this.prodName = prodName;
		this.prodID = prodID;
		this.desc = desc;
		this.cat = cat;
		this.qty = qty;
		this.price = price;
		count++;
		
		  
	}
	
	
	public int getQtyOrder() {
		return qtyOrder;
	}


	public void setQtyOrder(int qtyOrder) {
		this.qtyOrder = qtyOrder;
	}


	public int getCount() {
		return count;
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

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		
		
		}

		public String getCat() {
			return cat;
		}

		public void setCat(String cat) {
			this.cat = cat;
	
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

    int setQty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
