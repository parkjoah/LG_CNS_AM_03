package com.lgcns.inspire_spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.inspire_spring.test.dao.TestRepository;

@Service
public class TestService {
  
  @Autowired
  private TestRepository repository;

  public void testService(){
    System.out.println(">> service ");
    System.out.println(">> repository ");
    repository.testRow();
  }


}
