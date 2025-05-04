
import { createConnection } from "mysql2";



export function createDbConnection(){
    var conn = createConnection({
        host:"localhost",
        user:"root",
        password:"cdac",
        database:"cdac_wpt"
    });
    conn.connect((error) => {
        if(error){
            console.log(error);
        }else{
            console.log("Db connected..");
        }
    });
    return conn;
}