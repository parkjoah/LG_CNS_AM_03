// import React from "react";

import BookComponent from "../component/BookComponent";

const Books = [
  { name: "A", price: "10,000" },
  { name: "B", price: "20,000" },
  { name: "C", price: "30,000" },
  { name: "D", price: "40,000" },
  { name: "E", price: "50,000" },
];

export default function LibraryPage() {
  return (
    <div className="container">
      <div align="center">
        섭섭이와 함께하는 즐거운 SPA(React)
        <button type="button" className="btn btn-primary">
          Check
        </button>
      </div>
      <hr />
      {Books.map((book) => {
        return (
          // <BookComponent name={book.name} price={book.price} />
          <BookComponent data={book} />
        );
      })}
    </div>
  );
}
