package exam1;

public class Exam1 {
    public static void main(String[] args) {
        Car[] car = { new SuperCar(), new EcoCar() };

        car[0].setName("フェラーリ");
        car[1].setName("プリウス");

        for (int i = 0; i < car.length; i++) {
            car[i].putOnGas();
            car[i].run();
        }
    }
}
