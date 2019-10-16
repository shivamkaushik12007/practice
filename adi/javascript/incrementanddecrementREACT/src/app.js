import React,{Component} from 'react'
import ReactDOM from 'react-dom'

export default class App extends Component{
    constructor(){
        super();
        this.state={
            number:0
            // number:
        }
    }
    increment=()=>{
        this.setState((prevState) => {
            return {
                number : prevState.number + 1
            }
        })
    }
    decrement=()=>{
        this.setState((prevState) => {
            return {
                number : prevState.number - 1
            }
        })
    }
    render(){
        return <div>
            <input type="number" id="value"/>
            <h1>Count : {this.state.number}</h1>
            <button onClick={this.increment}>increment the number</button>
            <button onClick={this.decrement}>decrement the number</button>
        </div>
    }
}