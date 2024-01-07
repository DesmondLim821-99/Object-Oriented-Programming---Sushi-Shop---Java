package Assignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class bestSellingReport { //variable
	String prodID;  
	String prodName;
	int qty = 0; 
	 
	private static String companyName = "Sushi Queen Sdn Bhd"; //fixed variable
	private static String address = "10, Jalan Raya 19/8,  15, 57100 Subang Jaya, Selangor"; //fixed variable
	private double highestSellingProduct;
	private double lowestSellingProduct;
	
	public bestSellingReport(){ //constructor
		this(0.0,0.0);
	}
		public bestSellingReport(double highestSellingProduct, double lowestSellingProduct){ //constructor
		this.highestSellingProduct = highestSellingProduct;
		this.lowestSellingProduct = lowestSellingProduct;
	}
	
	public bestSellingReport(String prodID, String prodName, int qty) { //constructor
		this.prodID = prodID;		
		this.qty = qty;	
		this.prodName = prodName;
	}
	//Getters & setters
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		bestSellingReport.companyName = companyName;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		bestSellingReport.address = address;
	}

	public double getHighestSellingProduct() {
		return highestSellingProduct;
	}

	public void setHighestSellingProduct(double highestSellingProduct) {
		this.highestSellingProduct = highestSellingProduct;
	}

	public double getLowestSellingProduct() {
		return lowestSellingProduct;
	}

	public void setLowestSellingProduct(double lowestSellingProduct) {
		this.lowestSellingProduct = lowestSellingProduct;
	}
	
	public int getQty() {
		return qty;
	}
	
	public String getProdID() {
		return prodID;
	}
	
	public String getProdName() {
		return prodName;
	}
	//display best selling report methods
	public static void displayBestSellingReport(ArrayList<receipt> bestSellingReport, ArrayList<product> prodList){ //Using arrayList
		//variable
		int error = 0;
		int totalQty = 0;
		double total = 0; 
		int count = 0;
		int largestQty = 0;
		int row = 0;
		int tempQty=0;
		ArrayList<bestSellingReport> compareList = new ArrayList<bestSellingReport>(); //store to compareList
		do{
			Scanner scn = new Scanner(System.in);
                        
                                System.out.print("\n");
				System.out.println("\t\t\t\t" + companyName + "\n" + "\t" + "Address:" + address + "\n");
				System.out.println("-----------------------------Best Selling Summary Report-----------------------------");
				System.out.println("\t\t\t Product Name \t Product ID \t Quantity");
				System.out.println("=====================================================================================");
				
				for(int i = 0; i < prodList.size(); i++) {
					for(int j = 0; j < bestSellingReport.size(); j++) {
						if((bestSellingReport.get(j).getProdID()).equals(prodList.get(i).getProdID())) { //compare the product ID
							tempQty+=bestSellingReport.get(j).getQty();
						}
					}
					bestSellingReport prod = new bestSellingReport(prodList.get(i).getProdID(),prodList.get(i).getProdName(), tempQty);
					compareList.add(prod); 
					tempQty=0;
				}
				
				for(int i = 0; i < compareList.size(); i++) {
					if(largestQty < compareList.get(i).getQty()) { //find the largest value 
						largestQty = compareList.get(i).getQty();
					}
				}

				for(int i = largestQty; i > 0; i--) {
					for(int j = 0; j < compareList.size(); j++) {
						if(i == compareList.get(j).getQty()) { //sorting
							System.out.printf("%37s", compareList.get(j).getProdName());
							System.out.printf("\t\t%7s",compareList.get(j).getProdID());
							System.out.printf("\t%5d",compareList.get(j).getQty());
							System.out.print("\n");
							count++;
						}
					}
					row++;
				}
				
				System.out.println("\n=====================================================================================");
				System.out.println(" ( "+ count + " ) " + "Record Found");
                                System.out.print("\nPress anything to continue.............");
			        scn.nextLine();
		}while(error != 0);
	}

    @Override
    public String toString() {
        return "bestSellingReport{" + "prodID=" + prodID + ", prodName=" + prodName + ", qty=" + qty + ", highestSellingProduct=" + highestSellingProduct + ", lowestSellingProduct=" + lowestSellingProduct + '}';
    }
        
}
