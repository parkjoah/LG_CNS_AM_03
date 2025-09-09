import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class InheritanceApp {
  
  public static void main(String[] args) {
    
    // 강사객체를 생성하고 싶다면?
    // PersonDTO  tea = PersonDTO.builder().name("임섭순").age(20).address("서울").subject("자바").build();
    
    // PersonDTO stu = PersonDTO.builder().name("박조아").age(25).address("서울").stuId("2025").build();
  
    // -> 이런식의 설계는 응집력이 낮음... 좀 더 구체화된 설계를 해야함
  
    // TeacherDTO tea = new TeacherDTO("임정섭",20,"서울","자바");
    // StudentDTO stu = new StudentDTO("임정섭",20,"서울","2025")

    // TeacherDTO tea = TeacherDTO.builder().name("임정섭").age(20).address("서울").subject("자바").build();

    // StudentDTO stu = StudentDTO.builder().name("이현진").age(24).address("서울").stuId("2025").build();



    // 변수의 타입은 런타임이 아닌 컴파일 되는 시점에서 정해짐
    // 객체는 런타임시점에서 결정

    // 다형성 (polymorphism)
    PersonDTO tea = new TeacherDTO(); // -----> 만들어지는거 : TeacherDTO
    PersonDTO stu = new StudentDTO();

    PersonDTO[] perAry = new PersonDTO[10];
    perAry[0] = tea; //------> 이렇게 되는 순간 
    perAry[1] = stu;

    //?
    // instanceof 연산자 : 런타임 시점에 타입체크해주는 논리연산자
    for(int idx = 0 ; idx < perAry.length ; idx++){
      PersonDTO per = perAry[idx];
      //per.teaInfo(); // 이런접근 가능..?
      //((TeacherDTO)per).teaInfo(); //|--------> 이렇게 해줌
      if(per==null){
        break;
      } else if (per instanceof StudentDTO){  //------->instanceof로 타입체크
        ((StudentDTO)per).stuInfo();
      } else if(per instanceof TeacherDTO){  
        ((TeacherDTO)per).teaInfo();
      }
    }

  }// main end


}
