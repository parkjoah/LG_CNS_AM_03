package lgcns.inspire.inheritance.service;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.util.Division;

public interface OopService {

  public void setMakePer(Division division, String name, int age, String address, String comm) ;
  public PersonDTO getFindPer(String name) ;
  public PersonDTO [] getAryPer() ;


}