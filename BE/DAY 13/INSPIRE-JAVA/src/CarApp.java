import lgcns.Car;

public class CarApp {
  public static void main(String[] args) {
    
    /*
     * Quiz )
     * - 여러분의 드림카를 만들어보세요
     * - 객체 생성 후 maker, model, price 접근하여 드림카를 만들고
     * - 인스턴스 소유의 메서드를 호출해본다면?
     */
    
    Car myDreamCar = new Car();
    myDreamCar.setMaker("Tesla");
    myDreamCar.setModel("Model S"); 
    myDreamCar.setPrice(79999); 
    System.out.println("드림카 정보:");
    System.out.println("제조사: " + myDreamCar.getMaker());
    System.out.println("모델: " + myDreamCar.getModel());
    System.out.println("가격: $" + myDreamCar.getPrice());
    myDreamCar.drive();

    


    //////인스턴스 소유의 메서드 호출
    myDreamCar.drive();
    String repaireInfo = myDreamCar.repaire();
    System.out.println(repaireInfo);
    myDreamCar.performence("전기");
    String speedInfo = myDreamCar.speed(150);
    System.out.println(speedInfo);
  }
}
