// import lgcns.inspire.abstraction.LGTV;
// import lgcns.inspire.abstraction.SamsungTV;
import lgcns.inspire.abstraction.inter.TV;
import lgcns.inspire.factory.BeanFactory;

public class TVApp {
  public static void main(String[] args) {
    // SamsungTV tv = new SamsungTV(); // 1. 객체 타입이 노출되어있음
    // tv.turnOn();                    // 2. 고객의 잦은 변경 요청 ---> 계속 수정해야하는..

    // LGTV tv2 = new LGTV();
    // tv2.powerOn();

    /////////////////////////////

    // TV tv = new SamsungTV();
    // tv.powerOn();
    // TV tv1 = new LGTV();
    // tv1.powerOn();

    ////////////////////////////

    // BeanFactory factory01 = BeanFactory.getInstance();
    // BeanFactory factory02 = BeanFactory.getInstance();

    // System.out.println(factory01);
    // System.out.println(factory02);

    ////////////////////////////
    
    BeanFactory factory = BeanFactory.getInstance();
    TV tv = factory.getBrand("samsung");
    System.out.println(tv.getClass());
    System.out.println(tv);
    tv.powerOn();
    tv = factory.getBrand("samsung");
    System.out.println(tv.getClass());
    System.out.println(tv);
    tv.powerOn();
  }

}
