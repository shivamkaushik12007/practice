import React,{Component} from 'react';

export default class BookForm extends Component{
    render(){
        return(
            <React.Fragment>
                <div>
                    <p>Enter book name : </p><input type="text" id="bookName1"></input>
                    <p>Enter author name : </p><input type="text" id="bookAuthor1"></input>
                    <p>Enter book id : </p><input type="text" id="bookId1"></input>
                    <button class="addBtn" onClick={()=>this.props.onSubmit(
                        document.getElementById("bookName1").value,
                        document.getElementById("bookAuthor1").value,
                        document.getElementById("bookId1").value
                    )}>ADD</button>
                </div>
            </React.Fragment>
        )
    }
}