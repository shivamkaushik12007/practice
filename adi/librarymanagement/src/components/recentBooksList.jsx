import React,{Component} from 'react'
import AddBook from './addBook'
import BookForm from './bookForm'
export default class RecentBooksList extends Component{
    constructor(){
        super();
        this.state={
            bookList:[
                {name:"b1",author:"a1",id:"1.1"},
                {name:"b2",author:"a2",id:"1.2"},
                {name:"b3",author:"a3",id:"1.3"},
                {name:"b4",author:"a4",id:"1.4"}
            ]
            
        }
        this.addBook=this.addBook.bind(this);
        this.delete=this.delete.bind(this);
        this.submit=this.submit.bind(this);
    }
    
    addBook(){
        let b1=document.getElementById("bookName").value;
        let b2=document.getElementById("bookAuthor").value;
        let b3=document.getElementById("bookId").value;

        let temp={name:b1,author:b2,id:b3}
        this.state.bookList.push(temp);
        this.setState({temp});
    }

    delete(index){
        this.setState(state=>({
            bookList:state.bookList.filter(books=>books.id!==index)
        }))
    }

    submit(b1,b2,b3){
        let temp={name:b1,author:b2,id:b3}
        this.state.bookList.push(temp);
        this.setState({temp});
    }

    render(){
        return(
            <React.Fragment>
                {/* <form>
                    <p>Enter book name : </p><input type="text" id="bookName"></input>
                    <p>Enter author name : </p><input type="text" id="bookAuthor"></input>
                    <p>Enter book id : </p><input type="text" id="bookId"></input>
                    // <button class="btn" onClick={this.addBook}>ADD</button> 
                    <AddBook onAdd={this.addBook}></AddBook>
                </form> */}
                <table className='table container-fluid mx-auto'>
                    <thead>
                        <tr>
                            <th>Book name</th>
                            <th>Book author</th>
                            <th>Book id</th>
                            <th>options</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><input type="text" id="bookName"></input></td>
                            <td><input type="text" id="bookAuthor"></input></td>
                            <td><input type="text" id="bookId"></input></td>
                            <td><AddBook onAdd={this.addBook}></AddBook></td>
                        </tr>
                        {/* <tr>
                            <th>id 1</th>
                            <th>Book 1</th>
                        </tr>
                        <tr>
                            <th>id 2</th>
                            <th>Book 2</th>
                        </tr> */}
                        {this.state.bookList.map((book, index)=>
                            <tr key = {index}>
                                <td>{book.name}</td>
                                <td>{book.author}</td>
                                <td>{book.id}</td>
                                <td><button className="addBtn" onClick={()=>this.delete(book.id)}>Delete</button></td>
                            </tr>
                        )}
                    </tbody>
                </table>
                <BookForm onSubmit={this.submit}></BookForm>            
            </React.Fragment>
        )
    }
}
