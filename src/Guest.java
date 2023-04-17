import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Guest {

    private int member = 0 ;
    private String number = "";

    private long betweenDay = 0;

        public long getBetweenDay() {

            long betweenDay = ChronoUnit.DAYS.between(checkIn.getCheck(), checkOut.getCheck());

            return betweenDay;

        }



    public Room getGuestRoom() {
        return guestRoom;
    }

    public void setGuestRoom(Room guestRoom) {
        this.guestRoom = guestRoom;
    }

    private Room guestRoom = null;

    private Day checkIn = null;
    private Day checkOut = null;

    public Day getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Day checkIn) {
        this.checkIn = checkIn;
    }

    public Day getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Day checkOut) {
        this.checkOut = checkOut;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



}
