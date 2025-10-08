package lgcns.inspire.post.service;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public interface PostService {

  public List<PostResponseDTO> selectService();
  public Optional<PostResponseDTO> selectService(int id);
  public int createService(PostRequestDTO req);
  public Optional<List<PostResponseDTO>> searchService(String writer);
} 


