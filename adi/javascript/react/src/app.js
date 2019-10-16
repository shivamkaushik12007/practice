import React,{Component} from 'react'
import ReactDOM from 'react-dom'
import Person from './person.js'
// let person=[{
//     name:"a",
//     id:1
// },
// {
//     name:"b",
//     id:2
// },
// {
//     name:"c",
//     id:3
// },
// ]

// export default class App extends Component{
//     render(){
//         // return <div>
//         //     <Person name={person[0].name} id={person[0].id}/>
//         //     <Person name={person[1].name} id={person[1].id}/>
//         //     <Person name={person[2].name} id={person[2].id}/>
//         // </div>
//         return<div>{person.map((p)=>{
//                 return <Person  name={p.name} id={p.id}/>
//             })
//         }</div>
//     }
// }



export default class App extends Component{
    constructor(){
        super();
        this.state={
             person:[{
                    name:"a",
                    id:1
                },
                {
                    name:"b",
                    id:2
                },
                {
                    name:"c",
                    id:3
                },
            ]
        }
    }
    nameChange=()=>{
        // console.log("hello");
       return  this.setState(
            {
            person:[{
                name:"ab",
                id:1
            },
            {
                name:"bc",
                id:2
            },
            {
                name:"cd",
                id:3
            },
        ]
    });
    }
    render(){
        return<div>
        {this.state.person.map((p)=>{
                return<Person  name={p.name} id={p.id}/>
            })
        }
        <button onClick={this.nameChange}>click me</button>
        </div>
    }
}
