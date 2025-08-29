import CommentComponent from "../component/CommentComponent";

const comments = [
  { name: "임섭섭", comment: "react 재미있어요 ~" },
  { name: "이현진", comment: "저도 배워보고 싶어요" },
  { name: "섭섭해", comment: "목이 아프당 ㅠㅠ" },
];

export default function CommentPage() {
  return (
    <div>
      {comments.map((c) => {
        return <CommentComponent name={c.name} comment={c.comment} />;
      })}
    </div>
  );
}
