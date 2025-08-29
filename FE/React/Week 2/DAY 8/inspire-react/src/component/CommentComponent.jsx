const styles = {
  wrapper: {
    display: "flex",
    flexDirection: "row",
    border: "1px solid grey",
    borderRadius: 16,
    margin: 8,
    padding: 8,
  },

  image: {
    width: 50,
    height: 50,
    borderRadius: 25,
  },
  content: {
    display: "flex",
    flexDirection: "column",
    justifyContent: "center",
    marginLeft: 8,
  },
  nameTxt: {
    color: "green",
    fontSize: 16,
    fontWeight: "bold",
  },
  commentTxt: {
    color: "red",
    fontSize: 16,
  },
};

export default function CommentComponent({ name, comment }) {
  return (
    <div style={styles.wrapper}>
      <div>
        <img
          style={styles.image}
          src="https://upload.wikimedia.org/wikipedia/commons/8/89/Portrait_Placeholder.png"
          alt=""
        />
      </div>
      <div style={styles.content}>
        <span style={styles.nameTxt}>{name}</span>
        <span style={styles.commentTxt}>{comment}</span>
      </div>
    </div>
  );
}
