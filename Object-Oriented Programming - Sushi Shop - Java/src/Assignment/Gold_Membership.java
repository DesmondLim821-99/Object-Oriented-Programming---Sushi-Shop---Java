/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Gold_Membership extends Membership{
    private double memberDiscount = 8.0;
    private int MonthlyGiftRedemption = 3;
    private double extraMemberPoint = 2.0;
    
    public Gold_Membership () {
        
    }
    
    public Gold_Membership (Member member, String memberStatus) {
        super (member, memberStatus);
    }
    
    public void setmemberDiscount (double memberDiscount){
        this.memberDiscount = memberDiscount;
    }
    
    public double getmemberDiscount (){
        return memberDiscount;
    }

    public void setmonthlyGiftRedemption (int MonthlyGiftRedemption){
        this.MonthlyGiftRedemption = MonthlyGiftRedemption;
    }
    
    public double getmonthlyGiftRedemption (){
        return MonthlyGiftRedemption;
    }
    
    public void setextraMemberPoint (double extraMemberPoint){
        this.extraMemberPoint = extraMemberPoint;
    }
    
    public double getextraMemberPoint (){
        return extraMemberPoint;
    }
    
    @Override
    public Gold_Membership createMember (int ID, String type){
    
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        int age = 0;
        
            System.out.println("\t\t\t\t\t\t ---- Create Member ----");
            System.out.println("\t\t\t\t\t\t =======================");
            System.out.print("\n\t\t\t\t\t\t Enter new Member Name : ");
            String name = sc.nextLine();
            System.out.print("\n\t\t\t\t\t\t Enter new Member Age : ");
            
            while (!sc1.hasNextInt()){
                System.out.print("\t\t\t\t\t\tInvalid Input! Please try again........");
                System.out.print("\n\t\t\t\t\t\t Enter new Member Age : ");
                sc1.next();
            }age = sc1.nextInt();
            
            System.out.print("\n\t\t\t\t\t\t Enter new Member Contact No. :");
            String contact = sc.nextLine();
            System.out.print("\n\t\t\t\t\t\t Enter new Member Gender : ");
            char gender = sc1.next().charAt(0);
            
            Gold_Membership newmember = new Gold_Membership (new Member (ID, name , age, contact , gender), type);
            
            return newmember;
    }
    
    @Override
    public String toString (){
        return super.toString() + "\n\t\t\t\t\t\tMember Ship : " + memberDiscount + "\n\t\t\t\t\t\tMonthly Gift Redemption : " + MonthlyGiftRedemption + "\n\t\t\t\t\t\textraMemberPoint" + extraMemberPoint;
    }
}
