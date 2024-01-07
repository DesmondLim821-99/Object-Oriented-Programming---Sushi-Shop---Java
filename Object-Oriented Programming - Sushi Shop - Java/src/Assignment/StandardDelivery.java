/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

public class StandardDelivery extends Delivery{
    private double DeliveryFee = 0.5;
    
    public StandardDelivery(){
        
    }
    
    public StandardDelivery(String NewCustomerOrderID, int TrackingNumber,String DeliveryCompany, String NewCustomerName, String NewCustomerContactNo, String NewCustomerAddress, String DeliveryStates){
        super ( NewCustomerOrderID, TrackingNumber, DeliveryCompany, NewCustomerName, NewCustomerContactNo, NewCustomerAddress, DeliveryStates);
    }
    
    
    public double getStandardDeliveryFee(){
        return DeliveryFee;
    }   

    @Override
    public String toString (){
        return super.toString() + "\nDelivery Fee : " + DeliveryFee ;
    }    
}
