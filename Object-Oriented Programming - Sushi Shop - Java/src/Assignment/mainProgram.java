package Assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

	public static void main(String[] args) {
		//Variable--------------------------------------------------
                
                
		ArrayList<product> prodlist = new ArrayList<product>();
		ArrayList<order> orderlist = new ArrayList<order>();
		ArrayList<receipt> receiptlist = new ArrayList<receipt>();
		ArrayList<product> qtyWanted = new ArrayList<product>();
		ArrayList<Staff> staffArr = new ArrayList<Staff>();
//		ArrayList<Member> memberArr = new ArrayList<Member>();
		ArrayList<receipt> monthlyReceipt = new ArrayList<receipt>();
		ArrayList<receipt> bestSellingReport = new ArrayList<receipt>();

		menu menu = new menu();
		Staff staff = new Staff();
		Login login = new Login();
//		Member member = new Member();

		staff.seeds(staffArr);
//		member.seeds(memberArr);

		Scanner input = new Scanner(System.in);
		String loginID = login.loginAuthorization(input, staffArr, staff);

		int choice = 0, mainChoice = 0, problem = 0;
		boolean checkNum = false;
		//-------------------------      Membership Variable    ----------------------------
                
                Scanner sc = new Scanner (System.in);
                Scanner sc1 = new Scanner (System.in);

                ArrayList<Membership> membership = new ArrayList<>();
                int memID = 1001;

                Membership [] member = { new Basic_Membership (new Member (memID ++, "Alex Lim", 25, "019-1234567", 'M'), "Basic"),
                                         new Silver_Membership (new Member (memID ++, "Hashirama", 23, "011-1058567", 'M'), "Silver"),
                                         new Gold_Membership (new Member (memID ++, "Debra Yong", 20, "011-5558990", 'M'), "Gold")};


                membership.add(member[0]);
                membership.add(member[1]);
                membership.add(member[2]);

                ArrayList<VoucherRedemption> VRedemption = new ArrayList<>();
                int giftID = 101;

                VoucherRedemption [] Vmember = {new VoucherRedemption (membership.get(0).getmember(), giftID++, "Voucher"),
                                                new VoucherRedemption (membership.get(1).getmember(), giftID++, "Voucher"),
                                                new VoucherRedemption (membership.get(2).getmember(), giftID++, "Voucher")};

                VRedemption.add(Vmember[0]);
                VRedemption.add(Vmember[1]);
                VRedemption.add(Vmember[2]);

                ArrayList<ItemRedemption> IRedemption = new ArrayList<>();
                int gift2ID = 1;
                ItemRedemption [] Imember = {new ItemRedemption (membership.get(0).getmember(), gift2ID++, "Item"),
                                             new ItemRedemption (membership.get(1).getmember(), gift2ID++, "Item"),
                                             new ItemRedemption (membership.get(2).getmember(), gift2ID++, "Item")};

                IRedemption.add(Imember[0]);
                IRedemption.add(Imember[1]);
                IRedemption.add(Imember[2]);
                
                
                // Delivery --------------------------------------------
                ArrayList<Delivery> delivery = new ArrayList<Delivery>();  
                int DeliveryID = 100003;
                
                Delivery D1 = new StandardDelivery("OID00124",100001,"Sushi Queen Express","Eric Tan","011-21341567","23, Jalan Rakyat, Kampus Utama, Jalan Genting Kelang, 53300 Kuala Lumpur","Preparing");
                Delivery D2 = new PremiumDelivery("OID00235",100002,"Sushi Queen Express","James Low","014-2345412","54-B, Jalan Sihat, Bandar Barat, 52300 Kuala Lumpur ","Shipping");
                Delivery D3 = new PremiumDelivery("OID00243",100003,"Sushi Queen Express","Kris Lee","012-5423487","27, Jalan Jaya, 53300 Kuala Lumpur ","Delivered");
        
                delivery.add(D1);
                delivery.add(D2); 
                delivery.add(D3);       
                                                                            
               //------------------------------------------------------
		
		// Hard-code monthly report
		// 1-3 month
		receipt receiptHardcode1 = new receipt("Salmon Sushi", "PID0001", 360, 5.0, "OID0001", 1800.0, "SID0001",
				"2021/1/31", 16.5);
		monthlyReceipt.add(receiptHardcode1);
		bestSellingReport.add(receiptHardcode1);
		receipt receiptHardcode2 = new receipt("Tuna Sushi", "PID0002", 250, 5.0, "OID0001", 1250.0, "SID0001", "2021/1/31",
				16.5);
		monthlyReceipt.add(receiptHardcode2);
		bestSellingReport.add(receiptHardcode2);
		receipt receiptHardcode3 = new receipt("Salmon Sushi", "PID0001", 440, 5.0, "OID0002", 2250.0, "SID0001",
				"2021/2/28", 24.0);
		monthlyReceipt.add(receiptHardcode3);
		bestSellingReport.add(receiptHardcode3);
		receipt receiptHardcode4 = new receipt("Takoyaki", "PID0003", 256, 7.0, "OID0002", 1792.0, "SID0001", "2021/2/28",
				24.0);
		monthlyReceipt.add(receiptHardcode4);
		bestSellingReport.add(receiptHardcode4);
		receipt receiptHardcode5 = new receipt("Tuna Sushi", "PID0002", 240, 5.0, "OID0003", 1200.0, "SID0001", "2021/3/31",
				31.9);
		monthlyReceipt.add(receiptHardcode5);
		bestSellingReport.add(receiptHardcode5);
		receipt receiptHardcode6 = new receipt("Takoyaki", "PID0003", 220, 7.0, "OID0003", 1540.0, "SID0001", "2021/3/31",
				31.9);
		monthlyReceipt.add(receiptHardcode6);
		bestSellingReport.add(receiptHardcode6);

		// 4-6month
		receipt receiptHardcode7 = new receipt("Green Tea (Hot)", "PID0004", 45, 1.0, "OID0004", 45.0, "SID0001",
				"2021/4/30", 4.4);
		monthlyReceipt.add(receiptHardcode7);
		bestSellingReport.add(receiptHardcode7);
		receipt receiptHardcode8 = new receipt("Green Tea (Ice)", "PID0005", 45, 1.50, "OID0004", 67.5, "SID0001",
				"2021/4/30", 4.4);
		monthlyReceipt.add(receiptHardcode8);
		bestSellingReport.add(receiptHardcode8);
		receipt receiptHardcode9 = new receipt("Salmon Sushi", "PID0001", 350, 5.0, "OID0005", 1750.0, "SID0001",
				"2021/5/31", 29.7);
		monthlyReceipt.add(receiptHardcode9);
		bestSellingReport.add(receiptHardcode9);
		receipt receiptHardcode10 = new receipt("Udon", "PID0006", 78, 12.0, "OID0005", 936.0, "SID0001", "2021/5/31",
				29.7);
		monthlyReceipt.add(receiptHardcode10);
		bestSellingReport.add(receiptHardcode10);
		receipt receiptHardcode11 = new receipt("Tuna Sushi", "PID0002", 400, 5.0, "OID0006", 2000.0, "SID0001",
				"2021/6/30", 33.0);
		monthlyReceipt.add(receiptHardcode11);
		bestSellingReport.add(receiptHardcode11);
		receipt receiptHardcode12 = new receipt("Green Tea (Hot)", "PID0004", 408, 1.0, "OID0006", 408.0, "SID0001",
				"2021/6/30", 33.0);
		monthlyReceipt.add(receiptHardcode12);
		bestSellingReport.add(receiptHardcode12);

		// 7-9month
		receipt receiptHardcode13 = new receipt("Tempura", "PID0007", 100, 9.0, "OID0007", 900.0, "SID0001", "2021/7/31",
				64.9);
		monthlyReceipt.add(receiptHardcode13);
		bestSellingReport.add(receiptHardcode13);
		receipt receiptHardcode14 = new receipt("Tuna Sushi", "PID0002", 350, 5.0, "OID0007", 1750.0, "SID0001",
				"2021/7/31", 64.9);
		monthlyReceipt.add(receiptHardcode14);
		bestSellingReport.add(receiptHardcode14);
		receipt receiptHardcode15 = new receipt("Yakitori", "PID0008", 70, 3.9, "OID0008", 273.0, "SID0001", "2021/8/31",
				38.94);
		monthlyReceipt.add(receiptHardcode15);
		bestSellingReport.add(receiptHardcode15);
		receipt receiptHardcode16 = new receipt("Udon", "PID0006", 55, 12.0, "OID0008", 660.0, "SID0001", "2021/8/31",
				38.94);
		monthlyReceipt.add(receiptHardcode16);
		bestSellingReport.add(receiptHardcode16);
		receipt receiptHardcode17 = new receipt("Donburi", "PID0009", 92, 12.5, "OID0009", 1150.0, "SID0001", "2021/9/30",
				35.75);
		monthlyReceipt.add(receiptHardcode17);
		bestSellingReport.add(receiptHardcode17);
		receipt receiptHardcode18 = new receipt("Green Tea (Ice)", "PID0005", 435, 1.50, "OID0009", 652.5, "SID0001",
				"2021/9/30", 35.75);
		monthlyReceipt.add(receiptHardcode18);
		bestSellingReport.add(receiptHardcode18);

		// 10-12month
		receipt receiptHardcode19 = new receipt("Donburi", "PID0009", 780, 11.0, "OID00010", 8580.0, "SID0001",
				"2021/10/31", 45.98);
		monthlyReceipt.add(receiptHardcode19);
		bestSellingReport.add(receiptHardcode19);
		receipt receiptHardcode20 = new receipt("Yakitori", "PID0008", 620, 3.9, "OID00010", 2418.0, "SID0001", "2021/10/31",
				45.98);
		monthlyReceipt.add(receiptHardcode20);
		bestSellingReport.add(receiptHardcode20);
		receipt receiptHardcode21 = new receipt("Salmon Sushi", "PID0001", 350, 5.0, "OID00011", 1750.0, "SID0001",
				"2021/11/30", 46.2);
		monthlyReceipt.add(receiptHardcode21);
		bestSellingReport.add(receiptHardcode21);
		receipt receiptHardcode22 = new receipt("Tempura", "PID0007", 120, 9.0, "OID00011", 1080.0, "SID0001", "2021/11/30",
				46.2);
		monthlyReceipt.add(receiptHardcode22);
		bestSellingReport.add(receiptHardcode22);
		receipt receiptHardcode23 = new receipt("Tuna Sushi", "PID0002", 310, 5.0, "OID00012", 1550.0, "SID0001",
				"2021/12/31", 45.1);
		monthlyReceipt.add(receiptHardcode23);
		bestSellingReport.add(receiptHardcode23);
		receipt receiptHardcode24 = new receipt("Udon", "PID0006", 800, 12.0, "OID00012", 9600.0, "SID0001", "2021/12/31",
				45.1);
		monthlyReceipt.add(receiptHardcode24);
		bestSellingReport.add(receiptHardcode24);
		/////////////////////////////////////////////////

		// Hard-code product==========================
		product hardCodeProd1 = new product("Salmon Sushi", "PID0001",
				"Salmon sushi is often eaten nigiri style, with a ball of vinegared sushi rice topped with a slice of salmon.", "Sushi", 100, 5.00);
		prodlist.add(hardCodeProd1);

		product hardCodeProd2 = new product("Tuna Sushi", "PID0002",
				"Tuna sushi is similiar to salmon sushi, except it is made by tuna fish.", "Sushi", 100, 5.00);
		prodlist.add(hardCodeProd2);

		product hardCodeProd3 = new product("Takoyaki", "PID0003",
				"Takoyaki is a ball-shaped Japanese snack or appetizer made of a wheat flour-based batter and cooked in a special molded pan.", "Sushi", 100, 7.00);
		prodlist.add(hardCodeProd3);

		product hardCodeProd4 = new product("Green Tea (Hot)", "PID0004",
				"Green tea is a type of tea that is made from Camellia sinensis leaves.", "Drink", 100, 1.00);
		prodlist.add(hardCodeProd4);

		product hardCodeProd5 = new product("Green Tea (Ice)", "PID0005",
				"Green tea is a type of tea that is made from Camellia sinensis leaves.", "Drink", 100, 1.50);
		prodlist.add(hardCodeProd5);

		product hardCodeProd6 = new product("Udon", "PID0006",
				"Udon s a type of thick, wheat-flour noodle used frequently in Japanese cuisine.", "Noodles", 100, 12.00);
		prodlist.add(hardCodeProd6);

		product hardCodeProd7 = new product("Tempura", "PID0007",
				"Tempura s a typical Japanese dish usually consisting of seafood, meat, and vegetables that have been battered and deep fried. ", "Food", 100, 9.00);
		prodlist.add(hardCodeProd7);

		product hardCodeProd8 = new product("Yakitori", "PID0008",
				"Yakitori is a Japanese type of skewered chicken. Its preparation involves skewering the meat with kushi. ", "Food", 100, 3.90);
		prodlist.add(hardCodeProd8);

		product hardCodeProd9 = new product("Donburi", "PID0009",
				"Donburi is a Japanese rice bowl dish consisting of fish, meat, vegetables or other ingredients simmered together and served over rice.", "Rice", 100, 11.00);
		prodlist.add(hardCodeProd9);

		// =================================================
		do {
			do {
                //display main menu
				menu.mainMenu();

				//validate input
				if (input.hasNextInt()) {
					mainChoice = input.nextInt();
					checkNum = true;
					problem = 0;
					if (mainChoice < 1 || mainChoice > 7) {
						System.out.println("Invalid Choice");
						System.out.println("Please Enter between 1 - 7 !!! \n");
						problem = 1;

					}
				} 
				//If non-integer
				else {
					System.out.println("Invalid Choice");
					System.out.println("Please Enter integer !!! \n");
					checkNum = false;
					problem = 1;
					input.next();
				}

				//if integer and between 1 - 6
				if (checkNum && problem == 0) {
					
					switch (mainChoice) {
					case 1: {
						//display staff menu
						do {
							choice = menu.staffMenu(input);
							input.nextLine();
							switch (choice) {
							case 1:
								//display all staff
								staff.displayAllStaff(staffArr, loginID);
								break;
							case 2:
								//search staff
								staff.searchStaff(input, staffArr, staff, loginID);
								break;
							case 3:
								//edit staff info
								staff.editStaff(input, staffArr, loginID);
								break;
							case 4:
								//add new staff
								staff.addStaff(input, staffArr, loginID);
								break;
							case 5:
								//delete staff
								staff.deleteStaff(input, staffArr, loginID);
								break;
							case 6:
                                                            
								//take order
								DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
								LocalDateTime now = LocalDateTime.now();
								String sysDate = date.format(now);
								Scanner scn = new Scanner(System.in);
								//Variable
								int countRow = 0;
								int error = 0;
								int prodIDindex = 0;
								String confirm = "";
								String catChoice;
								String addOrNot = "";
								boolean isNum = true;
								boolean isDou = true;
								boolean exit = false;
								boolean foundprodID = false;
								boolean sameProdID = false;

								String getProdName = "";
								String getProdID = "";
								String getDesc = "";
								String getCat = "";
								String buyProdID;
								String foundProdName = "";
								String tempOrderID = "OID0000";
								int getQty = 0;
								int choiceConfirm = 0;
								int repearOrdercount = 0;
								int qtyWant = 0;
								double totalPrice = 0;
								double foundPrice = 0.0;
								double grandTotal = 0.0;
								double getPrice = 0.0;
								boolean repeatProd = false;
								boolean acceptqty = true;

								String cardHolderName;
								String continueOrNot = "";
								String payTransactionID;
								String getCardHolderName = "";
								int cardNumber;
								int cvv;
								int getCvv = 0;
								int getCardNumber = 0;
								int choicePayment = 0;
								double amountReceive = 0;
								double change;
								double receiptTotalAmount = 0;
								double getAmountReceive = 0.0;
								boolean foundTransactionID = false;
								//-------------------------
								
								 System.out.printf("\n\n");

								do {

									do {
                                                                                          System.out.println("\t\t\t\t\t\t-------------------------Sushi Queen Menu------------------------------");
                                                                                        System.out.println("\t\t\t\t\t\tProduct ID                  Product Name                   Price(RM)");
                                                                                        System.out.println("\t\t\t\t\t\t-----------------------------------------------------------------------");
                                                                                        for (int i = 0; i < prodlist.size(); i++) {                                                                                       
                                                                                        System.out.printf("\t\t\t\t\t\t%-12s %27s %24s\n",prodlist.get(i).getProdID(),prodlist.get(i).getProdName(),prodlist.get(i).getPrice());
                                                                                                        }
                                                                                        System.out.println("\t\t\t\t\t\t-----------------------------------------------------------------------");
                                                                                        System.out.println("\t\t\t\t\t\t**Quantity order for each product cannot exceed 100**");
                                                                                        System.out.print("\n");
											System.out.println("Row " + (countRow + 1));
                                                                                        

										do {
                                                                                        
                                                                                       
											System.out.print("Enter product ID ( E/e to exit):");
											buyProdID = scn.nextLine().toUpperCase();
											if (isNullOrEmpty(buyProdID)) {// if input is empty
												exit = false;

												System.out.println("You must fill in Product ID !!!\n");
												error = 1;
											} else if (buyProdID.length() == 1) {
												error = 0;
												exit = false;

												if (buyProdID.charAt(0) == 'E' || buyProdID.charAt(0) == 'e') {// if want to exit
													exit = true;
													countRow = 0;
												}

											} else {//no error
												exit = false;
												error = 0;
											}
											if (exit) {//if staff choose to exit
												countRow = 0;// recount product ordered
												qtyWanted.clear();
												orderlist.clear();
												break;
											}
											if (error == 0) {
												boolean nullProdList = nullArray(prodlist);// check if prodlist is empty or not
												if (!(nullProdList)) {//if not empty
													for (int i = 0; i < prodlist.size(); i++) {
														if (buyProdID.equals(prodlist.get(i).getProdID())) {//if product's ID found
															System.out.println(prodlist.get(i).getProdID() + " found ~\n");
															foundProdName = prodlist.get(i).getProdName();
															foundPrice = prodlist.get(i).getPrice();
															foundprodID = true;
															prodIDindex = i;
															error = 0;
															break;
														}

														else {//if product's ID not found

															error = 1;
															foundprodID = false;
														}
													}
													if (error == 1) {
														System.out.println("This product ID does not exist !!!\n");
													}
												} else {
													System.out.println("Current we have 0 product !!!");
													foundprodID = false;
													error = 1;
												}

											}
										} while (error != 0);
										if (exit) {//if staff choose to exit
											qtyWanted.clear();
											countRow = 0;
											orderlist.clear();
											break;
										}
										do {
											//quantity order
											System.out.print("Enter quantity want (-1 to exit): ");
											if (scn.hasNextInt()) {//if integer
												exit = false;
												error = 0;
												qtyWant = scn.nextInt();
												isNum = true;
												if (qtyWant == -1) {//if want to exit
													exit = true;
													countRow = 0;
												} else if (qtyWant <= 0) { //if qty < 0
													System.out.println("You cannot order 0 or less than 0 qty !!!\n");
													error = 1;
												} else {//if qty > 0 and is integer

													if (qtyWant <= prodlist.get(prodIDindex).getQty()) {//if qty ordered less than product's total qty 
														System.out.println("\n~~~Accept quantity ~~~");
														System.out.printf("\n");
														acceptqty = true;

														break;
													} else {
                                                                                                            if (qtyWant == -1) {//if want to exit
                                                                                                                    exit = true;
                                                                                                                    countRow = 0;
                                                                                                                    
                                                                                                                }
                                                                                                            else{
														System.out.println("This quantity is exceed !!!\n");
														
                                                                                                                isNum = false;
                                                                                                                error = 1;
                                                                                                                exit = false;
                                                                                                                
                                                                                                            }
                                                                                                                
													}

												}
											} else {//if non-integer
												System.out.println("Invalid quantity !!!\n");
												isNum = false;
												error = 1;
												exit = false;
                                                                                                acceptqty = true;
												scn.next();
                                                                                                if (qtyWant == -1) {//if want to exit
                                                                                                                    exit = true;
                                                                                                                    countRow = 0;
                                                                                                                }
											}

										} while (error != 0 || !(isNum) || !(acceptqty));
										if (exit) {//if staff choose to exit
											qtyWanted.clear();
											countRow = 0;
											orderlist.clear();
											break;
										}
										product addQty = new product(qtyWant, prodlist.get(prodIDindex).getProdID());//temporary add to array
										qtyWanted.remove(addQty);//store product ID and qty order into array

										if (qtyWanted.size() == 1) {//if only 1 type of product order
											repeatProd = false;
										} else {//check if 1 product order 2 times separetely
											for (int i = 0; i < qtyWanted.size(); i++) {
												for (int j = i + 1; j < qtyWanted.size(); j++) {
													if ((qtyWanted.get(i).getProdID()).equals(qtyWanted.get(j).getProdID())) {//if so
														repeatProd = true;

														repearOrdercount++;
													}
												}
											}
										}

										if (repearOrdercount == 0) {//if no duplicate product
											repeatProd = false;
											exit = false;
										}
										if (repeatProd == true) {//system automatically go back to staff menuy
											System.out.println("You cannot order same product !");
											System.out.println("You will now be forced to exit !");
											repeatProd = false;
											exit = true;
										}
										scn.nextLine();
									} while (repeatProd == true);

									repeatProd = false;
									if (exit) {//system automate exit
										qtyWanted.clear();
										countRow = 0;
										orderlist.clear(); 
										break;
									}
									if (foundprodID && acceptqty) {//if product ID found and qty ordered acceptable

										totalPrice = qtyWant * foundPrice;
										order order = new order(buyProdID, foundProdName, foundPrice, qtyWant,
												totalPrice, sysDate);//store product details ordered into array

										orderlist.add(order);//store product details ordered into array
										for (int i = 0; i < orderlist.size(); i++) {
											System.out.printf("COMFIRMATION:\n");
											System.out.println("==========================================");
											System.out.println("Product name : " + orderlist.get(i).getProdName());
											System.out.println("Product ID : " + orderlist.get(i).getProdID());
											System.out.println("Quantity : " + orderlist.get(i).getQty() + " pcs");
											System.out.format("Price: RM %.2f\n", orderlist.get(i).getPrice());
											System.out.format("Total Price : RM %.2f\n",
													orderlist.get(i).getTotalPrice());
										}
										System.out.println("==========================================");
										totalPrice = 0;
									}

									do {
										System.out.print("Anymore ? (Y/YES | N/NO | R/REDO): ");
										addOrNot = scn.nextLine().toUpperCase();//convert input to uppercase
										if (isNullOrEmpty(addOrNot)) {//if input is empty
											System.out.println("You must enter yes or no !");
											error = 1;
										} else if (addOrNot.length() == 1) {
											if (addOrNot.charAt(0) != 'Y' && addOrNot.charAt(0) != 'N'
													&& addOrNot.charAt(0) != 'R') {//invalid input
												System.out.println("You must enter y or n or r !");
												error = 1;
											} else {

												error = 0;
											}
										} else if (addOrNot.length() == 3 || addOrNot.length() == 2
												|| addOrNot.length() == 4) {
											if (addOrNot.equals("YES") == true) {

												error = 0;
											} else if (addOrNot.equals("NO") == true) {
												error = 0;
											} else if (addOrNot.equals("REDO") == true) {
												error = 0;
											} else {//invalid input
												System.out.println("You must enter YES or NO !");
												error = 1;
											}

										} else {//invalid input
											System.out.println("You must enter YES or NO or REDO !");
											error = 1;
										}

									} while (error != 0);
									if (addOrNot.equals("REDO") || addOrNot.charAt(0) == 'R') {//if staff choose to redo
										//Order detgails will be clear
										qtyWanted.clear();
										orderlist.clear();
										countRow = 0;//recount
										System.out.println("All rows details has been removed !");
									} else {
										countRow++;
									}

								} while (addOrNot.charAt(0) == 'Y' || addOrNot.equals("YES")
										|| addOrNot.charAt(0) == 'R' || addOrNot.equals("REDO"));//if want order more product or redo order
								if (!exit) {
									if (addOrNot.charAt(0) == 'N' || addOrNot == "NO") {//if want to stop the order

										order orderID = new order();
										orderID.setOrderID(tempOrderID);

										countRow = 0;

										System.out.printf("\n");
										System.out.println("==========================================");
										System.out.println("Order Details  : ");
										System.out.println("==========================================");

										totalPrice = 0;

										for (int i = 0; i < orderlist.size(); i++) {
											System.out.println("Order ID : " + orderID.getOrderID());
											System.out.println("Order Name  : " + orderlist.get(i).getProdName());
											System.out.println("Quantity  : " + orderlist.get(i).getQty() + " pcs");
											System.out.format("Price: RM %.2f\n", orderlist.get(i).getPrice());
											System.out.format("Total Price : RM %.2f\n",
													orderlist.get(i).getTotalPrice());
											System.out.println(
													"Service charge (SST) : " + orderlist.get(0).getSST() + "%");
											totalPrice += orderlist.get(i).getTotalPrice();
											System.out.println("==========================================");

										}
										grandTotal = totalPrice * (100.0 + orderlist.get(0).getSST()) / 100.0;
										System.out.format("Grand Total : RM %.2f\n", grandTotal);
										System.out.println("==========================================");

										System.out.printf("\n");
										do {
											System.out.println("Confirm ? (1 = confirm | 2 = cancelled)");
											if (scn.hasNextInt()) {//if integer
												error = 0;
												choiceConfirm = scn.nextInt();
												isNum = true;
												if (choiceConfirm != 1 && choiceConfirm != 2) {
													System.out.println("You must enter either 1 or 2 !");
													error = 1;
												}
											} else {//if non-integer
												error = 1;
												System.out.println("Invalid choice !");
												isNum = false;
												scn.next();
											}
										} while (error != 0 || !(isNum));
										if (choiceConfirm == 1) {//if confirm order
											if (qtyWanted.size() == 1) {//if only 1 product ordered
												getProdName = prodlist.get(prodIDindex).getProdName();
												getProdID = prodlist.get(prodIDindex).getProdID();
												getDesc = prodlist.get(prodIDindex).getDesc();
												getCat = prodlist.get(prodIDindex).getCat();
												getQty = qtyWant;
												getPrice = prodlist.get(prodIDindex).getPrice();
												prodlist.set(prodIDindex, new product(getProdName, getProdID, getDesc,
														getCat, getQty, getPrice));

											} else {//if multiple product ordered
												for (int i = 0; i < qtyWanted.size(); i++) {
													for (int j = 0; j < prodlist.size(); j++) {
														if (qtyWanted.get(i).getProdID() == prodlist.get(j)
																.getProdID()) {//get product info
															getProdName = prodlist.get(j).getProdName();
															getProdID = prodlist.get(j).getProdID();
															getDesc = prodlist.get(j).getDesc();
															getCat = prodlist.get(j).getCat();
															getQty = qtyWanted.get(i).getQtyOrder();
															getPrice = prodlist.get(j).getPrice();

															prodlist.set(j, new product(getProdName, getProdID, getDesc,
																	getCat, getQty, getPrice));

														}
													}
												}
											}
                                                                                        
                                                                                        
                                                                                        //Membership Discount 
                                                                                        
                                                                                        Scanner sc2 = new Scanner(System.in);
                                                                                        char status;
                                                                                        int ID = 0;
                                                                                        String memberType;
                                                                                        double discount = 0;
                                                                                        boolean validate = false;
                                                                                        
                                                                                        do {
                                                                                            System.out.println("(Membership Discount ) is customer ? (Y/N)");
                                                                                            while (!sc.hasNext()){
                                                                                                System.out.println("Invalid Input! Please try again......");
                                                                                                System.out.println("(Membership Discount ) is customer ? (Y/N)");
                                                                                                sc.next();
                                                                                            } status = sc.next().charAt(0); 
                                                                                        }while (status != 'y' && status != 'Y' && status != 'n' && status != 'N');
                                                                                        
                                                                                        if (status == 'y' || status == 'Y'){
                                                                                            
                                                                                            System.out.println("Enter Member ID : ");
                                                                                            while (!sc.hasNextInt()){
                                                                                                System.out.println("Invalid Input! Please try again......");
                                                                                                System.out.println("Enter Member ID : ");
                                                                                                sc.next();
                                                                                            
                                                                                            } ID = sc.nextInt();
                                                                                            
                                                                                            for (int i = 0; i < membership.size() && validate == false; i++){
                                                                                                if (membership.get(i).getmember().getmemberID() == ID){
                                                                                                    validate = true;
                                                                                                    memberType = membership.get(i).getmemberStatus();
                                                                                                    System.out.println("Member ID :" + membership.get(i).getmember().getmemberID() + "\nMember Name: " + membership.get(i).getmember().getmemberName() + "\nMember Status: " + membership.get(i).getmemberStatus());
                                                                                                    System.out.println("\n\nEnter voucher Code : ");
                                                                                                    String voucherCode = sc2.nextLine();
                                                                                                    
                                                                                                    if ("VCDiscount".equals(voucherCode)){
                                                                                                        
                                                                                                        if ("Basic".equals(memberType)){
                                                                                                            
                                                                                                            discount = 2.0;
                                                                                                            
                                                                                                        } else if ("Silver".equals(memberType)){
                                                                                                            
                                                                                                            discount = 5.0;
                                                                                                            
                                                                                                        } else if ("Gold".equals(memberType)){
                                                                                                            
                                                                                                            discount = 8.0;
                                                                                                            
                                                                                                        } 
                                                                                                        
                                                                                                        System.out.println("Member ID :" + membership.get(i).getmember().getmemberID() + "\nMember Name: " + membership.get(i).getmember().getmemberName() + "\nMember Status: " + membership.get(i).getmemberStatus() + "\nDiscount amount : " + discount);
                                                                                                        
                                                                                                        System.out.println("Membership Discount applied!!! ");
                                                                                                        
                                                                                                        membership.get(i).setmemberPoint(membership.get(i).getmemberPoint() + (grandTotal/10));
                                                                                                        System.out.println("\nMembership point gained : " + (grandTotal/10) + "\nTotal membership point : " + membership.get(i).getmemberPoint());
                                                                                                        
                                                                                                    } else {
                                                                                                        System.out.println("Invalid voucher code! Please try again......");
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            
                                                                                            if (validate == false){
                                                                                                System.out.println("Member ID not found......");
                                                                                            }
                                                                                        }
                                                                                        
                                                                                        
                                                                                        
                                                                                        grandTotal -= discount;
                                                                                        //select delivery option and create delivery tracking
                                                                                        int select;
                                                                                        int min = 1;
                                                                                        int max = 20;
                                                                                        double deliveryFee = 0;
                                                                                        Scanner sc3 = new Scanner(System.in);
                                                                                        
                                                                                        
                                                                                        System.out.print("\n");
                                                                                        System.out.println("\t\t\t\t\t\t ______________________________");
                                                                                        System.out.println("\t\t\t\t\t\t|                              |");
                                                                                        System.out.println("\t\t\t\t\t\t|      Delivery*Tracking       |");
                                                                                        System.out.println("\t\t\t\t\t\t|------------------------------|");
                                                                                        System.out.println("\t\t\t\t\t\t| 1. Standard Delivery         |");
                                                                                        System.out.println("\t\t\t\t\t\t| 2. Premium Delivery          |");
                                                                                        System.out.println("\t\t\t\t\t\t|                              |");
                                                                                        System.out.println("\t\t\t\t\t\t|______________________________|");
                                                                                        
                                                                                        do{
                                                                                            System.out.print("\t\t\t\t\t\tChoose Delivery Option (1/2) : ");
                                                                                            while(!sc.hasNextInt())
                                                                                            {
                                                                                            System.out.print("Error!!!Invalid Input! Please try again.........\n");
                                                                                            System.out.print("\n\t\t\t\t\t\tChoose Delivery Option (1/2) : ");
                                                                                            sc.next();

                                                                                            }select = sc.nextInt();
                                                                                            }while( select != 2 && select != 1);
                           
                                                                                        
                                                                                        switch(select){
                                                                                            case 1: 
                                                                                                System.out.print("Enter Receiver Name : ");
                                                                                                String CustomerName = sc3.nextLine();
                                                                                                System.out.print("Enter Contact Number : ");
                                                                                                String CustomerContact = sc3.nextLine();
                                                                                                System.out.print("Enter Delivery Address : ");
                                                                                                String CustomerAddress = sc3.nextLine();
                                                                                                DeliveryID += 1;
                                                                                                int TrackingNumber = DeliveryID;
                                                                                                String DeliveryCompany = "Sushi Queen Express";
                                                                                                String States = "Prepared";
                                                                                                String OrderID = orderID.getOrderID();
                                                                                                Delivery delivery1 = new StandardDelivery(OrderID, TrackingNumber, DeliveryCompany, CustomerName, CustomerContact, CustomerAddress, States);
                                                                                                delivery.add(delivery1);
                                                                                               
                                                                                                      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                                                                                                      System.out.println("Delivery Distance : "+ random_int + " KM");
                                                                                                      
                                                                                                      deliveryFee = random_int*0.5;
                                                                                                      System.out.println("Delivery Fee: RM "+ deliveryFee);
                                                                                                      grandTotal += deliveryFee;
                                                                                                      
                                                                                                      System.out.print("\n\n\nPress anything to continue.............");
                                                                                                      String continuetomenu = sc3.nextLine();
                                                                                                      
                                                                                                break;
                                                                                            case 2:
                                                                                                System.out.print("Enter Receiver Name : ");
                                                                                                String CustomerName1 = sc3.nextLine();
                                                                                                System.out.print("Enter Contact Number : ");
                                                                                                String CustomerContact1 = sc3.nextLine();
                                                                                                System.out.print("Enter Delivery Address : ");
                                                                                                String CustomerAddress1 = sc3.nextLine();
                                                                                                DeliveryID += 1;
                                                                                                int TrackingNumber1 = DeliveryID;
                                                                                                String DeliveryCompany1 = "Sushi Queen Express";
                                                                                                String States1 = "Prepared";
                                                                                                String OrderID1 = orderID.getOrderID();
                                                                                                Delivery delivery2 = new StandardDelivery(OrderID1, TrackingNumber1, DeliveryCompany1, CustomerName1, CustomerContact1, CustomerAddress1, States1);
                                                                                                delivery.add(delivery2);

                                                                                                

                                                                                                      int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
                                                                                                
                                                                                                      System.out.println("Delivery Distance : "+ random_int2+" KM");
                                                                                                      
                                                                                                      deliveryFee = random_int2*1.5;
                                                                                                      System.out.println("Delivery Fee: RM "+ deliveryFee);
                                                                                                      grandTotal += deliveryFee;
                                                                                                      
                                                                                                      System.out.print("\n\n\nPress anything to continue.............");
                                                                                                      String continuetomenu2 = sc3.nextLine();
                                                                                                      
                                                                                                      break;      
                                                                                                
                                                                                            default:
                                                                                            System.out.println("Error!!!Invalid Input! Please try again........");
                                                                                        }
                    
                                                                                        

											System.out.println("Succesful add order !");
											System.out.printf("\n");
											for (int i = 0; i < orderlist.size(); i++) {
												receipt receipt = new receipt(orderlist.get(i).getProdName(),
														orderlist.get(i).getProdID(), orderlist.get(i).getQty(),
														orderlist.get(i).getPrice(), orderID.getOrderID(),
														orderlist.get(i).getTotalPrice(), loginID,
														orderlist.get(i).getSysDate(), grandTotal);
												receiptlist.add(receipt);//add into receipt
												bestSellingReport.add(receipt);//add into receipt

											}
											System.out.println("========================");
											System.out.println("Receipt details");
											for (int i = 0; i < orderlist.size(); i++) {
												System.out.println("========================");
												if (i == 0) {
													System.out
															.println("Receipt date : " + orderlist.get(i).getSysDate());
													System.out.println("Transaction ID : " + orderID.getOrderID());
													System.out.println("Staff ID : " + loginID);
													System.out.printf("\n");
													System.out.println("Product Details :");

												}
												System.out.println("-------------------------");
												System.out.println("Product Name : " + orderlist.get(i).getProdName());
												System.out.println("Product ID : " + orderlist.get(i).getProdID());
												System.out.println("Quantity : " + orderlist.get(i).getQty());
												System.out.format("Price : RM %.2f\n", orderlist.get(i).getPrice());
												System.out.format("Total Price : RM %.2f\n",
														orderlist.get(i).getTotalPrice());
												System.out.println(
														"Service charge (SST) : " + orderlist.get(0).getSST() + "%");


											}
                                                                                        
                                                                                            System.out.println("Membership Discount : " + discount);
                                                                                            System.out.println("Delivery Fee : RM "+deliveryFee);
                                                                                        
											System.out.println("========================");
                                                                                        if (status == 'Y' || status == 'y'){
                                                                                            System.out.format("\nGrand Total (After Discount) : RM %.2f\n", grandTotal);
                                                                                        }else {
                                                                                            System.out.format("\nGrand Total  : RM %.2f\n", grandTotal);
                                                                                        }   
											System.out.println("========================");
											System.out.print("\n");
											
                                                                                        
                                                                                        
                                                                                        
											// run payment function to collect money from customer
											do {
												paymentTypeSelection();//payment menu
												if (scn.hasNextInt()) {//if integer
													choicePayment = scn.nextInt();
													isNum = true;
													if (choicePayment < 1 && choicePayment > 2) {//if not between 1 - 2
														error = 1;
													}
												} else {//if non-integer
													System.out.println("Invalid choice !");
													isNum = false;
													scn.next();
												}
											} while (error != 0 || !(isNum) || choicePayment >= 3
													|| choicePayment <= 0);//if invalid input

											scn.nextLine();

											switch (choicePayment) {
											case 1:
												do {//cash payment method
													System.out.printf("\n\n\n");
													System.out.println("Cash Payment ");
													System.out.println("------------------------------");
													System.out.printf("RM %.2f need to pay\n", grandTotal);
													do {
														System.out.print("Receive amount: RM ");
														if (scn.hasNextDouble()) {//if double
															error = 0;
															amountReceive = scn.nextDouble();
															isNum = true;
															if (amountReceive >= grandTotal) {//if customer pay more than the amount
																System.out.println("Accept amount !");
																System.out.printf("\n");
																acceptqty = true;
																break;
															} else if (amountReceive < grandTotal) {//if customer pay less than the amount
																System.out.println("Not enough money!");
																System.out.printf("\n");
																acceptqty = false;
															} else {
																System.out.println("This amount is exceed !");
																acceptqty = false;
															}
														}

														else {//if invalid amount
															System.out.println("Invalid amount !");
															isNum = false;
															error = 1;
															exit = false;
															scn.next();
														}
													} while (error != 0 || !(isNum) || !(acceptqty));//if invalid amount
													if (exit) {
														break;
													}

												} while (error != 0);
												if (acceptqty) {//if input is acceptable 
													change = amountReceive - grandTotal;
													System.out.printf("Change : RM %.2f", change);
												}
												System.out.println("\nThank you for your Payment! Have a nice day! \n");
												System.out.println("------------------------------");
												System.out.printf("\n\n\n");
												break;

											case 2:
												do {//credit card payment 
													System.out.printf("\n\n\n");
													System.out.println("Card Payment ");
													System.out.println("------------------------------");

													do {
														System.out.print("Enter Card Holder Name : ");
														getCardHolderName = scn.nextLine().toUpperCase();
														if (isNullOrEmpty(getCardHolderName)) {//if input is null
															exit = false;
															System.out.println("You must fill in Card Holder Name !");
															error = 1;
														} else {
															exit = false;
															error = 0;
														}
													} while (error != 0);

													do {
														System.out.println("Please enter LAST 4 digit card number : ");
														if (scn.hasNextInt()) {//if integer
															getCardNumber = scn.nextInt();
															isNum = true;

															if (getCardNumber >= 10000 || getCardNumber <= 0
																	|| getCardNumber <= 9 || getCardNumber <= 99
																	|| getCardNumber <= 999) {//if not 4 digit
																System.out.println("You must insert LAST 4 digit !");
																error = 1;
															} else {
																error = 0;
															}

														} else {//if non-integer
															System.out.println("Please enter integer input !");
															error = 1;
															isNum = false;
															scn.next();
														}
													} while (error != 0 || !(isNum));

													do {
														System.out.println("Please enter cvv number : ");
														if (scn.hasNextInt()) {//if integer
															getCvv = scn.nextInt();
															isNum = true;

															if (getCvv == -1) {//if input = -1
																System.out.println("You must insert cvv in 3 digit !");
																error = 1;
															} else if (getCvv >= 1000 || getCvv <= 0 || getCvv <= 9
																	|| getCvv <= 99) {//if input not 3 digit
																System.out.println("You must insert cvv in 3 digit !");
																error = 1;
															} else {
																error = 0;
															}
														} else {//if not integer
															System.out.println("Please enter integer input !");
															error = 1;
															isNum = false;
															scn.next();
														}
													} while (error != 0 || !(isNum));

												} while (error != 0);
												System.out.printf("Thank you " + getCardHolderName + " with card "
														+ getCardNumber
														+ " pay with Amount RM %.2f for your Payment! Have a nice day! \n",
														grandTotal);
												System.out.println("------------------------------");
												System.out.printf("\n\n\n");
												break;

											default://invalid payment choice
												System.out.printf("\n");
												System.out.println("Invalid choice !");
												System.out.printf("\n");
												break;
											}

											System.out.printf("\n");

										} else {
											System.out.println("Order has cancelled");
										}
										//reset
										totalPrice = 0;
										orderlist.clear();
										qtyWanted.clear();

									}

								} else {
									//reset
									qtyWanted.clear();
									orderlist.clear();
								}
								//reset
								orderlist.clear();
								qtyWanted.clear();
								System.out.printf("\n\n\n");
								break;
							case 7:

								// Varaible
								int countReceipt = 0;
								// ----------------------
								System.out.printf("\n\n");
								System.out.println("==========================================");
								System.out.println("Receipt details : ");

								for (int i = 0; i < receiptlist.size(); i++) {//count number of receipt
									countReceipt++;
								}

								for (int i = 0; i < receiptlist.size(); i++) {
									System.out.println("==========================================");

									System.out.println("Transaction ID : " + receiptlist.get(i).getTransactionID());
									System.out.println("Staff ID : " + receiptlist.get(i).getStaffID());
									System.out.println("Receipt date : " + receiptlist.get(i).getSysDate());
									System.out.println("Product Name : " + receiptlist.get(i).getProdName());
									System.out.println("Product ID : " + receiptlist.get(i).getProdID());
									System.out.println("Quantity : " + receiptlist.get(i).getQty());
									System.out.format("Price : RM %.2f\n", receiptlist.get(i).getPrice());
									System.out.format("Total Price : RM %.2f\n", receiptlist.get(i).getTotalAmount());
									System.out.format("Grand total : RM %.2f\n", receiptlist.get(i).getGrandTotal());

									System.out.println("==========================================");

								}

								System.out.println("==========================================");

								System.out.printf("\n\n\n");
								break;
							case 8:

								break;
							default:
								System.out.println("Invalid input!!!");
								break;
							}
						} while (choice != 8);

					}
						break;
					case 2: 
                                            boolean valid = false;
                                            int option1;
                                            Scanner typestring = new Scanner (System.in);
                                            Scanner typeint = new Scanner (System.in);
                                            
                                            do {
                                                        option1 = 0;
                                                        
                                                        System.out.print("\n");
                                                        System.out.println("\t\t\t\t\t\t ______________________________");
                                                        System.out.println("\t\t\t\t\t\t|                              |");
                                                        System.out.println("\t\t\t\t\t\t|           Membership         |");
                                                        System.out.println("\t\t\t\t\t\t|------------------------------|");
                                                        System.out.println("\t\t\t\t\t\t| 1. Member Management         |");
                                                        System.out.println("\t\t\t\t\t\t| 2. Gift Redemption           |");
                                                        System.out.println("\t\t\t\t\t\t| 3. Back                      |");
                                                        System.out.println("\t\t\t\t\t\t|______________________________|");
                                            do{
                                                   System.out.print("\t\t\t\t\t\t Enter your selection : ");
                                                   while(!typeint.hasNextInt())
                                                        {
                                                            System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                            System.out.print("\n\t\t\t\t\t\tEnter your selection : ");
                                                            typeint.next();
                                                                   
                                                        }option1 = typeint.nextInt();
                                                        
                                                    if (option1!=3 && option1 != 2 && option1 != 1){
                                                        System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                    }
                                            }while(option1!=3 && option1 != 2 && option1 != 1);
                                                     
                                            /*do {
                                                try {

                                                    System.out.print("\nEnter your selection : ");
                                                    option1 = typeint.nextInt();

                                                    valid = true;

                                                } catch (Exception e){
                                                    System.out.println("Invalid Input! Please try again.........\n");
                                                }
                                            } while (valid);*/
                                            
                                            

                                            switch (option1){
                                                case 1:
                                                        System.out.print("\n");
                                                        System.out.println("\t\t\t\t\t\t ______________________________");
                                                        System.out.println("\t\t\t\t\t\t|                              |");
                                                        System.out.println("\t\t\t\t\t\t|     Membership*Management    |");
                                                        System.out.println("\t\t\t\t\t\t|------------------------------|");
                                                        System.out.println("\t\t\t\t\t\t| 1. Create Membership         |");
                                                        System.out.println("\t\t\t\t\t\t| 2. Display Membership        |");
                                                        System.out.println("\t\t\t\t\t\t| 3. Update Membership         |");
                                                        System.out.println("\t\t\t\t\t\t| 4. Delete Membership         |");
                                                        System.out.println("\t\t\t\t\t\t|                              |");
                                                        System.out.println("\t\t\t\t\t\t|______________________________|");
                                                       
                                                        int option2;
                                                              do{
                                                   System.out.print("\t\t\t\t\t\t Enter your selection : ");
                                                   while(!sc.hasNextInt())
                                                        {
                                                            System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                            System.out.print("\n\t\t\t\t\t\tEnter your selection : ");
                                                            sc.next();
                                                                   
                                                        }option2 = sc.nextInt();
                                                        
                                                    if (option2 !=4 && option2 != 3 && option2 != 2 &&option2!=1){
                                                        System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                    }
                                                        
                                            }while(option2 !=4 && option2 != 3 && option2 != 2 &&option2!=1);
                                                       // int option2 = sc.nextInt();

                                                        switch (option2){
                                                            case 1:
                                                                 System.out.print("\n");
                                                                System.out.println("\t\t\t\t\t\t ______________________________");
                                                                System.out.println("\t\t\t\t\t\t|                              |");
                                                                System.out.println("\t\t\t\t\t\t|          Create*Member       |");
                                                                System.out.println("\t\t\t\t\t\t|------------------------------|");
                                                                System.out.println("\t\t\t\t\t\t| 1. Basic Member              |");
                                                                System.out.println("\t\t\t\t\t\t| 2. Silver Member             |");
                                                                System.out.println("\t\t\t\t\t\t| 3. Gold Membership           |");
                                                                System.out.println("\t\t\t\t\t\t|______________________________|");
                                                                int option3;
                                                   do{
                                                    System.out.print("\t\t\t\t\t\t Enter your selection : ");
                                                    while(!sc.hasNextInt())
                                                        {
                                                            System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                            System.out.print("\n\t\t\t\t\t\t Enter your selection : ");
                                                            sc.next();
                                                        }option3 = sc.nextInt();
                                                        
                                                        if (option3 !=4 && option3 != 3 && option3 != 2 &&option3!=1){
                                                            System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                        }
                                                        
                                                    }while(option3 !=4 && option3 != 3 && option3 != 2 &&option3!=1);

                                                                switch(option3){
                                                                    case 1:
                                                                        
                                                                        System.out.print("\n");
                                                                        String type1 = "Basic";
                                                                        Membership member1 = new Basic_Membership();
                                                                        member1 = member1.createMember(memID++, type1);
                                                                        membership.add(member1);

                                                                        VoucherRedemption Vmember1 = new VoucherRedemption(membership.get(membership.size() - 1).getmember(), giftID++, "Voucher");
                                                                        VRedemption.add(Vmember1);

                                                                        ItemRedemption Imember1 = new ItemRedemption (membership.get(membership.size() - 1).getmember(), gift2ID++, "Item");
                                                                        IRedemption.add(Imember1);

                                                                        System.out.println("New Member successfull created !!!!!");
                                                                        break;

                                                                    case 2:
                                                                        
                                                                        System.out.print("\n");
                                                                        String type2 = "Silver";
                                                                        Membership member2 = new Silver_Membership();
                                                                        member2 = member2.createMember(memID++, type2);
                                                                        membership.add(member2);

                                                                        VoucherRedemption Vmember2 = new VoucherRedemption(membership.get(membership.size() - 1).getmember(), giftID++, "Voucher");
                                                                        VRedemption.add(Vmember2);

                                                                        ItemRedemption Imember2 = new ItemRedemption (membership.get(membership.size() - 1).getmember(), gift2ID++, "Item");
                                                                        IRedemption.add(Imember2);

                                                                        System.out.println("New Member successfull created !!!!!");
                                                                        break;

                                                                    case 3:
                                                                        
                                                                        System.out.print("\n");
                                                                        String type3 = "Gold";
                                                                        Membership member3 = new Gold_Membership();
                                                                        member3 = member3.createMember(memID++, type3);
                                                                        membership.add(member3);

                                                                        VoucherRedemption Vmember3 = new VoucherRedemption(membership.get(membership.size() - 1).getmember(), giftID++, "Voucher");
                                                                        VRedemption.add(Vmember3);

                                                                        ItemRedemption Imember3 = new ItemRedemption (membership.get(membership.size() - 1).getmember(), gift2ID++, "Item");
                                                                        IRedemption.add(Imember3);

                                                                        System.out.println("New Member successfull created !!!!!");

                                                                        break;
                                                                    default:
                                                                        System.out.println("Invalid Input! Please try again........");
                                                                }
                                                                
                                                                System.out.print("\n\n\nPress anything to continue.............");
                                                                String continuetomenu = typestring.nextLine();
                                                                    
                                                                break;
                                                            case 2:
                                                                System.out.print("\n");
                                                                System.out.println("No.  \tMember ID \t Member Name \t Age \t Member Contact \t Gender \t Member Status " );
                                                                System.out.println("======================================================================================================");

                                                                for (int j = 0; j < membership.size(); j++){
                                                                    System.out.println((j + 1) + ") \t" +membership.get(j).displayMembership());
                                                                }
                                                                
                                                                System.out.print("\n\n\nPress anything to continue.............");
                                                                String continuetomenu1 = typestring.nextLine();
                                                                
                                                                break;
                                                            case 3:
                                                                System.out.print("\n");
                                                                int temp = 0;
                                                                int option4 = 0;
                                                                System.out.println("No.  \tMember ID \t Member Name \t Age \t Member Contact \t Gender \t Member Status " );
                                                                System.out.println("======================================================================================================");
                                                                
                                                                for (int j = 0; j < membership.size(); j++){
                                                                    System.out.println((j + 1) + ") \t" +membership.get(j).displayMembership());
                                                                    temp = j;
                                                                }

                                                                do {
                                                                    
                                                                    System.out.print("\n\t\t\t\t\t\tEnter number to be Update (No.) : ");
                                                                
                                                                    while (!sc.hasNextInt()){
                                                                    
                                                                        System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........");
                                                                        System.out.print("\n\t\t\t\t\t\t Enter your selection : ");
                                                                        sc.next();
                                                                    
                                                                    } option4 = sc.nextInt();
                                                                    
                                                                    if (option4 <= 0 || option4 > membership.size()){
                                                                        System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........");
                                                                    }
                                                                
                                                                } while (option4 <= 0  || option4 > membership.size());
                                                                
                                                                
                                                                membership.get(option4 - 1).updateMembership();
                                                                
                                                                System.out.print("\n\n\nPress anything to continue.............");
                                                                String continuetomenu2 = typestring.nextLine();
                                                                
                                                                break;
                                                            case 4:
                                                                int option5 = 0;
                                                                System.out.print("\n");
                                                                System.out.println("\t\t\t\t\t\t                Membership List             ");
                                                                System.out.println("\t\t\t\t\t\t============================================");
                                                                System.out.println("\t\t\t\t\t\tNo. \tMember ID\tMember Name\tMember Status");
                                                                for (int z = 0; z < membership.size();z++){
                                                                    System.out.println("\t\t\t\t\t\t" + (z + 1) + ") \t" + membership.get(z).getmember().getmemberID() + " \t\t" + membership.get(z).getmember().getmemberName() + " \t" + membership.get(z).getmemberStatus());
                                                                }
                                                                
                                                                do {
                                                                    System.out.print("\n\t\t\t\t\t\tEnter number to be remove (No.) : ");
                                                                    while (!sc.hasNextInt()){
                                                                        System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........");
                                                                        System.out.print("\n\t\t\t\t\t\tEnter number to be remove (No.) : ");
                                                                        sc.next();
                                                                    } option5 = sc.nextInt();
                                                                    
                                                                    if (option5 <= 0 || option5 > membership.size()){
                                                                        System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........");
                                                                    }
                                                                } while (option5 <= 0 || option5 > membership.size());
                                                                
                                                                membership.remove(option5 - 1);
                                                                VRedemption.remove(option5 - 1);
                                                                IRedemption.remove(option5 - 1);
                                                                
                                                                System.out.println("Removed Successfull !!!!");
                                                                
                                                                System.out.println("\n\n\nPress anything to continue.............");
                                                                String continuetomenu3 = typestring.nextLine();
                                                                
                                                                break;

                                                            default:
                                                                System.out.print("Invalid input! Please try again....");

                                                        }

                                                            break;

                                                        case 2:
                                                            
                                                            System.out.print("\n");    
                                                            System.out.println("\t\t\t\t\t\t ______________________________");
                                                            System.out.println("\t\t\t\t\t\t|                              |");
                                                            System.out.println("\t\t\t\t\t\t|         Gift*Redemption      |");
                                                            System.out.println("\t\t\t\t\t\t|------------------------------|");
                                                            System.out.println("\t\t\t\t\t\t| 1. Voucher Redemption        |");
                                                            System.out.println("\t\t\t\t\t\t| 2. Item Redemption           |");
                                                            System.out.println("\t\t\t\t\t\t|______________________________|");
                                                            //System.out.print("\nEnter your selection : ");
                                                            //int option3 = sc.nextInt();
                                                            int option3;
                                                            do{
                                                                System.out.print("\t\t\t\t\t\t Enter your selection : ");
                                                                while(!sc.hasNextInt())
                                                                {
                                                                    System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                                    System.out.print("\n\t\t\t\t\t\t Enter your selection : ");
                                                                    sc.next();
                                                                   
                                                                }option3 = sc.nextInt();
                                                                
                                                                if (option3 != 2 &&option3!=1){
                                                                    System.out.print("\t\t\t\t\t\tInvalid Input! Please try again.........\n");
                                                                }
                                                                
                                                            }while(option3 != 2 &&option3!=1);
                                                            
                                                            boolean validation = false;
                                                            boolean validation2 = false;

                                                            switch (option3){
                                                                case 1:
                                                                    System.out.print("\n\t\t\t\t\t\tEnter member ID : ");
                                                                    int ID = sc.nextInt();
                                                                    

                                                                    for (int i = 0; i < VRedemption.size() && validation == false;i++){
                                                                        if (VRedemption.get(i).getMember().getmemberID() == ID){
                                                                            validation = true;
                                                                            System.out.println("\n\t\t\t\t\t\tCurrent Member Point :" + membership.get(i).getmemberPoint());
                                                                                if (membership.get(i).getmemberPoint() >= 100){
                                                                                    VRedemption.get(i).generateVoucher();
                                                                                    membership.get(i).setmemberPoint(membership.get(i).getmemberPoint() - 100);
                                                                                    System.out.println("\n\t\t\t\t\t\tLatest Member Point :" + membership.get(i).getmemberPoint());
                                                                                }else
                                                                                    System.out.println("\t\t\t\t\t\tNot Enough member point! Purchase more to earn member point.....");
                                                                        } 
                                                                    }

                                                                    if (validation == false){
                                                                        System.out.println("\n\t\t\t\t\t\tMember ID not found..........\n");
                                                                    }
                                                                    
                                                                    break;
                                                                case 2:
                                                                    System.out.print("\n\t\t\t\t\t\tEnter member ID : ");
                                                                    int ID1 = sc.nextInt();
                                                                            
                                                                    for (int q = 0; q < IRedemption.size() && validation2 == false; q++){
                                                                        if (IRedemption.get(q).getMember().getmemberID() == ID1){
                                                                            validation2 = true;
                                                                            System.out.println("\n\t\t\t\t\t\tCurrent Member Point :" + membership.get(q).getmemberPoint());
                                                                            if (membership.get(q).getmemberPoint() >= 300){
                                                                                    IRedemption.get(q).redeemItem();
                                                                                    membership.get(q).setmemberPoint(membership.get(q).getmemberPoint() - 300);
                                                                                    System.out.println("\n\t\t\t\t\t\tLatest Member Point :" + membership.get(q).getmemberPoint());
                                                                                }else
                                                                                    System.out.println("Not Enough member point! Purchase more to earn member point.....");
                                                                        }
                                                                    }

                                                                    if (validation2 == false){
                                                                        System.out.println("\n\t\t\t\t\t\tMember ID not found..........\n");
                                                                    }

                                                                    break;

                                                                default:
                                                                    System.out.println("\t\t\t\t\t\tInvalid Input!!! Please try again.......");
                                                            }

                                                            System.out.print("\n\n\nPress anything to continue.............");
                                                            String continuetomenu5 = typestring.nextLine();
                                                            
                                                            break;

                                                        case 3:

                                                            break;

                                                        default:
                                                            System.out.println("\t\t\t\t\t\tInvalid Input... Please try again!");
                                                    }
                                                    }while (option1 != 3);
                                                    break;
                                            
					case 3: {//report module
						for (int i = 0; i < staffArr.size(); i++) {//check if staff is manager
							if (loginID.compareToIgnoreCase(staffArr.get(i).getStaffID()) == 0 ) {
								if (staffArr.get(i).getRole().compareToIgnoreCase("Manager") == 0) {//if staff is manager
									Scanner scn = new Scanner(System.in);	
									//Variable
									int dailyChoice = 0;
									int monthlyChoice = 0;
									int bestSellingChoice = 0;
									int reportChoice = 0;
									int error = 0;
									boolean exit = false;
									boolean isNum = true;

									do {
										do {
											menu.reportMenu();// display report menu
											if (scn.hasNextInt()) {//if integer
												reportChoice = scn.nextInt();
												isNum = true;
												if (reportChoice < 1 && reportChoice > 4) {//if not between 1 - 4
													error = 1;

												}
											} else {//if not integer
												System.out.println("Invalid Choice");
												System.out.println("Please Enter Again!!! \n");
												isNum = false;
												scn.next();
											}
										} while (error != 0 || !(isNum));

										switch (reportChoice) {
										case 1:
											do {
												menu.dailyMenu();// display dialy report menu
												if (scn.hasNextInt()) {//if integer
													dailyChoice = scn.nextInt();
													isNum = true;
													error = 0;
													if (dailyChoice < 1 || dailyChoice > 2) {//if input not between 1 - 2
														error = 1;

													}
												} else {//if not integer
													System.out.println("Invalid Choice");
													System.out.println("Please Enter Again!!! \n");
													isNum = false;
													scn.next();
												}
											} while (error != 0 || !(isNum));
											switch (dailyChoice) {
											case 1:
												//display daily report
												dailyReport dailyrep1 = new dailyReport();
												dailyrep1.displayDailyReport(receiptlist);
												break;

											case 2:
												//back to report menu
												System.out.printf("\n");
												System.out.println("Back to Report Menu!");
												System.out.printf("\n\n\n");
												break;
											default:
												break;
											}
											break;

										case 2:
											do {
												menu.monthlyMenu();//display monthly report menu
												if (scn.hasNextInt()) {//if integer
													monthlyChoice = scn.nextInt();
													isNum = true;
													error = 0;
													if (monthlyChoice < 1 || monthlyChoice > 3) {//if input not between 1 - 3
														error = 1;
														exit = false;
													}
												} else {//if not integer
													System.out.println("Invalid Choice");
													System.out.println("Please Enter Again!!! \n");
													isNum = false;
													scn.next();
												}
											} while (error != 0 || !(isNum));
											switch (monthlyChoice) {
											case 1://display monthly report
												monthlyReport monthlyrep1 = new monthlyReport();
												monthlyrep1.displayMonthlyReport(monthlyReceipt);
												break;

											case 2://search monthly report
												monthlyReport monthlyrep2 = new monthlyReport();
												monthlyrep2.searchMonthlyReport(monthlyReceipt);
												break;

											case 3://back to report menu
												System.out.printf("\n");
												System.out.println("Back to Report Menu!");
												System.out.printf("\n\n\n");
												break;
											}
											break;

										case 3:
											do {
												menu.bestSellingMenu();// display best selling report menu
												if (scn.hasNextInt()) {//if integer
													bestSellingChoice = scn.nextInt();
													isNum = true;
													error = 0;
													if (bestSellingChoice < 1 || bestSellingChoice > 2) {//if input not betweeen 1 - 2
														error = 1;

													}
												} else {//if not integer
													System.out.println("Invalid Choice");
													System.out.println("Please Enter Again!!! \n");
													isNum = false;
													scn.next();
												}
											} while (error != 0 || !(isNum));
											switch (bestSellingChoice) {
											case 1:
												//display best selling report
												bestSellingReport bestrep1 = new bestSellingReport();
												bestrep1.displayBestSellingReport(bestSellingReport, prodlist);
												break;

											case 2:
												//back report menu
												System.out.printf("\n");
												System.out.println("Back to Report Menu!");
												System.out.printf("\n\n\n");
												break;
											}
											break;
										case 4:
											//back to main menu
											System.out.println("Exit Successfully");

											break;

										default://invalid choice
											System.out.println("Invalid input. Please enter (1-4) only.");
											break;
										}
									} while (reportChoice != 4);
								}

							}
							else {//if staff not manager
								System.out.println("You have no authority to access to this module");
							}
							break;
						}
						
					}
						break;
					case 4: 
                       //product module
						Scanner scn = new Scanner(System.in);

						//variable
						int countRow = 0;
						int error = 0;
						int prodIDindex = 0;
						String confirm = "";
						String catChoice;
						String addOrNot = "";
						boolean isNum = true;
						boolean isDou = true;
						boolean exit = false;
						boolean foundprodID = false;
						boolean sameProdID = false;

						String prodName;
						String prodID;
						String prodDesc;
						String prodCat = "";
						int qty = 0;
						double price = 0.0;

						String searchProdID = "";
						String newProdName;
						String newProdID;
						String newProdDesc;
						String newProdCat = "";
						int newQty = 0;
						double newPrice = 0.0;

						int countProduct = 0;

						String deleteOrNot = "";

						do {

							do {
								prodMenu();//display product menu
								if (scn.hasNextInt()) {//if integer
									choice = scn.nextInt();
									isNum = true;
									if (choice < 1 && choice > 6) {//if input not between 1 - 6
										error = 1;
									}
								} else {//if not integer
									System.out.println("Invalid choice !");
									isNum = false;
									scn.next();
								}
							} while (error != 0 || !(isNum));
							scn.nextLine();

							System.out.printf("\n");
							switch (choice) {
							case 1:
								do {
									//add new product 
									System.out.printf("\n\n");
									System.out
											.println("---------------------------------------------------------------");
									System.out.println("Add Product ");
									System.out
											.println("---------------------------------------------------------------");

									do {
										System.out.print("Product Name ( E/e to exit ): ");
										prodName = scn.nextLine();
										if (isNullOrEmpty(prodName)) {//if input is null
											exit = false;
											System.out.println("You must fill in Product Name !");
											error = 1;
										} else if (prodName.length() == 1) {

											if (prodName.charAt(0) == 'E' || prodName.charAt(0) == 'e') {//if want to exit
												error = 0;
												exit = true;
											} else {//not enough length
												exit = false;
												System.out.println(
														"Please enter product name with minimum of 5 length !");
												error = 1;
											}

										} else if (prodName.length() < 5) {//not enough length
											exit = false;
											System.out.println("Please enter product name with minimum of 5 length !");
											error = 1;
										} else {//no problem
											exit = false;
											error = 0;
										}

									} while (error != 0);

									if (exit) {//if want to exit
										break;
									}
									do {
										System.out.print("Product ID (Ex: PID00001)( E/e to exit): ");
										prodID = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(prodID)) {//if input is null
											exit = false;
											System.out.println("You must fill in Product ID !");
											error = 1;
										} else if (prodID.length() == 1) {
											if (prodID.charAt(0) == 'E' || prodID.charAt(0) == 'e') {//if want to exit
												error = 0;
												exit = true;
											} else {//not enough length
												exit = false;
												System.out
														.println("Please enter product ID with minimum of 5 length !");
												error = 1;
											}

										} else if (prodID.length() < 5) {//not enough length
											exit = false;
											System.out.println("Please enter product ID with minimum of 5 length !");
											error = 1;
										} else {//no problem
											exit = false;
											error = 0;
										}

										if (error == 0) {//check product ID is used or not

											for (int i = 0; i < prodlist.size(); i++) {
												if (prodID.equals(prodlist.get(i).getProdID())) {
													System.out.println("This product ID has been register !");
													error = 1;
												}
											}
										}

									} while (error != 0);
									if (exit) {//if choose to exit
										break;
									}

									do {
										System.out.print("Description ( E/e to exit): ");
										prodDesc = scn.nextLine();
										if (isNullOrEmpty(prodDesc)) {//if input is null
											exit = false;
											System.out.println("You must fill in Product Description !");
											error = 1;
										} else if (prodDesc.length() == 1) {
											if (prodDesc.charAt(0) == 'E' || prodDesc.charAt(0) == 'e') {//if want to exit
												error = 0;
												exit = true;
											} else {
												System.out.println(//not enough length
														"Please enter product Description with minimum of 5 length !");
												exit = false;
												error = 1;
											}

										} else if (prodDesc.length() < 5) {//not enough length
											exit = false;
											System.out.println(
													"Please enter product Description with minimum of 5 length !");
											error = 1;
										} else {//no problem
											exit = false;
											error = 0;
										}

									} while (error != 0);
									if (exit) {//if want to exit
										break;
									}
									do {
										categoryMenu();//display category menu
										catChoice = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(catChoice)) {//if input is null
											System.out.println("You must fill in Product Category !");
											exit = false;
											error = 1;
										} else if (catChoice.length() != 1) {//if input lenght not 1
											exit = false;
											System.out.println("Please enter 1-letter-choice !");
											error = 1;
										} else {//no problem
											exit = false;
											if (catChoice.charAt(0) != 'S' && catChoice.charAt(0) != 's'
													&& catChoice.charAt(0) != 'D' && catChoice.charAt(0) != 'd'
													&& catChoice.charAt(0) != 'N' && catChoice.charAt(0) != 'n'
													&& catChoice.charAt(0) != 'R' && catChoice.charAt(0) != 'r'
													&& catChoice.charAt(0) != 'E' && catChoice.charAt(0) != 'e') {
												System.out.println("Invalid category choice !");//if input not recognise
												error = 1;

											} else if (catChoice.charAt(0) == 'S' || catChoice.charAt(0) == 's') {

												prodCat = "Sushi";
												error = 0;
											} else if (catChoice.charAt(0) == 'D' || catChoice.charAt(0) == 'd') {

												prodCat = "Drink";
												error = 0;
											} else if (catChoice.charAt(0) == 'N' || catChoice.charAt(0) == 'n') {

												prodCat = "Noodles";
												error = 0;
											} else if (catChoice.charAt(0) == 'R' || catChoice.charAt(0) == 'r') {

												prodCat = "Rice";
												error = 0;
											}

											else {// if want to exit
												exit = true;
												error = 0;
											}

										}
									} while (error != 0);
									if (exit) {//if want to exit
										break;
									}
									do {

										System.out.println("Quantity (-1 to exit): ");
										if (scn.hasNextInt()) {//if input is integer
											qty = scn.nextInt();
											isNum = true;
											if (qty == -1) {//if want to exit
												exit = true;
												error = 0;
											} else if (qty > 999 || qty <= 0) {//if qty not ebtween 0 - 1000
												exit = false;
												System.out.println("You must insert quantity between 1000 and 0 !");
												error = 1;
											} else {//no problem
												exit = false;
												error = 0;
											}

										} else {//if not integer
											System.out.println("Please enter integer input !");
											error = 1;
											isNum = false;
											scn.next();
										}
									} while (error != 0 || !(isNum));
									if (exit) {//if want to exit
										break;
									}

									do {

										System.out.println("Price (-1 to exit): ");
										if (scn.hasNextDouble()) {//if input is double
											price = scn.nextDouble();
											isDou = true;
											if (price == -1) {//if want to exit
												exit = true;
												error = 0;
											} else if (price > 99999999.9 || price <= 0.0) {//if price not between 0 - 10000000
												System.out.println(
														"You must insert price between between RM 999999.99 and RM 0.00 !");
												error = 1;
												exit = false;
											} else {// no problem
												exit = false;
												error = 0;
											}
										} else {//if not double
											System.out.println("Please enter double input !");
											error = 1;
											exit = false;
											isDou = false;
											scn.next();
										}

									} while (error != 0 || !(isDou));
									if (exit) {//if want to exit
										break;
									}
									if (error == 0) {

										System.out.println("===========================");
										System.out.println("Product details :");
										System.out.printf("\n");
										System.out.println("Product Name : " + prodName);
										System.out.println("Product ID : " + prodID);
										System.out.println("Product Description : " + prodDesc);
										System.out.println("Product Category : " + prodCat);
										System.out.println("Product Quantity : " + qty);
										System.out.format("Product Price : RM %.2f\n", price);
										System.out.println("===========================");

									}
									scn.nextLine();

									do {
										System.out.print("Confirm add product? (Y/YES | N/NO) (Case insensitive) ");
										confirm = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(confirm)) {//if input is null
											System.out.println("You must fill in yes or not !");
											error = 1;
										}

										else if (confirm.length() == 1) {
											if (confirm.charAt(0) != 'Y' && confirm.charAt(0) != 'N') {//if not Y and N
												System.out.println("You must enter Y or N !");
												error = 1;
											} else {//no problem

												error = 0;
											}
										} else if (confirm.length() == 3 || confirm.length() == 2) {
											if (confirm.equals("YES") == true) {

												error = 0;
											} else if (confirm.equals("NO") == true) {
												error = 0;
											} else {//if not YES or NO
												System.out.println("You must enter YES or NO !");
												error = 1;
											}

										} else {//invalid input
											System.out.println("You must enter YES or NO !");
											error = 1;
										}
									} while (error != 0);

									if (confirm.charAt(0) == 'Y' || confirm == "YES") {//add product into array
										product prod = new product(prodName, prodID, prodDesc, prodCat, qty, price);
										prodlist.add(prod);
										System.out.println("1 product has been added succesfully !");
									} else {//wont add product into array
										System.out.println("1 product has been cancelled !");
									}

									do {
										System.out.print(
												"Do you want to add more product? (Y/YES | N/NO) (Case insensitive) ");
										addOrNot = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(addOrNot)) {//if input is null
											System.out.println("You must enter yes or no !");
											error = 1;
										} else if (addOrNot.length() == 1) {
											if (addOrNot.charAt(0) != 'Y' && addOrNot.charAt(0) != 'N') {//if not Y and N
												System.out.println("You must enter yes or no !");
												error = 1;
											} else {// no problem

												error = 0;
											}
										} else if (addOrNot.length() == 3 || addOrNot.length() == 2) {
											if (addOrNot.equals("YES") == true) {

												error = 0;
											} else if (addOrNot.equals("NO") == true) {
												error = 0;
											} else {
												System.out.println("You must enter YES or NO !");
												error = 1;
											}

										} else {//if not YES or NO
											System.out.println("You must enter YES or NO !");
											error = 1;
										}

									} while (error != 0);

								} while (addOrNot.charAt(0) == 'Y' || addOrNot.equals("YES"));//if want to ad more
								System.out.println("Thank you ");

								System.out.println("------------------------------");
								System.out.printf("\n\n\n");
								break;

							case 2:
								do {
									//edit product info
									countProduct = 0;
									System.out.printf("\n\n");
									System.out
											.println("---------------------------------------------------------------");
									System.out.println("Modify Product Details");
									System.out
											.println("---------------------------------------------------------------");
									System.out.printf("\n");
									System.out.println("All Product avaialble");
									for (int i = 0; i < prodlist.size(); i++) {

										countProduct++;
										System.out.println("Product " + (i + 1) + " => ");
										System.out.println("Product Name : " + prodlist.get(i).getProdName());
										System.out.println("Product ID : " + prodlist.get(i).getProdID());
										System.out.println("Product Description : " + prodlist.get(i).getDesc());
										System.out.println("Product Category : " + prodlist.get(i).getCat());
										System.out.println("Product Quantity : " + prodlist.get(i).getQty());
										System.out.format("Product Price : RM %.2f\n", prodlist.get(i).getPrice());
										System.out.printf("\n");
									}
									System.out.println("------------------------------");
									System.out.println(countProduct + " product(s) found");
									System.out.printf("\n\n");

									if (countProduct == 0) {
										System.out.println("There are no product available yet !");
										exit = true;
									}

									else {
										System.out.println("Modify Product Details");
										System.out.println("------------------------------");
										do {
											
											System.out.println("Enter Product ID you want to modify (E/e to exit): ");
											searchProdID = scn.nextLine().toUpperCase();
											if (isNullOrEmpty(searchProdID)) {//if input is empty
												System.out.println("You must fill in Product ID !");
												error = 1;
												exit = false;
											} else if (searchProdID.length() == 1) {
												error = 0;
												if (searchProdID.charAt(0) == 'E' || searchProdID.charAt(0) == 'e') {//if want to exit
													exit = true;

												} else {//no problem
													exit = false;
												}
											}

											else {// no problem
												exit = false;
												error = 0;
											}

										} while (error != 0);
									}

									if (exit == true) {//if want to exit
										break;
									}
									for (int i = 0; i < prodlist.size(); i++) {//compare prod ID with prodlist
										if (searchProdID.equals(prodlist.get(i).getProdID())) {//if match
											foundprodID = true;
											prodIDindex = i;

											break;
										} else {//if not match

											foundprodID = false;
										}
									}
									if (foundprodID == true) {//if match
										System.out.println("Product found !");
										System.out.printf("\n");
										System.out.println("Enter new product details--------------");
										//Enter new product info
										//I use back same validation from add product module 
										do {
											System.out.print("Product Name ( E/e to exit ): ");
											newProdName = scn.nextLine();
											if (isNullOrEmpty(newProdName)) {
												exit = false;
												System.out.println("You must fill in Product Name !");
												error = 1;
											} else if (newProdName.length() == 1) {

												if (newProdName.charAt(0) == 'E' || newProdName.charAt(0) == 'e') {
													error = 0;
													exit = true;
												} else {
													exit = false;
													System.out.println(
															"Please enter product name with minimum of 5 length !");
													error = 1;
												}

											} else if (newProdName.length() < 5) {
												exit = false;
												System.out.println(
														"Please enter product name with minimum of 5 length !");
												error = 1;
											} else {
												exit = false;
												error = 0;
											}
										} while (error != 0);
										if (exit) {
											break;
										}
										do {
											System.out.print("Product ID ( E/e to exit ): ");
											newProdID = scn.nextLine().toUpperCase();
											if (isNullOrEmpty(newProdID)) {
												exit = false;
												System.out.println("You must fill in Product Name !");
												error = 1;
											} else if (newProdID.length() == 1) {

												if (newProdID.charAt(0) == 'E' || newProdID.charAt(0) == 'e') {
													error = 0;
													exit = true;
												} else {
													exit = false;
													System.out.println(
															"Please enter product ID with minimum of 5 length !");
													error = 1;
												}

											} else if (newProdID.length() < 5) {
												exit = false;
												System.out.println(
														"Please enter product ID with minimum of 5 length !");
												error = 1;
											} else {
												exit = false;
												error = 0;
											}
										} while (error != 0);
										if (exit) {
											break;
										}
										do {
											System.out.print("Description ( E/e to exit): ");
											newProdDesc = scn.nextLine();
											if (isNullOrEmpty(newProdDesc)) {
												exit = false;
												System.out.println("You must fill in Product Description !");
												error = 1;
											} else if (newProdDesc.length() == 1) {
												if (newProdDesc.charAt(0) == 'E' || newProdDesc.charAt(0) == 'e') {
													error = 0;
													exit = true;
												} else {
													System.out.println(
															"Please enter product Description with minimum of 5 length !");
													exit = false;
													error = 1;
												}

											} else if (newProdDesc.length() < 5) {
												exit = false;
												System.out.println(
														"Please enter product Description with minimum of 5 length !");
												error = 1;
											} else {
												exit = false;
												error = 0;
											}

										} while (error != 0);
										if (exit) {
											break;
										}
										do {
											categoryMenu();
											catChoice = scn.nextLine().toUpperCase();
											if (isNullOrEmpty(catChoice)) {
												System.out.println("You must fill in Product Category !");
												exit = false;
												error = 1;
											} else if (catChoice.length() != 1) {
												exit = false;
												System.out.println("Please enter 1-letter-choice !");
												error = 1;
											} else {
												exit = false;
												if (catChoice.charAt(0) != 'S' && catChoice.charAt(0) != 's'
														&& catChoice.charAt(0) != 'D' && catChoice.charAt(0) != 'd'
														&& catChoice.charAt(0) != 'N' && catChoice.charAt(0) != 'n'
														&& catChoice.charAt(0) != 'R' && catChoice.charAt(0) != 'r'
														&& catChoice.charAt(0) != 'E' && catChoice.charAt(0) != 'e') {
													System.out.println("Invalid category choice !");
													error = 1;

												} else if (catChoice.charAt(0) == 'S' || catChoice.charAt(0) == 's') {

													newProdCat = "Sushi";
													error = 0;
												} else if (catChoice.charAt(0) == 'D' || catChoice.charAt(0) == 'd') {

													newProdCat = "Drink";
													error = 0;
												} else if (catChoice.charAt(0) == 'N' || catChoice.charAt(0) == 'n') {

													newProdCat = "Noodles";
													error = 0;
												} else if (catChoice.charAt(0) == 'R' || catChoice.charAt(0) == 'r') {

													newProdCat = "Rice";
													error = 0;
												}

												else {
													exit = true;
													error = 0;
												}

											}
										} while (error != 0);
										if (exit) {
											break;
										}
										do {

											System.out.println("Quantity (-1 to exit): ");
											if (scn.hasNextInt()) {
												newQty = scn.nextInt();
												isNum = true;
												if (newQty == -1) {
													exit = true;
													error = 0;
												} else if (newQty > 999 || newQty <= 0) {
													exit = false;
													System.out.println("You must insert quantity between 1000 and 0 !");
													error = 1;
												} else {
													exit = false;
													error = 0;
												}

											} else {
												System.out.println("Please enter integer input !");
												error = 1;
												isNum = false;
												scn.next();
											}
										} while (error != 0 || !(isNum));
										if (exit) {
											break;
										}
										do {

											System.out.println("Price (-1 to exit): ");
											if (scn.hasNextDouble()) {
												newPrice = scn.nextDouble();
												isDou = true;
												if (newPrice == -1) {
													exit = true;
													error = 0;
												} else if (newPrice > 99999999.9 || newPrice <= 0.0) {
													System.out.println(
															"You must insert price between between RM 999999.99 and RM 0.00 !");
													error = 1;
													exit = false;
												} else {
													exit = false;
													error = 0;
												}
											} else {
												System.out.println("Please enter double input !");
												error = 1;
												exit = false;
												isDou = false;
												scn.next();
											}

										} while (error != 0 || !(isDou));
										scn.nextLine();
										if (exit) {
											break;
										}
										do {
											System.out.print("Confirm add product? (Y/YES | N/NO) (Case insensitive) ");
											confirm = scn.nextLine().toUpperCase();
											if (isNullOrEmpty(confirm)) {
												System.out.println("You must fill in yes or not !");
												error = 1;
											}

											else if (confirm.length() == 1) {
												if (confirm.charAt(0) != 'Y' && confirm.charAt(0) != 'N') {
													System.out.println("You must enter Y or N !");
													error = 1;
												} else {

													error = 0;
												}
											} else if (confirm.length() == 3 || confirm.length() == 2) {
												if (confirm.equals("YES") == true) {

													error = 0;
												} else if (confirm.equals("NO") == true) {
													error = 0;
												} else {
													System.out.println("You must enter YES or NO !");
													error = 1;
												}

											} else {
												System.out.println("You must enter YES or NO !");
												error = 1;
											}
										} while (error != 0);
										if (confirm.charAt(0) == 'Y' || confirm == "YES") {//if confirm the change
											for (int i = 0; i < prodlist.size(); i++) {//check prod ID got same or not
												if(i != prodIDindex) {
													if (newProdID.equals(prodlist.get(i).getProdID())) {//if same
														sameProdID = true;
														break;
													} else {//if not same
														sameProdID = false;
													}
												}
												
											}
											if (sameProdID == true) {//if same prod ID
												System.out.println("Failed to update !");
												System.out.println("Reasons :");
												System.out.println(
														"Your new product ID cannot match with other product ID !");
											} else {//change prod info from prodlist
												prodlist.set(prodIDindex, new product(newProdName, newProdID,
														newProdDesc, newProdCat, newQty, newPrice));
												System.out.println("Update succesful !");

											}
										} else {//if not confirm the change
											System.out.println("You did not make any change !");
											exit = true;
										}
										if (exit) {//if want to exit
											break;
										}

									} else {//if not foudn the prod ID want to edit
										foundprodID = false;
										System.out.printf("\n");
										System.out.println("This product ID does not exist ");

									}
									do {
										System.out.print("Do you want to modify more product? (Y/YES | N/NO) (Case insensitive) ");
										addOrNot = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(addOrNot)) {
											System.out.println("You must enter yes or no !");
											error = 1;
										} else if (addOrNot.length() == 1) {
											if (addOrNot.charAt(0) != 'Y' && addOrNot.charAt(0) != 'N') {
												System.out.println("You must enter yes or no !");
												error = 1;
											} else {

												error = 0;
											}
										} else if (addOrNot.length() == 3 || addOrNot.length() == 2) {
											if (addOrNot.equals("YES") == true) {

												error = 0;
											} else if (addOrNot.equals("NO") == true) {
												error = 0;
											} else {
												System.out.println("You must enter YES or NO !");
												error = 1;
											}

										} else {
											System.out.println("You must enter YES or NO !");
											error = 1;
										}

									} while (error != 0);
									System.out.printf("\n\n");

								} while (addOrNot.charAt(0) == 'Y' || addOrNot.equals("YES"));//if want to edit more product info
								System.out.println("---------------------------------------");
								System.out.printf("\n\n\n");
								break;

							case 3:
								//display all product
								countProduct = 0;
								System.out.printf("\n\n");
								System.out.println("---------------------------------------------------------------");
								System.out.println("Display Product Details");
								System.out.println("---------------------------------------------------------------");

								for (int i = 0; i < prodlist.size(); i++) {

									countProduct++;
									System.out.println("Product " + (i + 1) + " => ");
									System.out.println("Product Name : " + prodlist.get(i).getProdName());
									System.out.println("Product ID : " + prodlist.get(i).getProdID());
									System.out.println("Product Description : " + prodlist.get(i).getDesc());
									System.out.println("Product Category : " + prodlist.get(i).getCat());
									System.out.println("Product Quantity : " + prodlist.get(i).getQty());
									System.out.format("Product Price : RM %.2f\n", prodlist.get(i).getPrice());
									System.out.printf("\n");
								}
								System.out.println("---------------------------------------------------------------");
								System.out.println(countProduct + " product(s) found");
								System.out.printf("\n\n");
								System.out.printf("\n");
								break;
							case 4:
								//delete product
								do {
									System.out.printf("\n\n");
									System.out
											.println("---------------------------------------------------------------");
									System.out.println("Delete Product");
									System.out
											.println("---------------------------------------------------------------");
									for (int i = 0; i < prodlist.size(); i++) {//shoow all product available

										countProduct++;
										System.out.println("Product " + (i + 1) + " => ");
										System.out.println("Product Name : " + prodlist.get(i).getProdName());
										System.out.println("Product ID : " + prodlist.get(i).getProdID());
										System.out.println("Product Description : " + prodlist.get(i).getDesc());
										System.out.println("Product Category : " + prodlist.get(i).getCat());
										System.out.println("Product Quantity : " + prodlist.get(i).getQty());
										System.out.format("Product Price : RM %.2f\n", prodlist.get(i).getPrice());
										System.out.printf("\n");
									}
									do {
										System.out.println("Enter Product ID you want to delete (E/e to exit): ");
										searchProdID = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(searchProdID)) {
											System.out.println("You must fill in Product ID !");
											error = 1;
											exit = false;
										} else if (searchProdID.length() == 1) {
											error = 0;
											if (searchProdID.charAt(0) == 'E' || searchProdID.charAt(0) == 'e') {
												exit = true;

											} else {
												exit = false;
											}
										}

										else {
											exit = false;
											error = 0;
										}

									} while (error != 0);

									if (exit == true) {//if want to exit
										break;
									}

									for (int i = 0; i < prodlist.size(); i++) {//check if found prod ID in prodlist
										if (searchProdID.equals(prodlist.get(i).getProdID())) {//if found
											foundprodID = true;
											prodIDindex = i;

											break;
										} else {

											foundprodID = false;
										}
									}

									if (foundprodID == true) {//if found prod ID
										System.out.printf("\n\n");
										System.out.println("Product found !");
										System.out.printf("\n");
										System.out.println("Product Details => ");
										System.out.println("Product Name : " + prodlist.get(prodIDindex).getProdName());
										System.out.println("Product ID : " + prodlist.get(prodIDindex).getProdID());
										System.out.println("Product Description : " + prodlist.get(prodIDindex).getDesc());
										System.out.println("Product Category : " + prodlist.get(prodIDindex).getCat());
										System.out.println("Product Quantity : " + prodlist.get(prodIDindex).getQty());
										System.out.format("Product Price : RM %.2f\n",
										prodlist.get(prodIDindex).getPrice());
										do {
											System.out.print(
													"Confirm delete product? (Y/YES | N/NO) (Case insensitive) ");
											confirm = scn.nextLine().toUpperCase();
											if (isNullOrEmpty(confirm)) {
												System.out.println("You must fill in yes or not !");
												error = 1;
											}

											else if (confirm.length() == 1) {
												if (confirm.charAt(0) != 'Y' && confirm.charAt(0) != 'N') {
													System.out.println("You must enter Y or N !");
													error = 1;
												} else {

													error = 0;
												}
											} else if (confirm.length() == 3 || confirm.length() == 2) {
												if (confirm.equals("YES") == true) {

													error = 0;
												} else if (confirm.equals("NO") == true) {
													error = 0;
												} else {
													System.out.println("You must enter YES or NO !");
													error = 1;
												}

											} else {
												System.out.println("You must enter YES or NO !");
												error = 1;
											}
										} while (error != 0);

										if (confirm.charAt(0) == 'Y' || confirm == "YES") {//if confirm want to delete
											prodlist.remove(prodIDindex);
											System.out.println("1 Product Removed Succesfully !");
										} else {
											System.out.println("You did not delete any product !");

										}
									} else {//if not found the prod ID want to delete
										foundprodID = false;
										System.out.printf("\n");
										System.out.println("This product ID does not exist !");

									}
									do {
										System.out.print("Do you want to delete more product? (Y/YES | N/NO) (Case insensitive) ");
										deleteOrNot = scn.nextLine().toUpperCase();
										if (isNullOrEmpty(deleteOrNot)) {
											System.out.println("You must enter yes or no !");
											error = 1;
										} else if (deleteOrNot.length() == 1) {
											if (deleteOrNot.charAt(0) != 'Y' && deleteOrNot.charAt(0) != 'N') {
												System.out.println("You must enter yes or no !");
												error = 1;
											} else {

												error = 0;
											}
										} else if (deleteOrNot.length() == 3 || deleteOrNot.length() == 2) {
											if (deleteOrNot.equals("YES") == true) {

												error = 0;
											} else if (deleteOrNot.equals("NO") == true) {
												error = 0;
											} else {
												System.out.println("You must enter YES or NO !");
												error = 1;
											}

										} else {
											System.out.println("You must enter YES or NO !");
											error = 1;
										}

									} while (error != 0);
								} while (deleteOrNot.charAt(0) == 'Y' || deleteOrNot.equals("YES"));//if dont want delete more product

								System.out.println("---------------------------------------");
								System.out.printf("\n\n\n");
								break;
							case 5:
								System.out.printf("\n\n");
								break;

							default://invalid choice
								System.out.printf("\n");
								System.out.println("Invalid choice !");
								System.out.printf("\n");
								break;
							}
						} while (choice != 5);

						break;
                                        case 5://Delivery Module        
                                             
                                                int Option1;
                                             do{    
                                                Scanner typestring1 = new Scanner (System.in);
                                                Scanner typeint1 = new Scanner (System.in);

                                                System.out.println("No.  \tOrder ID \tTracking No\t Delivery Company \t Customer Name   \tCustomer Contact  \tAddress \t\t\t\t\t\t\t\t\t Delivery Status " );

                                                for (int i = 0; i <= 210; i++){
                                                System.out.print("=");
                                                }
                                                System.out.print("\n");  

                                                for (int i = 0; i < delivery.size(); i++) {
                                                System.out.printf((i+1)+")      %-15s %-16s %-24s %-21s %-23s %-80s %-14s\n",delivery.get(i).getNewCustomerOrderID(),delivery.get(i).getTrackingNumber(),delivery.get(i).getDeliveryCompany(),delivery.get(i).getNewCustomerName(),delivery.get(i).getNewCustomerContactNo(),delivery.get(i).getNewCustomerAddress(),delivery.get(i).getDeliveryStates());
                                                }

                                                for (int i = 0; i <= 210; i++){
                                                System.out.print("=");
                                                }
                                                System.out.print("\n\n");  

                                                System.out.println("\t\t\t\t\t\t _____________________ ");
                                                System.out.println("\t\t\t\t\t\t|                     |");
                                                System.out.println("\t\t\t\t\t\t| Delivery*Management |"); 
                                                System.out.println("\t\t\t\t\t\t|---------------------|");                    
                                                System.out.println("\t\t\t\t\t\t| 1. Update Delivery  |");
                                                System.out.println("\t\t\t\t\t\t| 2. Delete Delivery  |");
                                                System.out.println("\t\t\t\t\t\t| 3. Back             |");
                                                System.out.println("\t\t\t\t\t\t|_____________________|");

                                            do{
                                                System.out.print("\t\t\t\t\t\t Enter your selection : ");
                                                while(!typeint1.hasNextInt())
                                                {
                                                System.out.print("Error!!! Invalid Input! Please try again.........\n");
                                                System.out.print("\n\t\t\t\t\t\t Enter your selection : ");
                                                typeint1.next();

                                                }Option1 = typeint1.nextInt();
                                                }while(Option1 != 3 && Option1 != 2 && Option1 != 1);

                                        switch (Option1){
                                            case 1: 
                                                int Option2 =0;
                                                int Temp = 0;
                                                do {

                                                    System.out.print("\nEnter number do you want to update (No.) : ");

                                                    while (!sc.hasNextInt()){

                                                        System.out.print("Error!!! Invalid Input! Please try again.........");
                                                        System.out.print("\n Enter your selection : ");
                                                        sc.next();

                                                    } Option2 = sc.nextInt();

                                                } while (Option2 <= 0 && Option2 > Temp);

                                                delivery.get(Option2 - 1).updateDelivery();

                                                System.out.print("\n\n\nPress anything to continue.............");
                                                String continuetomenu1 = typestring1.nextLine();
                                                break;
                                            case 2:
                                                System.out.print("\nEnter number do you want to remove (No.) : ");
                                                int Option3 = sc.nextInt();
                                                delivery.remove(Option3 - 1);

                                                System.out.println("Remove Successful !!!!");

                                                System.out.println("\n\n\nPress anything to continue.............");
                                                String continuetomenu2 = typestring1.nextLine();                    
                                                 break;
                                            case 3:
                                                                    
                                                 break;
                                            default:
                                                System.out.println("Error!!! Invalid Input! Please try again........");

                                        }
                                                break;  
                                             }while(Option1 !=3);
                                             break;
                                             
                                        case 6:   
                                             input = new Scanner(System.in);
                                             loginID = login.loginAuthorization(input, staffArr, staff);
                                   
                                             break;
                                             
					case 7://exit program
						System.out.println("Arsigato..Kamsahamida..Thank You..Bye~");
						break;
                                                
					default:
						break;
					}
				}

			} while (problem != 0 || !(checkNum));
		} while (mainChoice != 7);//if staff want to exit the program

	}

	private static boolean isNullOrEmpty(String value) {//check if variable is null
		if (value != null && !value.isEmpty()) {
			return false;
		}
		return true;
	}

	public static void prodMenu() {
		Scanner scn = new Scanner(System.in);
                System.out.print("\n");
		System.out.println("\t\t\t\t\t\t ____________________");
                System.out.println("\t\t\t\t\t\t|                    |");
		System.out.println("\t\t\t\t\t\t|Program:            |");
                System.out.println("\t\t\t\t\t\t|____________________|");
		System.out.println("\t\t\t\t\t\t| 1. Add Product     |");
		System.out.println("\t\t\t\t\t\t| 2. Edit Product    |");
		System.out.println("\t\t\t\t\t\t| 3. Display Product |");
		System.out.println("\t\t\t\t\t\t| 4. Delete Product  |");
		System.out.println("\t\t\t\t\t\t| 5. Back            |");
		System.out.println("\t\t\t\t\t\t|____________________|");
		System.out.print("\t\t\t\t\t\tChoice (1-5) : ");

	}

	public static void categoryMenu() {
                System.out.print("\n");
		System.out.println("\t\t\t\t\t\t __________________________");
                System.out.println("\t\t\t\t\t\t|                          |");
		System.out.println("\t\t\t\t\t\t|Category:                 |");
                System.out.println("\t\t\t\t\t\t|__________________________|");
		System.out.println("\t\t\t\t\t\t| S/s => Sushi             | ");
		System.out.println("\t\t\t\t\t\t| D/d => Drink             | ");
		System.out.println("\t\t\t\t\t\t| N/n => Noodles           | ");
		System.out.println("\t\t\t\t\t\t| R/r => Rice              | ");
		System.out.println("\t\t\t\t\t\t| E/e => Back              | ");
		System.out.println("\t\t\t\t\t\t|__________________________|");
                System.out.print("\t\t\t\t\t\tChoose :");
	}

	public static void paymentTypeSelection() {
                System.out.print("\n");
                System.out.println("\t\t\t\t\t\t_________________________");
                System.out.println("\t\t\t\t\t\t|                        |");
		System.out.println("\t\t\t\t\t\t|Payment Type Selection: |");
                System.out.println("\t\t\t\t\t\t|________________________|");
		System.out.println("\t\t\t\t\t\t| 1. Cash Payment        |");
		System.out.println("\t\t\t\t\t\t| 2. Card Payment        |");
                System.out.println("\t\t\t\t\t\t|________________________|");
		System.out.print("\t\t\t\t\t\tChoose (1-2) : ");
	}

	public static boolean nullArray(ArrayList arrList) {//check if arraylist is null
		if (arrList != null) {
			for (Object a : arrList)
				if (a != null) {
					return false;
				}

		}
		return true;
	}
}
