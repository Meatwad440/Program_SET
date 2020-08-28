/*
Nick Hutson
Programming Fundamentals
*/

public class Set {
    
	private LinkedNode head;

    public Set() {
        
    	head = null;
  
    }

    public boolean exists(int n) {
        
    	LinkedNode curr = head;
        
    	while (curr != null) {
        
    		if (curr.getData() == n) //found matching value
            
    			return true;
            
    		curr = curr.getNext();
    		
        }
        
    	return false;//did not find in loop above
    	
    }

    public boolean add(int n) {
       
    	if (!exists(n)) //since this is a set, check if the value is already not in list
        
    	{
        
    		head = new LinkedNode(n, head); //always add new value to front of list
            
    		return true;
        } 
    	
    	else
        
    		return false;
    	
    }

    public boolean delete(int n) {
       
    	LinkedNode prev = null;
        
    	LinkedNode curr = head;
        
    	while (curr != null) {
        
    		if (curr.getData() == n)
            
    			break;
            
    		prev = curr;
            
    		curr = curr.getNext();
    		
        }
       
    	if (curr == null) //did not find matching value
        
    		return false;
        
    	else {
        
    		if (curr == head) //the data to be deleted is the head node
                
    			head = head.getNext();
            
    		else
                
    			prev.setNext(curr.getNext());
            
    		return true;
    		
        }
    	
    }

    public String toString() {
        LinkedNode curr = head;
        String str = "";
        while (curr != null) {
            str += curr.getData() + " ";
            curr = curr.getNext();
        }
        return str;
    }
}