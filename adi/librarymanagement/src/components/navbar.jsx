import React,{Component} from 'react'
import {Link} from 'react-router-dom'
export default class Navbar extends Component{
    render(){
        return <React.Fragment>
            <div className="container-fluid">
                <nav className="navbar navbar-expand-lg navbar-dark bg-dark mx-auto">
                     {/* eslint-disable-next-line */}
                    <Link className="navbar-brand" to="/">Navbar</Link>
                    <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>

                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav mr-auto">
                        <li className="nav-item active">
                            {/* eslint-disable-next-line */}
                            <Link className="nav-link" to="/RecentBooksList">Home <span className="sr-only">(current)</span></Link>
                        </li>
                        <li className="nav-item">
                             {/* eslint-disable-next-line */}
                            <Link className="nav-link" to="#">Link</Link>
                        </li>
                        <li className="nav-item dropdown">
                             {/* eslint-disable-next-line */}
                            <Link className="nav-link dropdown-toggle" to="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Dropdown
                            </Link>
                            <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                                 {/* eslint-disable-next-line */}
                            <Link className="dropdown-item" to="#">Action</Link>
                             {/* eslint-disable-next-line */}
                            <Link className="dropdown-item" to="#">Another action</Link>
                             {/* eslint-disable-next-line */}
                            <div className="dropdown-divider"></div>
                             {/* eslint-disable-next-line */}
                            <Link className="dropdown-item" to="#">Something else here</Link>
                            </div>
                        </li>
                        {/* <li className="nav-item">
                            <a className="nav-link disabled" to="#" tabindex="-1" aria-disabled="true">Disabled</a>
                        </li> */}
                        </ul>
                        <form className="form-inline my-2 my-lg-0">
                        <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
                        <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form>
                    </div>
                </nav>
            </div>
        </React.Fragment>
    }
}