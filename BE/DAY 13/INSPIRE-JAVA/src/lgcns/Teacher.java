package lgcns;

public class Teacher {
  public String name; 
  public double height; 
  public int age; 
  public String mbti;
  public String birthPlace;
  public boolean isMarriage; 


  /* 생성자(Constructor) : 클래스 이름과 동일한 메서드
  => like method
  - 반환타입 x, 메서드의 이름이 클래스이름과 동일
  - 일반메서드처럼 호출 할 수 x, 객체 생성 시 자동으로 호출
  - 인자없는 생성자를 기본생성자, 인자있는 생성자를 스페셜 생성자
  - 여러개의 생성자가 인자의 갯수와 타입을 달리해서 정의도디는 것을 생성자 오버로딩
  - 역할 : 멤버변수를 초기화

   */

  public Teacher(){

  }

   // 생성자 한번에 만들기
   // source action -> generate constructor using fields
   // 매게변수는 지역변수 !! 
  public Teacher(String name, double height, int age, String mbti, String birthPlace, boolean isMarriage) {
    this.name = name;
    this.height = height;
    this.age = age;
    this.mbti = mbti;
    this.birthPlace = birthPlace;
    this.isMarriage = isMarriage;
  }

  
}
