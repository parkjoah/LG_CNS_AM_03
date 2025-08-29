import { useEffect, useState } from "react";

// const StateSample = () => {
//   /*
//   요구사항)
//   - 입장인원이 꽉차면 입장 버튼을 비활성화(disabled) 시키고
//   - 퇴장버튼이 눌리면 인원을 감소시키는데 입장인원이 0이면 버튼을 비활성화(disabled)
//   */

//   //  나 //
//   //
//   // const CAPACITY = 10;
//   // const [cnt, setCnt] = useState(0);
//   // const cntUpHandler = () => {
//   //   setCnt((cnt) => (cnt < CAPACITY ? cnt + 1 : cnt));
//   //   console.log(cnt);
//   // };
//   // const cntDownHandler = () => {
//   //   setCnt((cnt) => (cnt > 0 ? cnt - 1 : cnt));
//   //   console.log(cnt);
//   // };
//   // return (
//   //   <div>
//   //     <p>입장인원 : {cnt}명</p>
//   //     <button type="button" onClick={cntUpHandler}>
//   //       입장
//   //     </button>
//   //     <button type="button" onClick={cntDownHandler}>
//   //       퇴장
//   //     </button>
//   //   </div>
//   // );

//   //
//   const CAPACITY = 10;
//   const [cnt, setCnt] = useState(0);
//   const [isFull, setisFull] = useState(false);
//   const [isEmpty, setisEmpty] = useState(false);

//   const cntUpHandler = () => {
//     setCnt((cnt) => cnt + 1);
//     // console.log(cnt);
//   };
//   const cntDownHandler = () => {
//     setCnt((cnt) => cnt - 1);
//     // console.log(cnt);
//   };

//   //side effect
//   useEffect(() => {
//     console.log(">>>useEffect");
//     setisFull(cnt >= CAPACITY);
//     setisEmpty(cnt <= 0);
//   }, [cnt]);
//   return (
//     <div>
//       <p>입장인원 : {cnt}명</p>
//       <button type="button" onClick={cntUpHandler} disabled={isFull}>
//         입장
//       </button>
//       <button type="button" onClick={cntDownHandler} disabled={isEmpty}>
//         퇴장
//       </button>
//       {isFull && <p style={{ color: "red" }}>정원이 가득 찼습니다.</p>}
//     </div>
//   );
// };

// const StateSample = () => {
/*
  요구사항)
  - 입장인원이 꽉차면 입장 버튼을 비활성화(disabled) 시키고
  - 퇴장버튼이 눌리면 인원을 감소시키는데 입장인원이 0이면 버튼을 비활성화(disabled)
  */

//  나 //
//
// const CAPACITY = 10;
// const [cnt, setCnt] = useState(0);
// const cntUpHandler = () => {
//   setCnt((cnt) => (cnt < CAPACITY ? cnt + 1 : cnt));
//   console.log(cnt);
// };
// const cntDownHandler = () => {
//   setCnt((cnt) => (cnt > 0 ? cnt - 1 : cnt));
//   console.log(cnt);
// };
// return (
//   <div>
//     <p>입장인원 : {cnt}명</p>
//     <button type="button" onClick={cntUpHandler}>
//       입장
//     </button>
//     <button type="button" onClick={cntDownHandler}>
//       퇴장
//     </button>
//   </div>
// );
//

// 사용자정의 훅 사용 법 : CUSTOM HOOK 만들기
import { useCounter } from "../../component/hook/useCounter";

const StateSample = () => {
  const CAPACITY = 10;

  const [cnt, upCntHandler, downCntHandler] = useCounter();

  const [isFull, setisFull] = useState(false);
  const [isEmpty, setisEmpty] = useState(false);

  //side effect
  useEffect(() => {
    console.log(">>>useEffect");
    setisFull(cnt >= CAPACITY);
    setisEmpty(cnt <= 0);
  }, [cnt]);
  return (
    <div>
      <p>입장인원 : {cnt}명</p>
      <button type="button" onClick={upCntHandler} disabled={isFull}>
        입장
      </button>
      <button type="button" onClick={downCntHandler} disabled={isEmpty}>
        퇴장
      </button>
      {isFull && <p style={{ color: "red" }}>정원이 가득 찼습니다.</p>}
    </div>
  );
};

export default StateSample;
