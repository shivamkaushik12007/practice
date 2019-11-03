import React,{Component} from 'react';
// import {Component} from 'react';
// import RecentBooksList from './recentBooksList'

class MainPage extends Component{
    constructor(){
        super();
        console.log("constructor is called");
    }

    componentDidMount(){
        console.log("component is mounted");
        fetch('http://localhost:3000/bookList')
        .then(res=>{
            return res.json();
        })
        .then(res=>{
            console.log(JSON.stringify(res));
            this.setState({bookList:res});
            console.log(this.state.bookList);
        })
    }
    state={
        bookList:[]
    }
    render(){
        // return <React.Fragment className="row">
        //     <RecentBooksList/>
        //</React.Fragment>
        //   return "hello"  /
        return(
            "hello"
        )
    }
}

export default MainPage;