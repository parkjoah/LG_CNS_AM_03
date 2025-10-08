package lgcns.inspire.post.ctrl;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostInsertCtrl {

  private PostService service;

  public PostInsertCtrl(){
      service = new PostServiceImpl();
  }

  public PostInsertCtrl(PostService service){
    this.service = service;
  }

  public int insert(String title, String content, String writer){
    System.out.println(">> post insert ctrl insert params : " + title);
    System.out.println(">> post insert ctrl insert params : " + content);
    System.out.println(">> post insert ctrl insert params : " + writer);

    PostRequestDTO req =  PostRequestDTO.builder()
                                                .title(title)
                                                .content(content)
                                                .writer(writer)
                                                .id(service.selectService().size()+1)
                                                .build();

    return service.createService(req);
  }
}
