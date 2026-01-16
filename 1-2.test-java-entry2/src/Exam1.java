public class Exam1 {
    public static void main(String[] args) {
        int totalScore = 48;

        if (totalScore >= 100) {
            System.out.println("満点です");
        } else if (totalScore >= 80) {
            System.out.println("合格です");
        } else {
            System.out.println("追試です");
        }
    }
}
