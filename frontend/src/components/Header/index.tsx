import "./styles.css";
import githubIcon from "../../assets/githubIcon.svg";
import { Link } from "react-router-dom";

const Header = () => {
  return (
    <div className="header-container">
      <div className="header-content">
        <Link to="/" style={{ textDecoration: 'none' }}>
          <h3 className="logo">
            Tads <span>Tiktok</span> Insight
          </h3>
        </Link>

        <div className="github">
          <img src={githubIcon} />
          <a href="https://github.com/fh3mrique">/Projeto</a>
        </div>
      </div>
    </div>
  );
};

export default Header;
