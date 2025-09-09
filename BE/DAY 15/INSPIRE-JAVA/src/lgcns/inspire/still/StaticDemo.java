package lgcns.inspire.still;

public class StaticDemo {
  /*
   * static keyword (변수, 메서드, 내부클래스)
   * - 
   */
  public int nonStaticVar;
  public static int staticVar;

  public static final int CONSTVAR = 100;

  public void nonStaticMethod() {
    System.out.println("Non-static method called");
    nonStaticVar =10;
    staticVar = 10; 
    int sum= nonStaticVar + staticVar;
    System.out.println("Sum: " + sum);
  }
  public static void staticMethod() {
    System.out.println("Static method ");
    // onStaticVar =10; // 컴파일 에러 발생, 클래스 소유는 인스턴스 소유에 접근 불가 
    staticVar = 10; 
    // int sum= nonStaticVar + staticVar;
    // System.out.println("Sum: " + sum);
  }
}
