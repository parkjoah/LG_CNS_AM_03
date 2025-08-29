// 나
export const LoginButton = ({ onclick }) => {
  return (
    <button type="button" onClick={onclick}>
      로그인
    </button>
  );
};

// //강사님
// export const LoginButton = ({ setIsFlag }) => {
//   const loginHandler = (setIsFlag) => {
//     setIsFlag((isFlag) => (isFlag = true));
//   };
//   return (
//     <button type="button" onClick={() => loginHandler(setIsFlag)}>
//       로그인
//     </button>
//   );
// };
