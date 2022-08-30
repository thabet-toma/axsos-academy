function pizzaOven (crustType1 ,sauceType1,cheeses1,toppings1){
    var pizza={};
    pizza.crustType=crustType1;
    pizza.sauceType=sauceType1;
    pizza.cheeses=cheeses1;
    pizza.toppings=toppings1;
    return pizza;

}
var pizza1=pizzaOven( "deep dish", "traditional", "mozzarella", ["pepperoni", "sausage"])
var pizza2=pizzaOven( "hand tossed", "marinara", ["mozzarella", "feta"],  ["mushrooms", "olives", "onions"])
var pizza3=pizzaOven( "hand tossed", "marinara", ["mozzarell", "feta"],  ["Sausage", ])
var pizza4=pizzaOven( "hand tossed", "marinara", ["mozzarella", "feta"],  ["meat"])
console.log(pizza1.crustType);
function randomPizza(){
var crustType=["deep dish","hand tossed"];
var sauceType=["traditional","marinara"];
var cheeses=["mozzarella","feta"];
var toppings=[["pepperoni","sausage"],["mushrooms","olives"],[ "onions","meat"]]
var random=pizzaOven(crustType[Math.floor(Math.random()*2)],sauceType[Math.floor(Math.random()*2)],cheeses[Math.floor(Math.random()*2)],toppings[Math.floor(Math.random()*4)]);
return random;
}
console.log(randomPizza())