package lgcns.inspire.abstraction;

import lgcns.inspire.abstraction.inter.TV;

public class LGTV implements TV{

  @Override
  public void powerOn(){
    System.out.println("LG TV 전원을 켜다");
  }

}
