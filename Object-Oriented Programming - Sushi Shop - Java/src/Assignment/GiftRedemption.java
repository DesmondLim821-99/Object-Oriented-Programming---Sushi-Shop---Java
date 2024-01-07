/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.time.LocalDate;


/**
 *
 * @author user
 */
public abstract class GiftRedemption {
    protected Member member;
    protected int giftID;
    protected String giftName;
    protected LocalDate dateRedemption;
    
    public GiftRedemption (){
        
    }
    
    public GiftRedemption (Member member, int giftID, String giftName){
        this.member = member;
        this.giftID = giftID;
        this.giftName = giftName;
        
        dateRedemption = LocalDate.now();
    }
    
    public void setMember (Member member){
        this.member = member;
    }
    
    public Member getMember (){
        return member;
    }
    
    public void setgiftID(int giftID){
        this.giftID = giftID;
    }
    
    public int getgiftID (){
        return giftID;
    }
    
    public void setgiftName (String giftName){
        this.giftName = giftName;
    }
    
    public String getgiftName (){
        return giftName;
    }
    
    public LocalDate getDate (){
        return dateRedemption;
    }
    
    @Override
    public String toString (){
        return "\tGift ID :" + giftID + "\tGift Name : " + giftName + "\tDate Redemption : " + dateRedemption;
    }
    
}
