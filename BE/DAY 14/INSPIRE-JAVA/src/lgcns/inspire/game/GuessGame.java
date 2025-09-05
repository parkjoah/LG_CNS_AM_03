package lgcns.inspire.game;

import java.util.Scanner;

public class GuessGame {

  // 1~100 난수 생성 후 반환
  public static int generatorNan(){
    int answer = (int)(Math.random()*100)+1;
    return answer;
  }

  public String gameStart(int answer){
    String result = null;

    Scanner sc = new Scanner(System.in);

    int guess ;

    for(int i=1;i<=10;i++){
      System.out.print("정답을 입력하세요 : ");
      guess = sc.nextInt();
      System.out.printf("단신의 생각은 %d 이네요",guess);
      boolean isClear = (guess==answer);

      if (isClear) {
            System.out.printf("%d번째에 정답을 맞췄습니다.%n", i);
            result = "CLEAR";
            break; 
        } else {
            System.out.println("틀렸습니다.");
        }
    }if(result!="CLEAR"){
      System.out.println("10번의 기회를 모두 사용하였습니다.");
      result="FAIL";

    }

    sc.close();
    return result;
  }
}
