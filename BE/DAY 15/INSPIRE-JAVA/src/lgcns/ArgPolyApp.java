package lgcns;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class ArgPolyApp {
  
  private static PersonDTO[] perAry;
  private static int idx;

  public static void main(String[] args) {
    StudentDTO stu = new 
    

    
  }

  public static void setPerAry(PersonDTO element){
    perAry[idx++] = element;
  }

  // public static void setTeaAry(TeacherDTO element){
  //   perAry[idx++] = element;
  // }

  // public static void setStuAry(StudentDTO element){
  //   perAry[idx++] = element;
  // }
  
  public static void printAry(){
    System.out.println("전체출력");
    for(PersonDTO element : perAry){
      if(element != null){
        System.out.println(element.perInfo());
      }else{
        break;
      }
    }
  }
}

