import { useState } from "react";
export const TodoPage = () => {
  // let txt = "";
  const [txt, setTxt] = useState("");
  const btnHandler = (msg) => {
    console.log("clicked", msg);
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
            onClick={() => btnHandler(txt)}
          >
            Add
          </button>
        </div>
      </form>
      입력된 데이터를 출력하는 영역
    </div>
  );
};
