import lgcns.inspire.still.StaticDemo;

public class StaticApp {

    public static void main(String[] args) {

      // StaticDemo.nonStaticVar = 10 // 컴파일 에러 발생, non-static 변수는 클래스 이름으로 접근할 수 없음

      StaticDemo.staticVar = 10; // 접근 가능
      System.out.println(StaticDemo.staticVar);

      // StaticDemo.CONSTVAR = 200; // 상수는 변경 불가, 컴파일 에러 발생
      // System.out.println(StaticDemo.CONSTVAR);

      StaticDemo app = new StaticDemo();
      app.nonStaticMethod(); // non-static 메서드 호출

      // staticMethod는 클래스 이름으로 직접 호출 가능
      StaticDemo.staticMethod(); // static 메서드 호출
    }
}