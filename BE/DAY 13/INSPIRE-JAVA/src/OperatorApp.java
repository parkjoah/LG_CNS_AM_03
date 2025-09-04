import lgcns.inspire.operator.Operator;

public class OperatorApp {
  public static void main(String[] args) {
    // Operator 클래스의 객체 생성
    Operator op = new Operator();

    // Operator 클래스의 메서드 호출
    op.example01(); // 산술연산자 출력
    String returnVal2 = op.example02("A", "B");
    System.out.println(returnVal2); // A	B 출력
  }
}
