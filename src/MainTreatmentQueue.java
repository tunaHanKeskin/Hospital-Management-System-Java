public class MainTreatmentQueue {
    public static void main(String[] args) {

        TreatmentQueue treatmentQueue = new TreatmentQueue();

        treatmentQueue.enqueue(new TreatmentRequest(1));
        treatmentQueue.enqueue(new TreatmentRequest(2));
        treatmentQueue.enqueue(new TreatmentRequest(3));
        treatmentQueue.enqueue(new TreatmentRequest(4));
        treatmentQueue.enqueue(new TreatmentRequest(5));
        treatmentQueue.enqueue(new TreatmentRequest(6));
        treatmentQueue.enqueue(new TreatmentRequest(7));
        treatmentQueue.enqueue(new TreatmentRequest(8));

        treatmentQueue.dequeue();
        treatmentQueue.dequeue();
        treatmentQueue.dequeue();

        // Print queue size
        System.out.println("Queue size: " + treatmentQueue.size());

        //print
        System.out.println("Remaining treatment requests:");
        treatmentQueue.printQueue();

    }
}
