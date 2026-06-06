class MinStack {
    class Node{
        int data;
        int min;
        Node next;
        Node(int val,int min){
            data=val;
            this.min=min;
            next=null;
        }
    }
    Node top;
    
    public MinStack() {
        top=null;
        
    }
    
    public void push(int val) {
        if(top==null){
           top=new Node(val,val);
            
        }
        else{

        int CurrMin=Math.min(top.min,val);
        Node newNode = new Node(val,CurrMin);
        newNode.next=top;
        top=newNode;    
        }

        
    }
    
    public void pop() {
        if(top!=null)
         top=top.next;
        
    }
    
    public int top() {
        return top.data;
        
    }
    
    public int getMin() {
        // Node rev=top;
        // if(top==null){
        //     throw new RuntimeException("Stack is Empty");
        // }
        // int min=rev.data;
        // rev=rev.next;
        // while(rev!=null){
        //     if(rev.data<min){
        //         min=rev.data;
        //     }
        //     rev=rev.next;
            
        // }
        // return min;

        return top.min;

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */