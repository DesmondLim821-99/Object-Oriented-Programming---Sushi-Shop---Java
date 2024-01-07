package Assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {
	menu() {
	}

	public void welcome() {
		System.out.println("\r\n" + "$$\\      $$\\           $$\\                                             \r\n"
				+ "$$ | $\\  $$ |          $$ |                                            \r\n"
				+ "$$ |$$$\\ $$ | $$$$$$\\  $$ | $$$$$$$\\  $$$$$$\\  $$$$$$\\$$$$\\   $$$$$$\\  \r\n"
				+ "$$ $$ $$\\$$ |$$  __$$\\ $$ |$$  _____|$$  __$$\\ $$  _$$  _$$\\ $$  __$$\\ \r\n"
				+ "$$$$  _$$$$ |$$$$$$$$ |$$ |$$ /      $$ /  $$ |$$ / $$ / $$ |$$$$$$$$ |\r\n"
				+ "$$$  / \\$$$ |$$   ____|$$ |$$ |      $$ |  $$ |$$ | $$ | $$ |$$   ____|\r\n"
				+ "$$  /   \\$$ |\\$$$$$$$\\ $$ |\\$$$$$$$\\ \\$$$$$$  |$$ | $$ | $$ |\\$$$$$$$\\ \r\n"
				+ "\\__/     \\__| \\_______|\\__| \\_______| \\______/ \\__| \\__| \\__| \\_______|\r\n"+ "");
               
                System.out.println("\t\t\t\t              ______________          ____________");
                System.out.println("\t\t\t\t            /     ようこそ    \\       |  _________ |");
                System.out.println("\t\t\t\t            \\  Kon'nichiwa  /        | |        | |");
                System.out.println("\t\t\t\t              ==============         | |        | |");
                System.out.println("\t\t\t\t                  | | | |            | |        | |");
                System.out.println("\t\t\t\t                  | | | |            | |        | |");
                System.out.println("\t\t\t\t                  | | | |            | |        | |");
                System.out.println("\t\t\t\t                  | | | |            | |        | |"); 
                System.out.println("\t\t\t\t                  | |_| |            | |________| |"); 
                System.out.println("\t\t\t\t                  |_____|            |____________|");   
          

                System.out.println("\n\t\t\t\t\t\t\t\t           @@@   @   @   @@@   @   @  @  @  @@@@@                                        ");
                System.out.println("\t\t\t\t\t\t\t\t          @   @  @   @  @   @  @   @  @  @    @                                          ");
                System.out.println("\t\t\t\t\t\t\t\t           @@    @   @   @@    @   @  @@@@    @        @@@   @   @ @@@@ @@@@ @   @       ");
                System.out.println("\t\t\t\t\t\t\t\t         @   @   @   @ @   @   @   @  @  @    @       @   @  @   @ @    @    @@  @       ");
                System.out.println("\t\t\t\t\t\t\t\t          @@@     @@@   @@@     @@@   @  @  @@@@@     @   @  @   @ @    @    @@  @       ");
                System.out.println("\t\t\t\t\t\t\t\t                                                      @ + @  @   @ @@@@ @@@@ @ @ @       ");
                System.out.println("\t\t\t\t\t\t\t\t                                                      @  +@  @   @ @    @    @  @@       ");
                System.out.println("\t\t\t\t\t\t\t\t                                                       @@@ +  @@@  @@@@ @@@@ @   @       ");        

	}

	public static void mainMenu() {
                        System.out.print("\n\t\t\t\t\t\t  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                        System.out.print("\t\t\t\t\t\t  |||*                                                      *||||||----------------------------|||\n");
                        System.out.print("\t\t\t\t\t\t  |||     WELCOME!! SELECT YOUR SELECTION BEFORE YOU START   ||||||       Sushi * Queen        |||\n");
                        System.out.print("\t\t\t\t\t\t  |||                                                        ||||||----------------------------|||\n");
                        System.out.print("\t\t\t\t\t\t  |||                 Y.                      _              |||||+------+--------------------+|||\n");
                        System.out.print("\t\t\t\t\t\t  |||                 YiL                   .```.            |||||| NO   |  Selection          |||\n");
                        System.out.print("\t\t\t\t\t\t  |||                  Yii;                .; .;;`.          |||||+------+--------------------+|||\n");
                        System.out.print("\t\t\t\t\t\t  |||       WOW        YY;ii._           .;`.;;;; :          |||||| 1)   | Staff Module        |||\n");
                        System.out.print("\t\t\t\t\t\t  |||  YOUR ARE BACK!  iiYYYYYYiiiii;;;;i` ;;::;;;;          ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||               .;YYYYYYiiiiiiYYYii  .;;.   ;;;          |||||| 2)   | Member Module       |||\n");
                        System.out.print("\t\t\t\t\t\t  |||           .YYYYYYYYYYiiYYYYYYYYYYYYii;`  ;;;;          ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||         .YYYYYYY$$YYiiYY$$$$iiiYYYYYY;.ii;`..          |||||| 3)   | Report Module       |||\n");
                        System.out.print("\t\t\t\t\t\t  |||        :YYY$!.  TYiiYY$$$$$YYYYYYYiiYYYYiYYii.         ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||       Y$MM$:   :YYYYYY$!'``'4YYYYYiiiYYYYiiYY.         |||||| 4)   | Product Module      |||\n");
                        System.out.print("\t\t\t\t\t\t  |||    `. :MM$$b.,dYY$$Yii' :'   :YYYYllYiiYYYiYY          ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  ||| _.._ :`4MM$!YYYYYYYYYii,.__.diii$$YYYYYYYYYYY          |||||| 5)   | Delivery Module     |||\n");
                        System.out.print("\t\t\t\t\t\t  ||| .,._ $b`P` '   '4$$$$$iiiiiiii$$$$YY$$$$$$YiY;         ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||    `,.`$:       :$$$$$$$$$YYYYY$$$$$$$$$YYiiYYL        |||||| 6)   | Sign Out            |||\n");
                        System.out.print("\t\t\t\t\t\t  |||     '`:$$.    .;PPb$`.,.``T$$YY$$$$YYYYYYiiiYYU:       ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||   ' ;$P$;;: ;;;;i$y$'!Y$$$b;$$$Y$YY$$YYYiiiYYiYY       |||||| 7)   | Exit                |||\n");
                        System.out.print("\t\t\t\t\t\t  |||     $Fi$$ .. `':iii.`-';YYYYY$$YY$$$$$YYYiiYiYYY       ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||     :Y$$rb ````  `_..;;i;YYY$YY$$$$$$$YYYYYYYiYY:      ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||      :$$$$$i;;iiiiidYYYYYYYYYY$$$$$$YYYYYYYiiYYYY.     ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||       `$$$$$$$YYYYYYYYYYYYY$$$$$$YYYYYYYYiiiYYYYYY     ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||       .i!$$$$$$YYYYYYYYY$$$$$$YYY$$YYiiiiiiYYYYYYY     ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||      :YYiii$$$$$$$YYYYYYY$$$$YY$$$$YYiiiiiYYYYYYi`     ||||||      |                     |||\n");
                        System.out.print("\t\t\t\t\t\t  |||*------------------------------------------------------*||+------+---------------------+--|||\n");
                        System.out.print("\t\t\t\t\t\t  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                        System.out.print("\n");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t\tChoose either (1-7) : ");

	}

	
	public Integer staffMenu(Scanner input) {
		Integer choice = 0;
		try {
                        System.out.print("\n");
                        System.out.println("\t\t\t\t\t\t ______________________");
                        System.out.println("\t\t\t\t\t\t|                      |");
			System.out.println("\t\t\t\t\t\t|     Staff*Module     |");
                        System.out.println("\t\t\t\t\t\t|----------------------|");
			System.out.println("\t\t\t\t\t\t| 1. Display Staff     |");
			System.out.println("\t\t\t\t\t\t| 2. Search Staff      |");
			System.out.println("\t\t\t\t\t\t| 3. Edit Staff        |");
			System.out.println("\t\t\t\t\t\t| 4. Add Staff         |");
			System.out.println("\t\t\t\t\t\t| 5. Delete Staff      |");
			System.out.println("\t\t\t\t\t\t| 6. Take Order        |");
			System.out.println("\t\t\t\t\t\t| 7. Display Receipt   |");
			System.out.println("\t\t\t\t\t\t| 8. Back              |");
			System.out.println("\t\t\t\t\t\t|______________________|");
			System.out.print("\t\t\t\t\t\tChoose either (1-8) : ");
			choice = input.nextInt();

		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}
	

	public Integer editMenu(Scanner input) {
		Integer choice = 0;
		try {
                        System.out.print("\n");
			System.out.println("\t\t\t\t\t\t ______________________");
                        System.out.println("\t\t\t\t\t\t|                      |");
			System.out.println("\t\t\t\t\t\t| Edit By :            |");
			System.out.println("\t\t\t\t\t\t|----------------------|");
			System.out.println("\t\t\t\t\t\t| 1. Name              |");
			System.out.println("\t\t\t\t\t\t| 2. Password          |");
			System.out.println("\t\t\t\t\t\t| 3. Recovery Question |");
			System.out.println("\t\t\t\t\t\t| 4. Role              |");
			System.out.println("\t\t\t\t\t\t|______________________|");
			System.out.print("\t\t\t\t\t\tChoose either (1-4) :  ");
			choice = input.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}

	public Integer searchMenu(Scanner input) {
		Integer choice = 0;
		try {
                        System.out.print("\n");
			System.out.println("\t\t\t\t\t\t __________________");
                        System.out.println("\t\t\t\t\t\t|                  |");
			System.out.println("\t\t\t\t\t\t| Search By :      |");
			System.out.println("\t\t\t\t\t\t|------------------|");
			System.out.println("\t\t\t\t\t\t| 1. ID            |");
			System.out.println("\t\t\t\t\t\t| 2. Role          |");
			System.out.println("\t\t\t\t\t\t| 3. Name          |");
			System.out.println("\t\t\t\t\t\t|__________________|");
			System.out.print("\t\t\t\t\t\tChoose either (1-3) : ");
			choice = input.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}

	public Integer recoveryQuestionMenu(Scanner sc) {
		Integer choice = 0;
		try {
                        System.out.print("\n");
			System.out.println(" ___________________________________");
                        System.out.println("|                                   |");
			System.out.println("| Recovery Questions:               |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 1. What is your hobby?            |");
			System.out.println("| 2. How many pet do you have?      |");
			System.out.println("| 3. What is your favourite colour? |");
			System.out.println("| 4. How old are you?               |");
			System.out.println("|___________________________________|");
			System.out.print("\t\t\t\t\t\tChoose your recovery question (1-4) : ");
			choice = sc.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}

	public Integer roleMenu(Scanner sc) {
		Integer choice = 0;
		try {   
                        System.out.print("\n");
			System.out.println("\t\t\t\t\t\t _______________");
                        System.out.println("\t\t\t\t\t\t|               |");
			System.out.println("\t\t\t\t\t\t| Role:         |");
			System.out.println("\t\t\t\t\t\t|---------------|");
			System.out.println("\t\t\t\t\t\t| 1. Staff      |");
			System.out.println("\t\t\t\t\t\t| 2. Manager    |");
			System.out.println("\t\t\t\t\t\t| 3. Help Desk  |");
			System.out.println("\t\t\t\t\t\t|_______________|");
			System.out.print("\t\t\t\t\t\tChoose role of the person (1 - 3) : ");
			choice = sc.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}

	public Integer memberMenu() {
		Scanner input = new Scanner(System.in);
		Integer choice = 0;
		try {
                        System.out.print("\n");
                        System.out.println("\t\t\t\t\t\t_________________________");
                        System.out.println("\t\t\t\t\t\t|                       |");
			System.out.println("\t\t\t\t\t\t|    Member*Module      |");
                        System.out.println("\t\t\t\t\t\t|-----------------------|");
			System.out.println("\t\t\t\t\t\t| 1. Display Member     |");
			System.out.println("\t\t\t\t\t\t| 2. Search Member      |");
			System.out.println("\t\t\t\t\t\t| 3. Update Member      |");
			System.out.println("\t\t\t\t\t\t| 4. Add Member         |");
			System.out.println("\t\t\t\t\t\t| 5. Delete Member      |");
			System.out.println("\t\t\t\t\t\t| 6. Back               |");
			System.out.println("\t\t\t\t\t\t|_______________________|");
			System.out.print("\t\t\t\t\t\tChoose either (1-6) : ");
			choice = input.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;

	}

	public Integer searchMenu() {
		Scanner input = new Scanner(System.in);
		Integer choice = 0;
		try {
                        System.out.print("\n");
			System.out.println("\t\t\t\t\t\t __________________");
                        System.out.println("\t\t\t\t\t\t|                  |");
			System.out.println("\t\t\t\t\t\t| Search By :      |");
			System.out.println("\t\t\t\t\t\t|------------------|");
			System.out.println("\t\t\t\t\t\t| 1. ID            |");
			System.out.println("\t\t\t\t\t\t| 2. Name          |");
			System.out.println("\t\t\t\t\t\t| 3. Back          |");
			System.out.println("\t\t\t\t\t\t|__________________|");
			System.out.print("\t\t\t\t\t\tChoose either 1 - 3 : ");
			choice = input.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}

	public Integer updateMenu() {
		Scanner input = new Scanner(System.in);
		Integer choice = 0;
		try {
                        System.out.print("\n");
			System.out.println("\t\t\t\t\t\t _______________________");
                        System.out.println("\t\t\t\t\t\t|                       |");
			System.out.println("\t\t\t\t\t\t| Update By :           |");
			System.out.println("\t\t\t\t\t\t|-----------------------|");
			System.out.println("\t\t\t\t\t\t| 1. Name               |");
			System.out.println("\t\t\t\t\t\t| 2. Phone              |");
			System.out.println("\t\t\t\t\t\t| 3. Email              |");
			System.out.println("\t\t\t\t\t\t| 4. Time Order         |");
			System.out.println("\t\t\t\t\t\t| 5. Point              |");
			System.out.println("\t\t\t\t\t\t|_______________________|");
			System.out.print("\t\t\t\t\t\tChoose either (1-5) : ");
			choice = input.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Enter number(s) only. Alphabets are not allowed.");
		}
		return choice;
	}
	
	public static void reportMenu() {
                 System.out.print("\n");
                 System.out.println("\t\t\t\t\t\t ____________________________");
                 System.out.println("\t\t\t\t\t\t|                           |");
		 System.out.println("\t\t\t\t\t\t|        Report*Menu        |");
		 System.out.println("\t\t\t\t\t\t|---------------------------|");
		 System.out.println("\t\t\t\t\t\t| 1. Daily Report           |");
		 System.out.println("\t\t\t\t\t\t| 2. 2021 Monthly Report    |");
                 System.out.println("\t\t\t\t\t\t| 3. Best Selling Report    |");
		 System.out.println("\t\t\t\t\t\t| 4. Back                   |");
                 System.out.println("\t\t\t\t\t\t|___________________________|");
		 System.out.print("\t\t\t\t\t\tChoose(1-4) : ");
	 }

	  public static void dailyMenu() {
                  System.out.print("\n");
		  System.out.println("\t\t\t\t\t\t ____________________________");
                  System.out.println("\t\t\t\t\t\t|                            |");
                  System.out.println("\t\t\t\t\t\t|        Daily Report        |");
                  System.out.println("\t\t\t\t\t\t|----------------------------|");
		  System.out.println("\t\t\t\t\t\t| 1. Display Report          |");
		  System.out.println("\t\t\t\t\t\t| 2. Back                    |");
		  System.out.println("\t\t\t\t\t\t|____________________________|");
		  System.out.print("\t\t\t\t\t\tChoose either (1-2) : ");
	  }
	  
	  public static void monthlyMenu() {
                  System.out.print("\n");
		  System.out.println("\t\t\t\t\t\t ____________________________");
                  System.out.println("\t\t\t\t\t\t|                            |");
                  System.out.println("\t\t\t\t\t\t|     2021 Monthly Report    |");
                  System.out.println("\t\t\t\t\t\t|----------------------------|");
		  System.out.println("\t\t\t\t\t\t| 1. Display Report          |");
	          System.out.println("\t\t\t\t\t\t| 2. Search Monthly Report   |");
		  System.out.println("\t\t\t\t\t\t| 3. Back                    |");
		  System.out.println("\t\t\t\t\t\t|____________________________|");
		  System.out.print("\t\t\t\t\t\tChoose either (1-3) : ");
	  }
	  
	  public static void bestSellingMenu() {
                  System.out.print("\n");
		  System.out.println("\t\t\t\t\t\t ____________________________");
                  System.out.println("\t\t\t\t\t\t|                            |");
	          System.out.println("\t\t\t\t\t\t|     Best Selling Report    |");
                  System.out.println("\t\t\t\t\t\t|----------------------------|");
		  System.out.println("\t\t\t\t\t\t| 1. Display Report          |");
		  System.out.println("\t\t\t\t\t\t| 2. Back                    |");
		  System.out.println("\t\t\t\t\t\t|____________________________|");
		  System.out.print("\t\t\t\t\t\tChoose either (1-2) : ");
	  }
}
