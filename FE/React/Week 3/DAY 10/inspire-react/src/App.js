import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { SignUpPage } from "./page/form/SignUpPage";
import { SignInPage } from "./page/form/SignInPage";
import { TodoList } from "./page/form/TodoList";

// 라우터 돔을 이용해서 화면전환을 구성하고 싶다면?

function App() {
  return (
    <BrowserRouter>
      <h2>페이지 이동을 위한 라우터 연습</h2>
      <Routes>
        <Route path="/" element={<SignUpPage />} />
        <Route path="/loginForm" element={<SignInPage />} />
        <Route path="/todos/list" element={<TodoList />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
