package lgcns.inspire.post.view;

import java.util.Scanner;

public class PostView {

  private Scanner sc;

  public PostView(){
    sc = new Scanner(System.in);
  }

  public void mainMenu(){

    while(true){
      System.out.println(">> Inspire Camp Post Ver(1.0)");
      System.out.println("1. 전체검색");
      System.out.println("2. 키워드검색");
      System.out.println("3. 입력 폼으로 이동");
      System.out.println("4. 수정 페이지 이동");
      System.out.println("5. 삭제하기");
      System.out.println("99. 프로그렘 종료");
      System.out.print("번호를 선택하세요 : ");
      int num = sc.nextInt();
      switch (num) {
        case 1:
          list();
          break;
        case 99:
          System.out.println("포스트 앱 수행을 종료합니다");
          System.exit(0);
          break;
      
        default:
          System.out.println("선택하신 번호는 작업 수행이 불가합니다.");
          break;
      }
    }


  }
  /*
  - 컨트롤러에게 데이터를 요청하고 전달받은 값을 출력하는 역할
  */
  public void list(){
    System.out.println(">> 데이터 출력 <<");
  }

}