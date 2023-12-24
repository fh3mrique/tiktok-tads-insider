import "./styles.css";

const Form = () => {
  return (
    <>
      <div className="form-container">
        <form>
          <h2>Cadastre uma nova pesquisa</h2>
          <div className="form-group">
            <label htmlFor="nome">Digite seu nome</label>
            <input type="text" className="form-control" />
          </div>
          <div className="form-group">
            <label htmlFor="nome">Qual é a sua idade</label>
            <input type="number" className="form-control" />
          </div>

          <div className="form-group">
            <label htmlFor="exampleFormControlSelect1">Qual é a sua linguagem favorita</label>
            <select className="form-control" id="exampleFormControlSelect1">
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
          </div>

          <button className="btn-submit">Cadastrar</button>
        </form>
      </div>
    </>
  );
};

export default Form;
