package Assignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Staff  {
	// Variable
	private static Integer ID = 1000; // id use during increment
	private String staffID; // store the complete staff id format
	private String staffName; // store staff name
	private String password; // store staff password
	private Integer recoveryQuestion; // recovery question for the use of forgot password
	private String recoveryAnswer; // recovery answer for the use of forgot password
	private String role; // store the role of a person
	menu menu = new menu(); // object to link to the print menu class's methods

	// Default Constructor
	public Staff() {
	}

	// Constructor
	public Staff(String staffName, String password, Integer recoveryQuestion, String recoveryAnswer, String role) {
		this.staffID = setSeedID();
		this.staffName = staffName;
		this.password = password;
		this.recoveryQuestion = recoveryQuestion;
		this.recoveryAnswer = recoveryAnswer;
		this.role = role;
	}

	// Use for search module to return the name input by user
	public ArrayList<Staff> getStaffByName(ArrayList<Staff> staffArr, String uInput) {
		ArrayList<Staff> tmpArr = new ArrayList<Staff>();
		staffArr.forEach(staff -> {
			if (staff.getStaffName().contains(uInput)) {
				tmpArr.add(staff);
			}
		});
		return tmpArr;
	}

	// Use for search module to return the role input by user
	public ArrayList<Staff> getStaffByRole(ArrayList<Staff> staffArr, int uInput) {
		ArrayList<Staff> tmpArr = new ArrayList<Staff>();
		staffArr.forEach(staff -> {
			switch (uInput) {
			case 1: {
				if (staff.getRole().equals("Staff")) {
					tmpArr.add(staff);
				}
				break;
			}
			case 2: {
				if (staff.getRole().equals("Manager")) {
					tmpArr.add(staff);
				}
				break;
			}
			case 3: {
				if (staff.getRole().equals("Help Desk")) {
					tmpArr.add(staff);
				}
				break;
			}
			}
		});
		return tmpArr;
	}

	// Hard code some staff records for the login usage
	public void seeds(ArrayList<Staff> staffArr) {
		Staff staff1 = new Staff("Ken", "0529", 1, "sleep", "Manager");
		staffArr.add(staff1);
		Staff staff2 = new Staff("HiiPuong", "1314", 1, "gym", "Staff");
		staffArr.add(staff2);
		Staff staff3 = new Staff("Desmond", "1234", 4, "69", "Help Desk");
		staffArr.add(staff3);
	}

	// set & get method for staff name
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	// set method for user ID
	public void setStaffID() {
		ID++;
		staffID = "S" + ID;
	}

	// set user ID for seed use
	public String setSeedID() {
		ID++;
		return staffID = "S" + ID;
	}

	public String getStaffID() {
		return staffID;
	}

	// set & get method for password
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	// set & get method for Recovery Question
	public void setRecoveryQuestion(Integer recoveryQuestion) {
		this.recoveryQuestion = recoveryQuestion;
	}

	public Integer getRecoveryQuestionNumber() {
		return recoveryQuestion;
	}

	public String getRecoveryQuestion() {
		if (recoveryQuestion == 1)
			return "1. What is your hobby?";
		if (recoveryQuestion == 2)
			return "2. How many pet do you have?";
		if (recoveryQuestion == 3)
			return "3. How many pet do you have?";
		else
			return "What your favourite number?";
	}

	// set & get method for Recovery Answer
	public void setRecoveryAnswer(String recoveryAnswer) {
		this.recoveryAnswer = recoveryAnswer;
	}

	public String getRecoveryAnswer() {
		return recoveryAnswer;
	}

	// set & get method for role
	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	// to string for the staff and help desk role so that they can't see other
	// people detail
	public String toStringOther() {
		return String.format("User ID           : " + staffID + "\nName              : " + staffName
				+ "\nPassword          : ******** \nRecovery Question : ******** \nRecovery Answer   : ******** \nRole              : "
				+ role + "\n\n");
	}

	// to string method for manager role that can view all detail of all the staff
	public String toString() {
		return String.format("User ID           : " + staffID + "\nName              : " + staffName
				+ "\nPassword          : " + password + "\nRecovery Question : " + recoveryQuestion
				+ "\nRecovery Answer   : " + recoveryAnswer + "\nRole              : " + role + "\n\n");
	}

	// to String method output in 1 line
	public String toString1Line() {
		return String.format("%9s \t %-20s %-20s %-20d %-20s %-15s\n", staffID, staffName, password, recoveryQuestion,
				recoveryAnswer, role);
	}

	public String toString1LineOther() {
		return String.format("%9s \t %-20s ********             ********             ********             %-15s\n",
				staffID, staffName, role);
	}

	// ---------------- add staff method--------------
	public void addStaff(Scanner input, ArrayList<Staff> staffArr, String loginID) {
		Integer choice = 0; // for recovery question and role choice
		String pass, confirmPass; // user input password and confirm password when add
		String name; // user input name to add
		String confirmAdd = ""; // to confirm the user want to add a staff
		Integer num = 0; // store number of staff the user want to add
		int i = 0; // use for "for loop"

		// loop to check the record inside the arraylist
		for (i = 0; i < staffArr.size(); i++) {
			if (loginID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) { // to check the login ID matched with
																					// ID inside the array list
				if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") == 0) { // check the role is it a manager
                                      
					System.out.println("Enter number of staff you wish to add : ");
					
                                        //Scanner checkk = new Scanner(System.in);
                                        while(!input.hasNextInt()){
                                            System.out.println("Enter number(only) of staff you wish to add : ");
                                            input.next();
                                        }
                                        num = input.nextInt();
                                       
                                        
					// loop to let the user add staff based on the number that user input
					for (i = 0; i < num; i++) {
                                                 input.nextLine();
						Staff staff = new Staff();

						System.out.print("Staff Name : ");
						name = input.nextLine();
						staff.setStaffName(name);
                                                

						// loop to check the password and confirm password is same
						do {
							System.out.print("Enter password : ");
							pass = input.nextLine();

							System.out.print("Enter confirm password : ");
							confirmPass = input.nextLine();

							if (pass.compareTo(confirmPass) != 0)
								System.out.println("Password and Confirm Password not matched! Please enter again");
							else
								staff.setPassword(pass);

						} while (pass.compareTo(confirmPass) != 0);

						// loop to check the recovery question choice
						do {
							choice = menu.recoveryQuestionMenu(input);
							input.nextLine();
							switch (choice) {
							case 1:
							case 2:
							case 3:
							case 4:
								staff.setRecoveryQuestion(choice);
								System.out.print("Recovery Answer : ");
								staff.setRecoveryAnswer(input.nextLine());
								break;
							default:
								System.out.println("Invalid Input!! Please enter (1,2,3 or 4) only.");
								break;
							}
						} while (choice < 1 || choice > 4);

						// loop to check the role choice
						do {
							choice = menu.roleMenu(input);
							input.nextLine();
							switch (choice) {
							case 1:
								staff.setRole("Staff");
								break;

							case 2:
								staff.setRole("Manager");
								break;
							case 3:
								staff.setRole("Help Desk");
								break;

							default:
								System.out.println("Invalid Input!! Please enter (1 - 3) only.");
								break;
							}
						} while (choice < 1 || choice > 3);

						// loop to ask user confirm add if wrong input then loop continue
						do {
							System.out.print("Confirm Add (Y=Yes OR N=No) ? ");
							confirmAdd = input.next();
							//input.nextLine();
							confirmAdd = confirmAdd.toUpperCase();
							// System.out.println(confirmAdd);// use for debug
							if (confirmAdd.compareToIgnoreCase("Y") == 0) {
								staff.setStaffID();
								staffArr.add(staff);
								System.out.println("\nUser Added!");
                                                                
							} else if (confirmAdd.compareToIgnoreCase("N") == 0) {
								System.out.println("Add staff cancelled");
							} else {
								System.out.println("Invalid Input. Please enter 'Y' or 'N' only. ");
							}
						} while (confirmAdd.compareToIgnoreCase("Y") != 0 && confirmAdd.compareToIgnoreCase("N") != 0);

					}
                                        break;
					// tell user they can't access because their role is not manager
				} else {
					System.out.println("You have no authority to perform this action");
				}
			}
		}

	}
	// -----------------End of add staff--------------

	// ---------------------Search staff method---------------------
	public void searchStaff(Scanner input, ArrayList<Staff> staffArr, Staff staff, String loginID) {
		String searchAnother = ""; // user decision to search another
		Integer choice = 0; // store the choice choose from print menu
		int i = 0; // use for "for loop"
		String loginRole = ""; // store the role of the person during login

		// check is there records inside the staff array list
		if (staffArr.size() > 0) {

			// loop to get the role of the person login
			for (i = 0; i < staffArr.size(); i++) {
				if (loginID.equalsIgnoreCase(staffArr.get(i).getStaffID())) {
					loginRole = staffArr.get(i).getRole();
				}
			}

			// loop for search module if the user want to search another
			do {

				choice = menu.searchMenu(input);
				input.nextLine();

				switch (choice) {
				case 1:
					// call the search by id method
					searchByID(input, staffArr, staff, loginID, loginRole);
					break;
				case 2:
					// call the search by role method
					searchByRole(input, staffArr, staff, loginID, loginRole);
					break;
				case 3:
					// call the search by name method
					searchByName(input, staffArr, staff, loginID, loginRole);
					break;
				default:
					// error message if user enter other than the 1-3
					System.out.println("Invalid input,please enter (1-3) only.\n");
					break;

				}

				// ask user whether want to search another records
				System.out.print("Search another records? (Y=yes OR N=no) : ");
				searchAnother = input.nextLine();
                                searchAnother = searchAnother.toUpperCase();
                                while(searchAnother.compareToIgnoreCase("Y")!=0&&searchAnother.compareToIgnoreCase("N")!=0){
                                    System.out.print("Please enter (Y=yes/N=no) to continue :" );
                                    searchAnother = input.nextLine();
                                }
				

				// user want to search another records
				if (searchAnother.compareToIgnoreCase("N") == 0 || searchAnother.compareToIgnoreCase("Y") == 0) {

				}
				// error message user enter other than Y and N
				else {
					System.out.println("Invalid input. Please enter 'Y' or 'N' only.");
				}

				// if user want to search another records continue to loop
			} while (searchAnother.compareToIgnoreCase("Y") == 0);
		}
		// tell user there are no records inside the array list
		else {
			System.out.println("No record added yet.");
		}
	}
	// ------------------------End of search staff------------------------

	// -----------------------Search staff by ID ----------------------------
	public void searchByID(Scanner input, ArrayList<Staff> staffArr, Staff staff, String loginID, String loginRole) {
		String searchID = ""; // user input id for search
		boolean found = false; // check whether found the ID inside the array list

		// ask user input the ID that user want to search
		System.out.print("Staff ID : ");
		searchID = input.nextLine();

		// loop to find the compare the ID from user input and array list
		for (int i = 0; i < staffArr.size(); i++) {

			// if the ID matched found is true
			if (searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
				found = true;
				
			}
			// else found is false
			else {
				found = false;

			}
			// when found is true
			if (found == true) {
				// check the role of the user login is NOT manager
				if (!loginRole.equalsIgnoreCase("Manager")) {
					// if the search ID same with login people
					if (loginID.equalsIgnoreCase(staffArr.get(i).getStaffID())) {
						System.out.println(staffArr.get(i).toString());
						break;
					}
					// if the search ID NOT same with login people
					else {
						System.out.println(staffArr.get(i).toStringOther());
						break;
					}
				}
				// the role is manager just print all in detail
				else {
					System.out.println(staffArr.get(i).toString());
					break;
				}
			}

		}
		// tell user cannot find user in the record
		if (found == false) {
			System.out.println("Unable to find the record");
		}

	}
	// --------------------End of Search staff ID-------------------------

	// --------------------Search staff by ROLE--------------------------
	public void searchByRole(Scanner input, ArrayList<Staff> staffArr, Staff staff, String loginID, String loginRole) {

		Integer role = 0; // user input role for search
		int i = 0; // use for "for loop"

		// validate input role
		try {
			role = menu.roleMenu(input);
			input.nextLine();
		}
		// if non integer input, print error message
		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		ArrayList<Staff> tmpArr = new ArrayList<Staff>(); // declare new array list to store the matched records
		tmpArr = staff.getStaffByRole(staffArr, role); // store the return records inside the array list

		// check whether there are records inside the array list
		if (tmpArr.size() > 0) {
			System.out.printf(
					"\n\nNo. Staff ID \t Name                 Password             Recovery Question    Recovery Answer      Role \n");
			System.out.println(
					"================================================================================================================");

			// loop to print the records
			for (i = 0; i < tmpArr.size(); i++) {

				// if role of the login people is NOT manager
				if (!loginRole.equalsIgnoreCase("Manager")) {
					// print login people records in detail
					if (loginID.equalsIgnoreCase(tmpArr.get(i).getStaffID()))
						System.out.println(tmpArr.get(i).toString1Line());

					// print other people records with limited detail
					else
						System.out.println(tmpArr.get(i).toString1LineOther());

				}
				// Role of the login people is Manager print all staff in detail
				else
					System.out.println(tmpArr.get(i).toString1Line());

				
			}
			System.out.println(
					"================================================================================================================");
			System.out.printf("\t\t" + tmpArr.size() + " record(s) found \n\n");
		}
		// tell user the role enter by user does not match with the records
		else {
			System.out.println("Role does not exist in the record");
		}
	}
	// ----------End of Search staff by ROLE----------------

	// -------------------------Search staff by NAME-----------------------
	public void searchByName(Scanner input, ArrayList<Staff> staffArr, Staff staff, String loginID, String loginRole) {
		String nameSearch; // user input search name
		int i = 0; // use for "for loop"

		// user input the name of the search staff
		System.out.print("Staff Name : ");
		nameSearch = input.nextLine();

		ArrayList<Staff> tmpArr = new ArrayList<Staff>(); // declare new array list to store the matched records
		tmpArr = staff.getStaffByName(staffArr, nameSearch); // store the return records inside the array list

		// check whether there are records inside the array list
		if (tmpArr.size() > 0) {
			System.out.printf(
					"\n\nNo. Staff ID \t Name                 Password             Recovery Question    Recovery Answer      Role \n");
			System.out.println(
					"================================================================================================================");

			// loop to print the records
			for (i = 0; i < tmpArr.size(); i++) {
				// if role of the login people is NOT manager
				if (!loginRole.equalsIgnoreCase("Manager")) {

					// print other people records with limited detail
					if (loginID.equalsIgnoreCase(tmpArr.get(i).getStaffID()))
						System.out.println(tmpArr.get(i).toString1Line());

					// print other people records with limited detail
					else
						System.out.println(tmpArr.get(i).toString1LineOther());

				}
				// Role of the login people is Manager print all staff in detail
				else
					System.out.println(tmpArr.get(i).toString1Line());
			}
			System.out.println(
					"================================================================================================================");
			System.out.printf("\t\t" + tmpArr.size() + " record(s) found \n\n");
		}
		// print message tell user the name enter by user does not match with the
		// records
		else {
			System.out.println("Name does not exist in the record");
		}
	}
	// --------------------------End of Search staff by NAME--------------------

	// ------------------------DISPLAY ALL staff method-----------------
	public void displayAllStaff(ArrayList<Staff> staffArr, String loginID) {
		int i = 0; // use for "for loop"
		String loginRole = ""; // store the role of the login people

		// loop to get the role of the login people
		for (i = 0; i < staffArr.size(); i++) {
			if (loginID.equalsIgnoreCase(staffArr.get(i).getStaffID())) {
				loginRole = staffArr.get(i).getRole();
			}
		}

		// check whether there are records inside the array list
		if (staffArr.size() > 0) {
			// login people's role is manager
			if (loginRole.equalsIgnoreCase("Manager")) {
				System.out.printf(
						"\n\nNo. Staff ID \t Name                 Password             Recovery Question    Recovery Answer      Role \n");
				System.out.println(
						"================================================================================================================");

				// loop to print all records
				for (i = 0; i < staffArr.size(); i++) {

					System.out.printf(" " + (i + 1) + " " + staffArr.get(i).toString1Line() + "\n");

				}
				System.out.println(
						"================================================================================================================");
				System.out.printf("\t\t" + staffArr.size() + " record(s) found \n\n"); // print number of record(s)
																						// found in record
			}
			// login people's role is NOT manager
			else {
				System.out.printf(
						"\n\nNo. Staff ID \t Name                 Password             Recovery Question    Recovery Answer      Role \n");
				System.out.println(
						"================================================================================================================");

				// loop to print all records
				for (i = 0; i < staffArr.size(); i++) {
					// login people ID matched with records, thus print in detail
					if (loginID.equalsIgnoreCase(staffArr.get(i).getStaffID()))
						System.out.printf(" " + (i + 1) + " " + staffArr.get(i).toString1Line() + "\n");
					// login people ID NOT matched with records, thus print with limited detail
					else
						System.out.printf(" " + (i + 1) + " " + staffArr.get(i).toString1LineOther() + "\n");
				}
				System.out.println(
						"================================================================================================================");
				System.out.printf("\t\t" + staffArr.size() + " record(s) found \n\n"); // print number of record(s)
																						// found in record
			}
		}
		// Tell user no record inside the array list yet
		else
			System.out.println("No record added yet.");
	}
	// -------------------End of DISPLAY ALL staff method----------------------

	// -------------------EDIT staff method-----------------------------
	public void editStaff(Scanner input, ArrayList<Staff> staffArr, String loginID) {
		Integer choice; // choice to select edit by which attribute
		String searchID = ""; // user input id to edit
		String nextEdit = ""; // user choice whether want to edit another records
		int i = 0; // user for "for loop"
		Staff staff = new Staff();

		// check whether there are records inside the array list
		if (staffArr.size() > 0) {

			// loop the array list
			for (i = 0; i < staffArr.size(); i++) {

				// if the login ID matched with the records inside array list
				if (loginID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {

					// if the role of the login people is Manager
					if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") == 0) {

						// loop if user want to edit another records
						do {
							// user input ID for edit
							System.out.print("\nPlease input staff id for edit, press 'e/E' to exit : ");
							searchID = input.nextLine();
                                                 
                                                        
                                                        boolean vld = false;
                                                        do{
                                                            if(searchID.equals("e")||searchID.equals("E")){
                                                                 //boolean found = false;
                                                                  break;
                                                         }
                                                            for(i = 0; i < staffArr.size()&&vld==false; i++){
                                                                 if(searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0){
                                                                     vld =true;
                                                                     
                                                                 }
                                                            }
                                                            if(vld == false){
                                                                System.out.println("Unable to find the record\n");
                                                                System.out.print("Please input staff id for edit, press 'e/E' to exit : ");
                                                                searchID = input.nextLine();
                                                            }
                                                             
                                                            
                                                        }while(vld == false);
                                                         if(searchID.equals("e")||searchID.equals("E")){
                                                                 //boolean found = false;
                                                                  break;
                                                                
                                                             }
                                                            
                                                         
                                                        
                                                  
//                                                        if(searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) != 0){
//                                                            while(searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) != 0 && !searchID.equals("e") && !searchID.equals("E")){
//                                                            System.out.println("Unable to find the record\n");
//                                                            System.out.print("Please input staff id for edit, press 'e/E' to exit : ");
//                                                            searchID = input.nextLine();
//                    
//                                                            }
//                                                          
//                                                            
//                                                        } if(searchID.equals("e")||searchID.equals("E")){
//                                                                 boolean found = false;
//                                                                  break;
//                                                                
//                                                             }
//                          
							// display the edit menu for user to choose which attribute to edit
							choice = menu.editMenu(input);
							input.nextLine();
                                                        while(choice != 1 && choice!=2 && choice !=3 && choice !=4 && choice !=-1){
                                                            System.out.println("Invalid input. Please enter (1-4) only, and enter -1 to exit.");
                                                            choice = menu.editMenu(input);
                                                            input.nextLine();
                                                            
                                                            if(choice == -1)
                                                            {
                                                                System.out.print("Exit..\n\n");
                                                                break;
                                                            }
                                                        }
                                                      

							switch (choice) {
							case 1:
								// call the method edit by name
								editByName(input, staffArr, searchID);
								break;
							case 2:
								// call the method edit by password
								editByPassword(input, staffArr, staff, searchID);
								break;
							case 3:
								// call the method edit by recovery question
								editByRecoveryQuestion(input, staffArr, staff, searchID);
								break;
							case 4:
								// call the method edit by recovery answer
								editByRole(input, staffArr, staff, searchID);
								break;
//							default:
//								// print error message when user input other than 1-5
//								System.out.println("Invalid input. Please enter (1-4) only.");
//								break;

							}

							// ask user if want to edit another records
							System.out.print("Next edit (Y=yes OR N=no) :");
							nextEdit = input.next();
							input.nextLine();
							nextEdit = nextEdit.toUpperCase();
                                                        while(nextEdit.compareToIgnoreCase("Y")!=0&&nextEdit.compareToIgnoreCase("N")!=0){
                                                            System.out.print("Please enter (Y=yes/N=no):" );
                                                            nextEdit = input.nextLine();
                                                        }

							// if user want to edit another records
							if (nextEdit.compareToIgnoreCase("N") == 0 || nextEdit.compareToIgnoreCase("Y") == 0) {

							}
							// if user input other than Y and N, display error message
							else {
								System.out.println("Invalid input. Please enter 'Y' or 'N' only.");
							}
							// if user want to edit another records continue to loop
						} while (nextEdit.compareToIgnoreCase("Y") == 0 );
					}
					// print error message when user is NOT a manager
					else if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") != 0)
						System.out.println("You have no authority to perform this action");
				}
			}
		}
		// tell user no records inside the array list yet
		else
			System.out.println("No record added yet");
	}
	// --------------------End of EDIT staff method--------------------

	// --------------------EDIT staff by NAME method---------------------
	public void editByName(Scanner input, ArrayList<Staff> staffArr, String searchID) {
		String continueEdit; // user input whether they want to continue to edit
		String name; // user input new edited name
		String confirmEdit; // user input whether they confirm the edit made
		int i = 0; // use for "for loop"
		boolean found = false; //check whether record found

		// loop the records in array list
		for (i = 0; i < staffArr.size(); i++) {
			// if the search ID matched with the records in array list, display the record
			if (searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
				System.out.println(staffArr.get(i).toString());
				found = true;
				
				// ask user whether want to continue edit the record found
				System.out.print("Continue edit (Y=Yes OR N=No) ? ");
				continueEdit = input.next();
                                while(continueEdit.compareToIgnoreCase("Y") != 0 && continueEdit.compareToIgnoreCase("N") != 0 ){
                                    System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                    continueEdit = input.next();
                                }
				input.nextLine();
				continueEdit = continueEdit.toUpperCase();

				// if user want to continue edit on the record found
				if (continueEdit.compareToIgnoreCase("Y") == 0) {
					// ask user input the new name
					System.out.print("New Name : ");
					name = input.nextLine();

					// ask user whether they confirm the changes made
					System.out.print("Confirm edit (Y=Yes OR N=No) ? ");
					confirmEdit = input.next();
					input.nextLine();
					confirmEdit = confirmEdit.toUpperCase();
                                        while(confirmEdit.compareToIgnoreCase("Y") != 0 &&confirmEdit.compareToIgnoreCase("N") != 0  )
                                        {
                                            System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                            confirmEdit = input.next();
                                            input.nextLine();
                                        }
                                        //input.nextLine();
					// if user don't want the changes they made, cancel changes
					if (confirmEdit.compareToIgnoreCase("N") == 0) {
						System.out.println("Edit Cancelled");
					}

					// if user confirm the changes they made, save changes
					else if (confirmEdit.compareToIgnoreCase("Y") == 0) {
						staffArr.get(i).setStaffName(name);
						System.out.println("After Edit\n=======================");
						System.out.println(staffArr.get(i).toString());
					}

					// display error message if user enter other than Y and N for confirm edit
					else {
						System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
					}
				}
				// if user don't want to continue edit on the record found
				else if (continueEdit.compareToIgnoreCase("N") == 0) 
					System.out.println("Back...");
				
				// display error message if user enter other than Y and N for continue edit
				// record
				else 
					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
				
			}

		}
		// tell user cannot find user in the record
		if (found == false) {
			System.out.println("Unable to find the record");
		}

	}

	// --------------------End of EDIT staff by NAME method --------------------

	// --------------------EDIT staff by PASSWORD method-------------------------
	public void editByPassword(Scanner input, ArrayList<Staff> staffArr, Staff staff, String searchID) {
		String continueEdit; // user input whether they want to continue to edit
		String password = "", confirmPassword = ""; // user input new edited password
		String confirmEdit; // user input whether confirm the edit made
		boolean found = false; // check whether record found

		// loop to find the id in the array list that matched with user input for edit
		for (int i = 0; i < staffArr.size(); i++) {
			// compare if search ID and records in array list matched, display the record
			if (searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
				System.out.println(staffArr.get(i).toString());
				found = true;
				
				// ask user whether want to continue edit the record found
				System.out.print("Continue edit (Y=Yes OR N=No) ? ");
				continueEdit = input.next();
                                while(continueEdit.compareToIgnoreCase("Y") != 0 && continueEdit.compareToIgnoreCase("N") != 0 ){
                                    System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                    continueEdit = input.next();
                                }
				input.nextLine();
				continueEdit = continueEdit.toUpperCase();
				//input.nextLine();
				
                                     while(continueEdit.compareToIgnoreCase("Y") != 0 && continueEdit.compareToIgnoreCase("N") != 0 ){
                                    System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                    continueEdit = input.next();
                                }
                                     input.nextLine();
                                     continueEdit = continueEdit.toUpperCase();
				// if user want to continue edit on the record found, ask user input the new
				// password
				if (continueEdit.compareToIgnoreCase("Y") == 0) {
					// loop to check the password and confirm password is same
					do {
						System.out.print("Enter new password : ");
						password = input.nextLine();

						System.out.print("Enter new confirm password : ");
						confirmPassword = input.nextLine();

						// display error message if new password & confirm password not matched
						if (password.compareTo(confirmPassword) != 0)
							System.out.println("Password and Confirm Password not matched! Please enter again");

					} while (password.compareTo(confirmPassword) != 0);

					// ask user whether they confirm the changes made
					System.out.print("Confirm edit (Y=Yes OR N=No) ? ");
					confirmEdit = input.next();
					input.nextLine();
					confirmEdit = confirmEdit.toUpperCase();
                                        while(confirmEdit.compareToIgnoreCase("Y") != 0 &&confirmEdit.compareToIgnoreCase("N") != 0  )
                                        {
                                            System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                            confirmEdit = input.next();
                                            input.nextLine();
                                        }

					// if user don't want the changes they made, cancel changes
					if (confirmEdit.compareToIgnoreCase("N") == 0) 
						System.out.println("Edit Cancelled");
					
					// if user confirm the changes they made, save changes
					else if (confirmEdit.compareToIgnoreCase("Y") == 0) {
						staffArr.get(i).setPassword(password);
						System.out.println("After Edit\n=======================");
						System.out.println(staffArr.get(i).toString());
					}
					// display error message if user enter other than Y and N for confirm edit
					else {
						System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
					}
				}
				// if user don't want to continue edit on the record found
				else if (continueEdit.compareToIgnoreCase("N") == 0) {
					System.out.println("Back...");
				}
				// display error message if user enter other than Y and N for continue edit
				// record
				else {
					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
				}
			}
		}
		// tell user cannot find user in the record
		if (found == false) {
			System.out.println("Unable to find the record");
		}
	}
	// -----------End of EDIT staff by PASSWORD method ----------

	// -----------EDIT staff by RECOVERY QUESTION method-----------
	public void editByRecoveryQuestion(Scanner input, ArrayList<Staff> staffArr, Staff staff, String searchID) {
		String continueEdit; // user input whether they want to continue to edit
		Integer recoveryQuestion = 0; // user choice for recovery question
		String confirmEdit; // user input whether confirm the edit made
		String recoveryAnswer = ""; // user input new recovery answer
		boolean found = false; // check whether record found

		// loop to find the id in the array list that matched with user input for edit
		for (int i = 0; i < staffArr.size(); i++) {
			// compare if search ID and records in array list matched, display the record
			if (searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
				found = true;
				// check if input integer
				try {
					System.out.println(staffArr.get(i).toString());

					// ask user whether want to continue edit the record found
					System.out.print("Continue edit (Y=Yes OR N=No) ? ");
				continueEdit = input.next();
                                while(continueEdit.compareToIgnoreCase("Y") != 0 && continueEdit.compareToIgnoreCase("N") != 0 ){
                                    System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                    continueEdit = input.next();
                                }
				input.nextLine();
				continueEdit = continueEdit.toUpperCase();

					// if user want to continue edit on the record found, ask user input the new
					// recovery question
					if (continueEdit.compareToIgnoreCase("Y") == 0) {

						// check the recovery question input correct else it will continue loop
						do {
							// display recovery question menu for user to choose
							recoveryQuestion = menu.recoveryQuestionMenu(input);
							input.nextLine();

							// display error message if user input other than 1-4 for recovery question
							// choice
							if (recoveryQuestion < 1 || recoveryQuestion > 4) {
								System.out.println("Invalid input. Please enter (1-4) only .");
                                                                recoveryQuestion = menu.recoveryQuestionMenu(input);
                                                                input.nextLine();
							}
                                                        else{
                                                            System.out.print("New Recovery Answer : ");
                                                            recoveryAnswer = input.nextLine();
                                                            break;
                                                        }
							

							// continue to loop if user input other than 1-4
						} while (recoveryQuestion < 1 || recoveryQuestion > 4 ||!input.hasNextInt());

						// ask user whether they confirm the changes made
						System.out.print("Confirm edit (Y=Yes OR N=No) ? ");
					confirmEdit = input.next();
					input.nextLine();
					confirmEdit = confirmEdit.toUpperCase();
                                        while(confirmEdit.compareToIgnoreCase("Y") != 0 &&confirmEdit.compareToIgnoreCase("N") != 0  )
                                        {
                                            System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                            confirmEdit = input.next();
                                            input.nextLine();
                                        }

						// if user don't want the changes they made, cancel changes
						if (confirmEdit.equalsIgnoreCase("N")) {
							System.out.println("Edit Cancelled");
						}

						// if user want the changes they made, save changes
						else if (confirmEdit.equalsIgnoreCase("Y")) {
							staffArr.get(i).setRecoveryQuestion(recoveryQuestion);
							staffArr.get(i).setRecoveryAnswer(recoveryAnswer);
							System.out.println("After Edit\n=======================");
							System.out.println(staffArr.get(i).toString());
						}
						// display error message if user enter other than Y and N for confirm edit
						else {
							System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
						}
						// if record found, but user don't want to edit
					} else if (continueEdit.compareToIgnoreCase("N") == 0) {
						System.out.println("Back...");
					}
					// display error message if user enter other than Y and N for continue edit
					// record
					else {
						System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
					}

				}
				// display error message when user input non integer for recovery question
				catch (InputMismatchException e) {
					System.out.println("Enter number(s) only. Alphabets are not allowed.");
                                        
				}
			}

		}
		// tell user cannot find user in the record
		if (found == false) {
			System.out.println("Unable to find the record");
		}
	}
	// ----------End of EDIT staff by RECOVERY QUESTION method -----------

	// --------------------EDIT staff by ROLE method---------------------------
	public void editByRole(Scanner input, ArrayList<Staff> staffArr, Staff staff, String searchID) {
		String continueEdit; // user input whether they want to continue to edit
		Integer choice = 0; // user input choose from role menu
		String confirmEdit; // user input whether confirm the edit made
		String role = ""; // user input new role
		boolean found = false; // check whether record found

		// loop to find the id in the array list that matched with user input for edit
		for (int i = 0; i < staffArr.size(); i++) {
			// compare if search ID and records in array list matched, display the record
			if (searchID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
				System.out.println(staffArr.get(i).toString());
				found = true;

				// ask user whether want to continue edit the record found
				System.out.print("Continue edit (Y=Yes OR N=No) ? ");
				continueEdit = input.next();
                                while(continueEdit.compareToIgnoreCase("Y") != 0 && continueEdit.compareToIgnoreCase("N") != 0 ){
                                    System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                    continueEdit = input.next();
                                }
				input.nextLine();
				continueEdit = continueEdit.toUpperCase();

				// if user want to continue edit on the record found
				if (continueEdit.compareToIgnoreCase("Y") == 0) {

					// check the role input correct else it will continue loop
					do {
						choice = menu.roleMenu(input);
						input.nextLine();

						// display error message if user input other than 1-3 for role
						if (choice < 1 || choice > 3) {
							System.out.println("Invalid input. Please enter (1-3) only.");
						}
						// continue to loop if user input other than 1-3 for role
					} while (choice < 1 && choice > 3);

					// ask user whether they confirm the changes made
				System.out.print("Confirm edit (Y=Yes OR N=No) ? ");
					confirmEdit = input.next();
					input.nextLine();
					confirmEdit = confirmEdit.toUpperCase();
                                        while(confirmEdit.compareToIgnoreCase("Y") != 0 &&confirmEdit.compareToIgnoreCase("N") != 0  )
                                        {
                                            System.out.print("Please enter (Y=Yes OR N=No) ? ");
                                            confirmEdit = input.next();
                                            input.nextLine();
                                        }

					// if user don't want the changes they made, cancel changes
					if (confirmEdit.equalsIgnoreCase("N")) {
						System.out.println("Edit Cancelled");
					}
					// if user want the changes they made, save changes
					else if (confirmEdit.equalsIgnoreCase("Y")) {
						if (choice == 1) {
							role = "Staff";
							staffArr.get(i).setRole(role);
						} else if (choice == 2) {
							role = "Manager";
							staffArr.get(i).setRole(role);
						}
						// display the record after changes made
						System.out.println("After Edit\n=======================");
						System.out.println(staffArr.get(i).toString());
					}
					// display error message if user enter other than Y and N for confirm edit
					else {
						System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
					}
				}
				// if record found, but user don't want to edit
				else if (continueEdit.compareToIgnoreCase("N") == 0) {
					System.out.println("Back...");
				}
				// display error message if user enter other than Y and N for continue edit
				else {
					System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
				}
			}
		}
		// tell user cannot find user in the record
		if (found == false) {
			System.out.println("Unable to find the record");
		}
	}
	// ----------------End of EDIT staff by ROLE method -------------------

	// -----------------DELETE staff record method--------------------------
	public void deleteStaff(Scanner input, ArrayList<Staff> staffArr, String loginID) {
		String idToDelete; // user input id that wish to be delete
		String confirmDelete; // user input whether confirm to delete the record
		int i = 0; // use for "for loop"
		boolean found = false; // check whether record found
		boolean deleteE = false; //check delete record is login ID

		// check if there are records in array list
		if (staffArr.size() > 0) {

			// loop the records in array list
			for (i = 0; i < staffArr.size(); i++) {

				// compare the login ID and the records in array list is matched
				if (loginID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
					// if the role of the login people is a manager
					if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") == 0) {
						System.out.printf(
								"\n\nNo. Staff ID \t Name                 Password             Recovery Question    Recovery Answer      Role \n");
						System.out.println(
								"================================================================================================================");
						// loop to display all the records in the array list
						for (i = 0; i < staffArr.size(); i++) {
							System.out.println((i + 1) + ". " + staffArr.get(i).toString1Line());

						}
						System.out.println(
								"================================================================================================================");
						System.out.printf("\t\t" + staffArr.size() + " record(s) found \n\n"); // display the number of
																								// record(s) found in
																								// array list

						// ask user input id that they wish to delete
						System.out.print("Enter the staff ID that you wish to delete, press 'e/E' to exit : ");
						idToDelete = input.nextLine();
						idToDelete = idToDelete.toUpperCase();
                                                      boolean test = false;
                                                        do{
                                                            if(idToDelete.equals("e")||idToDelete.equals("E")){
                                                                 //boolean found = false;
                                                                  break;
                                                         }
                                                            for(i = 0; i < staffArr.size()&&test==false; i++){
                                                                 if(idToDelete.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0){
                                                                     test =true;
                                                                     
                                                                 }
                                                            }
                                                            if(test == false){
                                                                System.out.println("Unable to find the record\n");
                                                                System.out.print("Please input staff id for delete, press 'e/E' to exit : ");
                                                                idToDelete = input.nextLine();
                                                            }
                                                             
                                                            
                                                        }while(test == false);
                                                         if(idToDelete.equals("e")||idToDelete.equals("E")){
                                                                 //boolean found = false;
                                                                  break;
                                                                
                                                             }

						// loop to find the record
						for (i = 0; i < staffArr.size(); i++) {

							// if the selected record to delete is the login record
							if (idToDelete.compareToIgnoreCase(loginID) == 0) {
								deleteE = true;
								
							}
							// if the selected record to delete is NOT the login record
							else {
								// check the id that wish to delete with the records is matched
								if (idToDelete.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0) {
									found = true;
									// display the record found to user
									System.out.println(staffArr.get(i).toString());

									// ask user whether they want to delete the record found
									System.out.print(
											"Confirm delete all the information for the above record (Y=yes OR N=no) : ");
									confirmDelete = input.nextLine();
									confirmDelete = confirmDelete.toUpperCase();

									// if user proceed on delete the record
									if (confirmDelete.compareToIgnoreCase("Y") == 0) {
										staffArr.remove(i); // remove the record from array list

										// display all the records in the array list after delete action performed
										System.out.printf(
												"\n\nNo. Staff ID \t Name                 Password             Recovery Question    Recovery Answer      Role \n");
										System.out.println(
												"================================================================================================================");
										for (i = 0; i < staffArr.size(); i++) {
											System.out.println((i + 1) + ". " + staffArr.get(i).toString1Line());

										}
										System.out.println(
												"================================================================================================================");
										System.out.printf("\t\t" + staffArr.size() + " record(s) found \n\n");

									}
									// if user don't want to delete the record, cancel delete
									else if (confirmDelete.compareToIgnoreCase("N") == 0) {
										System.out.println("Delete cancelled");
									}
									// display error message if user enter other than Y and N for confirm delete
									else {
										System.out.println("Invalid Input. Please enter 'Y' or 'N' only.");
									}
								}

							}
						}
						if(deleteE == true) {
							// tell user they can't delete the record that are logging in
							System.out.println("You are not allowed to delete the logging in staff information.");
							break;
						}
						// tell user cannot find user in the record
						if (found == false) {
							System.out.println("Unable to find the record");
						}
					}
					// if user is NOT a manager, display error message
					else if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") != 0)
						System.out.println("You have no authority to perform this action");
				}
			}
		}
		// tell user no record inside the array list yet
		else
			System.out.println("No record added yet");
	}
}
//---------------End of DELETE staff record method-----------------
//================END OF STAFF CLASS============
