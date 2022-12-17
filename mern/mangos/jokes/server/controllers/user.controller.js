const Joker = require("../models/user.model");


module.exports.findAllJokes = (req, res) => {
  Joker.find()
    .then(allDaJokers => res.json({ Jokers: allDaJokers }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.findOneSingleJoker = (req, res) => {
  if (req.params.id!='random'){
	Joker.findOne({ _id: req.params.id })
		.then(oneSingleJoker => res.json({ Joker: oneSingleJoker }))
		.catch(err => res.json({ message: "Something went wrong", error: err }));
}
else{
 
  Joker.count(function(err, count){
    var random = Math.floor(Math.random() * count)
    Joker.findOne().skip(random)
    .then(oneSingleJoker => res.json({ Joker: oneSingleJoker }))
    .catch(err => res.json({ message: "Something went wrong", error: err }))})}}
  // console.log(count)
  
 
 

// 


module.exports.createNewJoker = (req, res) => {
  Joker.create(req.body)
    .then(newlyCreatedJoker => res.json({ Joker: newlyCreatedJoker }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.updateExistingJoker = (req, res) => {
  Joker.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true })
    .then(updatedJoker => res.json({ Joker: updatedJoker }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.deleteAnExistingJoker = (req, res) => {
  Joker.deleteOne({ _id: req.params.id })
    .then(result => res.json({ result: result }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};
