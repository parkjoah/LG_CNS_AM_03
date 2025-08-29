import GuestGreeting from "./GuestGreeting";
import UserGreeting from "./UserGreeting";

const Greeting = (props) => {
  const isFlag = props.isFlag;

  // if (isFlag) {
  //   return <UserGreeting />;
  // } else {
  //   return <GuestGreeting />;
  // }

  return isFlag ? <UserGreeting /> : <GuestGreeting />;
};

export default Greeting;
