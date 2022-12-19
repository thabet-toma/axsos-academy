const UserController = require("../controllers/user.controller");

module.exports = app => {
  app.get("/api/Products/", UserController.findAllUsers);
  app.get("/api/products/:id", UserController.findOneSingleUser);
  app.put("/api/users/update/:id", UserController.updateExistingUser);
  app.post("/api/Products/new", UserController.createNewProduct);
  app.delete("/api/users/delete/:id", UserController.deleteAnExistingUser);
};