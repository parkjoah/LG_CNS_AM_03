package lgcns.inspire;

// import java.util.Scanner;

import lgcns.inspire.exception.ExceptionDemo;

public class ExceptionApp {
  public static void main(String[] args) {

    // ExceptionDemo app = new ExceptionDemo();
    // String[] strAry = {"jslinm","lgcns","inspire"};
    // app.printAry(strAry);

    //////////////////////////////

    /* Scanner */
    // Scanner sc = new Scanner(System.in);
    // System.out.println("숫자를 입력하세요");

    // int num = 0;
    // try{
    //   num = sc.nextInt();
    // } catch(Exception e){
    //   e.printStackTrace();
    // }
    // System.out.println(">>> num : " + num);
    // sc.close();

    /////////////////////////////////////

    ExceptionDemo app = new ExceptionDemo();
    // String result = app.readConsole();
    // System.out.println(">>>"+result);


    try {
      app.first(1);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(">>>> main end");
  }
}
