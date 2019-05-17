import java.util.Scanner;

public class Q1_r{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);

		double a; /* a = age */
		double f; /* f = fares */
		int o; /* o = origin */
		int d; /* d = destination */
		char c; /* c = continue */
		double q; /* q = quantity of tickets*/
		double price; /* p = price */
		price = 0;
		double t; /* total */


		System.out.println("Please select between Adult or Children ticket.");
		System.out.println("For Adult Ticket, enter 1,");
		System.out.println("For Children Ticket, enter 2.");
		System.out.println("--------------------------");
		a = in.nextInt();

		System.out.println("--------------------------");
		System.out.println("Please select the amount of tickets to purchase.");
		System.out.println("--------------------------");
		q = in.nextInt();

		System.out.println("--------------------------");
		System.out.println("Please select your origin.");
		System.out.println("For KL Sentral, enter 1."); 
		System.out.println("For Bandar Tasik Selatan, enter 2."); 
		System.out.println("For Putrajaya & Cyberjaya, enter 3.");
		System.out.println("For Salak Tinggi, enter 4."); 
		System.out.println("For KLIA, enter 5.");
		System.out.println("--------------------------");
		o = in.nextInt();


		System.out.println("--------------------------");
		System.out.println("Please select your destination.");
		System.out.println("For KL Sentral, enter 1."); 
		System.out.println("For Bandar Tasik Selatan, enter 2."); 
		System.out.println("For Putrajaya & Cyberjaya, enter 3.");
		System.out.println("For Salak Tinggi, enter 4."); 
		System.out.println("For KLIA, enter 5.");
		System.out.println("For KLIA2, enter 6.");
		System.out.println("--------------------------");
		d = in.nextInt();

		System.out.println("--------------------------");
		System.out.println("This is your ticket information.");
		System.out.println("--------------------------");

		/*
		Origin 1
		*/

		if (o==1 && d==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Bandar Tasik Selatan");
		}

		else if (o==1 && d==3){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Putrajaya & Cyberjaya.");
		}

		else if (o==1 && d==4){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Salak Tinggi");
		}

		else if (o==1 && d==5){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA.");
		}

		else if (o==1 && d==6){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA2.");
		}

		/* 
		Origin 2 
		*/
		else if (o==2 && d==3) {
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is Putrajaya & Cyberjaya.");
		}

		else if (o==2 && d==4){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is Salak Tinggi");
		}

		else if (o==2 && d==5){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is KLIA.");
		}

		else if (o==2 && d==6){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is KLIA2.");
		}

		/* 
		Origin 3
		*/

		else if (o==3 && d==4){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is Salak Tinggi.");
		}

		else if (o==3 && d==5){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is KLIA");
		}

		else if (o==3 && d==6){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is KLIA2");
		}


		/* 
		Origin 4
		*/

		else if (o==4 && d == 5){
			System.out.println("Your origin is Salak Tinggi.");
			System.out.println("Your destination is KLIA");
		}

		else if (o==4 && d==6){
			System.out.println("Your origin is Salak Tinggi.");
			System.out.println("Your destination is KLIA2");
		}

		/*
		Origin 5
		*/

		else if (o==5 && d == 6){
			System.out.println("Your origin is KLIA.");
			System.out.println("Your destination is KLIA2");
		}

		else {
			System.out.println("Please try again.");
			System.exit(0);
		}

		/*
		Price if-else statement
		*/

		if (o==1 && d==2 && a==1){
			price = 6.50;
		}

		else {
			System.out.println("Please try again.");
			System.exit(0);
		}

		/*
		Price calculations
		*/

		t = price * q;
		System.out.println("--------------------------");
		System.out.println("Total payable amount is RM" +t);
		System.out.println("--------------------------");
	}
}