import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";
import { getAllWeight } from "./client";
import { render } from "@testing-library/react";

class App extends Component {
  render() {
    getAllWeight().then((res) =>
      res.json().then((weight) => {
        console.log(weight);
      })
    );
    return <h1>Hello Spring Boot</h1>;
  }
}

export default App;
