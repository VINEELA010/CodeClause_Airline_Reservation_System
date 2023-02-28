import java.util.Scanner;

public class AirlineReservationSystem 
{
    private static boolean[] seats = new boolean[25];

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        while (true) 
        {
            
            System.out.println("1. Reserve a seat");
            System.out.println("2. View all seats");
            System.out.println("3. Exit");
            int choice = obj.nextInt();
            if (choice == 1) 
            {
                reserve_Seat();
            }
            else if (choice == 2) 
            {
                view_Seats();
            }
            else if (choice == 3) 
            {
                System.out.println("Thank you Visit Again");
                break;
            }
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        obj.close();
    }

    private static void reserve_Seat() 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter seat number: ");
        int seatNum = obj.nextInt();
        if (seats[seatNum - 1] == false) 
        {
            seats[seatNum - 1] = true;
            System.out.println("Seat reserved. Thank you.");
        }
        else 
        {
            System.out.println("Sorry, this seat is already reserved.");
        }
    }

    private static void view_Seats() 
    {
        for (int i = 0; i < seats.length; i++)
        {
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) 
            {
                System.out.println("Reserved");
            }
            else
            {
                System.out.println("Available");
            }
         }
    }
}