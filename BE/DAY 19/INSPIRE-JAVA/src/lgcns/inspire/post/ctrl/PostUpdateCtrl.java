package lgcns.inspire.post.ctrl;

public class PostUpdateCtrl {
  public int update(String title, String content,int id){
    System.out.println(">>> Post Insert ctrl params title : " + title);
    System.out.println(">>> Post Insert ctrl params content : " + content);
    System.out.println(">>> Post Insert ctrl params id : "+id);
    return 1;
  }
}
