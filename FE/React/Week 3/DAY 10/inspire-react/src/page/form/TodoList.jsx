import { Link, useLocation } from "react-router-dom";

export const TodoList = () => {
  const location = useLocation();
  const arr = location.state;
  console.log(arr);
  return (
    <div>
      {/* a 태그 사용: 새로고침 발생 -> Link 사용..*/}
      {/* <a href="/">첫 화면으로 이동</a> */}
      <Link to="/">첫 화면으로 이동</Link>
      <hr />
      <ol>
        {arr.map((todo, idx) => (
          <li key={idx}>{todo.content}</li>
        ))}
      </ol>
    </div>
  );
};
