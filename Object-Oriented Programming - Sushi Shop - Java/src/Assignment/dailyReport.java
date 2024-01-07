package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class dailyReport{ //variable
	private static String companyName = "Sushi Queen Sdn Bhd"; //fixed variable
	private static String address = "10, Jalan Raya 19/8,  15, 57100 Subang Jaya, Selangor"; //fixed variable
	private double grandDailyTotal; //Total Daily Sales 
	
	public dailyReport(){ //constructor
		this(0.0);
	}
	
    public dailyReport(double grandDailyTotal){ //constructor
		this.grandDailyTotal = grandDailyTotal;
	}
	//Getters and Setters
	public double getGrandDailyTotal() {
		return grandDailyTotal;
	}

	public void setGrandDailyTotal(double grandDailyTotal) {
		this.grandDailyTotal = grandDailyTotal;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		dailyReport.companyName = companyName;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		address = address;
	}
	
	//display monthly report methods
	public void displayDailyReport(ArrayList<receipt> receiptlist){ //Using arrayList
		//variable
		int error = 0;
		int totalQty = 0;
		double total = 0; 
		int count = 0;
		do{
			Scanner scn = new Scanner(System.in);
			if(error == 0){
                        System.out.print("\n");
                        System.out.println("\t\t\t\t" + companyName + "\n" + "\t" + "Address:" + address + "\n");
	         	System.out.println("---------------------------------Daily Summary Report--------------------------------");
                        System.out.println("Date \t\t  Product ID \t Product Name \t Total Quantity \t Total Amount \t ");
	                System.out.println("=====================================================================================");

	            for(int i=0; i<receiptlist.size(); i++)
	            {
	            	System.out.println(receiptlist.get(i).toString1()); //display the date that user wants
	            }
	            
	            for(int i=0; i<receiptlist.size(); i++){
	            	        totalQty += receiptlist.get(i).getQty(); //total up the quantity
	    			total += receiptlist.get(i).getTotalAmount(); //total up the total amount
	    			count ++;
	            }
			}
			setGrandDailyTotal(total);
                        System.out.print("\n");
			System.out.println("\t\t\t\t\t\t\t\t\t ============");
			System.out.printf("\t\t\t\t\t\t\t     Grand Total: RM %.2f \n", getGrandDailyTotal());
			System.out.println("\n=====================================================================================");
			System.out.println(" ( "+ count + " ) " + "Record Found");
                        System.out.print("\nPress anything to continue.............");
		        scn.nextLine();
			}while(error != 0);
	}
        
        //toString methods
	public String toString(){
		return String.format("%.2f", grandDailyTotal);
	}
}

