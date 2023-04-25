import java.util.Objects;

class Card {
    String kind;
    int number;

    public Card() {
        this("SPADE" , 1);
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Object클래스의 toString()을 오버라이딩
    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }

    // Object클래스의 equals()를 오버라이딩
    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;

        Card c = (Card) obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    // Object클래스의 HashCode()를 오버라이딩(equals()를 오버라이딩하면 필수)
    public int hashCode() {
        return Objects.hash(kind, number);
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));
    }
}
