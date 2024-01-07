package Assignment;

/**
 *
 * @author user
 */
public class Member {
    private int memberID;
    private String memberName;
    private int memberAge;
    private String memberTelNo;
    private char memberGender;
    private int RedemptionCount = 2;
    
    public Member (){
    }
    
    public Member (int memberID, String memberName, int memberAge, String memberTelNo, char memberGender){
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberTelNo = memberTelNo;
        this.memberGender = memberGender;
        
    }
    
    public void setmemberID (int memberID){
        this.memberID = memberID;
    }
    
    public int getmemberID (){
        return memberID;
    }
    
    public void setmemberName (String memberName){
        this.memberName = memberName;
    }
    
    public String getmemberName (){
        return memberName;
    }
    
    public void setmemberAge (int memberAge){
        this.memberAge = memberAge;
    }
    
    public int getmemberAge (){
        return memberAge;
    }
    
    public void setmemberTelNo (String memberTelNo){
        this.memberTelNo = memberTelNo;
    }
    
    public String getmemberTelNo (){
        return memberTelNo;
    }
    
    public void setmemberGender (char memberGender){
        this.memberGender = memberGender;
    }
    
    public char getmemberGender (){
        return memberGender;
    }
    
    public void setRedemptionCount (int count){
        this.RedemptionCount = count;
    }
    
    public int getRedemptionCount (){
        return RedemptionCount;
    }
    
    @Override
    public String toString (){
        return  + memberID + "\t\t " + memberName + "\t " + memberAge + "\t " + memberTelNo + "\t\t " + memberGender + "\t  ";
    }
}


