package ch06;
class MyMath {
    void printGugudan(int dan) {
         if(!(2<=dan && dan <=9 ))
            return;

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n",dan, i, dan * i);
            
        }
    }
    
    long add(long a, long b) {
        long result;
        return result = a + b;
        // return a + b;
    }
    long subtract(long a, long b) {
        return a - b;
    }
    long multiply(long a, long b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }

    long max(long a, long b) {
        long max = 0;
        if(a > b) {
              max = a;
          }else {
            max = b;
        }
        return max;

        // return a > b ? a : b;
    }

    long min(long a, long b) {
        return a < b ? a : b;
    }
}

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result = mm.max(5, 3);
        long result0 = mm.min(5, 3);
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        mm.printGugudan(6); // 구구단 3단을 출력
        mm.printGugudan(12); // 12단은 출력 X

        System.out.println("max(5, 3) = " + result);
        System.out.println("min(5, 3) = " + result);
        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + (float)result4);
    }
}
