/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;


import java.util.Scanner;

public class Delivery {
    private String DeliveryCompany;
    private int TrackingNumber;
    private String NewCustomerName;
    private String NewCustomerContactNo;
    private String NewCustomerAddress;
    private String DeliveryStates;
    private String NewCustomerOrderID;
    
    public Delivery(){
        
    }
    
    public Delivery(String NewCustomerOrderID, int TrackingNumber,String DeliveryCompany, String NewCustomerName, String NewCustomerContactNo, String NewCustomerAddress, String DeliveryStates){
        this.DeliveryCompany = DeliveryCompany;
        this.TrackingNumber = TrackingNumber;
        this.NewCustomerName = NewCustomerName;
        this.NewCustomerContactNo = NewCustomerContactNo;
        this.NewCustomerAddress = NewCustomerAddress;
        this.DeliveryStates = DeliveryStates;
        this.NewCustomerOrderID = NewCustomerOrderID;
    }
    
        
    public void setDeliveryCompany(String DeliveryCompany){
        this.DeliveryCompany = DeliveryCompany;
    }
    
    public String getDeliveryCompany(){
        return DeliveryCompany;
    }

    public int getTrackingNumber(){
        return TrackingNumber;
    }
            
    public void setNewCustomerName(String NewCustomerName){
        this.NewCustomerName = NewCustomerName;
    }
    
    public String getNewCustomerName(){
        return NewCustomerName;
    }
            
    public void setNewCustomerContactNo(String NewCustomerContactNo){
        this.NewCustomerContactNo = NewCustomerContactNo;
    }
    
    public String getNewCustomerContactNo(){
        return NewCustomerContactNo;
    }
            
    public void setNewCustomerAddress(String NewCustomerAddress){
        this.NewCustomerAddress = NewCustomerAddress;
    }
    
    public String getNewCustomerAddress(){
        return NewCustomerAddress;
    }
    
    public void setDeliveryStates(String DeliveryStates){
        this.DeliveryStates = DeliveryStates;
    }
    
    public String getDeliveryStates(){
        return DeliveryStates;
    }
    
    public void setNewCustomerOrderID(String NewCustomerOrderID){
        this.NewCustomerOrderID = NewCustomerOrderID;
    }
    
    public String getNewCustomerOrderID(){
        return NewCustomerOrderID;
    }
    
    public void updateDelivery (){
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        int option = 0;
        
        
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t ________________________________");
        System.out.println("\t\t\t\t\t\t|                               |");
	System.out.println("\t\t\t\t\t\t|         Update*Delivery       |");
        System.out.println("\t\t\t\t\t\t|-------------------------------|");
	System.out.println("\t\t\t\t\t\t| 1. Update Customer Name       |");
	System.out.println("\t\t\t\t\t\t| 2. Update Customer Address    |");
	System.out.println("\t\t\t\t\t\t| 3. Update Customer Contact No |");
	System.out.println("\t\t\t\t\t\t| 4. Update Delivery Status     |");
	System.out.println("\t\t\t\t\t\t|_______________________________|");
        
        do {
            System.out.print("\n\t\t\t\t\t\t Enter your selection (1-4) : ");
            while (!sc1.hasNextInt())
            {
                System.out.print("Error!!! Invalid Input! Please try again.........");
                System.out.print("\n Enter your selection : ");
                sc1.next();
            } option = sc1.nextInt();
            
//            option = sc1.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4);
        
        switch (option){
            
            case 1:
                System.out.print("\nEnter new Customer Name: ");
                String name = sc.nextLine();
                setNewCustomerName(name);
                System.out.println("\nProcessing....... Successfull!!!!");
                break;
            case 2:
                System.out.print("\nEnter new Customer Address: ");             
                String address = sc.nextLine();              
                setNewCustomerAddress(address);
                System.out.println("\nProcessing....... Successfull!!!!");
                break;
            case 3:
                System.out.print("\nEnter new Customer Contact No: ");
                String number = sc.nextLine();
                setNewCustomerContactNo(number);
                System.out.println("\nProcessing....... Successfull!!!!");
                break;
            case 4:
                System.out.print("\nEnter new Delivery Status: ");               
                String status = sc.nextLine();
                setDeliveryStates(status);
                System.out.println("\nProcessing....... Successfull!!!!");
                break;
            default:
                System.out.println("Error!!! Invalid Input! Please try again.....");
        }
    }
    
    public int DeleteDelivery (){
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter Number (1/2/3) : ");       
        while (!sc.hasNextInt()){
            System.out.println("Error!!! Invalid Input! Please try again......");
            System.out.println(" Enter Number (1/2/3) :");
            sc.next();
        } int Num = sc.nextInt();
        
        return Num ;
    }
    
    public String DisplayDelivery(){
    return "\nDelivery Company : " + DeliveryCompany + "\nTracking Number : " + TrackingNumber ;

}    

}