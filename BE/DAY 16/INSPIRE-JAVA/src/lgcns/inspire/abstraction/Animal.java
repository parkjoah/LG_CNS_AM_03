package lgcns.inspire.abstraction;

public abstract class Animal {
//public abstract class Animal { 
  /// ------> 추상메서드를 하나라도 포함하려면 추상클래스여야함 !! 
  /// -----------> 이런 클래스는 객체 생성이 안됨....

  private String name;

  public void eating(String food){
    System.out.println(food+"를 먹고 살아갑니다.");
  }

  // 추상메서드
  //public abstract void fly(); // ------> 구현부 없음


}
