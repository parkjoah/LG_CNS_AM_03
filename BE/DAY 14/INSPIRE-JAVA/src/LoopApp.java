import lgcns.inspire.loop.LoopDemo;

public class LoopApp {

  public static void main(String[] args) {
    
    LoopDemo app = new LoopDemo();
    int sum = app.sumOneToTen();
    System.out.println("Sum of numbers from 1 to 10: " + sum);

    app.sumRandom(); 
    app.loopBreak(111);

    app.popStr("joah");
    
    app.gugudanTable();
  }
}

