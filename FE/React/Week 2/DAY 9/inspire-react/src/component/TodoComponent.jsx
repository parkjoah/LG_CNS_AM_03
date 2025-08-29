export const TodoComponent = ({ todoList }) => {
  return (
    <div className="todoContainer">
      <ol>
        {todoList.map((t, idx) => {
          return <li key={idx}>{t}</li>;
        })}
      </ol>
    </div>
  );
};
