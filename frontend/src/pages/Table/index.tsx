import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import { Pesquisa, PesquisaResponse } from "../../types/Pesquisa";

const Table = () => {
  let [pesquisa, setPesquisas] = useState<PesquisaResponse>();

  useEffect(() => {
    axios.get("http://localhost:8081/pesquisa?LinesPerPage=12").then((response) => setPesquisas(response.data));
  }, []);

  return (
    <>
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Nome</th>
            <th scope="col">Idade</th>
            <th scope="col">Linguagem Favorita</th>
          </tr>
        </thead>
        <tbody>

          {pesquisa?.content.map((pesquisa) => (
            <tr key={pesquisa.id}>
            <th scope="row">{pesquisa.id}</th>
            <td>{pesquisa.nome}</td>
            <td>{pesquisa.idade}</td>
            <td>{pesquisa.linguagemFavorita}</td>
          </tr>
          ))}
        </tbody>
      </table>

      <Link to="/pesquisa">
        <button className="btn btn-primary">Cadastrar nova pesquisa</button>
      </Link>
    </>
  );
};

export default Table;
