import axios from "axios"


export function fetchAllStudents(){
    return axios.get("http://127.0.0.1:4600/student");
}


export function registerStudent(formData){
    return axios.post("http://127.0.0.1:4600/student", formData)
}

