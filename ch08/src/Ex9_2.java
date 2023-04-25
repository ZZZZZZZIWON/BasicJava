class Person {
    long id; // this.id

    public boolean equals(Object obj) {
//        if(obj instanceof Person)
//            return id == ((Person) obj).id;
//        else
//            return false;
        if (!(obj instanceof Person))
            return false;

        Person p = (Person) obj;
        return this.id == p.id; // 자신의 id와 Person객체로 들어온 obj의 id랑 비교
    }

    Person(long id) {
        this.id = id;
    }
}

public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(9310252410016L);
        Person p2 = new Person(9310252410016L);

        if (p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

    }
}
