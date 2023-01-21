import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDates {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = new Date(2022, 11, 15);
        Date date2 = new Date(2022, 12, 15);

        int comparison = date1.compareTo(date2);
        if (comparison < 0) {
            System.out.println(dateFormat.format(date1) + " is before " + dateFormat.format(date2));
        } else if (comparison > 0) {
            System.out.println(dateFormat.format(date1) + " is after " + dateFormat.format(date2));
        } else {
            System.out.println(dateFormat.format(date1) + " is the same as " + dateFormat.format(date2));
        }
    }
}
