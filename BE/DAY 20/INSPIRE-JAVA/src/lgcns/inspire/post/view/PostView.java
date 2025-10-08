package lgcns.inspire.post.view;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

// import lgcns.inspire.post.ctrl.PostController;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.front.FrontController;

public class PostView {

  private Scanner sc;

  // Dependency Injection (DI)
  // private PostController ctrl;

  private FrontController front;

  public PostView(){
    sc = new Scanner(System.in);
    // ctrl = new PostController();
    front = new FrontController();
  }

  public void mainMenu(){

    while(true){
      System.out.println();
      System.out.println(">> Inspire Camp Post Ver(1.0)");
      System.out.println("1. 전체검색");
      System.out.println("2. 게시글 상세보기");
      System.out.println("3. 입력 폼으로 이동");
      System.out.println("4. 수정 페이지 이동");
      System.out.println("5. 삭제하기");
      System.out.println("6. 게시글 작성자로 검색");
      System.out.println("99. 프로그렘 종료");
      System.out.print("번호를 선택하세요 : ");

      int num = Integer.parseInt(sc.nextLine()); 

      switch (num) {
        case 1:
          System.out.println();
          list();
          break;
        case 2:
          read();
          break;
        case 3:
          insert();
          break;
        case 4:
          update();
          break;
        case 5:
          delete();
          break;
        case 6:
          search();
          break;
        case 99 :
          boolean flag = front.save("save");
          if(flag) {
          System.out.println("데이터 저장 후포스트 앱 수행을 종료합니다");
          System.exit(0) ;
          } else {
          System.out.println("데이터 저장 실패!!");
          }
          break ;
      
        default:
          System.out.println();
          System.out.println("선택하신 번호는 작업 수행이 불가합니다.");
          break;
      }
    }


  }
  ////////////////// 1. 
  /*
  - 컨트롤러에게 데이터를 요청하고 전달받은 값을 출력하는 역할
  */
  public void list(){

    System.out.println(">> 데이터 출력 <<");

    List<PostResponseDTO> list = front.list("list");
    System.out.println("View list data : "+list);
    // for(PostResponseDTO data: list){
    //   System.out.println(data);
    // }

    /*

    //1.8 version
    // stream api 이용해서 출력
    list.stream()
        .forEach(System.out::println); 

    // 특정속성에 대한 정보만 추출(title)
    list.stream()
        .map(PostResponseDTO::getTitle)
        .forEach(System.out::println);

    */


    list.stream()
        .filter(post-> post.getId()>=2)
        .forEach(System.out::println);
  }

  /////////////// 2.
  public void read() {
    System.out.println();
    System.out.println(">>>> 특정 게시물 상세보기 <<<<");

    System.out.print(">>> 게시물 번호 입력 : ");
    int id = sc.nextInt() ;
    Optional<PostResponseDTO> result = front.findPost("find",id);
    if( result.isPresent() ) {
    System.out.println( result.get() ) ;
    } else {
    System.out.println(">>>> 특정 게시물 찾기 실패!! ");
    }
  } 

  ///////////////// 3.
  public void insert(){
    System.out.println();
    System.out.println(">> title, content, writer <<");

    System.out.print(">> 제목 : ");
    String title = sc.nextLine();

    System.out.print(">> 내용 : ");
    String content = sc.nextLine();

    System.out.print(">> 작성자 : ");
    String writer = sc.nextLine();

    /*
    요구사항 )
    = 입력받은 3개의 파라미터를 ctrl에 전달(메서드 정의)
    - 전달된 파라미터를 PostRequestDTO 객체로 바인딩해서 (우선 PostResponseDTO에 담아서 저장하는 거로 !!!)

    - 기본키 값은 size()+1로 id 값을 할당
    - service로 전달하고, 
    - service는 dao로 전달
    - dao 기존 list에 전달받은 request 객체를 담고
    - 성공이며 1, 실패면 2 반환
    - 
     */
    System.out.println(">> " + title + "\t" + content + "\t" + writer);

    int successFlag = front.createPost("insert",title, content, writer);
    if(successFlag == 1){
      System.out.println("입력성공");
    }else{
      System.out.println("입력실패");
    }
  }

  /////////// 4
  /*
  Quiz ) 
  - 수정폼으로 부터 title, content, id 입력받고 싶다
  - 입력받은 데이터를 front.update("update",title,content,id)전달
  - front ctrl 쪽에서는 Factory의 도움을 받아서 PostUpdateCtrl 객체 반환
  - 해당 객체의 update(title,content,id) 전달해서 수행여부로 int 형 값 반환
  */
  public void update(){
    System.out.println();
    System.out.println(">>> post Update title,content,id <<<");
    System.out.print(">>> 수정 제목 :");
    String title =sc.nextLine();
    System.out.print(">>> 수정 내용 :");
    String content =sc.nextLine();
    System.out.print(">>> 수정 게시글 번호 :");
    int id =Integer.parseInt(sc.nextLine());

    int updateFlag = front.update("update",title,content,id);
    System.out.println((updateFlag==1)?"수정완료":"수정실패");
  }

  //////////////// 5
  public void delete(){
    System.out.println();
    System.out.println(">> post id <<");

    System.out.print("삭제할 게시글 Id :");
    int id = Integer.parseInt(sc.nextLine());

    int deletedFlag = front.delete("delete",id);
    System.out.println((deletedFlag ==1)?"삭제완료":"삭제실패");

  }

  ////////////// 6
  public void search(){
    System.out.println();
    System.out.println(">> post search writer<< ");

    System.out.print(">> 작성자 : ");
    String writer = sc.nextLine();

    Optional <List<PostResponseDTO>> list =  front.search("search", writer);

    list.ifPresentOrElse(lst->lst.forEach(System.out::println),()-> System.out.println(writer+"님이 작성한 게시글이 존재하지 않습니다."));
    

  }
}