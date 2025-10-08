package lgcns.inspire;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import lgcns.inspire.function.InspireFunction;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class StreamApp {
  
  /*
  
  Collection - Java Stream (코드의 가독성, 병렬처리, 유지보수 향상)

  Stream API

  - 원본데이터의 소스를 변경 X
  - 일회용(한번 사용하면 재사용X)
  - 병렬처리(thread)로 실행속도가 빠르다
  - 작업을 내부 반복으로 처리(람다식이 필요)

  함수형 인터페이스
  - 가질 수 있는 메서드는 딱 하나

  Supplier : 매개변수없이 반환값만 가지고 있는 것
  Function : 매개변수를 받아서 반환값이 있는 것 
  Consumer : 매개변수를 받아서 반환값이 없는 것 
  Predicate : 매개변수를 받아서 Boolean 반환하는 것

  람다식은 하나의 메서드를 식으로 표현하는 것
  - 메서드의 이름이 없음
  - 익명형태를 가진다

  public String getname(){
    return "jslim"
  }
  람다식)
  () -> (실행문)
   */
  
  public static void main(String[] args) {
    InspireFunction lambdaFunc = (x,y) -> x > y ? x : y ; 
    System.out.println(lambdaFunc.max(100, 200)); //200

    InspireFunction lambdaSumFunc = (x,y) -> x+y ; 
    System.out.println(lambdaSumFunc.max(100, 200)); //300

    System.out.println(">> Supplier");
    Supplier<String> supplier=()->"inspire";
    System.out.println(supplier.get());

    System.out.println(">> Consumer");
    Consumer<String> consumer = (str)->System.out.println(str.split(" ")[0]);
    //consumer.accept("lgcns inspire "); //
    consumer
          .andThen(System.out::println)
          .accept("lgcns inpire");


    System.out.println();
    System.out.println(">> Function");
    Function<String,Integer> function = (str)-> str.length();

    int len = function.apply("jslim lgcns inspire");
    System.out.println(len);

    System.out.println();
    System.out.println(">> Predicate");
    Predicate<String> predicate = (str)-> str.equals("lgcns");
    Boolean flag = predicate.test("inspire");
    System.out.println(flag);

    // 이렇게 선언 -> 자동으로 list
    List<String> brands = Arrays.asList("samsung","lg");
    brands.stream()
          // .forEach(brand -> System.out.println(brand)); // lambda
          .forEach(System.out::println); //메서드 참조방식


    System.out.println(">> Optional");

    /*
    - 어떤 메서드가 null을 반환할지 확신할 수 없거나, 
    - null 처리를 놓쳐서 발생하는 예외를 피할 때
    주의사항 ) 
    - 메서드의 반환타입으로 사용(전역변수 타입 X, 매개변수 X)
    - 사용의도에 맞게 사용해야한다(null 할당 X)
    */
    
    Optional<String> op01 = Optional.of("jslim");
    if(op01.isPresent()){
      System.out.println(op01.get());
    }

    Optional<PostResponseDTO> op2 = Optional.empty();
    System.out.println(op2.get().getTitle());

    System.out.println(">> main end");
    


  }
}
