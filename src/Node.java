public class Node {
    public Patient data;   // It's contains the patient object.
    public Node next;      // It's points to the next node.

    public Node(Patient data) {
        this.data = data;
        this.next = null;
    }
}
