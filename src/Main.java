import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

public class Main {
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2009,9,29,15,45,15);
        System.out.println("1. *** " + localDateTime.format(FORMATTER) + " ***");
        System.out.println("2.День недели: " + localDateTime.getDayOfWeek());
        System.out.println("3.День в году: " + localDateTime.getDayOfYear());
        System.out.println("4.Неделя месяца: " + localDateTime.get(WeekFields.ISO.weekOfMonth()));
        System.out.println("5.Месяц: " + localDateTime.getMonth().getValue());
    }
    }