//package Assignment;
//
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//// Constructor
//public class Member {
//	// Variable
//	private static Integer ID = 1000; // id use during increment
//	private String memberID; // store the complete member id format
//	private String memberName; // store member name
//	private String phone; // store member phone number
//	private String email; // store member email
//	private Integer timeOrder; // store number of time order
//	private Integer point; // store point collected
//	menu menu = new menu(); // object to link to the print menu class's methods
//	Staff staff = new Staff(); // object to link to the staff class's methods
//
//	// Default Constructor
//	public Member() {
//	}
//
//	// Constructor
//	public Member(String memberName, String phone, String email, Integer timeOrder, Integer point) {
//		this.memberID = setSeedID();
//		this.memberName = memberName;
//		this.phone = phone;
//		this.email = email;
//		this.timeOrder = timeOrder;
//		this.point = point;
//	}
//
//	// set user ID for seed use
//	private String setSeedID() {
//		ID++;
//		return memberID = "M" + ID;
//	}
//
//	// SET & GET method for Member ID
//	public String getMemberID() {
//		return memberID;
//	}
//
//	public void setMemberID(String memberID) {
//		ID++;
//		memberID = "M" + ID;
//	}
//
//	// SET & GET method for Member name
//	public String getMemberName() {
//		return memberName;
//	}
//
//	public void setMemberName(String memberName) {
//		this.memberName = memberName;
//	}
//
//	// SET & GET method for Member phone
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	// SET & GET method for Member email
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	// SET & GET method for Member time order
//	public Integer getTimeOrder() {
//		return timeOrder;
//	}
//
//	public void setTimeOrder(Integer timeOrder) {
//		this.timeOrder = timeOrder;
//	}
//
//	// SET & GET method for Member collected point
//	public Integer getPoint() {
//		return point;
//	}
//
//	public void setPoint(Integer point) {
//		this.point = point;
//	}
//
//	// calculate the point member collected
//	public Integer calcPoint(Integer addPoint) {
//		this.point += addPoint;
//		timeOrder++;
//		return point;
//	}
//
//	// to string method that display line by line
//	public String toString() {
//		return String.format("Member ID          : " + memberID + "\nName               : " + memberName
//				+ "\nPhone Number       : " + phone + "\nEmail              : " + email + "\nTime Order         : "
//				+ timeOrder + "\nCollected Point(s) : " + point + "\n\n");
//	}
//
//	// to string method that display in one line
//	public String toString1Line() {
//		return String.format("%9s \t %-20s %-15s %-25s %-10d   %-5d\n", memberID, memberName, phone, email, timeOrder,
//				point);
//	}
//
//	// Use for search module to return the name input by user
//	public ArrayList<Member> getMemberByName(ArrayList<Member> memberArr, String uInput) {
//		ArrayList<Member> tmpArr = new ArrayList<Member>();
//		memberArr.forEach(member -> {
//			if (member.getMemberName().contains(uInput)) {
//				tmpArr.add(member);
//			}
//		});
//		return tmpArr;
//	}
//
//	// Hard code some staff records
//	public void seeds(ArrayList<Member> memberArr) {
//		Member member1 = new Member("Jane", "01135132997", "jane@gmail.com", 2, 300);
//		memberArr.add(member1);
//		Member member2 = new Member("John", "0123456789", "john@gmail.com", 1, 150);
//		memberArr.add(member2);
//	}
//
//	// -----------DISPLAY ALL member method--------------------
//	public void displayAllMember(ArrayList<Member> memberArr) {
//		int i = 0; // use for "for loop"
//
//		// display all records if inside array list have records
//		if (memberArr.size() > 0) {
//			System.out.println(
//					"\n\nNo. Member ID \t Name                 Phone Number    Email                     Time Order   Points");
//			System.out.println(
//					"---------------------------------------------------------------------------------------------------------------");
//
//			// for loop to print all records
//			for (i = 0; i < memberArr.size(); i++) {
//				System.out.print((i + 1) + "." + memberArr.get(i).toString1Line());
//			}
//			System.out.println(
//					"---------------------------------------------------------------------------------------------------------------");
//			System.out.print("\t\t" + memberArr.size() + " record(s) found\n\n"); // display the numebr of record(s)
//																					// found
//
//		}
//		// tell user no record inside array list
//		else
//			System.out.println("No record added yet");
//	}
//	// ---------------------------------------------------
//
//	// -------------ADD member method----------------------
//	public void addMember(ArrayList<Member> memberArr) {
//		Scanner input = new Scanner(System.in); // object to capture user input
//		String name, phone, email; // capture user input when add record
//		Integer num = 0; // user input number of record to add
//		String confirmAdd = ""; // ask whether confirm add the record
//		int i = 0; // use for "for loop"
//
//		// validate user input is integer
//		try {
//			System.out.print("Enter number of member you wish to add : ");
//			num = input.nextInt();
//			input.nextLine();
//		}
//		// if user input not integer, display error message
//		catch (InputMismatchException e) {
//			System.out.println("Enter number(s) only. Alphabets are not allowed.");
//		}
//
//		// loop again if user wish to add more than 1 record
//		for (i = 0; i < num; i++) {
//			System.out.print("\n\nEnter Name         : ");
//			name = input.nextLine();
//
//			System.out.print("Enter phone number : ");
//			phone = input.nextLine();
//
//			System.out.print("Enter email        : ");
//			email = input.nextLine();
//
//			// validate user input is integer
//			try {
//				System.out.print("Enter time order   : ");
//				timeOrder = input.nextInt();
//				input.nextLine();
//
//				System.out.print("Enter point        : ");
//				point = input.nextInt();
//				input.nextLine();
//			}
//
//			// if user input not integer, display error message
//			catch (InputMismatchException e) {
//				System.out.println("Enter number(s) only. Alphabets are not allowed.");
//			}
//
//			// ask user whether they want to add the record
//			System.out.print("\nConfirm add member Y or N : ");
//			confirmAdd = input.nextLine();
//			confirmAdd = confirmAdd.toUpperCase();
//
//			// if user want to add record, record add to array list
//			if (confirmAdd.equalsIgnoreCase("y")) {
//				Member member = new Member(name, phone, email, 0, 0);
//				memberArr.add(member);
//			}
//			// if user want to add record, cancel add
//			else
//				System.out.println("Add member cancelled");
//		}
//	}
//	// -------------------------------------------------------
//
//	// -------------SEARCH member method----------------------
//	public void searchMember(ArrayList<Member> memberArr) {
//		int i = 0; // use for "for loop"
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		Integer choice = 0; // user choice for search menu
//
//		// check whether array list have record
//		if (memberArr.size() > 0) {
//			do {
//				// display search menu
//				choice = menu.searchMenu();
//				switch (choice) {
//				case 1:
//					// call search by id method
//					searchByID(memberArr);
//					break;
//				case 2:
//					// call search by name method
//					searchByName(memberArr);
//					break;
//				default:
//					// display error message, if user input other than 1-3
//					System.out.println("Invalid input. Please enter (1-3) only.");
//					break;
//				}
//				// if user choice not 3 continue to loop search
//			} while (choice != 3);
//		}
//		// tell user no record add yet
//		else
//			System.out.println("No record added yet");
//	}
//	// ------------------------------------------------------
//
//	// -------------SEARCH by ID member method----------------------
//	public void searchByID(ArrayList<Member> memberArr) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		String searchID; // capture user input id for searching
//		int i = 0; // use for looping
//		boolean found = false; // check if there is record found
//
//		// user enter id wish to search
//		System.out.print("Enter Member ID : ");
//		searchID = input.nextLine();
//		searchID = searchID.toUpperCase();
//
//		// loop the array list
//		for (i = 0; i < memberArr.size(); i++) {
//			// if the search ID and records inside array list matched
//			if (searchID.equalsIgnoreCase(memberArr.get(i).getMemberID()))
//				found = true;
//			else
//				found = false;
//
//			// if record found, display record
//			if (found == true) {
//				System.out.println(memberArr.get(i).toString());
//				break;
//			}
//		}
//		// tell user record not found in array list
//		if (found == false)
//			System.out.println("ID does not exist");
//
//	}
//	// ------------------------------------------------------
//
//	// -------------SEARCH by member NAME method----------------------
//	public void searchByName(ArrayList<Member> memberArr) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		String searchName; // capture user input id for searching
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// user input name wish to search
//		System.out.print("Enter Member Name : ");
//		searchName = input.nextLine();
//		ArrayList<Member> tmpArr = new ArrayList<Member>(); // declare new array list to store the matched record
//		tmpArr = getMemberByName(memberArr, searchName); // store the return records inside the array list
//
//		// check whether there are records inside the array list
//		if (tmpArr.size() > 0) {
//			System.out.println(
//					"\n\nNo. Member ID \t Name                 Phone Number    Email                     Time Order   Points");
//			System.out.println(
//					"---------------------------------------------------------------------------------------------------------------");
//			// loop to print the records
//			for (i = 0; i < tmpArr.size(); i++) {
//				System.out.println((i + 1) + tmpArr.get(i).toString1Line());
//			}
//			System.out.println(
//					"---------------------------------------------------------------------------------------------------------------");
//			System.out.print("\t\t" + tmpArr.size() + " record(s) found\n\n");
//
//		}
//		// tell user the name enter by user does not match with the records
//		else
//			System.out.println("Name does not exist in the record");
//	}
//	// -----------------------------------------------
//
//	// -------------UPDATE by member method----------------------
//	public void updateMember(ArrayList<Member> memberArr, ArrayList<Staff> staffArr, String loginID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		Integer choice = 0; // user choice for Update menu
//		String searchID; // capture user input id to update
//		String nextUpdate = ""; // capture user input whether want to update another record
//		int i = 0; // use for "for loop"
//
//		// check whether there are records inside the array list
//		if (memberArr.size() > 0) {
//			// loop staff array list record
//			for (i = 0; i < staffArr.size(); i++) {
//				// compare the login ID and the records in array list is matched
//				if (loginID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
//					// if the role of the login people is a manager or help desk
//					if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") == 0
//							|| staffArr.get(i).getRole().compareToIgnoreCase("Help Desk") == 0) {
//
//						do {
//							// user input id for update
//							System.out.print("Please input member ID for update: ");
//							searchID = input.nextLine();
//
//							// display update menu
//							choice = menu.updateMenu();
//
//							switch (choice) {
//							case 1:
//								// call update name method
//								updateName(memberArr, searchID);
//								break;
//							case 2:
//								// call update phone method
//								updatePhone(memberArr, searchID);
//								break;
//							case 3:
//								// call update email method
//								updateEmail(memberArr, searchID);
//								break;
//							case 4:
//								// call update time order method
//								updateTimeOrder(memberArr, searchID);
//								break;
//							case 5:
//								// call update point method
//								updatePoint(memberArr, searchID);
//								break;
//							default:
//								// print error message when user input other than 1-5
//								System.out.println("Invalid input. Please enter (1-5) only.");
//								break;
//
//							}
//
//							// ask user if want to update another records
//							System.out.print("Next Update (Y=yes OR N=no) ? ");
//							nextUpdate = input.next();
//							input.nextLine();
//							nextUpdate = nextUpdate.toUpperCase();
//
//							// if user want to edit another records
//							if (nextUpdate.compareToIgnoreCase("N") == 0 || nextUpdate.compareToIgnoreCase("Y") == 0) {
//
//							}
//							// if user input other than Y and N, display error message
//							else
//								System.out.println("Invalid input. Please enter 'Y' or 'N' only.");
//
//							// if user want to update another records continue to loop
//						} while (nextUpdate.compareToIgnoreCase("Y") == 0);
//
//					}
//					// if login staff NOT manager or help desk role
//					else {
//						do {
//							// user input id for update
//							System.out.print("Please input member ID for Update: ");
//							searchID = input.nextLine();
//
//							// only let user update point of member
//							updatePoint(memberArr, searchID);
//
//							// ask user if want to update another records
//							System.out.print("Next Update (Y=yes OR N=no) ? ");
//							nextUpdate = input.next();
//							input.nextLine();
//							nextUpdate = nextUpdate.toUpperCase();
//
//							// if user want to update another records
//							if (nextUpdate.compareToIgnoreCase("N") == 0 || nextUpdate.compareToIgnoreCase("Y") == 0) {
//
//							}
//							// if user input other than Y and N, display error message
//							else
//								System.out.println("Invalid input. Please enter 'Y' or 'N' only.");
//
//							// if user want to update another records continue to loop
//						} while (nextUpdate.compareToIgnoreCase("Y") == 0);
//					}
//				}
//			}
//		}
//		// tell user no records inside the array list yet
//		else
//			System.out.println("No record added yet");
//	}
//	// ----------------------------------------------------------
//
//	// -------------UPDATE by member NAME method----------------------
//	public void updateName(ArrayList<Member> memberArr, String searchID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		String name; // user input new name
//		String continueUpdate; // user input whether they want to continue to update
//		String confirmUpdate; // user input whether they confirm the update made
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// loop the records in array list
//		for (i = 0; i < memberArr.size(); i++) {
//			// if the search ID matched with the records in array list, display the record
//			if (searchID.compareToIgnoreCase(memberArr.get(i).getMemberID()) == 0) {
//				System.out.println(memberArr.get(i).toString());
//				found = true;
//
//				// ask user whether want to continue edit the record found
//				System.out.print("Continue Update (Y=Yes OR N=No) ? ");
//				continueUpdate = input.next();
//				input.nextLine();
//				continueUpdate = continueUpdate.toUpperCase();
//
//				// if user want to continue edit on the record found
//				if (continueUpdate.compareToIgnoreCase("Y") == 0) {
//					System.out.println("Enter new name : ");
//					name = input.nextLine();
//
//					// ask user whether they confirm the changes made
//					System.out.print("Confirm Update Y or N : ");
//					confirmUpdate = input.nextLine();
//					confirmUpdate = confirmUpdate.toUpperCase();
//
//					// if user don't want the changes they made, cancel changes
//					if (confirmUpdate.compareToIgnoreCase("N") == 0) {
//						System.out.println("Update Cancelled");
//					}
//					// if user confirm the changes they made, save changes
//					else if (confirmUpdate.compareToIgnoreCase("Y") == 0) {
//						memberArr.get(i).setMemberName(name);
//						System.out.println("After Update\n=======================");
//						System.out.println(memberArr.get(i).toString());
//					}
//				}
//				// if user don't want to continue update on the record found
//				else if (continueUpdate.compareToIgnoreCase("N") == 0)
//					System.out.println("Back...");
//				// display error message if user enter other than Y and N for continue update
//				// record
//				else
//					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//			}
//		}
//		// tell user cannot find user in the record
//		if (found == false)
//			System.out.println("Unable to find the record");
//	}
//	// ----------------------------------------------------------
//
//	// -------------UPDATE by member PHONE NUMBER method----------------------
//	public void updatePhone(ArrayList<Member> memberArr, String searchID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		String phone; // user input new phone number
//		String continueUpdate; // user input whether they want to continue to update
//		String confirmUpdate; // user input whether they confirm the update made
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// loop the records in array list
//		for (i = 0; i < memberArr.size(); i++) {
//			// compare if search ID and records in array list matched, display the record
//			if (searchID.compareToIgnoreCase(memberArr.get(i).getMemberID()) == 0) {
//				System.out.println(memberArr.get(i).toString());
//				found = true;
//
//				// ask user whether want to continue edit the record found
//				System.out.print("Continue Update (Y=Yes OR N=No) ? ");
//				continueUpdate = input.next();
//				input.nextLine();
//				continueUpdate = continueUpdate.toUpperCase();
//
//				// if user want to continue edit on the record found
//				if (continueUpdate.compareToIgnoreCase("Y") == 0) {
//					// ask user input the new phone
//					System.out.print("Enter new phone number (E.g: 0123456789): ");
//					phone = input.nextLine();
//
//					// ask user whether they confirm the changes made
//					System.out.print("Confirm Update Y or N : ");
//					confirmUpdate = input.nextLine();
//					confirmUpdate = confirmUpdate.toUpperCase();
//
//					// if user don't want the changes they made, cancel changes
//					if (confirmUpdate.compareToIgnoreCase("N") == 0)
//						System.out.println("Update Cancelled");
//
//					// if user want the changes they made, save changes
//					else if (confirmUpdate.compareToIgnoreCase("Y") == 0) {
//						memberArr.get(i).setPhone(phone);
//						System.out.println("After Update\n=======================");
//						System.out.println(memberArr.get(i).toString());
//					}
//					// display error message if user enter other than Y and N for confirm update
//					else
//						System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//				}
//				// if user don't want to continue edit on the record found
//				else if (continueUpdate.compareToIgnoreCase("N") == 0)
//					System.out.println("Back...");
//
//				// display error message if user enter other than Y and N for continue update
//				else
//					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//			}
//		}
//		// tell user cannot find user in the record
//		if (found == false)
//			System.out.println("Unable to find the record");
//	}
//	// ----------------------------------------------------------
//
//	// -------------UPDATE by member EMAIL method----------------------
//	public void updateEmail(ArrayList<Member> memberArr, String searchID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		String email; // user input new email
//		String continueUpdate; // user input whether they want to continue to update
//		String confirmUpdate; // user input whether they confirm the update made
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// loop the records in array list
//		for (i = 0; i < memberArr.size(); i++) {
//			// compare if search ID and records in array list matched, display the record
//			if (searchID.compareToIgnoreCase(memberArr.get(i).getMemberID()) == 0) {
//				System.out.println(memberArr.get(i).toString());
//				found = true;
//
//				// ask user whether want to continue edit the record found
//				System.out.print("Continue Update (Y=Yes OR N=No) ? ");
//				continueUpdate = input.next();
//				input.nextLine();
//				continueUpdate = continueUpdate.toUpperCase();
//
//				// if user want to continue update on the record found
//				if (continueUpdate.compareToIgnoreCase("Y") == 0) {
//
//					// ask user input the new email
//					System.out.print("Enter new email (E.g: abc@gmail.com) : ");
//					email = input.nextLine();
//
//					// ask user whether they confirm the changes made
//					System.out.print("Confirm Update Y or N : ");
//					confirmUpdate = input.nextLine();
//					confirmUpdate = confirmUpdate.toUpperCase();
//
//					// if user don't want the changes they made, cancel changes
//					if (confirmUpdate.compareToIgnoreCase("N") == 0)
//						System.out.println("Update Cancelled");
//
//					// if user want the changes they made, save changes
//					else if (confirmUpdate.compareToIgnoreCase("Y") == 0) {
//						memberArr.get(i).setEmail(email);
//						System.out.println("After Update\n=======================");
//						System.out.println(memberArr.get(i).toString());
//					}
//					// display error message if user enter other than Y and N for confirm update
//					else
//						System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//				}
//				// if user don't want to continue edit on the record found
//				else if (continueUpdate.compareToIgnoreCase("N") == 0)
//					System.out.println("Back...");
//
//				// display error message if user enter other than Y and N for continue update
//				else
//					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//			}
//		}
//		// tell user cannot find user in the record
//		if (found == false)
//			System.out.println("Unable to find the record");
//	}
//
//	// ----------------------------------------------------------
//
//	// -------------UPDATE by member TIME ORDER method----------------------
//	public void updateTimeOrder(ArrayList<Member> memberArr, String searchID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		Integer timeOrder = 0; // user input new TIME ORDER
//		String continueUpdate = ""; // user input whether they want to continue to update
//		String confirmUpdate = ""; // user input whether they confirm the update made
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// loop the records in array list
//		for (i = 0; i < memberArr.size(); i++) {
//			// compare if search ID and records in array list matched, display the record
//			if (searchID.compareToIgnoreCase(memberArr.get(i).getMemberID()) == 0) {
//				System.out.println(memberArr.get(i).toString());
//				found = true;
//
//				// ask user whether want to continue edit the record found
//				System.out.print("Continue Update (Y=Yes OR N=No) ? ");
//				continueUpdate = input.next();
//				input.nextLine();
//				continueUpdate = continueUpdate.toUpperCase();
//
//				// if user want to continue update on the record found
//				if (continueUpdate.compareToIgnoreCase("Y") == 0) {
//
//					// check if input integer
//					try {
//						// ask user input the new time order
//						System.out.print("Enter new time order : ");
//						timeOrder = input.nextInt();
//						input.nextLine();
//
//						// ask user whether they confirm the changes made
//						System.out.print("Confirm Update Y or N : ");
//						confirmUpdate = input.nextLine();
//						confirmUpdate = confirmUpdate.toUpperCase();
//
//					}
//					// display error message when user input non integer
//					catch (InputMismatchException e) {
//
//						System.out.println("Enter number(s) only. Alphabets are not allowed.");
//					}
//
//					// if user don't want the changes they made, cancel changes
//					if (confirmUpdate.compareToIgnoreCase("N") == 0)
//						System.out.println("Update Cancelled");
//
//					// if user want the changes they made, save changes
//					else if (confirmUpdate.compareToIgnoreCase("Y") == 0) {
//						memberArr.get(i).setTimeOrder(timeOrder);
//						System.out.println("After Update\n=======================");
//						System.out.println(memberArr.get(i).toString());
//					}
//				}
//				// if user don't want to continue edit on the record found
//				else if (continueUpdate.compareToIgnoreCase("N") == 0)
//					System.out.println("Back...");
//				// display error message if user enter other than Y and N for continue update
//				else
//					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//			}
//		}
//		// tell user cannot find user in the record
//		if (found == false)
//			System.out.println("Unable to find the record");
//	}
//	// ----------------------------------------------------------
//
//	// -------------UPDATE by member POINT method----------------------
//	public void updatePoint(ArrayList<Member> memberArr, String searchID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		Integer point = 0; // user input new POINT
//		String continueUpdate = ""; // user input whether they want to continue to update
//		String confirmUpdate = ""; // user input whether they confirm the update made
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// loop the records in array list
//		for (i = 0; i < memberArr.size(); i++) {
//			// compare if search ID and records in array list matched, display the record
//			if (searchID.compareToIgnoreCase(memberArr.get(i).getMemberID()) == 0) {
//				System.out.println(memberArr.get(i).toString());
//				found = true;
//
//				// ask user whether want to continue edit the record found
//				System.out.print("Continue Update (Y=Yes OR N=No) ? ");
//				continueUpdate = input.next();
//				input.nextLine();
//				continueUpdate = continueUpdate.toUpperCase();
//
//				// if user want to continue update on the record found
//				if (continueUpdate.compareToIgnoreCase("Y") == 0) {
//
//					// check if input integer
//					try {
//						System.out.print("Add collected point : ");
//						point = input.nextInt();
//						input.nextLine();
//
//						System.out.print("Confirm Update Y or N : ");
//						confirmUpdate = input.nextLine();
//						confirmUpdate = confirmUpdate.toUpperCase();
//					}
//					// display error message when user input non integer
//					catch (InputMismatchException e) {
//
//						System.out.println("Enter number(s) only. Alphabets are not allowed.");
//					}
//					// if user don't want the changes they made, cancel changes
//					if (confirmUpdate.compareToIgnoreCase("N") == 0) {
//						System.out.println("Update Cancelled");
//					}
//					// if user want the changes they made, save changes
//					else if (confirmUpdate.compareToIgnoreCase("Y") == 0) {
//						memberArr.get(i).calcPoint(point);
//
//						System.out.println("After Update\n=======================");
//						System.out.println(memberArr.get(i).toString());
//					}
//				}
//				// if user don't want to continue edit on the record found
//				else if (continueUpdate.compareToIgnoreCase("N") == 0)
//					System.out.println("Back...");
//				// display error message if user enter other than Y and N for continue update
//				else
//					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//
//			}
//		}
//		// tell user cannot find user in the record
//		if (found == false)
//			System.out.println("Unable to find the record");
//	}
//	// ----------------------------------------------------------
//
//	// -------------DELETE member record method----------------------
//	public void deleteMember(ArrayList<Member> memberArr, ArrayList<Staff> staffArr, String loginID) {
//		Scanner input = new Scanner(System.in); // object to capture the user input
//		String idToDelete = ""; // user input id that wish to be delete
//		String confirmDelete = ""; // user input whether confirm to delete the record
//		int i = 0; // use for "for loop"
//		boolean found = false; // check whether record found
//
//		// loop the records in array list
//		for (i = 0; i < staffArr.size(); i++) {
//
//			// compare the login ID and the records in array list is matched
//			if (loginID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
//
//				// if the role of the login people is a manager
//				if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") == 0) {
//
//					// check if there are records in array list
//					if (memberArr.size() > 0) {
//						System.out.println(
//								"\n\nNo. Member ID \t Name                 Phone Number    Email                     Time Order   Points");
//						System.out.println(
//								"---------------------------------------------------------------------------------------------------------------");
//						// loop to display all the records in the array list
//						for (i = 0; i < memberArr.size(); i++) {
//							System.out.println((i + 1) + memberArr.get(i).toString1Line());
//						}
//						System.out.println(
//								"---------------------------------------------------------------------------------------------------------------");
//						System.out.print("\t\t" + memberArr.size() + " record(s) found\n\n");
//
//						// ask user input id that they wish to delete
//						System.out.print("Enter Member ID that you wish to delete all the information : ");
//						idToDelete = input.nextLine();
//						idToDelete = idToDelete.toUpperCase();
//
//						// loop to find the record
//						for (i = 0; i < memberArr.size(); i++) {
//							// check the id that wish to delete with the records is matched
//							if (idToDelete.equalsIgnoreCase(memberArr.get(i).getMemberID()))
//								found = true;
//
//							if (found == true) {
//								// display the record found to user
//								System.out.println(memberArr.get(i).toString());
//
//								// ask user whether they want to delete the record found
//								System.out.print(
//										"Confirm delete all the information for the above record (Y=yes OR N=no) : ");
//								confirmDelete = input.nextLine();
//								confirmDelete = confirmDelete.toUpperCase();
//
//								// if user proceed on delete the record
//								if (confirmDelete.compareToIgnoreCase("Y") == 0) {
//									memberArr.remove(i); // remove the record from array list
//
//									// display all the records in the array list after delete action performed
//									System.out.println(
//											"\n\nNo. Member ID \t Name                 Phone Number    Email                     Time Order   Points");
//									System.out.println(
//											"---------------------------------------------------------------------------------------------------------------");
//
//									for (i = 0; i < memberArr.size(); i++) {
//										System.out.println((i + 1) + memberArr.get(i).toString1Line());
//									}
//									System.out.println(
//											"---------------------------------------------------------------------------------------------------------------");
//									System.out.print("\t\t" + memberArr.size() + " record(s) found\n\n");
//
//								}
//								// if user don't want to delete the record, cancel delete
//								else if (confirmDelete.compareToIgnoreCase("N") == 0)
//									System.out.println("Delete cancelled");
//								// display error message if user enter other than Y and N for confirm delete
//								else
//									System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
//
//							}
//						}
//						if (found == false)
//							System.out.println("Unable to find the record");
//					}
//					// tell user no record inside the array list yet
//					else
//						System.out.println("No record added yet");
//				}
//				// if user is NOT a manager, display error message
//				else
//					System.out.println("You have no authority to perform this action");
//			}
//		}
//	}
//}


