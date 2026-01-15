public class Exam3 {
    public static void main(String[] args) {
        int item1Price = 200;
        int item2Price = 250;
        final double TAX_RATE = 0.1;
        int subTotal = item1Price * 3 + item2Price * 4;
        int taxAmount = (int) (subTotal * TAX_RATE);
        int total = subTotal + taxAmount;

        System.out.println("==============");
        System.out.println("小計");
        System.out.println(subTotal + "円");
        System.out.println("消費税");
        System.out.println(taxAmount + "円");
        System.out.println("合計金額");
        System.out.println(total + "円");
        System.out.println("==============");
    }
}
