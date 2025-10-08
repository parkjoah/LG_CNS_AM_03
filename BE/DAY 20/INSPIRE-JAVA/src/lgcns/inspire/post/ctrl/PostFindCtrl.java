package lgcns.inspire.post.ctrl;

import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostFindCtrl {

  private PostService service;

  public PostFindCtrl(){
      service = new PostServiceImpl();
  }

  public PostFindCtrl(PostService service){
    this.service = service;
  }

  public Optional<PostResponseDTO> findPost(int id){
    
    System.out.println(">> post ctrl findpost : params : "+id);
    return service.selectService(id);
  }
}
