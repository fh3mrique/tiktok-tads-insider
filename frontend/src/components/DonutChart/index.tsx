import Chart from "react-apexcharts";
import "./styles.css"

const mockData = {
  series: [2, 3, 1, 2, 2],
  labels: ["Java", "JavaScript", "Pithon", "C", "C++"],
};

const options = {
  legend: {
    show: true,
  },
};

const DonutChart = () => {
  return (
    <div className="donut-chart-layout">
      <Chart
        options={{ ...options, labels: mockData.labels }}
        series={mockData.series}
        type="donut"
        height="300"
      />
    </div>
  );
};

export default DonutChart;
