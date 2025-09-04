package lgcns.inspire.operator;

public class Operator {

  // 객체생성시 멤버변수의 초기화를 도와주는 like a method
  public Operator(){


  }

  //반환값 x , 매개변수 x
  public void example01(){
    System.out.println("산술연산자: +,-, *, /, %");
    System.out.println("증감연산자: ++, --");  
    System.out.println("삼항연산자  조건 ? 참 : 거짓");
    System.out.println("논리연산자: &,|, &&, ||, ! (and, or, not)");
    System.out.println("관계연산자: <, >, <=, >=, ==, != (비교연산자)");
  }


  public String example02(String str01, String str02){
    return str01+"\t"+str02;
  }
}
