package classroom.class_01_06;
import java.time.LocalDate;
import java.util.Date;

public class DateApi {
    public static void main(String[] args) {
        Date date = new Date();
        Date date_1 = new Date();
        System.out.println(date);
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
    }
}
