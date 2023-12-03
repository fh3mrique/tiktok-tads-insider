import { Link } from "react-router-dom";

const Table = () => {
  return (
    <>
      <div>Local onde ficará uma tabela com todos registro da pesquisa</div>

      <Link to="/pesquisa">
        <button className="btn btn-primary">Cadastra nova pesquisa</button>
      </Link>
    </>
  );
};

export default Table;
