class Mypoint extends Object {
    int x;
    int y;

}
//class Circle extends Mypoint {
//    int r;
//}  상속관계

class Circle extends Object{
    Mypoint p = new Mypoint();
    int r;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.p.x = 1;
//        c.p.y = 2;
//        c.r = 3;
//        System.out.println("c.x = "+ c.p.x);
//        System.out.println("c.y = "+ c.p.y) ;
//        System.out.println("c.r = "+ c.r);

        System.out.println(c.toString()); // 객체 c의 주소 반환(ch07.Circle@64c64813)
        Circle c2 = new Circle();
        System.out.println(c2.toString()); //객체 c2의 주소 반환(ch07.Circle@3ecf72fd)
        System.out.println(c2); // println이 참조변수를 호출하면 자동으로 toString()을 호출
    }

}
