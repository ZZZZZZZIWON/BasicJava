abstract class Player {             // 추상클래스 (미완성 클래스, 미완성 설계도)
    abstract void play(int pos);    // 추상메소드 (미완성 메소드)

    abstract void stop();           // 추상메소드 (선언부만 있고 구현부{}가 없는 메소드)
}
// 추상클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {

    @Override
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다.");
    }
    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player(); 추상 클래스의 객체 생성 불가
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer(); // 다형성
        ap.play(100); // 실제 객체가 가지고 있는 구현된 메소드 호출
        ap.stop();        // 리모콘 타입(Player ap)와는 관계없음
    }
}
