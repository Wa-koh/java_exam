import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(1543, 2, 10, 5, 12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        System.out.println("徳川家康の誕生日は" + localDateTime.format(formatter) + "です");

        localDateTime = localDateTime.plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .plusMinutes(5);

        System.out.println("1年2ヶ月3日4時間5分後は" + localDateTime.format(formatter) + "です");
    }
}
