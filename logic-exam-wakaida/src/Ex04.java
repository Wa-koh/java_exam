import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("西暦を入力：");
        int year = scanner.nextInt();
        scanner.close();

        if (check(year)) {
            System.out.println(year + "年はうるう年です");
        } else {
            System.out.println(year + "年はうるう年ではありません");
        }
    }

    public static boolean check(int year) {
        boolean result = false;
        if ((year % 4 == 0)) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = true;
                }
            } else {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }
}
