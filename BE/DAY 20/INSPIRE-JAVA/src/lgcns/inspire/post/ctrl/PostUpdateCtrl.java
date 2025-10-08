package lgcns.inspire.post.ctrl;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostUpdateCtrl {

  private PostService service;

  public PostUpdateCtrl(){
      service = new PostServiceImpl();
  }

  public PostUpdateCtrl(PostService service){
    this.service = service;
  }


  public int update(String title, String content,int id){
    System.out.println(">>> Post Insert ctrl params title : " + title);
    System.out.println(">>> Post Insert ctrl params content : " + content);
    System.out.println(">>> Post Insert ctrl params id : "+id);

    PostRequestDTO request = PostRequestDTO.builder()
                                    .title(title)
                                    .content(content)
                                    .id(id).build();

    return service.updateService(request);
  }
}
