import { useState } from "react";
import { TodoComponent } from "../component/TodoComponent";
export const TodoPage = () => {
  // let txt = "";
  const [txt, setTxt] = useState("");
  const [todoList, setTodoList] = useState([]);

  const btnHandler = (e, txt) => {
    e.preventDefault();
    console.log("clicked", txt);
    setTodoList((todo) => [...todo, txt]);
    setTxt("");
  };

  const txtHandler = (e) => {
    setTxt(e.target.value);
  };

  return (
    <div className="container">
      <h2>To-Do List</h2>
      <form className="d-flex">
        <div className="flex-grow-1 me-2">
          <input
            type="text"
            className="form-control"
            placeholder="Input new Todo"
            onChange={txtHandler}
            value={txt}
          />
        </div>
        <div>
          <button
            className="btn btn-primary"
            // onClick={btnHandler}
            onClick={(e) => btnHandler(e, txt)}
          >
            Add
          </button>
        </div>
      </form>
      <TodoComponent todoList={todoList} />
    </div>
  );
};
