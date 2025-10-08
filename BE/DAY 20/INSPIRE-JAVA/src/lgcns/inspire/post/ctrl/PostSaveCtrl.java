package lgcns.inspire.post.ctrl;

import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostSaveCtrl {
  private PostService service;

  public PostSaveCtrl(){
      service = new PostServiceImpl();
  }

  public PostSaveCtrl(PostService service){
    this.service = service;
  }

  public boolean save(){
    System.out.println(">> Post save ctrl :");
    return service.saveToFile();
  }
}
