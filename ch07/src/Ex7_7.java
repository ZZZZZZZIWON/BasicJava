class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = (Car) fe;
//     car.water;
        fe2 = (FireEngine) car;
        fe2.water();

    }
}
