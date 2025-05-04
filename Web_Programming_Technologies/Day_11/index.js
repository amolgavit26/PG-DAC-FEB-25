
import express, { request, response } from "express";
import { StatusCodes } from "http-status-codes";
import { createDbConnection } from "./src/config/DbConfig.js"
import { hashSync } from "bcrypt";

const PORT = 7800;
const app = express();
app.use(express.json());

const conn = createDbConnection();

app.get("/", (request, response) => {
    response.status(StatusCodes.OK).send({ message: "Welcome to Student CURD" });
});


app.post("/admin/login",(request, response) => {
    try {
        const requestData = request.body;
        const query = `select * from admin where username="${requestData.username}"`;
        conn.query(query, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "plsease try again later" });
            } else {
                console.log(result)
                response.status(StatusCodes.OK).send(result);
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Invalid password" });
    }
});


// Register the admin

app.post("/admin", (request, response) => {
    try {
        const data = request.body;
        const encryptedPassword = hashSync(data.password, 10);      // Decrypt data
        data.password = "";
        const query = `insert into admin values(${data.id}, "${data.name}", "${data.username}", "${encryptedPassword}")`;
        conn.query(query, (error, result) => {
            if (error) {
                if (error.errno == 1062) {
                    response.status(StatusCodes.BAD_REQUEST).send({ message: "Id is duplicate" });
                } else {
                    console.log(error);
                    response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem inserting data" });
                }
            } else {
                response.status(StatusCodes.OK).send({ message: "Admin registred" });
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal error" });
    }
});

// add data

app.post("/student", (request, response) => {
    try {
        const data = request.body;
        const query = `insert into student values(${data.id}, "${data.name}", "${data.phone}", ${data.marks})`;
        conn.query(query, (error, result) => {
            if (error) {
                if (error.errno == 1062) {
                    response.status(StatusCodes.BAD_REQUEST).send({ message: "Id is duplicate" });
                } else {
                    console.log(error);
                    response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem inserting data" });
                }
            } else {
                response.status(StatusCodes.OK).send({ message: "Student enter succcesfully" });
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal error" });
    }
});


// Fetch all data

app.get("/student", (request, response) => {
    try {
        const query = "select * from student";
        conn.query(query, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in fetcing data" });
            } else {
                response.status(StatusCodes.OK).send(result);
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal error" });
    }
});


// Fetch only one selected data

app.get("/student/:x", (request, response) => {
    try {
        const id = parseInt(request.params.x);
        const query = `select * from student where id=${id}`;
        conn.query(query, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in fetcing data" });
            } else {
                if (result.length === 0) {
                    response.status(StatusCodes.NOT_FOUND).send({ message: `Student with id ${id} not found.` });
                } else {
                    response.status(StatusCodes.OK).send(result[0]);
                }
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal error" });
    }
});



// Delete data

app.delete("/student/:x", (request, response) => {
    try {
        const id = parseInt(request.params.x);
        const query = `delete from student where id=${id}`;
        conn.query(query, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in fetcing data" });
            } else {
                response.status(StatusCodes.OK).send({ message: "Student deleted" });
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal error" });
    }
});


// Update data

app.put("/student/:x", (request, response) => {
    try {
        const id = parseInt(request.params.x);
        const data = request.body;
        const query = `update student set name="${data.name}", phone="${data.phone}", marks=${data.marks} where id = ${data.id}`;
        conn.query(query, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in fetcing data" });
            } else {
                response.status(StatusCodes.OK).send({ message: "Student data updated"});
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem while updating data" });
    }
});




app.listen(PORT, () => {
    console.log(`Server is running on ${PORT}`);

});