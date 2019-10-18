import React,{Component} from 'react'
export default class RecentBooksList extends Component{
    state={
        bookList:[
            {name:"b1",author:"a1",id:"1.1"},
            {name:"b2",author:"a2",id:"1.2"},
            {name:"b3",author:"a3",id:"1.3"},
            {name:"b4",author:"a4",id:"1.4"}
        ]
        
    }
    render(){
        return(
            <React.Fragment>
                <table className='table container-fluid mx-auto'>
                    <thead>
                        <tr>
                            <th>Book name</th>
                            <th>Book author</th>
                            <th>Book id</th>
                        </tr>
                    </thead>
                    <tbody>
                        {/* <tr>
                            <th>id 1</th>
                            <th>Book 1</th>
                        </tr>
                        <tr>
                            <th>id 2</th>
                            <th>Book 2</th>
                        </tr> */}
                        {this.state.bookList.map(book=>
                            <tr>
                                <td>{book.name}</td>
                                <td>{book.author}</td>
                                <td>{book.id}</td>
                            </tr>
                        )}
                    </tbody>
                </table>
            </React.Fragment>
        )
    }
}
