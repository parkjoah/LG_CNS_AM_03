import axios from "axios";

const url = process.env.REACT_APP_JSON_SERVER_URL;
const api = axios.create({
  baseURL: url,
  withCredentials: true, //인증 같이 포함 하겠다~
});

export default api;

/*
인터셉터(request, response) 개념을 이용해서
- 인증된 사용자의 엑세스 토큰 확인
- 토큰이 만료된 경우 자동 재발급 요청..

비동기 통신을 할 때 브라우저 보안 정책으로 인한 CORS 문제가 발생함..
Cross-Origin-Resource Sharing..


*/
