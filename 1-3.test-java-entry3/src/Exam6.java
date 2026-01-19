public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(2, 3, '+'));
        System.out.println(calc(8, 2, '-'));
        System.out.println(calc(5, 4, '*'));
        System.out.println(calc(7, 2, '/'));
        System.out.println(calc(3, 8, '@'));
    }

    static int calc(int num1, int num2, char cal) {
        int calcResult = 0;
        if (cal == '+') {
            calcResult = num1 + num2;
        } else if (cal == '-') {
            calcResult = num1 - num2;
        } else if (cal == '*') {
            calcResult = num1 * num2;
        } else if (cal == '/') {
            calcResult = num1 / num2;
        } else {
            return -1;
        }
        return calcResult;
    }
}
