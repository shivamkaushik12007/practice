import React,{Component} from 'react';
import 'bootstrap/dist/css/bootstrap.css'
import Navbar from './components/navbar'
import MainPage from './components/mainPage'

class App extends Component{
    render(){
        return <React.Fragment>
            <Navbar/>
            <MainPage/>
            <h1 className="container-fluid">Welcome to the library</h1>
        </React.Fragment>
    }
}

export default App;
