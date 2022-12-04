class Ninja{
    constructor(name){
        this.name=name
        this.health=null
        this.speed=3
        this.strength=3
    }
     sayName(){
        console.log(this.name)

    }
    showStats(){
        console.log(this.name)
        console.log(this.strength)
        console.log(this.speed)
        console.log(this.health)
       
    }
    drinkSake(){
        this.health+=10
    }
}
class Sensei extends Ninja{
    constructor(name){
        super(name)
        this.health=200
        this.speed=10
        this.strength=10
        this.wisdom=10
    }
    speakWisdom(){
        super.drinkSake()
        console.log("nothing is matter")
    }
}
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();
ninja1.drinkSake();
ninja1.showStats()
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
superSensei.showStats();