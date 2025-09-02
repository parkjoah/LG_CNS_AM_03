import { useEffect, useState } from "react";
import { WeatherBox } from "./component/openapi/weather/WeatherBox";

import "./component/openapi/css/weather.css";
import { WeatherButton } from "./component/openapi/weather/WeatherButton";

import { ThreeDots } from "react-loader-spinner";

export const WeatherApp = () => {
  const apiKey = process.env.REACT_APP_OPENAPI_KEY;

  const [weather, setWeather] = useState(null);

  /////////// optional chaining
  const obj = { name: "jslim", age: 20 };
  console.log(obj?.name); // obj가 null일 경우 undefined을 반환함
  /////////////////////////////

  const cityAry = ["Busan", "Paris", "New York", "GwangJu"];
  const [city, setCity] = useState("");

  ////ThreeDot spinner
  const [visible, setVisible] = useState(false);

  const getCurrentLocation = () => {
    navigator.geolocation.getCurrentPosition((position) => {
      let lat = position.coords.latitude;
      let lon = position.coords.longitude;
      getWeatherByCurrentLocation(lat, lon);
      setCity("");
    });
  };

  const getWeatherByCurrentLocation = async (lat, lon) => {
    let url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${apiKey}&units=metric`;
    setVisible(true);

    const res = await fetch(url);
    const data = await res.json();
    console.log(data);
    setWeather(data);
    setVisible(false);
  };

  /*
  Quiz)
  - 버튼 이벤트 처리 방법을 고민
  - 해당 버튼의 이벤트 발생시 endpoint 에 q=선택된 도시명 을 포함해서 전달하고
  - WeatherBox 의 정보가 리렌더링 되도록 한다.

  Quiz Additional
  - 현재 Current Location 버튼은 이벤트가 걸려있지 않습니다,
  - 이벤트 등록하고 버튼 클릭시 새롭게 데이터를 받아 올 수 있도록 try!!
  */

  const getWeatherByCity = async () => {
    let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;
    setVisible(true);
    const res = await fetch(url);
    const data = await res.json();
    console.log(data);
    setWeather(data);
    setVisible(false);
  };

  useEffect(() => {
    city !== "" && getWeatherByCity();
  }, [city]);

  const changeCity = (item) => {
    setCity(item);
  };

  return (
    <div className="container">
      <div>
        <ThreeDots
          height="80"
          width="80"
          radius="9"
          color="#4fa94d"
          ariaLabel="three-dots-loading"
          visible={visible}
        />
      </div>

      <WeatherBox weather={weather} />
      <WeatherButton
        cities={cityAry}
        btnHandler={changeCity}
        location={getCurrentLocation}
        city={city}
      />
    </div>
  );
};
