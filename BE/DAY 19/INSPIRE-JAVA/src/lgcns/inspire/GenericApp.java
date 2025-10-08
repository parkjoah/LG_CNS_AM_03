package lgcns.inspire;

import lgcns.inspire.generic.ErrorCode;

class GenericApp {
  public static void main(String[] args) {
    // Integer
    ErrorCode<Integer> err = new ErrorCode<>();
    err.setCode(400);
    System.out.println(err.getCode());

    // String
    ErrorCode<String> msg = new ErrorCode<>();
    msg.setCode("코드넘버");
    System.out.println(msg.getCode());
  }
}