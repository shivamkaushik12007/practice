import React,{Component} from 'react';
import RecentBooksList from './recentBooksList'

class MainPage extends Component{
    render(){
        return <React.Fragment className="row">
            <RecentBooksList/>
        </React.Fragment>
            
    }
}

export default MainPage;