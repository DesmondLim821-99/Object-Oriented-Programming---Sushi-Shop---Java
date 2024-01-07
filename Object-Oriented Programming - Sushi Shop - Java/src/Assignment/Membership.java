package Assignment;

import java.util.Scanner;

public abstract class  Membership {
    protected Member member;
    protected String memberStatus;
    protected double memberPoint = 500;
    protected int MemCount;
    
    public Membership (){
        
    }
    
    public Membership (Member member, String memberStatus){
        this.member = member;
        this.memberStatus = memberStatus;
        
        MemCount++;
    }
    
    public void setMember (Member member){
        this.member = member;
    }
    
    public Member getmember (){
        return member;
    }
    
    public void setmemberStatus (String memberStatus){
        this.memberStatus = memberStatus;
    }
    
    public String getmemberStatus (){
        return memberStatus;
    }
    
    public void setmemberPoint (double memberPoint){
        this.memberPoint = memberPoint;
    }
    
    public double getmemberPoint (){
        return memberPoint;
    }
    
    public int getMemberCount (){
        return MemCount;
    }
    
    public abstract Membership createMember (int ID, String type);
    
    public String displayMembership (){
        return member.toString() + "\t " + memberStatus;
    }
    
    public void updateMembership (){
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        int option = 0;
        
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t ______________________________");
        System.out.println("\t\t\t\t\t\t|        Update*Member         |");
        System.out.println("\t\t\t\t\t\t|------------------------------|");
        System.out.println("\t\t\t\t\t\t| 1. Update Member Name        |");
        System.out.println("\t\t\t\t\t\t| 2. Update Member Age         |");
        System.out.println("\t\t\t\t\t\t| 3. Update Member Contact No  |");
        System.out.println("\t\t\t\t\t\t| 4. Update Member Gender      |");
        System.out.println("\t\t\t\t\t\t|______________________________|");
        
        do {
            System.out.print("\n\t\t\t\t\t\t Enter your selection : ");
            while (!sc1.hasNextInt())
            {
                System.out.print("Invalid Input! Please try again.........");
                System.out.print("\n Enter your selection : ");
                sc1.next();
            } option = sc1.nextInt();
            
//            option = sc1.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4);
        
        switch (option){
            
            case 1:
                System.out.print("\n\t\t\t\t\t\tEnter new Member Name: ");
                String name = sc.nextLine();
                member.setmemberName(name);
                System.out.println("\n\t\t\t\t\t\tProcessing....... Successfull!!!!");
                break;
            case 2:
                int age;
                System.out.print("\n\t\t\t\t\t\tEnter new Member Age: ");
                
                while(!sc1.hasNextInt()){
                    System.out.println("\t\t\t\t\t\tInvalid Input! Please try again......");
                    System.out.print("\n\t\t\t\t\t\tEnter new Member Age: ");
                    sc1.next();
                } age = sc1.nextInt();
                
                member.setmemberAge(age);
                System.out.println("\n\t\t\t\t\t\tProcessing....... Successfull!!!!");
                break;
            case 3:
                System.out.print("\n\t\t\t\t\t\tEnter new Member Contact No : ");
                String number = sc.nextLine();
                member.setmemberTelNo(number);
                System.out.println("\n\t\t\t\t\t\tProcessing....... Successfull!!!!");
                break;
            case 4:
                System.out.print("\n\t\t\t\t\t\tEnter new Member Gender: ");
                
                char gender = sc1.next().charAt(0);
                    
                member.setmemberGender(gender);
                System.out.println("\n\t\t\t\t\t\tProcessing....... Successfull!!!!");
                break;
            default:
                System.out.println("\t\t\t\t\t\tInvalid Input! Please try again.....");
        }
    }
    
    public int DeleteMembership (){
        Scanner sc = new Scanner (System.in);
        int ID = 0;
        
        System.out.println("\t\t\t\t\t\t Enter Member ID (4-digit):");
        
        while (!sc.hasNextInt()){
            System.out.println("\t\t\t\t\t\tInvalid Input! Please try again......");
            System.out.println("\t\t\t\t\t\t Enter Member ID (4-digit):");
            sc.next();
        } ID = sc.nextInt();
        
        return ID - 1000;
    }
    
    @Override
    public String toString (){
        return member.toString() + "\t\t\t\t\t\t" + memberStatus; 
    }
}
