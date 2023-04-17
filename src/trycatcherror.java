import java.util.Scanner;

public class trycatcherror {


    Scanner keyboard = new Scanner(System.in);


    public int tryPaseInt(String inPutMessage) {

        int selection = -1;
        boolean again = true;


        while(again)
        {

            try
            {

                System.out.print(inPutMessage);
                selection = Integer.parseInt(keyboard.nextLine());

                again = false;

            }

            catch (NumberFormatException e)
            {
                System.out.println("It's not number");

            }
            

        }

        return selection;
    }


}
