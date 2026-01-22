package exam1;

public class SuperCar extends Car {
    @Override
    public void run() {
        System.out.println("ブオーン!" + super.getName() + "が走ります");
    }
}
