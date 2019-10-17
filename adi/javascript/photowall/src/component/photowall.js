import React, {Component} from 'react';
import Photo from './photo'



function Photowall(props)
{
    return <div className="photogrid">
        {props.post.map((post,index)=><Photo key={index} post={post} onRemove={props.onRemove}/>)}
    </div>
}



/*class Photowall extends Component
{
render()
{
    return <div className="photogrid">
        {this.props.post.map((post,index)=><Photo key={index} post={post}/>)}
    </div>
}
}*/
export default Photowall