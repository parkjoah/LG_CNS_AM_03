public class StringApp {
  public static void main(String[] args) {
    String str01 = "inspire" , str02 = "inspire";
    // == ---------> stsout : ==
    if(str01==str02){
      System.out.println("==");
    }else{
      System.out.println("!=");
    }
    // equals ----------> sysout : equals
    if(str01.equals(str02)){
      System.out.println("equals");
    }else{
      System.out.println("!equals");
    }

    ///////////////////////////////////

    String str_1 = new String("jslim");
    String str_2 = new String("jslim");
    // == ---------> stsout : != 
    // ------------------> 객체로 만들게 되면 주소값이 다르기 때문에 다르게 나옴
    if(str_1==str_2){
      System.out.println("==");
    }else{
      System.out.println("!=");
    }
    // equals ----------> sysout : equals
    if(str_1.equals(str_2)){
      System.out.println("equals");
    }else{
      System.out.println("!equals");
    }

    
  }
}
