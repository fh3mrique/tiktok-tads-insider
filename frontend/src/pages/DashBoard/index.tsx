import { Link } from "react-router-dom";
import BarCharts from "../../components/BarChart";
import DonutChart from "../../components/DonutChart";
import "./styles.css";
const Dashboard = () => {
  return (
    <div className="container">

      <h1 className="title-dashboard">DashBoard da pesquisa</h1>

      <div className="dashboard-container">

        <div className="donut-chart-container">
          <h2>% das Ide´s mais amadas pelos estudantes</h2>
          <BarCharts />
        </div>
        <div className="bar-chart-container">
          <h2>% das Lingugens mais amadas pelos estudantes</h2>
          <DonutChart />
        </div>

      </div>
      
      <Link to="/registros" className="button-dashboard-container">
          <button className="button-dashboard">Ver registros</button>
      </Link>

    </div>
  );
};

export default Dashboard;
