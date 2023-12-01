import { BrowserRouter, Route, Routes } from "react-router-dom"
import Home from "./pages/Home"
import Header from "./components/Header"
import Dashboard from "./pages/DashBoard"
import Table from "./pages/Table"


const Rotas = () => {
  return (
    <BrowserRouter>
        <Header/>
        <Routes>
            <Route path="/" element = {<Home/>}/>
            <Route path="/dashboard" element = {<Dashboard/>}/>
            <Route path="/registros" element = {<Table/>}/>
        </Routes>
    
    </BrowserRouter>
  )
}

export default Rotas