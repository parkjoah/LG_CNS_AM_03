package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
// import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

// @Builder

@SuperBuilder
@Getter
@ToString
public class TeacherDTO extends PersonDTO{


  private String subject;

  public String teaInfo(){
    return super.perInfo() + ", subject = " + subject;
  }





  // public TeacherDTO(){

  // }

  // public TeacherDTO(String name, int age, String address, String subject) {
    
  //   super.setName(name);
  //   super.setAge(age);
  //   super.setAddress(address);

  //   // this.setName(name);  ------> 이렇게 this로 줘도 됨! 
  //   // this.setAge(age);           가독성을 위해 super로 부르는게 좋음
  //   // this.setAddress(address);

  //   this.subject = subject;
  // }
  
  
}
