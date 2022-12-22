const express = require("express");
const cors = require('cors')
const app = express();

// This will fire our mongoose.connect statement to initialize our database connection
require("./server/config/mongoose.config");

app.use(express.json(), express.urlencoded({ extended: true }));

// This is where we import the users routes function from our user.routes.js file
app.use(cors()) // This is new
const AllMyUserRoutes = require("./server/routes/user.routes");
AllMyUserRoutes(app);

const server=app.listen(8000, () => console.log("The server is all fired up on port 8000"));
const io = require('socket.io')(server, { cors: true });
io.on("connection",socket=>{
    console.log("Nice to meet you. (shake hand)")
   
    socket.on("msg",data=>{
        io.emit("msgs",data)
    })
    socket.on("nameC",data=>{
        io.emit('nameS',data)
    console.log(data)
})
})
