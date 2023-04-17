
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Scanner;
import java.text.DateFormatSymbols;



public class Final_Projectmain {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        trycatcherror tce = new trycatcherror();
     
        int a = 0;
        int room = 0;


        do {

            Day checkIn = new Day();
            Day checkOut = new Day();

            NormalRoom normalRoom = new NormalRoom();
            SweetRoom   sweetRoom = new SweetRoom();
            LuxuryRoom  luxuryRoom = new LuxuryRoom();

            Guest guest = new Guest();

            guest.setCheckIn(checkIn);
            guest.setCheckOut(checkOut);

            System.out.println(" Welcome to SE Hotel Reservation");
            System.out.println("--------------------------------");
            System.out.println(" Would you like to reserve your room?");
            System.out.println(" 1.Yes or 2.No ");
            System.out.println(" Please write only number!");

            int reserve = tce.tryPaseInt("You select:");




            if (reserve == 1) //reserve
            {


                System.out.println("--------------------------------");

                System.out.print(" Enter your date of check-in : ");
                checkIn.setDate(keyboard.nextLine());

                System.out.print(" Enter your date of check-out : ");
                checkOut.setDate(keyboard.nextLine());

                System.out.println("--------------------------------");               
                System.out.print(" How many members?: ");

                guest.setMember(keyboard.nextInt());

                do {

                    if (guest.getMember() <= 5) {


                        System.out.println(" Please select room size");
                        System.out.println(" 1." + normalRoom.getRoomSize() + "or 2." + sweetRoom.getRoomSize());

                        room = tce.tryPaseInt(" You Choose :");


                        switch (room) {
                        
                            case 1:

                                guest.setGuestRoom(normalRoom);

                                System.out.println(" Price 1/day for" + guest.getGuestRoom().getRoomSize() + "is $" + guest.getGuestRoom().getCost());
                                System.out.println();

                                break;

                            case 2:

                                guest.setGuestRoom(sweetRoom);
                                System.out.println(" Price 1/day for " + guest.getGuestRoom().getRoomSize()  + " is $" + guest.getGuestRoom().getCost());
                                System.out.println();

                                break;

                            default:

                                System.out.println(" Select 1 or 2 Please try again");
                                System.out.println();

                                break;

                        } //switch(room)


                    } // if (member <= 5)


                    else if (guest.getMember() >= 5 && guest.getMember() <= 10) {

                        guest.setGuestRoom(sweetRoom);

                        System.out.println(" Your room  is "+ guest.getGuestRoom().getRoomSize()+" room");

                        System.out.println(" Price 1/day for " + guest.getGuestRoom().getRoomSize()  + " is $" + guest.getGuestRoom().getCost());

                    } //else if(member >= 5 && member <= 10)

                    else 
                    {
                        System.out.println(" *Over limit*");
                    } //else
                    
                } while (room >= 3);


                System.out.println(" --------------------------------");
                
                System.out.println(" Your Reservation ");
                System.out.println(" Check - in :" + guest.getCheckIn().getDate());
                System.out.println(" Check - out :" + guest.getCheckOut().getDate());
                System.out.println(" Total day: " + guest.getBetweenDay());
                System.out.println(" Total member :" + guest.getMember());
                
                if (room == 1)
                {
                	 System.out.println(" Total price : $ " + guest.getBetweenDay() * 15000);
                }

                else
                {
                	 System.out.println(" Total price :  $ " + guest.getBetweenDay() * 25000);
                }

                if (room == 1)
                {
                    System.out.println(" Room size : Small room");
                }

                else
                {
                    System.out.println(" Room size : Large room");
                }

                Namearray(guest.getMember());

            } //if

            else if (reserve == 2) 
            {
                System.out.println(" Thank you for your  attention. ");
            } //Else if

            System.out.println(" --------------------------------");
            
            System.out.println(" Would you like to reserve your room again?" );
            System.out.println(" Enter 1 for Reservation");
            System.out.println(" Enter 2 for End");

            a = tce.tryPaseInt("You select:");

        } while (a != 2);

        System.out.println(" Thank you for your reservation.");

      } //Main


    public static void Namearray(int member1) {

        int[] phNum = new int[2];
        String YN, Name;

        System.out.println(" --------------------------------");
        System.out.print(" Do you want to confirm\nYes or No:\n:");
        YN = String.valueOf(new Scanner(System.in).nextLine());
        String YN2 = YN.toUpperCase();

        switch (YN2) {

            case "YES":

                System.out.print(" Please give your name\n:");
                Name = String.valueOf(new Scanner(System.in).nextLine());

                if (member1 >= 2) {
                    System.out.println(" Please leave some of your phone number");
                    for (int i = 0; i < phNum.length; i++) {
                        System.out.print(" : ");
                        phNum[i] = Integer.parseInt(new Scanner(System.in).nextLine());

                    }

                } 
                else 
                {
                    System.out.println(" Please leave your phone number");
                    for (int i = 1; i < phNum.length; i++)
                    {
                        System.out.println(" : ");
                        phNum[i] = Integer.parseInt(new Scanner(System.in).nextLine());
                    }
                }
                break;

            case "NO" :

                Stack<String>Thank=new Stack<>();
                Thank.push(" Thank you for your attention.");

                System.out.println(""+Thank.pop());
                break;
        }//switchYN2
    }//Namearray

    
    
}//namee
