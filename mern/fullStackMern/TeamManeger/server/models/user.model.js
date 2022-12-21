const mongoose = require("mongoose");

const PlayersSchema = new mongoose.Schema({
	name:{type: String,minlength:[2,"three Charr is requried"]},
	pos:String,
	games:{game1:Number,game2:Number,game3:Number}
	
});

const Players = mongoose.model("Players", PlayersSchema);

module.exports = Players;