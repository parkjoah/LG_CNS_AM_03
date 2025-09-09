package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
public class StudentDTO extends PersonDTO{

  private String stuId;

  public String stuInfo(){
    return super.perInfo() + ", stuId = " + stuId;
  }

  // perInfo는 이미 부모에 정의되어있음 !
  @Override //------> 오버라이딩 문법을 잘 지키고 있는지 체크해주는 어노테이션
  public String perInfo(){ 
    return super.perInfo() + ",subject " + subject;
  }
  /*
  @Override  ------> 오류 !! 오버라이딩이 아님 !! 구현부만 달라야함
  public String perInfo(String s){ 
    return super.perInfo() + ", stuId = " + stuId;
  }
   */
}
