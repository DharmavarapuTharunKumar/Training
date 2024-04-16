/*2. Ticket Pricing:
You are designing a ticket pricing program for a movie theater. The program should prompt the user for 
their age and the type of movie they want to watch (e.g., "regular" or "3D"). Based on the age and 
movie type, the program should calculate and output the ticket price according to the following rules:
Regular Movie:
Age < 18: $8
Age >= 18: $12
3D Movie:
Age < 18: $10
Age >= 18: $15
has context menu*/

import java.util.Scanner;
public class TicketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter the type of movie (regular or 3d): ");
        String movieType = sc.next();
        
        double ticketPrice = 0;
        
        if(movieType.equalsIgnoreCase("regular")) {
            if(age < 18) {
                ticketPrice = 8;
            } else {
                ticketPrice = 12;
            }
        } else if(movieType.equalsIgnoreCase("3d")) {
            if(age < 18) {
                ticketPrice = 10;
            } else {
                ticketPrice = 15;
            }
        } else {
            System.out.println("Invalid movie type entered.");
            return;
        }
        
        System.out.println("Ticket price: $" + ticketPrice);
        
        sc.close();
    }
}
