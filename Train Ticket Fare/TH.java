package javaapplication37;

import java.util.Scanner;
public class TH {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        double total, price = 0;
        double bPrice = 0;
        String ask, blank;
        String origin;
        String destination = "";
        
        do 
        {
            System.out.println("");
        System.out.print("Enter your origin location\n"
                + "1) Bandar Tasik Selatan\n"
                + "2) Putrajaya\n"
                + "3) Salak Tinggi\n"
                + "4) KLIA\n"
                + "5) KLIA2\n");
        origin = keyboard.nextLine();
        
        if (origin.equalsIgnoreCase("Bandar Tasik Selatan"))
        {
            do {
                askDestination();
            destination = keyboard.nextLine();
            
            if (destination.equalsIgnoreCase("KL Sentral")) {
                price = 6.5;
                bPrice = 2.9;
            }
            
            else if (destination.equals("0"))
                chart();
           
            else {
                    System.out.println("Invalid Input");
            }
            
            
            } while (destination.equals("0") || !destination.equalsIgnoreCase("KL sentral"));
        }
        
        if (origin.equalsIgnoreCase("Putrajaya"))
        {
            do {
                askDestination();
            destination = keyboard.nextLine();
            
            if (destination.equalsIgnoreCase("KL Sentral")) {
                price = 14;
                bPrice = 6.3;
            }
            
            else if (destination.equalsIgnoreCase("Bandar Tasik Selatan")) {
                price = 8;
                bPrice = 3.6;
            
            }
            else if (destination.equals("0"))
                chart();
            
            else {
                System.out.println("Invalid Input");
            }
            
            } while (destination.equals("0") || !(destination.equalsIgnoreCase("KL Sentral")) || destination.equalsIgnoreCase("Bandar Tasik Selatan"));
   
        }
        
        if (origin.equalsIgnoreCase("Salak Tinggi"))
        {
            do {
                askDestination();
            destination = keyboard.nextLine();
            if (destination.equalsIgnoreCase("KL Sentral")) {
                price = 18.3;
                bPrice = 8.2;
            }
            else if (destination.equalsIgnoreCase("Bandar Tasik Selatan")) {
                price = 12.4;
                bPrice = 5.6;
            }
            else if (destination.equalsIgnoreCase("Putrajaya")) {
                price = 4.7;
                bPrice = 2.1;
            }
            else if (destination.equals("0"))
                chart();
            else {
                System.out.println("Invalid Input");
            }
            } while (destination.equals("0") || !(destination.equalsIgnoreCase("KL sentral") || destination.equalsIgnoreCase("Bandar Tasik Selatan") || destination.equalsIgnoreCase("Putrajaya")));
        }
        
        if (origin.equalsIgnoreCase("KLIA"))
        {
            do {
                askDestination();
            destination = keyboard.nextLine();
            if (destination.equalsIgnoreCase("KL sentral")) {
                price = 55;
                bPrice = 25;
            }
            else if (destination.equalsIgnoreCase("Bandar Tasik Selatan")) {
                price = 38.4;
                bPrice = 17.3;
            }
            else if (destination.equalsIgnoreCase("Putrajaya")) {
                price = 9.4;
                bPrice = 4.2;
            }
            else if (destination.equalsIgnoreCase("Salak Tinggi")) {
                price = 4.9;
                bPrice = 2.2;
            }
            else if (destination.equals("0"))
                chart();
            else {
                System.out.println("Invalid Input");
            }
            
            } while (destination.equals("0") || !(destination.equalsIgnoreCase("KL sentral") || destination.equalsIgnoreCase("Bandar Tasik Selatan") || destination.equalsIgnoreCase("Putrajaya") || destination.equalsIgnoreCase("Salak Tinggi")));
        }
         
          if (origin.equalsIgnoreCase("KLIA2"))
        {
            do {
                askDestination();
            destination = keyboard.nextLine();
            if (destination.equalsIgnoreCase("KL sentral")) {
                price = 55;
                bPrice = 25;
            }
            else if (destination.equalsIgnoreCase("Bandar Tasik Selatan")) {
                price = 38.4;
                bPrice = 17.3;
            }
            else if (destination.equalsIgnoreCase("Putrajaya")) {
                price = 9.4;
                bPrice = 4.2;
            }
            else if (destination.equalsIgnoreCase("Salak Tinggi")) {
                price = 4.9;
                bPrice = 2.2;
            }
            else if (destination.equalsIgnoreCase("KLIA")) {
                price = 2;
                bPrice = 1;
            }
            else if (destination.equals("0"))
                chart();
            else {
                System.out.println("Invalid Input");
            }
             
            } while (destination.equals("0") || !(destination.equalsIgnoreCase("KL sentral") || destination.equalsIgnoreCase("Bandar Tasik Selatan") || destination.equalsIgnoreCase("Putrajaya") || destination.equalsIgnoreCase("Salak Tinggi") || destination.equalsIgnoreCase("KLIA")));
        }
         
          System.out.println("How many tickets do you want?");
            System.out.println("");
          System.out.print("Adults : ");
          int adultNum = keyboard.nextInt();
          System.out.print("Child (2 - 12 years) : ");
          int childNum = keyboard.nextInt();
          
          total = (price * adultNum) + (bPrice * childNum);
          
        System.out.println("1) One-way Ticket \n2) Round Ticket");
        int way = keyboard.nextInt();
        
        if (way == 1)
            total *= 1;
        else if (way == 2)
            total *= 2;
            System.out.println("");
        System.out.println("You're going to " + destination + " from " + origin + ".");
        System.out.println("Total money is RM" + String.format("%.2f", total));
        
            System.out.print("You want to purchase tickets again? (Yes or No) : ");
            blank = keyboard.nextLine();
            ask = keyboard.nextLine();
        } while (ask.equalsIgnoreCase("yes"));
    }
    
    public static void chart()
    {
        System.out.println("Bandar Tasik Selatan ==> KL Sentral");
        System.out.println("===================================================================");
        System.out.println("Putrajaya ==> KL Sentral \t Bandar Tasik Selatan");
        System.out.println("===================================================================");
        System.out.println("Salak Tinggi ==> KL Sentral \t Bandar Tasik Selatan \t Putrajaya");
        System.out.println("===================================================================");
        System.out.println("KLIA ==> KL Sentral \t Bandar Tasik Selatan \t Putrajaya \t Salak Tinggi");
        System.out.println("===================================================================");
        System.out.println("KLIA2 ==> KL Sentral \t Bandar Tasik Selatan \t Putrajaya \t Salak TInggi \t KLIA");
    }
    
    public static void askDestination()
    {
        System.out.println("");
            System.out.println("Enter your destination location");
            System.out.println("If you want to see the destination list, enter 0");
    }
}