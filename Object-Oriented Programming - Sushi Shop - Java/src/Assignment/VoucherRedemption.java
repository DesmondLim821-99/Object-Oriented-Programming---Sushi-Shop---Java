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
public class VoucherRedemption extends GiftRedemption {
    
    private String VoucherCode;
    private static int pointRequirement = 100;
    
    public VoucherRedemption (){
        
    }
    
    public VoucherRedemption (Member member, int giftID, String giftName){
        super (member, giftID, giftName);
    }
    
    public void setvoucherCode (String VoucherCode){
        this.VoucherCode = VoucherCode;
    }
    
    public String getvoucherCode (){
        return VoucherCode;
    }
    
    public int getpointRequirement(){
        return pointRequirement;
    }
    
    public void generateVoucher (){
        if (super.getMember().getRedemptionCount() > 0){
            super.getMember().setRedemptionCount(super.getMember().getRedemptionCount() - 1);
            setvoucherCode ("VCDiscount");
            System.out.println("\n\t\t\t\t\t\tVoucher Successfully generated!!");
            System.out.println("\n\t\t\t\t\t\tMember ID : " + super.getMember().getmemberID() + "\n\t\t\t\t\t\tMember Name : " + super.getMember().getmemberName());
            System.out.println("\n\n\t\t\t\t\t\tVoucher Code : " + getvoucherCode() + "\n\n\t\t\t\t\t\tMonthly Redemption Chance left for this member :" + super.getMember().getRedemptionCount());
        } else
            System.out.println("\n\t\t\t\t\t\tSorry, No more voucher redemption left for this month.....");
    }
    
    @Override
    public String toString (){
        return super.toString() + "\t\t\t\t\t\t\tPoint Required per Redemption : " + pointRequirement;
    }
}
