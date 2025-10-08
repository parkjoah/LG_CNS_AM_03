package lgcns.inspire.post.ctrl;

import java.util.HashMap;
import java.util.Map;

import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostDeleteCtrl {
  private PostService service;

  public PostDeleteCtrl(){
      service = new PostServiceImpl();
  }

  public PostDeleteCtrl(PostService service){
    this.service = service;
  }
  // public int delete(int id){
  //   System.out.println(">> post delete ctrl insert params : " + id);

  //   return 1;
  // }
  // public int delete(Integer id){
  //   System.out.println(">> post delete ctrl insert params : " + id);

  //   return 1;
  // }

  public int delete(int id){
    System.out.println(">> post delete ctrl insert params : " + id);
    Map<String, Integer> map = new HashMap<>();
    map.put("key", id);

    return service.deleteService(map);
  }
}
