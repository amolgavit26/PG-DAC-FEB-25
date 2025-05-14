import express from "express";
import { createDbConnection } from "./src/config/DbConfig.js"
import CURD from "./CURD.js"


const PORT = 4600;


const app = express();
app.use(express.json());

const conn = createDbConnection();


app.use("/", CURD);




app.listen(4600, () => {
    console.log(`Server is running on`);
});



