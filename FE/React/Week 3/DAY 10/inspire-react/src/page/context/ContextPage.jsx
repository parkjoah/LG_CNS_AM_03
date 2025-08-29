import { ContextBody } from "../../component/context/ContextBody";
import { ContextFooter } from "../../component/context/ContextFooter";
import { ContextHeader } from "../../component/context/ContextHeader";

export const ContextPage = () => {
  return (
    <div>
      {/* 기존에 했던 방식...
      <ContextHeader isMode={props.isMode} />
      <ContextBody isMode={props.isMode} />
      <ContextFooter isMode={props.isMode} /> */}

      {/* Context 사용 */}
      <ContextHeader />
      <ContextBody />
      <ContextFooter />
    </div>
  );
};
