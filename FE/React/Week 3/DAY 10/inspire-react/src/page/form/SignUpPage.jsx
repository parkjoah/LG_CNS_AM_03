import { useState } from "react";
import api from "../../api/axios";
import { useNavigate } from "react-router-dom";

export const SignUpPage = () => {
  const [email, setEmail] = useState("");
  const [passwd, setPasswd] = useState("");
  const [gender, setGender] = useState("");

  // 컴포넌트 이동을 위한 useNavigate()훅 사용
  const moveUrl = useNavigate();

  const emailHandler = (e) => {
    setEmail(e.target.value);
    console.log(">>" + email);
  };
  const passwdHandler = (e) => {
    setPasswd(e.target.value);
  };
  const genderHandler = (e) => {
    setGender(e.target.value);
    console.log(">>" + gender);
  };

  const submitHandler = async (email, passwd, gender) => {
    // e.preventDefault();
    console.log(email, passwd, gender);
    /*
    fetch api, axios 통신을 통해서 데이터를 전달받고 필요한 경우 화면 전환 및 전달받은 데이터를
    props 전달 또는 
    context api나 외부전역상태관리 라이브러리를 이용해서 공유할 수 있다.
    */

    const data = {
      email, //email :email 경우 축약문법!!
      passwd,
      gender,
    };

    /*
    post : 입력
    get : 데이터 가져올 때
    put : 데이터 수정
    delete : 데이터 삭제
    */

    try {
      const response = await api.post("users", data);
      console.log("axios /users post >> ", response);
      if (response.status === 201) {
        //router-dom 이용해서 컴포넌트 transition
        moveUrl("/loginForm");
      }
    } catch (err) {
      console.log(err);
    } finally {
    }
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
        <label>성별 : </label>
        <select value={gender} onChange={genderHandler}>
          <option value="M">남자</option>
          <option value="F">여자</option>
        </select>
        <br />
      </form>
      <button
        type="button"
        onClick={() => submitHandler(email, passwd, gender)}
      >
        가입
      </button>
    </div>
  );
};
