class Time {
    int hour;
    int minute;
    int second;

    public void setHour(int hour) {
//        if (hour < 0 || hour >23 ) return;
        if(isNotValidHour(hour)) return;
        this.hour = hour;
    }

    //    매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
        // 이 메서드는 내부에서만 사용하기 때문에 private으로 설정
        // test할 범위가 private이기 때문에 포함된 클래스만 test해도 됨
    }

    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//    t.hour = 100;
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour());
    }
}
