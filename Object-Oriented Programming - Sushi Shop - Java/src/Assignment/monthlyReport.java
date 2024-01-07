package Assignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class monthlyReport{//variable
	private static String companyName = "Sushi Queen Sdn Bhd"; //fixed variable
	private static String address = "10, Jalan Raya 19/8,  15, 57100 Subang Jaya, Selangor"; //fixed variable
	private double grandMonthlyTotal; //Total Monthly Sales
	private double avgSales;

	
	public monthlyReport(){ //constructor
		this(0.0,0.0);
	}
	
    public monthlyReport(double grandMonthlyTotal, double avgSales){ //constructor
		this.grandMonthlyTotal = grandMonthlyTotal;
		this.avgSales = avgSales;
	}
	
    //Getters & Setters
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		monthlyReport.companyName = companyName;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		monthlyReport.address = address;
	}

	public double getGrandMonthlyTotal() {
		return grandMonthlyTotal;
	}

	public void setGrandMonthlyTotal(double grandMonthlyTotal) {
		this.grandMonthlyTotal = grandMonthlyTotal;
	}

	public double getAvgSales() {
		return avgSales;
	}

	public void setAvgSales(double avgSales) {
		this.avgSales = avgSales;
	}
	//methods
	public double calAvg(double grandMonthlyTotal, int count){
		return grandMonthlyTotal/ count;
	}
    //display monthly report methods
	public void displayMonthlyReport(ArrayList<receipt> monthlyReceipt){ //Using arrayList
		//variable
   	    int error = 0;
		int totalQty = 0;
	    double total = 0; 
		int count = 0;
		do{
			Scanner scn = new Scanner(System.in);
                                System.out.print("\n");
				System.out.println("\t\t\t\t" + companyName + "\n" + "\t" + "Address:" + address + "\n");
				System.out.println("---------------------------------2021 Summary Report---------------------------------");
				System.out.println("Date \t\t  Product ID \t Product Name \t Total Quantity \t Total Amount \t ");
				System.out.println("=====================================================================================");
				for(int i=0; i<monthlyReceipt.size(); i++){
			    	  System.out.println(monthlyReceipt.get(i).toString1()); //display the date that user wants
				}
				
				for(int i = 0; i < monthlyReceipt.size(); i++) { //total up the quantity & total amount
					  totalQty += monthlyReceipt.get(i).getQty();
					  total += monthlyReceipt.get(i).getTotalAmount();
		    		  totalQty += 0;
				      total += 0;
				      count ++;
				}
				
				setGrandMonthlyTotal(total); //Store to grand monthly total
				
				System.out.println("\t\t\t\t\t\t\t\t\t ============");
				System.out.printf("\t\t\t\t\t\t\t  Grand Total: RM  %.2f \n", getGrandMonthlyTotal());
	    		System.out.printf("\t\t\t\t\t\t\t      Average: RM   %.2f \n", calAvg(grandMonthlyTotal,count));
				System.out.println("\n=====================================================================================");
				System.out.println(" ( "+ count + " ) " + "Record(s) Found");
                                System.out.print("\nPress anything to continue.............");
			scn.nextLine();
		}while(error != 0);
	}
	//search monthly report methods
	public static void searchMonthlyReport(ArrayList<receipt> monthlyReceipt){ //Using arrayList
	    Scanner scn = new Scanner(System.in);
	    //variable
	    int entermonth = 0;
	    boolean exit = false;
    	boolean isNum = true;
    	int count = 0;
    	int error = 0;
    	double grdTotal = 0;
    	String year = "2021/";
    	String slash = "/";
    	String combineDate="";
    	String tempDate="";
    	
	   do{
		   System.out.print("Enter month(1-12): ");
		   //validation
		   if(scn.hasNextInt()) {
			     entermonth = scn.nextInt();
				 isNum = true;
				 error = 0;
				 if(entermonth < 1 || entermonth > 12) {
					 error = 1; 
					 System.out.println("Must enter between 1 - 12 !");
				 }
			 }
			 else {
				 System.out.println("Invalid month !");
				 isNum = false;
				 scn.next();
			 }
	   }while(error != 0 || !(isNum));
	   //compare the month that user needs
  		  if(error == 0){
  			  if(entermonth == 1) { 
  				combineDate=year.concat(Integer.toString(entermonth));
  				combineDate=combineDate.concat(slash);
  				combineDate=combineDate.concat("31");
  			  }
  			  else if(entermonth == 2) {
    				combineDate=year.concat(Integer.toString(entermonth));
      				combineDate=combineDate.concat(slash);
      				combineDate=combineDate.concat("28");
      		  }
  			 else if(entermonth == 3) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("31");
   			  }
  			 else if(entermonth == 4) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("30");
   			  }
  			 else if(entermonth == 5) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("31");
   			  }
  			 else if(entermonth == 6) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("30");
   			  }
  			 else if(entermonth == 7) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("31");
   			  }
  			 else if(entermonth == 8) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("31");
   			  }
  			 else if(entermonth == 9) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("30");
   			  }
  			 else if(entermonth == 10) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("31");
   			  }
  			 else if(entermonth == 11) {
 				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("30");
   			  }
  			 else {
  				combineDate=year.concat(Integer.toString(entermonth));
   				combineDate=combineDate.concat(slash);
   				combineDate=combineDate.concat("31");
   			  }
  			System.out.println("Date: "+combineDate);
  			System.out.println("\n");
  			System.out.println(tempDate);
  			System.out.println("\t\t\t\t" + companyName + "\n" + "\t" + "Address:" + address + "\n");
		    System.out.println("-------------------------------Monthly Summary Report--------------------------------");
			System.out.println("Date \t\t  Product ID \t Product Name \t Total Quantity \t Total Amount(RM) \t ");
			System.out.println("=====================================================================================");
			for(int i=0; i<monthlyReceipt.size(); i++){
			   	 if(combineDate.equals(monthlyReceipt.get(i).getSysDate())) { //compare the date
			   	    System.out.println(monthlyReceipt.get(i).toString1()); //display the date that user wants
			     	count++;
			    	grdTotal+= monthlyReceipt.get(i).getTotalAmount(); //total up the total amount within a month
			   	 }
		    	
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t ============");
			System.out.printf("\t\t\t\t\t\t\t     Grand Total: RM  %.2f \n", grdTotal);
			System.out.println("\n=====================================================================================");
			System.out.println(" ( "+ count + " ) " + "Record(s) Found");
                        System.out.print("\nPress anything to continue.............");
                        scn.nextLine();
  		  }
	}

    @Override
    public String toString() {
        return "monthlyReport{" + "grandMonthlyTotal=" + grandMonthlyTotal + ", avgSales=" + avgSales + '}';
    }
        
}