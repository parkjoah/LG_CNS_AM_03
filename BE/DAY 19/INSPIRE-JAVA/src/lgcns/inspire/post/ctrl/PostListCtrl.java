package lgcns.inspire.post.ctrl;

import java.util.List;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
// import lgcns.inspire.post.repository.PostDAO;
// import lgcns.inspire.post.repository.PostDAO;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostListCtrl {
  private PostService service;

  public PostListCtrl(){
    if(service==null){
      service = new PostServiceImpl();
    } 
  }

  public PostListCtrl(PostService service){
    this.service = service;
  }

  public List<PostResponseDTO> list(){
    return service.selectService();
  }
}
