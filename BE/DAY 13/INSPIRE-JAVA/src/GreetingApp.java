public class GreetingApp {

    /*
    변수 선언 문법
    접근지정자(public, private) 타입 변수명 ;
    public int age;

    변수의 타입(자료형)
    - 기본타입 : 값을 담는 그릇
      - 숫자 
        - 정수 : byte. short. int. long
        - 실수 : float, double
      - 문자 : char
      - 문자열 : String
      - 논리 : boolean(true|false)
    - 참조타입: 생성된 인스턴스의 주소값을 담는 그릇
      - 기본타입이 아닌 모든 변수타입

    메서드(method) : 행위를 의미(프로그램의 흐름제어 또는 반복을 이용해서 로직처리)

    접근지정자 반환타입(기본|참조|void:반환타입x) 메서드명([매개변수]){}
    public void test(){}
    puvlic 기본타입|참조타입 test(){ 
      return ;          ----------------> 리턴 필요
    }

    함수는 독립시행잉 가능함 (메서드는 불가능. 메서드는 인스턴스 소유. 객체생성 이후에 호출 가능..)
     */

  public static void main(String[] args) {
    // 지역변수 - 해당 블록 내에서 사용...
    String msg = "섭섭이와 함께하는 즐거운 자바..";
    System.out.println(msg); //sysout 단축키

  }    
}

