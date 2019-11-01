// import React,{Component} from 'react';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.css'
import Navbar from './components/navbar'
import MainPage from './components/mainPage'
// import AddBook from './components/addBook'
 import {Route,BrowserRouter} from 'react-router-dom'
import RecentBooksList from './components/recentBooksList';
// class App extends Component{
//     // render(){
//     //     return <React.Fragment>
//     //         <Navbar/>
//     //         <h1 className="container-fluid">Welcome to the library</h1>
//     //         <MainPage/>
//     //         <button className="btn"  >update</button>
//     //     </React.Fragment>
//     // }
    
// }


// export default App;

function App(){
    return(
        <BrowserRouter>
            <div className='row'>
                <div className='col'>
                    <Navbar/>
                </div>
            </div>
            <switch>
                <Route path="/" exact component={MainPage}></Route>
                <Route path="/RecentBooksList" component={RecentBooksList}></Route>
            </switch>
        </BrowserRouter>
    )
}

export default App;
