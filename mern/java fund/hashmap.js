class LinkedList {
    constructor()
    {
        this.head = null;
        this.size = 0;
    }
    add(element)
{
    // creates a new node
    var node = new Node(element);
 
    // to store current node
    var current;
 
    // if list is Empty add the
    // element and make it head
    if (this.head == null)
        this.head = node;
    else {
        current = this.head;
 
        // iterate to the end of the
        // list
        while (current.next) {
            current = current.next;
        }
 
        // add node
        current.next = node;
    }
    this.size++;
}
 
}
class Node {
    // constructor
    constructor(element)
    {
        this.element = element;
        this.next = null
    }
}

class hash{
    constructor(){
        this.arr=[]

    }
    add(key,value){
        if(this.arr[key.length%16]==null ||s.arr[key.length%16]==undefined){
        this.arr[key.length%16]=value}
        else{
            l=new LinkedList()
            l.add(arr[key.length%16])
            

        }
        
    }
    printH(key){
        console.log(this.arr[key.length%16])
    }



}
g= new hash()
g.add("jj","5")
g.printH("jj")