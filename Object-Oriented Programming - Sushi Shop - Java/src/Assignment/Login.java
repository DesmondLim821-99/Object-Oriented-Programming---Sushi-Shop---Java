package Assignment;

import java.util.ArrayList;
import java.util.Scanner;



public class Login {
	String id = ""; 				// user input id during login
	String password = ""; 			// user input password during login
	String answer; 					// user input recovery answer during login
	Integer count = 0;			 	// number of time wrong password
	String forgotPassword = " "; 	// decision for recovery question
	boolean error = false; 			// login error
	boolean found = true; 			// login success

	public String loginAuthorization(Scanner input, ArrayList<Staff> staffArr, Staff staff) {
		menu menu = new menu(); // object to link to print menu class's method
		
		//display welcome word
		menu.welcome();	

		String confirmPassword; // for confirm password 

		boolean ok = false;
		int i = 0;  //use for "for loop"
		
		// loop to check id
		do {
			System.out.print("\nStaff ID : ");
			id = input.nextLine();
			id = id.toUpperCase();
			// use for loop to check the each id inside array list
			for (i = 0; i < staffArr.size(); i++) {
				// login id matched with the records
				if (id.compareTo(staffArr.get(i).getStaffID()) == 0) {
					// loop to check the password
					do {
						System.out.print("Password: ");
						password = input.nextLine();
						// check the input password and records in array list matched
						if (password.compareTo(staffArr.get(i).getPassword()) == 0) {
							System.out.println("Succesfully Login~~~");
							System.out.printf("\n");
							System.out.println("Staff ID: "+ staffArr.get(i).getStaffID());
							System.out.println("Staff Name: " +staffArr.get(i).getStaffName());
							System.out.printf("\n");
							ok = true;
							return staffArr.get(i).getStaffID();
						} 
						// display error message as password not matched
						else {
							System.out.println("\nIncorrect Password!!!");
							// ask whether user forgot password 
							System.out.print("\nDid you forgot your password Y or N: ");
							String ans = input.nextLine();
                                                        while(!ans.equalsIgnoreCase("Y")&&!ans.equalsIgnoreCase("N")){// check for invalid input
                                                            System.out.print("Please enter 'Y' or 'N': ");
                                                            ans = input.nextLine();
                                                        }
							// user forgot password
							if (ans.equalsIgnoreCase("Y")) {
								ok = true;
							}

						}
					} while (!ok);
                                        System.out.print("\n");
					System.out.println(staffArr.get(i).getRecoveryQuestion());
					System.out.print("Recover Answer: ");
					answer = input.nextLine();
					// check user input recovery answer
					if (answer.compareToIgnoreCase(staffArr.get(i).getRecoveryAnswer()) == 0) {
						//check password and confirm password matched
						do {
							System.out.print("\nEnter new password : ");
							password = input.nextLine();

							System.out.print("Enter confirm the new password : ");
							confirmPassword = input.nextLine();
							// display error message as confirm password and password not matched
							if (password.compareTo(confirmPassword) != 0)
								System.out.println("Password and Confirm Password not matched! Please enter again!!!");
							else {
								// loop to find the staff record inside array list
								for (i = 0; i < staffArr.size(); i++) {
									//compare id with the records is matched
									if (id.equals(staffArr.get(i).getStaffID())) {
										staffArr.get(i).setPassword(password);		// set new password for that person
										System.out.println("Succesfully Login~~~");
										System.out.printf("\n");
										System.out.println("Staff ID: "+ staffArr.get(i).getStaffID());
										System.out.println("Staff Name: " +staffArr.get(i).getStaffName());
										System.out.printf("\n");
                                                                                found = true;
									}
								}
							}

						} while (password.compareTo(confirmPassword) != 0);
                                                
					}
					// display error message as the user enter wrong recovery answer
                                      
					else {
						System.out.println("\nSystem has exited due to user provided the wrong recovery answer...");
						System.exit(0);
					}
				} 
				// id not found
				else 
					found = false;
			}
			// tell user id not found in records
			if(found == false) 
				System.out.println("Staff ID Not Found!!!");

		} while (!found);
		return id;
	}

}
