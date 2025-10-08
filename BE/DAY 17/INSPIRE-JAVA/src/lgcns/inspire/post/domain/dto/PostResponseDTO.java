
package lgcns.inspire.post.domain.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;


@Builder //객체생성 도와줌
@Getter
public class PostResponseDTO {
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private int viewCnt;


}
