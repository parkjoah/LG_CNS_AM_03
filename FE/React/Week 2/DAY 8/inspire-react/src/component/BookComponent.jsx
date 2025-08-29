// export default function BookComponent({ name, price }) {
//   return (
//     <div>
//       <div>
//         책 이름 : {name}, 가격 : ₩{price}
//         {/* {`책 이름 : ${name}, 가격 : ₩${price}`} */}
//       </div>
//     </div>
//   );
// }

export default function BookComponent(props) {
  return (
    <div>
      <div>
        책 이름 : {props.data.name}, 가격 : ₩{props.data.price}
        {/* {`책 이름 : ${name}, 가격 : ₩${price}`} */}
      </div>
    </div>
  );
}
