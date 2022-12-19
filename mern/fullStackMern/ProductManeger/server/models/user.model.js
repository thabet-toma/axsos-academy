const mongoose = require("mongoose");

const ProductSchema = new mongoose.Schema({
	Title: String,
	Price: Number,
	Desc:String
});

const Product = mongoose.model("Product", ProductSchema);

module.exports = Product;