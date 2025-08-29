// //나
export const LogoutButton = ({ login }) => {
  return (
    <button type="button" onClick={login}>
      로그아웃
    </button>
  );
};

//강사님
// export const LogoutButton = ({ setIsFlag }) => {
//   const logoutHandler = (setIsFlag) => {
//     setIsFlag((isFlag) => (isFlag = false));
//   };
//   return (
//     <button type="button" onClick={() => logoutHandler(setIsFlag)}>
//       로그아웃
//     </button>
//   );
// };
