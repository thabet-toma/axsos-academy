const mongoose = require("mongoose");

const AuthorsSchema = new mongoose.Schema({
	name:{type: String,minlength:[3,"three Charr is requried"]}
	
});

const Authors = mongoose.model("Authors", AuthorsSchema);

module.exports = Authors;