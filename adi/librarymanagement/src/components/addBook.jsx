import React,{Component} from 'react'
// import RecentBooksList from './recentBooksList'
export default class AddBook extends Component{
    render(){
        return(
            <React.Fragment>
                <form>
                    <p>Enter book name : </p><input type="text" id="bookName"></input><br></br>
                    <p>Enter author name : </p><input type="text" id="bookAuthor"></input><br></br>
                    <p>Enter book id : </p><input type="text" id="bookId"></input><br></br>
                    <button class="btn">ADD</button>
                </form>
            </React.Fragment>
        )
    }
}