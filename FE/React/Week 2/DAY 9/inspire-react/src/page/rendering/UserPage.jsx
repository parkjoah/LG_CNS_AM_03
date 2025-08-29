import { useState } from "react";
import Greeting from "../../component/rendering/Greeting";
import { LogoutButton } from "../../component/rendering/LogoutButton";
import { LoginButton } from "../../component/rendering/LoginButton";

//나
const UserPage = () => {
  const [isFlag, setIsFlag] = useState(false);

  const flagHandler = () => {
    setIsFlag((curr) => !curr);
  };

  return (
    <div>
      <Greeting isFlag={isFlag} />
      {isFlag ? (
        <LogoutButton onclick={flagHandler} />
      ) : (
        <LoginButton onclick={flagHandler} />
      )}
    </div>
  );
};

// const UserPage = () => {
//   const [isFlag, setIsFlag] = useState(false);

//   return (
//     <div>
//       <Greeting isFlag={isFlag} />
//       {isFlag ? (
//         <LogoutButton setIsFlag={setIsFlag} />
//       ) : (
//         <LoginButton setIsFlag={setIsFlag} />
//       )}
//     </div>
//   );
// };

export default UserPage;
