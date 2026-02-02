import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("西暦を入力：");
        int year = scanner.nextInt();
        scanner.close();

        int result = year / 100 + 1;
        if (year % 100 == 0) {
            result -= 1;
        }

        System.out.println(year + "年は" + result + "世紀です");
    }
}
