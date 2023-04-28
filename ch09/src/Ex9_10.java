public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100; //int를 String으로 변환
//        String strVal = String.valueOf(iVal); // int를 String으로 변환
        String strVal = iVal +"";

        double dVal = 200.0;
        String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2); // 문자열을 숫자로 바꾸는 방법

        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "+") + sum); // 구분자 없이 문자열을 하나로 묶음
        // join 메소드를 사용하면 구분자는 ""로 주고 문자열들을 comma로 나열
        System.out.println(strVal + "+" + strVal2 + "=" + sum2); // 성능이 저하(객체를 계속 생성)
    }
}
