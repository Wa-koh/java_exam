import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("半角スペース区切りで時・分・秒を入力：");
        String line = scanner.nextLine();
        String[] times = line.split(" ");
        scanner.close();

        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        int second = Integer.parseInt(times[2]);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H時m分s秒");
        LocalTime localTime = LocalTime.of(hour, minute, second);
        LocalTime localTime2 = localTime.plusSeconds(1);

        System.out.println(localTime.format(formatter) + "の 1 秒後は" + localTime2.format(formatter) + "です");
    }
}
