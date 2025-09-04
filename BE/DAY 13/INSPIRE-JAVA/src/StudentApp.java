import lgcns.Student;

public class StudentApp {
  public static void main(String[] args) {
    Student s1 =new Student(); //s1 : instance

    System.out.println(s1.name); // null

    s1.name = "이현진";
    s1.gender = 'M';

    System.out.println(s1.name);// 이현진
    s1.stuInfo(); // 나는 학생입니다.
  }
}