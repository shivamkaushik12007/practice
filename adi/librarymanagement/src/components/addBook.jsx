import React,{Component} from 'react'
// import RecentBooksList from './recentBooksList'
// export default class AddBook extends Component{
//     render(){
//         return(
//             <React.Fragment>
//                 <form>
//                     <p>Enter book name : </p><input type="text" id="bookName"></input>
//                     <p>Enter author name : </p><input type="text" id="bookAuthor"></input>
//                     <p>Enter book id : </p><input type="text" id="bookId"></input>
//                     <button class="btn">ADD</button>
//                 </form>
//             </React.Fragment>
//         )
//     }
// }
export default class AddBook extends Component{
    render(){
        return(
            <div>
                <button className="addBtn" onClick={()=>this.props.onAdd()}>add</button>
            </div>
        )
    }
}