export const WeatherBox = ({ weather }) => {
  /*
    현재위치, 기온, 날씨
  */
  return (
    <div className="weather-box">
      <div>{weather?.name}</div>
      <div>
        {weather?.main.temp}C - {weather?.main.temp * 1.8 + 32}F
      </div>
      <div>{weather?.weather[0].description}</div>
    </div>
  );
};
