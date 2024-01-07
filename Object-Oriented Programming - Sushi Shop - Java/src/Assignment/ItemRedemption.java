/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class ItemRedemption extends GiftRedemption{
    private static String [] ItemName = {"HandBag", "Mini Fan", "PowerBank", "Writing Books X3", "Iphone Charger", "Chair"};
    
    public ItemRedemption (){
        
    }
    
    public ItemRedemption (Member member, int giftID, String giftName){
        super (member, giftID, giftName);
    }
    
    public String getItemName (int choice){
        return ItemName[choice];
    }
    
    public void redeemItem (){
        Scanner sc = new Scanner (System.in);
        int option = 0;
        
        System.out.println("\n\n\n\t\t\t\t\t\t      Item List      ");
        System.out.println("\t\t\t\t\t\t=====================");
        for (int i = 0; i < ItemName.length; i ++){
            System.out.println("\t\t\t\t\t\t" + (i + 1) + ") " + ItemName[i]);
        }
        
        do {
            System.out.print("\n\t\t\t\t\t\tEnter your selection (1 - 6): ");
            while (!sc.hasNextInt()){
                System.out.println("\t\t\t\t\t\tInvalid Input!!! Please try again......");
                System.out.print("\n\t\t\t\t\t\tEnter your selection (1 - 6): ");
                sc.next();
            }option = sc.nextInt();
            
            if (option != 1 &&  option != 2 && option != 3 && option != 4 && option != 5 && option != 6){
                System.out.println("\t\t\t\t\t\tInvalid Input!!! Please try again......");
            }
            
        } while (option != 1 &&  option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
        
        System.out.println("\n\t\t\t\t\t\tProcessing...........Redemption Successfull!!!");
        System.out.println("\n\t\t\t\t\t\tMember ID : " + super.getMember().getmemberID() + "\n\t\t\t\t\t\tMember Name : " + super.getMember().getmemberName() + "\n\t\t\t\t\t\tItem Name : " + ItemName[option -1]);
        
    }
    
    @Override
    public String toString (){
        return super.toString();
    }
}
