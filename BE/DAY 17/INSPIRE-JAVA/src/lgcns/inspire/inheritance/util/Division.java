package lgcns.inspire.inheritance.util;

// public class Division {
//   public static final int STU = 1;
//   public static final int TEA = 2;
// }

public enum Division { // -------> type의 안정성 확보 !!!
  // STU(1), TEA(2);
  STU("학생"), TEA("강사");
  // STU, TEA;


  private final String division;

  private Division(String division){
    this.division=division;

  }

  public String getDivision(){
    return this.division;
  }
}