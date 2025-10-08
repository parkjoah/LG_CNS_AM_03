package com.lgcns.inspire_spring.test.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class TestResponseDTO {
  private String emp_id;
  private String emp_name;
  private String email;
  private int salary;
}
