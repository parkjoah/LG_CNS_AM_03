import styled from "styled-components";
import { BlogListItem } from "../item/BlogListItem";

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;

  & > * {
    :not(:last-child) {
      margin-bottom: 16px;
    }
  }
`;

export const BlogList = ({ blogs }) => {
  return (
    <Wrapper>
      {blogs.map((blog, idx) => (
        <BlogListItem key={blog.id} blog={blog} />
      ))}
    </Wrapper>
  );
};
