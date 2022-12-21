const UserController = require("../controllers/user.controller");

module.exports = app => {
  app.get("/api/Authors/", UserController.findAllAuthors);
  app.get("/api/Authors/:id", UserController.findOneSingleAuthor);
  app.put("/api/Authors/update/:id", UserController.updateExistingAuthor);
  app.post("/api/Authors/new", UserController.createNewAuthor);
  app.delete("/api/Authors/delete/:id", UserController.deleteAnExistingAuthor);
};