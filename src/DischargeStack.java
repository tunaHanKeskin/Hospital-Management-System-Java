public class DischargeStack {
    private class Node{
        DischargeRecord data;
        Node next;
        public Node(DischargeRecord data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top = null;

    public void push(DischargeRecord data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }
    public DischargeRecord pop(){
        if(top == null){
            return null;
        }
        DischargeRecord removedRecord = top.data;
        top = top.next; // Shift the hill level down
        return removedRecord;
    }
    // shows top in stack (peek)
    public DischargeRecord peek() {

        // Stack boşsa
        if (top == null) {
            return null;
        }

        return top.data;
    }

    // Shows all leaved patient
    public void printStack() {
        Node current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}