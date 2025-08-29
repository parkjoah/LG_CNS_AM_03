import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
// import App from "./App";
import reportWebVitals from "./reportWebVitals";
import { TodoPage } from "./page/TodoPage";
// import { NotificationPage } from "./page/hook/NotificationPage";
// import UserPage from "./page/rendering/UserPage";
// import StateSample from "./page/state/StateSample";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    {/* <UserPage /> */}
    {/* <StateSample /> */}
    {/* <NotificationPage /> */}
    <TodoPage />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
