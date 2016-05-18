class MyQueue {
    Stack<Integer>  q=new Stack<>();
    Stack<Integer>  s=new Stack<>();
    // Push element x to the back of queue.
    public void push(int x) {
        q.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!q.empty())
        {
            s.push(q.pop());
        }
        s.pop();
        while(!s.empty())
        {
            q.push(s.pop());
        }
        
    }

    // Get the front element.
    public int peek() {
        while(!q.empty())
        {
            s.push(q.pop());
        }
        int temp= s.peek();
        while(!s.empty())
        {
            q.push(s.pop());
        }
        return temp;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return q.empty();
        
    }
}