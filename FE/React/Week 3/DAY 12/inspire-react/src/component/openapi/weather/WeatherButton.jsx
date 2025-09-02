import React from "react";
import { Button } from "react-bootstrap";

export const WeatherButton = ({ cities, btnHandler, location, city }) => {
  return (
    <div className="weather-btn">
      <Button
        className="btn "
        onClick={location}
        variant={`${city === null ? "outline-warning" : "warning"}`}
      >
        Current Location
      </Button>
      {cities.map((c, idx) => (
        <Button
          className="btn"
          key={idx}
          onClick={() => btnHandler(c)}
          variant={`${city === c ? "outline-warning" : "warning"}`}
        >
          {c}
        </Button>
      ))}
    </div>
  );
};
