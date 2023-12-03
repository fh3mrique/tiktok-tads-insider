import { BrowserRouter, Route, Routes } from "react-router-dom"
import Home from "./pages/Home"
import Header from "./components/Header"
import Dashboard from "./pages/DashBoard"
import Table from "./pages/Table"
import Form from "./pages/Form"


const Rotas = () => {
  return (
    <BrowserRouter>
        <Header/>
        <Routes>
            <Route path="/" element = {<Home/>}/>
            <Route path="/dashboard" element = {<Dashboard/>}/>
            <Route path="/registros" element = {<Table/>}/>
            <Route path="/pesquisa" element = {<Form/>}/>
        </Routes>
    
    </BrowserRouter>
  )
}

export default Rotas