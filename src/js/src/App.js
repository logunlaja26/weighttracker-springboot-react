import React, { Component } from "react";
import "./App.css";
import { getAllWeights } from "./client";
import { Table } from "antd";

class App extends Component {
  state = {
    weights: [],
  };

  componentDidMount() {
    this.fetchWeights();
  }

  fetchWeights = () => {
    getAllWeights().then((res) =>
      res.json().then((weights) => {
        console.log(weights);
        this.setState({ weights: weights });
      })
    );
  };
  render() {
    const { weights } = this.state;
    if (weights && weights.length) {
      const columns = [
        {
          title: "Weight",
          dataIndex: "weight",
          key: "weight",
        },
        {
          title: "Date",
          dataIndex: "localDate",
          key: "localDate",
        },
      ];

      return <Table dataSource={weights} columns={columns} rowKey="weight" />;
    } else {
      return null;
    }
  }
}

export default App;
