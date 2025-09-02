import styled from "styled-components";
import { TextArea } from "../ui/TextArea";
import { Button } from "../ui/Button";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import api from "../../../api/axios";

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

export const BlogWritePage = () => {
  /*
  1. title, content 훅을 사용해서 상태관리 해야함
  2. 버튼의 이벤트 발생시 axios.js api를 활용해서 json-server와 post 통신을 하고 데이터를 저장
  3. useNavigate()를 이용해서 라우터에 등록된 MainPage로 이동
  */
  const [title, setTitle] = useState("");
  const [content, setContent] = useState("");
  const moveUrl = useNavigate();

  const saveHandler = async (title, content) => {
    try {
      await api.post("blogs", { title, content });
      moveUrl("/");
    } catch (err) {
      console.log(err);
    }
  };
  // const saveHandler = async (title, content) => {
  //   await api
  //     .post("blogs", { title, content })
  //     .then(moveUrl("/"))
  //     .catch((err) => {
  //       console.log(err);
  //     });
  // };

  return (
    <Wrapper>
      <Container>
        <TextArea
          height={20}
          value={title}
          changeHandler={(e) => setTitle(e.target.value)}
        />
        <TextArea
          height={480}
          value={content}
          changeHandler={(e) => setContent(e.target.value)}
        />
        <Button
          title="작성완료"
          btnHandler={() => saveHandler(title, content)}
        />
      </Container>
    </Wrapper>
  );
};
