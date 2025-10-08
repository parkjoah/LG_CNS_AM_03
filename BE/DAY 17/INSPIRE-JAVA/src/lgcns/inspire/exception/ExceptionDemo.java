package lgcns.inspire.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {


  /*
  예외처리
  - 컴파일시점 예외
  - 런타임시점 예외

  try{
    예외발생 코드
  } catch( 발생 예외 객체 정의 ){
    예외발생시 수행되는 블럭
  } finally{
    예외발생여부와 상관없이 무조건 수행 블럭
  }

  throws XXXXException


  나중에 배울 함수형인터패이스...

  함수형 인터페이스(value + variance) : 베이버
  Try.of(예외발생 가능 코드)
      .onFailure() //-------> 예외시 처리
      .getOrElse() //-------> 실패시 특정 값을 반환


  */

  public void printAry(String[] ary){
    System.out.println(">> ary print start");

    for(String s:ary){
      System.out.println(s);
    }

    // idx<=ary.length로 에러 발생시켜보면 -----> ">> ary print end" 출력전에 종료됨
    // --------> 예외처리 필요
    for(int idx =0; idx<=ary.length;idx++){
      try {
        System.out.println(ary[idx]);
      } catch (Exception e) {
        System.out.println(">> inner try");
      }
    }

    try {
      for(int idx =0; idx<=ary.length;idx++){
        System.out.println(ary[idx]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    } finally{
      System.out.println(">> 예외여부와 상관없이 수행");
    }

    System.out.println(">> ary print end");
  }

  //////////////////////////////////////////////////
  // IOException 잡기

  public String readConsole(){

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("input data : ");
    String data = null;
    //data=br.readLine(); ---->//컴파일시점 Error발생
    try {
      data = br.readLine();
    } catch (IOException e) {

      e.printStackTrace();
    } 

    return data;
  }

  // Throws 사용하면 --------> 나중에 사용할 떄 어차피 잡아야함 -> 던지지말고 잡아서 처리하자
  public String readConsole2 () throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("input data : ");
    String data=br.readLine(); //---->//컴파일시점 Error발생
    
    return data;
  }

  ////////////////////////////////////////////////////

  // public void first(int x) throws Exception{
  //   System.out.println(">> first start");
  //   second(x);
  //   System.out.println(">> first end");
  // }

  // public void second(int x) throws Exception{
  //   System.out.println(">> second start");
  //   third(x);
  //   System.out.println(">> second end");
  // }

  // public void third(int x) throws Exception{
  //   System.out.println(">> third start");
  //   if(x < 0){
  //     throw new Exception("양수를 입력해 주세요");
  //   }
  //   System.out.println(">> third end");
  // }

  // 아래처럼 수정가능 !!
    public void first(int x) {
    System.out.println(">> first start");
    second(x);
    System.out.println(">> first end");
  }

  public void second(int x) {
    System.out.println(">> second start");
    try{
      third(x);
    }catch(Exception e){
      e.printStackTrace();
    }
    System.out.println(">> second end");
  }

  public void third(int x) throws Exception{
    System.out.println(">> third start");
    try{
      if(x < 0){
      throw new Exception("양수를 입력해 주세요");
      }
    }finally{
      System.out.println(">> third end");
    }
  
  }

}
