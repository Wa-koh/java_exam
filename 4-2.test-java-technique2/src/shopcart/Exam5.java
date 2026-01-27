package shopcart;

public class Exam5 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item();
        item1.setName("アナと雪の女王");
        item1.setPrice(3000);
        shoppingCart.add(item1);

        Item item2 = new Item();
        item2.setName("美女と野獣");
        item2.setPrice(2000);
        shoppingCart.add(item2);

        Item item3 = new Item();
        item3.setName("モアナと伝説の海");
        item3.setPrice(8000);
        shoppingCart.add(item3);

        System.out.println("合計値：" + shoppingCart.getTotalPrice() + "円");
        System.out.println("平均値：" + shoppingCart.getAveragePrice() + "円");
    }
}
