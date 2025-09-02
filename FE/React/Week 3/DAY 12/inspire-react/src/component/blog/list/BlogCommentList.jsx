import styled from "styled-components";
import { BlogCommentListItem } from "../item/BlogCommentListItem";

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;
  margin-bottom: 16px;
  & > * {
    :not(:last-child) {
      margin-bottom: 16px;
    }
  }
`;

export const BlogCommentList = ({ comments }) => {
  return (
    <Wrapper>
      {comments.map((comment, idx) => {
        return (
          <BlogCommentListItem key={comment.id} content={comment.comment} />
        );
      })}
    </Wrapper>
  );
};
