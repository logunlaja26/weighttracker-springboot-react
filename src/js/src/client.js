import fetch from "unfetch";

export const getAllWeights = () => fetch("api/weight");
