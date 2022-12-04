class Card{
constructor(name,cost){
    this.name=name
    this.cost=cost
}
}
class Unit extends Card{
    constructor(name,cost,power,res){
        super(name,cost)
        this.power=power
        this.res=res
    }
    attack(target){
        target.res-=this.power
    }

}
class Effect extends Card{
    constructor(name,cost,text,mag,state    ){
        super(name,cost)
        this.text=text
        
        this.mag=mag
        this.state=state
    }
    play( target ) {
        if( target instanceof Unit ) {
            if(this.state=="resilience"){
        target.res+=this.mag}
        else{
            target.power+=this.mag
        }
        } else {
            throw new Error( "Target must be a unit!" );
        }
    }
   	
}
const  RedBeltNinja=new Unit ("redNinja",3,3,4)
const BlackBeltNinja=new Unit ("blackNinja",4,5,4)
const one=new Effect("Hard Algorithm",2,"increase target's resilience by 3",3,"resilience")

const tow=new Effect("Unhandled Promise Rejection",1,"reduce target's resilience by 2",-2,"resilience")
const three=new Effect("Pair Programming",3,"increase target's power by 2",2,"power")
one.play(RedBeltNinja)
console.log(RedBeltNinja.res)
tow.play(RedBeltNinja)
three.play(RedBeltNinja)
RedBeltNinja.attack(BlackBeltNinja)
console.log(RedBeltNinja.res)
console.log(RedBeltNinja.power)