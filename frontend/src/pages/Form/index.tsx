import './styles.css'

/* Vc pode colocar aqui a função que vai implementar o Observer (deixe isso para fazer depois 
que o form que o formulario tiver pronto e estilizado)*/

// essa função vai ser chamada quando o usuario clicar enviar o formulario, ela 
//deverá notificar com algum componente na tela modal, alerta, alguma coisa que 
//informe que a pesquisa foi cadastrada (vai da sua criatividade)

const Form = () => {
  return (
    <>
        {/* Aqui dentro dessa tag sem nada e que vc coloca o "html" do form. 
        se vc reparar vai ver que o nome do arquivo é index.tsx inves de index.html
        em resumo é a mesma coisa do html normal, só que com algumas diferenças: 
        ex: tem que colocar className inves de class quando for botar uma classe na tag*/}

        <div className='form-container'>
            <form action="" method="post">
                {/* os unicos inputs que são obrigatórios para a pesquisa ficar armazenado no backend
                 são os que perguntam o nome, a linguagem é a ide favorita (esses ultimos 2 deverão 
                 ser inpusts do tipo select) de resto vc pode modelar a pesquisa do jeito que quiser*/}
            </form>
        </div>

        
    </>
  )
}

export default Form