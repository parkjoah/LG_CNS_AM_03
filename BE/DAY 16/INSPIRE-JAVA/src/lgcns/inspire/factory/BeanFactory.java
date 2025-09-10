package lgcns.inspire.factory;

import lgcns.inspire.abstraction.LGTV;
import lgcns.inspire.abstraction.SamsungTV;
import lgcns.inspire.abstraction.inter.TV;

public class BeanFactory {

  private static BeanFactory instance;
  private TV[] ary; //배열객체 선언(생성x)

  private BeanFactory(){ //--------> 외부에서 객체생성불가
    ary = new TV[2]; //배열객체 생성
    ary[0] = new SamsungTV();
    ary[1] = new LGTV();
  }

  public static BeanFactory getInstance(){
    if(instance == null){
      instance = new BeanFactory();
    }
    return instance;
  }

  public TV getBrand(String brand){
    return (brand.equals("samsung"))?ary[0]:ary[1];
  }
}
