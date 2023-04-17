import java.time.LocalDate;

public class Day {

    private String date = "";

    private LocalDate check = null;

    private int day = 0;

    private int month = 0;
    private int year = 0;
    public String getDate() {
        return date;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getCheck() {
        return check;
    }
    public void setDate(String date) {
        this.date = date;

        String[] checkout = this.date.split("/");

        this.day = Integer.parseInt(checkout[0]);
        this.month = Integer.parseInt(checkout[1]);
        this.year = Integer.parseInt(checkout[2]);

        this.check = LocalDate.of(this.year,this.month,this.day);

    }



}
