// import lgcns.inspire.abstraction.Animal;

import lgcns.inspire.abstraction.Animal;
import lgcns.inspire.abstraction.Bird;
import lgcns.inspire.abstraction.Superman;
import lgcns.inspire.abstraction.inter.Flyer;

public class AbstractApp {
  

  public static void main(String[] args){

    // Animal animal = new Animal(); -------> 추상클래스는 객체생성 불가 !

    Animal [] animalAry = new Animal[2];
    animalAry[0] = new Bird(); //------------> 업캐스팅 !
    animalAry[1] = new Superman();

    for(Animal element:animalAry){
      // element.fly(); ------------> fly()는 Animal이 가지고 있는게 아님..!
      if (element instanceof Bird){ //-----> 다운casting 해줘야함 
        ((Bird)element).fly();
      }else if(element instanceof Superman){
        ((Superman)element).fly();
      }
    }
    /////////////////////////
    /// Animal이 아닌 Flyer로 배열을 만든다면 ? 

    Flyer [] animalAry2 = new Flyer[2];
    animalAry[0] = new Bird(); 
    animalAry[1] = new Superman();

    for(Flyer element:animalAry2){
      element.fly();    //--------------> 다운Casting 없이 가능함
    }

  }
}
