import React,{Component} from 'react'
import ReactDOM from 'react-dom'
import { realpathSync } from 'fs';
const element=React.createElement('h1',null,'hello world');
ReactDOM.render(element,document.getElementById('root'));
//creating list element
const ele1=React.createElement('ol',null,
    React.createElement('li',null,'todo1'),
    React.createElement('li',null,'todo2'),
    React.createElement('li',null,'todo3')
)
ReactDOM.render(ele1,document.getElementById('list1'));

//creating list element using map
const tasks=['map1','map2','map3'];
const ele2=React.createElement('ol',null,
    tasks.map((task,index)=>{
        return React.createElement('li',{key:index},task)
    })
);
ReactDOM.render(ele2,document.getElementById('list2'));

//JSX
const tasks1=['jsx1','jsx2','jsx3'];
const ele3=<ol>
    {/* <li>list1</li>
    <li>list2</li>
    <li>list3</li> */}
    <li>{tasks1[0]}</li>
    <li>{tasks1[1]}</li>
    <li>{tasks1[2]}</li>
</ol>
ReactDOM.render(ele3,document.getElementById('list3'));

//list using map in jsx
const tasks2=['mJSX1','mJSX2','mJSX3'];
const ele4=<ol>
    {tasks2.map((task,index)=>{
       return <li key={index}>{task}</li>
    })}
</ol>
ReactDOM.render(ele4,document.getElementById('list4'));

//components in react 
class List extends Component{
    render(){
        return <ol>
                {/* <li>list1</li>
                <li>list2</li>
                <li>list3</li> 
                <li>list4</li>  */}
                { this.props.tasks.map((task)=>{
                        return <li>{task}</li>
                    })
                }
            </ol>
    }
}
class Title extends Component{
    render(){
        return <title>react title class</title>
    }
}
class ListHead extends Component{
    render(){
        return <h3>
            header of the list
        </h3>
    }
}
class Main extends Component{
    render(){
    return <div>
        <Title/>
        <ListHead/>
        <List tasks={['l1','l2','l3']}/>
        <List tasks={['m1','m2','m3']}/>
        <List tasks={['n1','n2','n3']}/>
    </div>
    }
}
ReactDOM.render(<Main/>,document.getElementById("list5"))
