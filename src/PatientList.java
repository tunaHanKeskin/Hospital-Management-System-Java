public class PatientList {
    Node head;

    public PatientList(){
        this.head = null; // Hear list is empty.
    }

    public void addPatient(Patient p){
        Node newNode = new Node(p);
        if (head == null){
            this.head = newNode;
            return;
        }
        else{
            Node temp = head;   // We are creating a helpful "temp".
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printPatientList(){
        Node temp = head;

        if (head == null){
            System.out.println("Patient list is empty");
        }
        while (temp != null){
            System.out.println("ID:" + temp.data.id +" " + "Name:" + temp.data.name);
            temp = temp.next;
        }
    }
    public Patient findPatient(int id){
        Node temp = head;

        while(temp != null){
            if(temp.data.id == id){
                System.out.println(temp.data.name + "is on the list.");
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
    public void removePatient(int id) {
        if (head == null) { //hata vermemesi için yazdım eğer list boşsa devam etsin diye
            System.out.println("Patient list is empty");
            return;
        }

        if (head.data.id == id) {
            head = head.next;
            System.out.println("Patient has been removed");
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            if (temp.data.id == id) {
                prev.next = temp.next;
                System.out.println("Patient " + temp.data.name + " has been removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Patient not found");

    }
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
