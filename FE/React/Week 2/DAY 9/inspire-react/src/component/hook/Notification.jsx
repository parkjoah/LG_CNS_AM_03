import React from "react";

const styles = {
  wrapper: {
    border: "1px solid gray",
    borderRadius: 16,
    display: "flex",
    flexDirection: "row",
    margin: 8,
    padding: 8,
  },
  msgTxt: {
    color: "red",
    fontSize: 16,
  },
};

export class Notification extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      notifications: [],
    };
  }
  componentDidMount() {
    console.log(`Notification componentDidMount ${this.props.id}`);
  }
  componentDidUpdate() {
    console.log(`Notification componentDidUpdate ${this.props.id}`);
  }
  componentWillUnmount() {
    console.log(`Notification componentWillUnmount ${this.props.id}`);
  }
  render() {
    return (
      <div style={styles.wrapper}>
        <span style={styles.msgTxt}>{this.props.msg}</span>
      </div>
    );
  }
}
