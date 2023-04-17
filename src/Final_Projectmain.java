
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

            System.out.println(" Welcome to YEORUEM Hotel ");
            System.out.println("--------------------------------");
            System.out.println(" Would you like to Booking a room?");
            System.out.println(" (1) Yes or (2) No ");
            
            int reserve = tce.tryPaseInt("You selected: ");




            if (reserve == 1) //reserve
            {


                System.out.println("--------------------------------");

                System.out.print(" Enter your date of check-in : ");
                checkIn.setDate(keyboard.nextLine());

                System.out.print(" Enter your date of check-out : ");
                checkOut.setDate(keyboard.nextLine());

                System.out.println("--------------------------------");               
                System.out.print(" How many guests?: ");

                guest.setMember(keyboard.nextInt());

                do {

                    if (guest.getMember() > 0) {


                        System.out.println(" Please select room size");
                        System.out.println(" (1)" + normalRoom.getRoomSize() + "or (2)" + sweetRoom.getRoomSize() + "or (3)" + luxuryRoom.getRoomSize());

                        room = tce.tryPaseInt(" Your choice: ");


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

                            case 3:

                                guest.setGuestRoom(luxuryRoom);
                                System.out.println(" Price 1/day for " + guest.getGuestRoom().getRoomSize()  + " is $" + guest.getGuestRoom().getCost());
                                System.out.println();

                                break;
                                
                            default:

                                System.out.println(" Select 1 2 or 3. Please try again.");
                                System.out.println();

                                break;

                        } //switch(room)


                    } // if (member == 0)


                    else if (guest.getMember() > 0) {

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
                System.out.println(" Total days: " + guest.getBetweenDay());
                System.out.println(" Total customer : " + guest.getMember());
                
                if (room == 1)
                {
                	 System.out.println(" Total price : $ " + guest.getBetweenDay() * 1500);
                }

                else if (room == 2)
                {
                	 System.out.println(" Total price :  $ " + guest.getBetweenDay() * 3000);
                }
                else
                {
                	 System.out.println(" Total price :  $ " + guest.getBetweenDay() * 6000);
                }
            }
                if (room == 1)
                {
                    System.out.println(" Room size : Normal Room");
                }

                else if (room == 2)
                {
                    System.out.println(" Room size : Sweet room");
                }

                else
                {
                    System.out.println(" Room size : Luxury room");
                }

                Namearray(guest.getMember());

             //if

             if (reserve == 2) 
            {
                System.out.println("We're sorry we weren't able to help you.");
            } //Else if

            System.out.println(" --------------------------------");
            
            System.out.println(" Would you like to Booking your room again?" );
            System.out.println(" Enter 1 for Booking Room ");
            System.out.println(" Enter 2 for End");

            a = tce.tryPaseInt("You select:");

        } while (a != 2);

        System.out.println(" Thank you for your Interesting .");

      } //Main


    public static void Namearray(int member1) {

        int[] phNum = new int[2];
        String YN;

        System.out.println(" --------------------------------");
        System.out.print(" Do you want to confirm\nYes or No:\n:");
        YN = String.valueOf(new Scanner(System.in).nextLine());
        String YN2 = YN.toUpperCase();

        switch (YN2) {

            case "YES":

                System.out.print(" Please give your name\n:");
                if (member1 >= 2) {
                    System.out.println(" Please leave some of your phone number");
                    for (int i = 0; i < phNum.length; i++) {
                        System.out.print(" : ");
                        phNum[i] = Integer.parseInt(new Scanner(System.in).nextLine());

                    }

                } 
                

            case "NO" :

                Stack<String>Thank=new Stack<>();
                Thank.push(" Thank you for your attention.");

                System.out.println(""+Thank.pop());
                break;
        }//switchYN2
    }//Namearray

    
    
}//namee
