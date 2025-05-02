/*

npm install package-name;
npm install express;
npm install bcrypt;


when w einstall 3rd party module/package it entry will go into 
package.jason File, also it will create a new folder node_modules & 
one file pacakge-Lock.json

all the downloaded dependancies folder and files will go inside of
node_modules

package-lock.jason file take records of all files and project 
present inside the node_modules


Q why package.jason file maintains the name of dependancies?
    If we want to shear the project or move the project to another folder
    location or to another system we will not carry node_modules due to
    it's bulky size

    apart from the node_module carry entire project structure and on 
    new location we need node_modules
    
    so we just need to run this command: npm install
    this will look into the dependancies key of package.json and install them
    into the new location


two types of 3rd party modules:
    1. local module : install within a project
        p1 -> express   p2  p3
        if we install 

    if a module is providing predefined function, or properties etc that we will
    be using them into our code then always it should be installed locally
    and local modules are only referred as dependancy

    2. global module : doesn't installed into specific project
        it will be install at a centralized location (installed at the installation
        folder of node js) from where any project can utilize that module
        p1  p2  p3
        package

    there are certain modules which are not providing any function or
    properties, insted they will be giving some tools

    note: global module will not update the package.json file

    npm install -g module-name

    npm install -g nodemon



    base url       facebook.com         127.0.0.1:5600 
    sub url        facebook.com/login   127.0.0.1:5600/student

    routing
    express js : it is just a library using which we can 

*/



import {createServer} from "http";

console.log("before server is started");

const server = createServer((request, response) => {
    // read the url
    //  apply conditions on url
    //  if (url="127.0.0.1:5600") {} else if (url="127.0.0.1:5600/students");
    response.write("Hello World..!!");
    response.end();
});

server.listen(5600,() => {
    console.log("server is started");
});
