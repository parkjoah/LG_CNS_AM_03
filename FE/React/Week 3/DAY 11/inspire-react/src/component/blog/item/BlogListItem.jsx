import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const Wrapper = styled.div`
  width: calc(100% - 32px);
  padding: 16px;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;
  border: 1px solid grey;
  border-radius: 8px;
  cursor: pointer;
  background: white;
  :hover {
    background: lightgrey;
  }
`;

const TitleText = styled.p`
  font-size: 20px;
  font-weight: 500;
`;

export const BlogListItem = ({ blog }) => {
  const moveUrl = useNavigate();
  return (
    <Wrapper
      onClick={() => {
        moveUrl(`/blog-read/${blog.id}`);
        // moveUrl(`/blog-read/${blog.id}`, {
        //   state: blog.id,
        // });
        // useParam . state . useLocation 등 사용 가능함
        // console.log(blog.id);
      }}
    >
      <TitleText>{blog.title}</TitleText>
    </Wrapper>
  );
};
