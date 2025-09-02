import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";

import styled from "styled-components";
import { MainPage } from "./component/blog/page/MainPage";
import { BlogWritePage } from "./component/blog/page/BlogWritePage";
import { BlogReadPage } from "./component/blog/page/BlogReadPage";

const DivTitleText = styled.p`
  font-size: 24px;
  font-weight: bold;
  text-align: center;
`;
export const BlogApp = () => {
  return (
    <BrowserRouter>
      <div align="center">
        <DivTitleText>AM Inspire Camp 3th</DivTitleText>
      </div>
      <Routes>
        <Route path="/" element={<MainPage />}></Route>
        <Route path="/blog-write" element={<BlogWritePage />}></Route>
        <Route path="/blog-read/:blogId" element={<BlogReadPage />}></Route>
      </Routes>
    </BrowserRouter>
  );
};
