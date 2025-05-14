

import express, { request } from "express";
import { getStatusCode, StatusCodes } from "http-status-codes";
import { createDbConnection } from "./src/config/DbConfig.js";
import cors from "cors"
const router = express.Router();
const conn = createDbConnection();

router.use(cors());

// Welcome Page

router.get("/", (request, response) => {
    response.status(StatusCodes.OK).send({ message: "Welcome to Student CURD Operation" });
});




// SignUp page

router.post("/student", (request, response) => {
    try {
        const data = request.body;

        const qry = `INSERT INTO STUDENTS (ID, NAME, PHONE, MARKS)
                        VALUES (${data.id}, "${data.name}", "${data.phone}", ${data.marks})`;

        conn.query(qry, (error, result) => {
            if (error) {
                if (error.errno == 1062) {
                    response.status(StatusCodes.BAD_REQUEST).send({ message: "ID is duplicate" });
                } else {
                    response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem Inserting Data" });
                }
            } else {
                response.status(StatusCodes.OK).send({ message: "Student Register Successfully" });
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal Error" });
    }
});






// Fetch all Data

router.get("/student", (request, response) => {
    try {
        const query = "select * from students";
        conn.query(query, (error, result) => {
            if (error) {
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in fetching data" });
            } else {
                response.status(StatusCodes.OK).send(result);
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal Srver Problem" });
    }
});



// Select student by ID

router.get("/student/:x", (request, response) => {
    try {
        const id = parseInt(request.params.x);

        const query = `select * from students where id=${id}`;
        conn.query(query, (error, result) => {
            if (error) {
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in fetching data" });
            } else {
                if (result.length == 0) {
                    response.status(StatusCodes.NOT_FOUND).send({ message: `Student with ID=${id} not found` });
                } else {
                    response.status(StatusCodes.OK).send(result[0]);
                }
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal Service Error" });
    }
});





// Delete Student data

router.delete("/student/:x", (request, response) => {
    try {
        const id = parseInt(request.params.x);
        const query = `delete from students where id=${id}`;
        conn.query(query, (error, result) => {
            if (error) {
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem While Deleting Data" });
            } else {
                if (result.affectedRows === 0) {
                    response.status(StatusCodes.NOT_FOUND).send({ message: `Student with ID=${id} not found` });
                } else {
                    response.status(StatusCodes.OK).send({ message: "Student deleted successfully" });
                }

            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal Server Error" });
    }
});



// update student

router.put("/student/:x", (request, response) => {
    try {
        const id = parseInt(request.params.x);
        const data = request.body;
        const query = `update students set name="${data.name}", phone="${data.phone}", marks=${data.marks} where id=${id}`;
        conn.query(query, (error, result) => {
            if (error) {
                response.send(error);
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem while updating" });
            } else {
                response.status(StatusCodes.OK).send({ message: "Student data update successfully" });
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Internal Server Problem" });
    }
});









export default router;