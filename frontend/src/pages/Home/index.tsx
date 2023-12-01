import "./styles.css";
import imgHome from "../../assets/tecnico.jpg";
import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div className="home-container">
      <div className="text-home-container">
        <h1 className="text-home">
          Quais as tecnologias os estudantes de TADS estão mais usando?
        </h1>

        <h3 className="text-subtitle">
          Clique no botão abaixo e saiba quais são as tecnologias mais
          utilizadas pelos estudantes de TADS.
        </h3>

        <Link to="dashboard">
          <button className="home-btn">Quero saber quem são</button>
        </Link>
      </div>

      <div className="img-container">
        <img className="img-home" src={imgHome} alt="" />
      </div>
    </div>
  );
};

export default Home;
