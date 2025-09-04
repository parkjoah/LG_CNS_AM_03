import lgcns.Teacher;

public class TeacherApp {
  public static void main(String[] args) {
    new Teacher();

    Teacher tea01 = new Teacher();
    tea01.name = "이현진";
    tea01.height = 175.5;
    System.out.println(tea01.name);
    System.out.println(tea01.height);
    System.out.println(tea01.age);
    System.out.println(tea01.mbti);
    System.out.println(tea01.birthPlace);
    System.out.println(tea01.isMarriage);

    ////
    Teacher tea02 = new Teacher("jslim", 177.6, 20, "isfj", "광주", true) ;
    System.out.println(tea02.name);
    System.out.println(tea02.height);
    System.out.println(tea02.age);
    System.out.println(tea02.mbti);
    System.out.println(tea02.birthPlace);
    System.out.println(tea02.isMarriage);

  }
}
