package lgcns.inspire.post.service;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.repository.PostDAO;

public class PostServiceImpl implements PostService{

  private PostDAO dao;
  public PostServiceImpl(){
    dao = new PostDAO();
  }

  @Override
  public List<PostResponseDTO> selectService() {
    System.out.println(">> post service selectService");
    return dao.selectRow();
  }

  /*
  가져온 데이터로부터
  식별값(id)에 만족하는 데이터를 반환할 때 Optional<PostResponseDTO>
  stream() 사용
   */
  @Override
  public Optional<PostResponseDTO> selectService(int id) {
    System.out.println(">> post service selectService : params id");
    List<PostResponseDTO> list = dao.selectRow();
    Optional<PostResponseDTO> result = list.stream()
                                            .filter(post->post.getId()==id)
                                            // .findFirst(); 
                                            .findAny(); //하나라는 확신이 있으면 any 써도 됨!
    return result;
  }


  //createService
  @Override
  public int createService(PostRequestDTO req) {
    
    return dao.insertRow(req);
  }

  /*
  Quiz)
  - 전체 글 목록을 가져고와서
  - 작성자에 해당하는 게시글만 필터링하고
  - 만약, 작성자에 해당하는 게시글이 존재하지 않는다면
  - case01) 비어있는 리스트로 반환
  - case02) Optional 로 감싸서 반환
  - 두 가지 케이스 중 하나를 선택해서 반환한다.
  */
  @Override
  public Optional<List<PostResponseDTO>> searchService(String writer) {
    System.out.println(">> post service searchService : params writer "+ writer);
    List<PostResponseDTO> list = dao.selectRow();

    // db :groupby(), partitioningBy()
    List<PostResponseDTO> filtered = list.stream()
            .filter(post -> writer.equals(post.getWriter()))
            .collect(Collectors.toList()); //toSet. toMap 가능
            
    return filtered.isEmpty() ? Optional.empty() : Optional.of(filtered);
  }
  
}
