import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

import "./styles.css";

const Form: React.FC = () => {
  const navigate = useNavigate();

  const [formData, setFormData] = useState({
    nome: "",
    idade: 0,
    linguagemId: 1,
  });

  const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: name === "idade" ? parseInt(value, 10) : value,
    }));
  };

  const handleSubmit = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    try {
      await axios.post("http://localhost:8081/pesquisa", formData);
      // Após o sucesso do cadastro, redirecione para a rota /registros
      navigate("/registros");
    } catch (error) {
      // Handle error, e.g., show an error message
      console.error("Erro ao cadastrar pesquisa:", error);
    }
  };

  return (
    <>
      <div className="form-container">
        <form onSubmit={handleSubmit}>
          <h2>Cadastre uma nova pesquisa</h2>
          <div className="form-group">
            <label htmlFor="nome">Digite seu nome</label>
            <input
              type="text"
              className="form-control"
              name="nome"
              value={formData.nome}
              onChange={handleChange}
            />
          </div>
          <div className="form-group">
            <label htmlFor="idade">Qual é a sua idade</label>
            <input
              type="number"
              className="form-control"
              name="idade"
              value={formData.idade}
              onChange={handleChange}
            />
          </div>

          <div className="form-group">
            <label htmlFor="linguagemId">Qual é a sua linguagem favorita</label>
            <select
              className="form-control"
              id="exampleFormControlSelect1"
              name="linguagemId"
              value={formData.linguagemId}
              onChange={handleChange}
            >
              <option value={1}>1</option>
              <option value={2}>2</option>
              <option value={3}>3</option>
              <option value={4}>4</option>
              <option value={5}>5</option>
            </select>
          </div>

          <button type="submit" className="btn-submit">
            Cadastrar
          </button>
        </form>
      </div>
    </>
  );
};

export default Form;
