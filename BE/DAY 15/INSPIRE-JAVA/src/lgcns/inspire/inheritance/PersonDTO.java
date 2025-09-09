package lgcns.inspire.inheritance;

// import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

// @Builder  -> 단일 클래스에서의 객체생성에서 사용
@SuperBuilder // -> 상속 클래스...
@Setter
@Getter
public class PersonDTO {
  ///// 공통읭 요소
  private String name;
  private int age;
  private String address;

  
  @Override
  public String perInfo() {
    return "PersonDTO [name=" + name + ", age=" + age + ", address=" + address + "]";
  }


  
  // public void setName(String name) {
  //   this.name = name;
  // }
  // public void setAge(int age) {
  //   this.age = age;
  // }
  // public void setAddress(String address) {
  //   this.address = address;
  // }
  // public String getName() {
  //   return name;
  // }
  // public int getAge() {
  //   return age;
  // }
  // public String getAddress() {
  //   return address;
  // }

  ///// 특징적인 요소
  /// 강사
  // private String subject;
  /// 학생
  // private String stuId;

}
