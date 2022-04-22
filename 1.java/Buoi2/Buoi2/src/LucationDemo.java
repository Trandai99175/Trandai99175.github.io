import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class LucationDemo {
    public static void main(String[] args) {
//        Gias tri hien tai
        LocalDate id= LocalDate.now();
        System.out.println(id);

        System.out.println(" nam hien tai:"+ id.getYear());
//        thay đôi thời gian
    }
}
