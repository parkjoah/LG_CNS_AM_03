package lgcns;

public class Car {
  // 인스턴스소유(변수 + 메서드) + 생성자(new 연산자 뒤에서만 호풀)

  // public String maker, model;
  // public int price;

  // information hiding ------> 직접접근을 막고, 메서드를 통해 접근
  private String maker, model;
  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  private int price;

  

  public String dreamCarInfo(){
    return "당신의 드림카 제조사는 :" + maker + ", 모델은 " + model + ", 가격은 " + price + "입니다.";
  }
  
  public void drive() {
    System.out.println("매개변수 없고 반환타입이 없음.");
  }

  public String repaire() {
    System.out.println("매개변수 없고, 반환타입이 문자열.");

    return "차량 수리완료";
  }

  public void performence(String fue1){
    System.out.println("매개변수로 문자열을 전달받고, 반환타입이 문자열.");
    System.out.println(fue1+"로 성능이 향상되었습니다");

  }
  
  public String speed(int speed) {
    System.out.println("매개변수로 정수를 전달받고, 반환타입이 문자열.");
    System.out.println("현재 속도는 " + speed + "km/h 입니다.");
  
    return "과속중입니다. ";
  }

}
