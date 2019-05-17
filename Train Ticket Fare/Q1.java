import java.util.Scanner;

public class Q1{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);

		int a; /* a = age */
		double f; /* f = fares */
		int o; /* o = origin */
		int d; /* d = destination */
		char c; /* c = continue */
		int q; /* q = quantity of tickets*/
		int p; /* p = price */
		int t; /* total */


		System.out.println("Please select between Adult or Children ticket.");
		System.out.println("For Adult Ticket, enter 1,");
		System.out.println("For Children Ticket, enter 2.");
		System.out.println("--------------------------");
		a = in.nextInt();

		System.out.println("--------------------------");
		System.out.println("Please select the amount of tickets to purchase.");
		System.out.println("--------------------------");
		p = in.nextInt();

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

		if (o==1 && d==1){
			System.out.println("You cannot select the same origin and destination.");
		}

		else if (o==1 && d==2 && a==1){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Bandar Tasik Selatan");
			System.out.println("Your ticket price is RM6.50");
		}

		else if (o==1 && d==3 && a==1){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Putrajaya & Cyberjaya.");
			System.out.println("Your ticket price is RM14.00");
		}

		else if (o==1 && d==4 && a==1){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Salak Tinggi");
			System.out.println("Your ticket price is RM18.30");
		}

		else if (o==1 && d==5 && a==1){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA.");
			System.out.println("Your ticket price is RM55.00");
		}

		else if (o==1 && d==6 && a==1){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA2.");
			System.out.println("Your ticket price is RM55.00");
		}

		else if (o==1 && d==2 && a==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Bandar Tasik Selatan");
			System.out.println("Your ticket price is RM2.90");
		}

		else if (o==1 && d==3 && a==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Putrajaya & Cyberjaya.");
			System.out.println("Your ticket price is RM6.30");
		}

		else if (o==1 && d==4 && a==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is Salak Tinggi");
			System.out.println("Your ticket price is RM8.20");
		}

		else if (o==1 && d==5 && a==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA.");
			System.out.println("Your ticket price is RM25.00");
		}

		else if (o==1 && d==6 && a==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA2.");
			System.out.println("Your ticket price is RM25.00");
		}

		else if (o==2 && d==2){
			System.out.println("You cannot select the same origin and destination.");
		}

		else if (o==2 && d==1){
			System.out.println("This line does not go to KL Sentral");
		}
		
		else if (o==2 && d==3 && a==1) {
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is Putrajaya & Cyberjaya.");
			System.out.println("Your ticket price is RM8.00");
		}

		else if (o==2 && d==4 && a==1){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is Salak Tinggi");
			System.out.println("Your ticket price is RM12.40");
		}

		else if (o==2 && d==5 && a==1){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is KLIA.");
			System.out.println("Your ticket price is RM38.40");
		}

		else if (o==2 && d==6 && a==1){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is KLIA2.");
			System.out.println("Your ticket price is RM38.40");
		}

		else if (o==2 && d==1 && a==2){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is KL Sentral");
			System.out.println("Your ticket price is RM2.90");
		}

		else if (o==2 && d==3 && a==2){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is Putrajaya & Cyberjaya.");
			System.out.println("Your ticket price is RM3.60");
		}

		else if (o==2 && d==4 && a==2){
			System.out.println("Your origin is Bandar Tasik Selatan.");
			System.out.println("Your destination is Salak Tinggi");
			System.out.println("Your ticket price is RM5.60");
		}

		else if (o==2 && d==5 && a==2){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA.");
			System.out.println("Your ticket price is RM17.30");
		}

		else if (o==2 && d==6 && a==1){
			System.out.println("Your origin is KL Sentral.");
			System.out.println("Your destination is KLIA2.");
			System.out.println("Your ticket price is RM17.30");
		}

		else if (o==3 && d==3){
			System.out.println("You cannot select the same origin and destination.");
			System.exit(0);
		}

		else if (o==3 && d==1){
			System.out.println("This line does not go to KL Sentral");
		}


		else if (o==3 && d==2){
			System.out.println("This line does not go to Bandar Tasik Selatan.");
		}


		else if (o==3 && d==4 && a==1){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is Salak Tinggi.");
			System.out.println("Your ticket price is RM4.70");
		}

		else if (o==3 && d==4 && a==2){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is Salak Tinggi");
			System.out.println("Your ticket price is RM2.10");
		}


		else if (o==3 && d==5 && a==1){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is KLIA");
			System.out.println("Your ticket price is RM9.40");
		}


		else if (o==3 && d==5 && a==2){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is KLIA");
			System.out.println("Your ticket price is RM4.20");
		}


		else if (o==3 && d==6 && a==1){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is KLIA2");
			System.out.println("Your ticket price is RM9.40");
		}


		else if (o==3 && d==6 && a==2){
			System.out.println("Your origin is Putrajaya & Cyberjaya.");
			System.out.println("Your destination is KLIA2");
			System.out.println("Your ticket price is RM4.20");
		}


		else if (o==4 && d==4){
			System.out.println("You cannot select the same origin and destination.");
			System.exit(0);
		}

		else if (o==4 && d==1){
			System.out.println("This line does not go to KL Sentral");
		}


		else if (o==4 && d==2){
			System.out.println("This line does not go to Bandar Tasik Selatan.");
		}

		else if (o==4 && d==3){
			System.out.println("This line does not go to Putrajaya & Cyberjaya.");
		}

		else if (o==4 && d == 5 && a==1){
			System.out.println("Your origin is Salak Tinggi.");
			System.out.println("Your destination is KLIA");
			System.out.println("Your ticket price is RM4.90");
		}

		else if (o==4 && d==5 && a==2){
			System.out.println("Your origin is Salak Tinggi.");
			System.out.println("Your destination is KLIA");
			System.out.println("Your ticket price is RM2.90");
		}


		else if (o==4 && d == 6 && a==1){
			System.out.println("Your origin is Salak Tinggi.");
			System.out.println("Your destination is KLIA2");
			System.out.println("Your ticket price is RM4.90");
		}

		else if (o==4 && d==6 && a==2){
			System.out.println("Your origin is Salak Tinggi.");
			System.out.println("Your destination is KLIA2");
			System.out.println("Your ticket price is RM2.90");
		}

		else if (o==5 && d==5){
			System.out.println("You cannot select the same origin and destination.");
			System.exit(0);
		}

		else if (o==5 && d==1){
			System.out.println("This line does not go to KL Sentral");
		}


		else if (o==5 && d==2){
			System.out.println("This line does not go to Bandar Tasik Selatan.");
		}

		else if (o==5 && d==3){
			System.out.println("This line does not go to Putrajaya & Cyberjaya.");
		}

		else if (o==5 && d ==4){
			System.out.println("This line does not go to Salak Tinggi.");
		}

		else if (o==5 && d == 6 && a==1){
			System.out.println("Your origin is KLIA.");
			System.out.println("Your destination is KLIA2");
			System.out.println("Your ticket price is RM2.00");
		}

		else if (o==5 && d==6 && a==2){
			System.out.println("Your origin is KLIA."); 
			System.out.println("Your destination is KLIA2");
			System.out.println("Your ticket price is RM1.00");
		}

		else {
			System.out.println("Please try again.");
		}
	}
}