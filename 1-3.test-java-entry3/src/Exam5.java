public class Exam5 {
    public static void main(String[] args) {
        int addAnswer = addition(5, 3);
        System.out.println("足し算結果：" + addAnswer);

        int subAnswer = subtraction(5, 3);
        System.out.println("引き算結果：" + subAnswer);

        int multiAnswer = multiplication(5, 3);
        System.out.println("掛け算結果：" + multiAnswer);

        int divAnswer = division(5, 3);
        System.out.println("割り算結果：" + divAnswer);

        int remAnswer = remainder(5, 3);
        System.out.println("剰余算結果：" + remAnswer);
    }

    static int addition(int num1, int num2) {
        int addResult = num1 + num2;
        return addResult;
    }

    static int subtraction(int num1, int num2) {
        int subResult = num1 - num2;
        return subResult;
    }

    static int multiplication(int num1, int num2) {
        int multiResult = num1 * num2;
        return multiResult;
    }

    static int division(int num1, int num2) {
        int divResult = num1 / num2;
        return divResult;
    }

    static int remainder(int num1, int num2) {
        int remResult = num1 % num2;
        return remResult;
    }
}
