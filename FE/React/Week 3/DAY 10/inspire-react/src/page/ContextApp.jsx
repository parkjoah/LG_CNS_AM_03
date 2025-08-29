import { ContextPage } from "./context/ContextPage";
import ctx from "../component/context/util/contextMode";
import { useState } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { SignUpPage } from "./form/SignUpPage";
import { SignInPage } from "./form/SignInPage";
import { TodoList } from "./form/TodoList";
//provider 역할을 할거임
export const ContextApp = () => {
  const [isMode, setIsMode] = useState(false);
  return (
    <div>
      <ctx.Provider value={{ isMode, setIsMode }}>
        <ContextPage />
        <BrowserRouter>
          <h2>페이지 이동을 위한 라우터 연습</h2>
          <Routes>
            <Route path="/" element={<SignUpPage />} />
            <Route path="/loginForm" element={<SignInPage />} />
            <Route path="/todos/list" element={<TodoList />} />
          </Routes>
        </BrowserRouter>
      </ctx.Provider>
    </div>
  );
};
