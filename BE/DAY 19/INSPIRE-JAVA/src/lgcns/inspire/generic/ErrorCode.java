package lgcns.inspire.generic;

public class ErrorCode<T> { // 어떤 타입이 드러올지 모르지만 변수의 타입으로 사용하겠다 ~
  private T code; // T 타입 → 객체 생성 시 지정됨 
  public void setCode(T code){
    this.code=code;
  }
  public T getCode(){
    return code;
  }
}
