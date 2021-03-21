import React, { Component } from 'react';
import axios from 'axios';

class UserComponent extends Component {
  constructor (props){
    super(props);
      this.state = {
        users: []
      }
  }
  componentDidMount() {
    axios.get(`http://localhost:8080/api/users`)
      .then(res => {
        this.setState({users: res.data});
      });
  }


  render() {
    return (
        <div>
            <h2 className="text-center"> User List</h2>
            <div className="row">
                <table id="table1" className="table table-striped table-bordered" style={{padding: 100, marginTop: 50, textAlign: 'center', alignContent: 'center'}}>
                    <tbody>
                        <tr>
                            <th>User ID</th>
                            <th>User First Name</th>
                            <th>User Last Name</th>
                            <th>User Email Id</th>
                        </tr>
                    </tbody>
                    <tbody>
                        {
                            this.state.users.map(
                                users =>
                                    <tr key={users.id}>
                                        <td> {users.id}</td>
                                        <td> {users.firstName} </td>
                                        <td> {users.lastName} </td>
                                        <td> {users.email} </td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>

            </div>
        </div>
    );
}

//   render(){
//     console.log(this.state);
//     return(
//         <h1>Hello</h1>
//     );
//   }
}

export default UserComponent;