import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class AryApp {
  public static void main(String[] args) {
    /*
     * 배열 (Array)
     * - 고정길이를 갖는다 (리사이징x)
     * - 단일 타입만 담는 그릇 (기본, 참조)
     * - 참조타입으로 취급 -----> 객체생성 후 사용가능
     * - length 속성을 통해서 배열의 길이를 확인
     * - 첨자번지는 0 ~
     * - [ ]
     */

    String [] ary = new String[10];
    //ary[0] = 'A'; // char 안됨 
    ary[0] = "string";

    int [] ary2 = {1,2,3,4,5};
    for(int idx=0; idx<ary2.length; idx++){
      System.out.println(ary[idx]);
    }
    System.out.println();

    // 
    for(int data : ary2){
      System.out.println(data);
    }

    //////////////////////////////
    /// 참조타입의 객체를 배열에 담는다면 ?
    System.out.println();
    // PostResponseDTO postAry = new PostResponseDTO();
    PostResponseDTO [] postAry = new PostResponseDTO[10];
    // postAry[0] = new PostResponseDTO();
    
    for(PostResponseDTO dto:postAry){
      System.out.println(dto);
    }

    // Builder Patter 사용
    System.out.println(">>getter call<<");

    PostResponseDTO data = PostResponseDTO.builder().title("빌더패턴").build();
    System.out.println(data.getTitle());
    postAry[0]=data;
    for(PostResponseDTO dto: postAry){
      System.out.println(dto.getTitle());
      System.out.println(dto.getContent());
    }
    System.out.println(">>main end<<");
  }
}
