/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;


public class PremiumDelivery extends Delivery{
    private double DeliveryFee = 1.5;
    
    public PremiumDelivery(){
        
    }
    
    public PremiumDelivery(String NewCustomerOrderID, int TrackingNumber,String DeliveryCompany, String NewCustomerName, String NewCustomerContactNo, String NewCustomerAddress, String DeliveryStates){
        super ( NewCustomerOrderID, TrackingNumber, DeliveryCompany, NewCustomerName, NewCustomerContactNo, NewCustomerAddress, DeliveryStates);
    }  
    

    public double getPremiumDeliveryFee(){
        return DeliveryFee;
    }   
    
    @Override
    public String toString (){
        return super.toString() + "\nDelivery Fee : " + DeliveryFee ;
    }        
}
