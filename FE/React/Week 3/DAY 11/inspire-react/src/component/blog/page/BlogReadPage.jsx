import { useNavigate, useParams } from "react-router-dom";
import styled, { keyframes } from "styled-components";
import { Button } from "../ui/Button";
import { useEffect, useState } from "react";
import api from "../../../api/axios";
import { TextArea } from "../ui/TextArea";
import { BlogCommentList } from "../list/BlogCommentList";

const Wrapper = styled.div`
  padding: 16px;
  width: calc(100% - 32px);
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
`;

const Container = styled.div`
  width: 100%;
  max-width: 720px;

  & > * {
    :not(:last-child) {
      margin-bottom: 16px;
    }
  }
`;

const PostContainer = styled.div`
  padding: 8px 16px;
  border: 1px solid grey;
  border-radius: 8px;
`;

const TitleText = styled.p`
  font-size: 28px;
  font-weight: 500;
`;

const ContentText = styled.p`
  font-size: 20px;
  line-height: 32px;
  white-space: pre-wrap;
`;

const CommentLabel = styled.p`
  font-size: 16px;
  font-weight: 500;
`;

const spin = keyframes`
0% { transform: rotate(0deg); }
100% { transform: rotate(360deg); }
`;

const Spinner = styled.div`
  border: 6px solid #f3f3f3;
  border-top: 6px solid #3498db;
  border-radius: 50%;
  width: 48px;
  height: 48px;
  animation: ${spin} 1s linear infinite;
  margin: 100px auto;
`;

export const BlogReadPage = () => {
  const { blogId } = useParams(); //무조건 Router와 통일..
  const moveUrl = useNavigate();
  console.log(blogId);

  const [blog, setBlog] = useState({});

  useEffect(() => {
    const getBlog = async () => {
      //api get()데이터 가져온 후 해당 데이터 state 상태로 만들어보자.
      // queryString : http://Xxxxxxxxx/blogs?id=1
      // path variable : http://Xxxxxxxxx/blogs/1
      try {
        // 1. queryString //
        // 이경우에 배열로 내려오기 때문에 [0]해줘야함
        // res.data[0]
        //
        // const res = await api.get(`/blogs`, {
        //   params: { id: blogId },
        // });
        // setBlog(res.data[0]);
        // console.log(res.data);

        // 2. path variable
        // 객체로 받아서 바로 res.data
        const res = await api.get(`/blogs/${blogId}`);
        setBlog(res.data);
        console.log(res.data);
      } catch (err) {
        console.log(err);
      }
    };

    getBlog();
  }, [blogId]);

  return (
    <Wrapper>
      {!blog.id && <Spinner />}
      {blog.id && (
        <Container>
          <Button title="메인페이지 이동" btnHandler={() => moveUrl("/")} />
          <PostContainer>
            <TitleText>{blog.title}</TitleText>
            <ContentText>{blog.content}</ContentText>
          </PostContainer>
          {/* 댓글 UI 설계 */}
          <CommentLabel>한 줄 댓글</CommentLabel>
          <BlogCommentList comments={blog.comment} />
          <TextArea height={40} />
          <Button title="댓글 작성" />
        </Container>
      )}
    </Wrapper>
  );
};
