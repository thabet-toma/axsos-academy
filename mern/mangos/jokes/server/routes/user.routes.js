const UserController = require("../controllers/user.controller");

module.exports = app => {
  app.get("/api/Jokes/", UserController.findAllJokes);
  app.get("/api/Jokes/:id", UserController.findOneSingleJoker);
  
  app.put("/api/Jokes/update/:id", UserController.updateExistingJoker);
  app.post("/api/Jokes/new", UserController.createNewJoker);
  app.delete("/api/Jokes/delete/:id", UserController.deleteAnExistingJoker);
};