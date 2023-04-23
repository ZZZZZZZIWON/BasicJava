class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
        }

        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");

    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

    }
}
