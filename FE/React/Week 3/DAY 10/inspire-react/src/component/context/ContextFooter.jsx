import { useContext } from "react";
import ctx from "./util/contextMode";

export const ContextFooter = () => {
  const { isMode, setIsMode } = useContext(ctx);
  const modeHandler = () => {
    setIsMode((curr) => !curr);
  };
  return (
    <div>
      <footer style={{ backgroundColor: isMode ? "black" : "white" }}>
        <button type="button" onClick={modeHandler}>
          모드 변경
        </button>
      </footer>
    </div>
  );
};
