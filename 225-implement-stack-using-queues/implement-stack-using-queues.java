class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q= new LinkedList<>();
        
    }
    
    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
        
    }
    
    public int pop() {
        return q.poll();
        
    }
    
    public int top() {
        return q.peek();
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
//  * int param_3 = obj.top();
//  * boolean param_4 = obj.empty();
//  */
//  import java.util.*;

// class MyStack {
//     Queue<Integer> q1 = new LinkedList<>();
//     Queue<Integer> q2 = new LinkedList<>();

//     public void push(int x) {
//         q1.offer(x);   // O(1)
//     }

//     public int pop() {
//         while (q1.size() > 1) {
//             q2.offer(q1.poll());
//         }

//         int top = q1.poll();

//         Queue<Integer> temp = q1;
//         q1 = q2;
//         q2 = temp;

//         return top;
//     }

//     public int top() {
//         while (q1.size() > 1) {
//             q2.offer(q1.poll());
//         }

//         int top = q1.peek();
//         q2.offer(q1.poll());

//         Queue<Integer> temp = q1;
//         q1 = q2;
//         q2 = temp;

//         return top;
//     }

//     public boolean empty() {
//         return q1.isEmpty();
//     }
// }