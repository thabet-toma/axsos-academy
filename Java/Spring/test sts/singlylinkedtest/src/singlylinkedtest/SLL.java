package singlylinkedtest;
public class SLL {
	public Node head;
	 public SLL() {
	      
	    }
	    // SLL methods go here. As a starter, we will show you how to add a node to the list.
	    public void add(int value) {
	        Node newNode = new Node(value);
	        if(head == null) {
	            head = newNode;
	        } else {
	            Node runner = head;
	            while(runner.next != null) {
	                runner = runner.next;
	            }
	            runner.next = newNode;
	        }
	    }    
    public void remove() {
    	if(head.next==null) {
    		head=null;
    	}
    	else {
    		Node temp=head;
    		head=head.next;
    		temp=null;
    	}
    }
}

