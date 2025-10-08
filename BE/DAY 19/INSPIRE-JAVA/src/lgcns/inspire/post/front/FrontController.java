package lgcns.inspire.post.front;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.ctrl.PostDeleteCtrl;
import lgcns.inspire.post.ctrl.PostFindCtrl;
import lgcns.inspire.post.ctrl.PostInsertCtrl;
import lgcns.inspire.post.ctrl.PostListCtrl;
import lgcns.inspire.post.ctrl.PostSearchCtrl;
import lgcns.inspire.post.ctrl.PostUpdateCtrl;
// import lgcns.inspire.post.ctrl.PostListCtrl;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.factory.BeanFactory;

public class FrontController {
  private BeanFactory factory;

  public FrontController(){
    factory = BeanFactory.getInstance();
  }

  public List<PostResponseDTO> list(String requestURL){
    System.out.println(">> front ctrl list");
    // Object obj = factory.getCtrl("list");
    PostListCtrl obj = (PostListCtrl)factory.getCtrl(requestURL);
    return obj.list();

    // PostListCtrl postListCtrl = new PostListCtrl(); ---> 안좋은 코드 : 지역변수로,,,, + 계속 생성..

  }
  public Optional<PostResponseDTO> findPost(String requestURL,int id){
    System.out.println(">> front ctrl findpost param : "+id);

    PostFindCtrl obj = (PostFindCtrl)factory.getCtrl(requestURL);
    return obj.findPost(id);
  }

  //3 Insert
  public int createPost(String requestURL,String title, String content, String writer){
    System.out.println(">> front ctrl createPost param : " + title);
    System.out.println(">> front ctrl createPost param : " + content);
    System.out.println(">> front ctrl createPost param : " + writer);

    PostInsertCtrl obj = (PostInsertCtrl)factory.getCtrl(requestURL);

    return obj.insert(title ,content,writer);
  }

  // 5 Delete
  public int delete(String requestURL, int id){
    System.out.println(">> front ctrl delete params id : "+ id);

    PostDeleteCtrl obj = (PostDeleteCtrl)factory.getCtrl(requestURL);
    return obj.delete(id);
  }

  // 4. Update
  public int update(String requestURL,String title, String content,int id){

    System.out.println(">> front ctrl update params : "+ title );
    System.out.println(">> front ctrl update params : " +content);
    System.out.println(">> front ctrl update params : "+ id);

    PostUpdateCtrl obj = (PostUpdateCtrl) factory.getCtrl(requestURL);

    return obj.update(title,content,id);
  }

  //6. writer로 검색

  public Optional<List<PostResponseDTO>> search(String requestURL, String writer){
    System.out.println(">> front ctrl search params : " + writer);

    PostSearchCtrl obj = (PostSearchCtrl)factory.getCtrl(requestURL);
    return obj.search(writer);
  }

  
}
