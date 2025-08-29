import { useState } from "react";
import { useNavigate } from "react-router-dom";
import api from "../../api/axios";

export const SignInPage = () => {
  const [email, setEmail] = useState("");
  const [passwd, setPasswd] = useState("");

  // 컴포넌트 이동을 위한 useNavigate()훅 사용
  const moveUrl = useNavigate();

  const emailHandler = (e) => {
    setEmail(e.target.value);
    console.log(">>" + email);
  };
  const passwdHandler = (e) => {
    setPasswd(e.target.value);
  };
  const submitHandler = async (email, passwd) => {
    // 인증(Authentication).. - JWT(Json Web Token)
    // select * from from table where email=? and passwd=?
    // access token(header)
    // 다시 요청시 해당 토큰을 axios 헤더에 담아서 전달해야함 !
    /* 인증 x -> 인가 o
      api.get(`/login?email=?passwd=?`)
      
      api.get(`/login`,{
        headers:{
          Authorization : `Bearer ${tokenn}`
        }
      })
    */
    // const response = await api.get(`/users?email=${email}&passwd=${passwd}`);
    // console.log("axios /user get >> response >>> ", response);
    // if (response.status === 200) {
    //   moveUrl("/todo/list", { state: response.data });
    // }
    await api
      .get(`/todos`)
      .then((response) => {
        moveUrl(`/todos/list`, { state: response.data });
      })
      .catch((err) => {
        console.log("err >>", err);
      });
  };

  return (
    <div>
      <form>
        <label>이메일 : </label>
        <input
          type="text"
          placeholder="email"
          value={email}
          onChange={emailHandler}
        />
        <br />
        <label>비밀번호 : </label>
        <input
          type="text"
          placeholder="password"
          value={passwd}
          onChange={passwdHandler}
        />
        <br />
      </form>
      <button type="button" onClick={() => submitHandler(email, passwd)}>
        로그인
      </button>
    </div>
  );
};
