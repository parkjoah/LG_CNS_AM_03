package lgcns.inspire.post.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class PostRequestDTO {
  private int id;
  private String title, content,writer;

  // 정적 팩토리 메서드 패턴
  public static PostResponseDTO toResponseDTO(PostRequestDTO req){

    return PostResponseDTO.builder()
                          .id(req.getId())
                          .title(req.title)
                          .content(req.content)
                          .writer(req.writer)
                          .build();

  }
}
