public class Exam4 {
    public static void main(String[] args) {
        int addAnswer = Calculation.addition(5, 3);
        System.out.println("足し算結果：" + addAnswer);

        int subAnswer = Calculation.subtraction(5, 3);
        System.out.println("引き算結果：" + subAnswer);

        int multiAnswer = Calculation.multiplication(5, 3);
        System.out.println("掛け算結果：" + multiAnswer);

        int divAnsweer = Calculation.division(5, 3);
        System.out.println("割り算結果：" + divAnsweer);

        int remAnswer = Calculation.remainder(5, 3);
        System.out.println("剰余算結果：" + remAnswer);
    }
}
