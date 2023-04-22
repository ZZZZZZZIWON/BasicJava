class Point1 {
    int x;
    int y;
//    String getLocation() {
//        return "x: " + x + "y: " + y;
//
//    }

    // Object 클래스의 toString()을 오버라이딩


    @Override
    public String toString() {
        return "x:" + x + " y:" + y;
    }
}


class MyPoint3D extends Point1 {
    int z;

    public MyPoint3D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x:" + x + " y:" + y + " z:" + z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
//        MyPoint3D p = new MyPoint3D();
//        p.x = 3;
//        p.y = 5;
//        p.z = 7;
//        System.out.println(p.getLocation());

//        System.out.println("p.x="+p.x);
//        System.out.println("p.y="+p.y);

        MyPoint3D p = new MyPoint3D(1,2);
        System.out.println(p);
    }
}
