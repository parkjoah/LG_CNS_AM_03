package lgcns.inspire;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class CollectionApp {
  
  /*

  Collection API
  - List() ------> 중복허용, 순서존재, 객체를 요소로 갖는다, 가변길이
  - Set ------> 중복X, 순서X, 객체를 요소로 갖는다, 가변길이

  - Map({key : value})

  Wrapper Class (Boxing, UnBoxing)
  - int -> Integer, char -> Character

  */

  ///////////////////////////////////

  public static void main(String[] args) {
    System.out.println(">> Array");
    int [] ary = new int[5];
    ary[0] = 10; ary[1] = 20; ary[2] = 30; ary[3] = 40; ary[4] = 50;

    System.out.println(Arrays.toString(ary)); //[10, 20, 30, 40, 50]


    /* 
    List list = new ArrayList();

    list.add("jslim");
    // list.add()
    list.add(10);

    System.out.println(list.toArray()); //[Ljava.lang.Object;@6b95977
    System.out.println(list.toString()); //[jslim]
    
    for(int idx=0;idx<list.size();idx++){
      Object obj = list.get(idx);
    }
     */

    // List -> add(), get(), remove(), size()...

    //////////////////////////////////////////////////

    /* Generic 문법 !! */
    // List<String> list2 = new ArrayList<String>();

    List<Integer> list3 = new ArrayList<Integer>();
    list3.add(10);
    list3.add(20);
    list3.add(30);
    System.out.println(list3.toString());
    for(int idx=0; idx<list3.size();idx++){
      int data = list3.get(idx);
      System.out.println(data);
    }


    List<PersonDTO> perList = new ArrayList<PersonDTO>();
    TeacherDTO tea = TeacherDTO.builder().name("임정섭").age(20).address("서울").subject("자바").build();
    StudentDTO stu = StudentDTO.builder().name("이현진").age(24).address("서울").stuId("2025").build();

    perList.add(tea);
    perList.add(stu);

    for(int idx=0;idx<perList.size();idx++){
      System.out.println(perList.get(idx).perInfo());
    }


    //////////////////////////////

    /* Set */

    Set<String> set = new HashSet<>();
    set.add("jslim");
    set.add("inspire");
    set.add("lgcns"); 
    set.add("jslim");
    System.out.println(set); //[inspire, jslim, lgcns] -> 순서 없음

    Object [] setAry = set.toArray();
    for(Object value :setAry){
      System.out.println(value);
    }


    /////////////////////////////////

    /* Map */

    // Generic ----> extends 
    Map<String, List<? extends PersonDTO>> map = new HashMap<>(); // key, value-> PersonDTO

    List<StudentDTO> stuList = new ArrayList<>();
    List<TeacherDTO> teaList = new ArrayList<>();
    stuList.add(stu);
    teaList.add(tea);

    map.put("STU", stuList);
    map.put("TEA", teaList);

    List<? extends PersonDTO> perStuList = map.get("STU");
    for(PersonDTO per: perStuList){
      System.out.println(per.perInfo());
    }
  }
}
