
package lgcns.inspire.post.domain.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Builder //객체생성 도와줌
@Getter
@ToString
public class PostResponseDTO {
  private int id;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private int viewCnt;


}
