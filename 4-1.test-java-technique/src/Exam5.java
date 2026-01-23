import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2001, 4, 3);

        int year = birthDate.getYear();
        int month = birthDate.getMonthValue();
        int dayOfMonth = birthDate.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + dayOfMonth + "日です");
    }
}
