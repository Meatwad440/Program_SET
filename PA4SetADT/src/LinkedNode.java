/*
Nick Hutson
Programming Fundamentals
*/

public class LinkedNode
{
    private int data;
    private LinkedNode next;
    public LinkedNode(int data, LinkedNode nxt)
    
    {
        
    	this.data = data;
        this.next = nxt;
        
    }
    
    public int getData() {
        return data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public LinkedNode getNext() {
        return next;
    }
    
    public void setNext(LinkedNode next) {
        this.next = next;
    }


}