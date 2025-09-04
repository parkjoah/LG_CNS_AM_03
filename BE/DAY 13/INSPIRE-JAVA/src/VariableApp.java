public class VariableApp {
  public static void main(String[] args) {
    
    // 변수 선언 및 값 할당
    int age = 20; 
    double height = 175.5; 
    String name = "이현진"; 
    boolean isMarriage =true;

    // 변수 출력
    System.out.println(age);
    System.out.println(height);
    System.out.println(name);
    System.out.println(isMarriage);

    // byte x = 10, y =10,sum=0;
    // sum = x + y; -------> // byte + byte = int
    // System.out.println(sum); --------> //error: incompatible types: possible lossy conversion from int to byte

    // casting(형변환) //
    // upcasting(자동형변환) : 작은 타입에서 큰 타입으로
    // downcasting(강제형변환) : 큰 타입에서 작은 타입으로 : 연산자를 이용해서 강제로 !!!
    byte x = 10,  y =10,sum=0;
    sum =(byte) (x + y); 
    System.out.println("연산 결과는 : "+sum);

    char charVar01 = 'A', charVar02 = 'B';
    System.out.println(charVar01); // A
    System.out.println(charVar02); // B
    System.out.println(charVar01 + charVar02); // 131 : ASCII 코드값의 합
    System.out.println((char)97); // a 

    float floatVar = 3.14f; // float는 접미사 f를 붙여야 함
    double doubleVar = 3.14;
    System.out.println(floatVar); // 3.14
    System.out.println(doubleVar); // 3.14
  }
}
