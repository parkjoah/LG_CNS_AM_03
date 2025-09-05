package lgcns.inspire.control;

public class ControlDemo {
  /*
   * 제어구문 : A또는 B의 행위를 기대할 수 있는 것
   * if문, switch문, for문, while문, do-while문

    if(조건식){
    //조건식이 true일 때 실행되는 코드
    } else if(조건식2){
    //조건식2가 true일 때 실행되는 코드 
    } else{
    //조건식이 false일 때 실행되는 코드
    }


    switch(변수){
      case 값1:
        //값1일 때 실행되는 코드
        break;
      case 값2:
        //값2일 때 실행되는 코드
        break;
      default:
        //모든 case에 해당하지 않을 때 실행되는 코드
    }


        (조건식) ? true일 때 : false일 때 ;
   */
  

  /*
  조건) 매개변수의 값이 1 ~ 3
  조건) 1 : 금도끼 , 2 : 은도끼 , 3 : 쇠도끼
  조건) 나무꾼이 제 도끼는 1번입니다라고 한다면? -> '거짓말을 하는구나' 메시지를 반환
  조건) 나무꾼이 제 도끼는 2번입니다라고 한다면? -> '또 거짓말을 하는구나' 메시지를 반환
  조건) 나무꾼이 제 도끼는 3번입니다라고 한다면? -> '정직하구나 너에게 모든 도기를 주겠다' 메시지를 반환
  */

  public String woodMan(int number){
    String result = null; //참조값의 default값은 null

    switch (number) {
      case 1:
        result = "거짓말을 하는구나";
        break;
      case 2:
        result = "또 거짓말을 하는구나";
        break;
      case 3:
        result = "정직하구나 너에게 모든 도기를 주겠다";
        break;
      default: result = "잘못된 입력입니다. 1, 2, 3 중 하나를 입력하세요.";
        break;
    }

    return result;
  }
  
  ////////////
  /*
  Quiz)
  paramter : kor, eng, math
  return type : String
  method name : passOrNonpass
  합격의 조건)
  - 세 과목의 점수가 각각 40점이상이면서
  - 평균 60점 이상이면 합격
  - 아니면 불합격
  */
  public String passOrNonPass(int kor, int eng, int math) {
    String result = null;

    double average = (kor + eng + math) / 3.0;
    result = (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) ? "합격" :"불합격";
    

    return result;
  }
}
