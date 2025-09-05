package lgcns.inspire.loop;

public class LoopDemo {
  /*
   * 반복구문 ; for, while, do-while
   * for : 반복횟수가 정해져 있을 때
   * while : 반복횟수가 정해져 있지 않고 어떤 상황이 올 때까지 반복해야 할 때
   *  +  do-while : 최소 1회는 실행되어야 할 때
   * 
   * Stream API : 반복구문을 사용하지 않고도 컬렉션을 순회할 수 있는 방법
   * - lambda 표현식과 함께 사용
   * - 4가지 함수형 (Supplier, Consumer, Function, Predicate) 인터페이스를 사용)
   */
  

  public int sumOneToTen() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

  public void sumRandom(){
    int nan =(int)Math.random() *100 +1;
    System.out.println(nan);
    int idx =0;
    int sum = 0;
    while (idx <= nan) {
      sum += nan;
      idx++;
    }
    System.out.format("1부터 %d까지의 합은 %d입니다.", nan, sum);
  }

  // break ;
  /*
   * 입력값 number =100;
   * 매개변수로 입력받은 값을 1~ 차례로 누적하여 합을 구하다가,
   * 입력받은 값을 넘으면 중단 !
   */
  public void loopBreak(int number){
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
      if (sum > number) {
        System.out.println("입력값 초과 " + i + "번째에서 중단");
        break; // 반복문 중단
      }
    }
    System.out.println(" sum: " + sum);

  }

  public void popStr(String str){
    System.out.println("params = "+str);
    for(int i =0; i<str.length();i++){
      System.out.println(str.toCharArray()[i]);
    }
    for(int i =0; i<str.length();i++){
      System.out.println(str.charAt(i));
    }
  }


  public void gugudanTable(){

    for(int dan=2;dan<=9;dan++){
      if(dan==5){
        continue;
      }
      for(int col=1;col<=9;col++){
        System.out.printf("%d * %d = %d\t",dan,col,(dan*col));
      }
      // if(dan==5){
      //   break;
      // }
      System.out.println();
    }
  }
}
