package lgcns.inspire.post.ctrl;

public class PostInsertCtrl {
  public int insert(String title, String content, String writer){
    System.out.println(">> post insert ctrl insert params : " + title);
    System.out.println(">> post insert ctrl insert params : " + content);
    System.out.println(">> post insert ctrl insert params : " + writer);
    return 1;
  }
}
