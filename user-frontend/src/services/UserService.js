import axios from 'axios';

const USERS_REST_API_URL = "http://localhost:8080/api/users";


// fetches the restAPI

class UserService{

    getUsers () {
        axios.get(USERS_REST_API_URL);
    }

}


//Creating a new object of this class
export default new UserService();