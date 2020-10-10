import React, { Component } from "react";
//import Container from "./Container";
import "./App.css";
import { getAllWeights } from "./client";
import { Table, Spin } from "antd";
import { LoadingOutlined } from "@ant-design/icons";

const getIndicatorIcon = () => (
  <LoadingOutlined style={{ fontSize: 24 }} spin />
);

class App extends Component {
  state = {
    weights: [],
    isFetching: true,
  };

  componentDidMount() {
    this.fetchWeights();
  }

  fetchWeights = () => {
    this.setState({ isFetching: true });
    getAllWeights().then((res) =>
      res.json().then((weights) => {
        console.log(weights);
        this.setState({ weights: weights, isFetching: false });
      })
    );
  };
  render() {
    const { weights, isFetching } = this.state;
    if (isFetching) {
      return (
        <container>
          <Spin indicator={getIndicatorIcon()} />
        </container>
      );
    }
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
