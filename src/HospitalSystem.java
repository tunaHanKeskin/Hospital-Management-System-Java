import java.util.HashMap;

public class HospitalSystem {  // Önceki görevlerde yazdığın yapıları buraya dahil ediyoruz
    private PatientList allPatients;        //Task 1
    private TreatmentQueue normalQueue;  //Task2
    private TreatmentQueue priorityQueue;
    private DischargeStack dischargeStack;  //Task3
    //For quick search for by ID.
    private HashMap<Integer, Patient> patientsMap;

    public HospitalSystem() {
        allPatients = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientsMap = new HashMap<>();

    }
    public void addPatient(Patient patient) {
        allPatients.addPatient(patient);
        patientsMap.put(patient.id, patient);
        System.out.println("Patient " + patient.id + " has been added");
    }

    public void addTreatmentRequest(int patientId, boolean priority) {
        TreatmentRequest request = new TreatmentRequest(patientId);
        if (priority == true) {  // Check priority or normal
            priorityQueue.enqueue(request);
        }else {
            normalQueue.enqueue(request);
        }
    }

    public void addDischargeRecord(int patientId) {
        DischargeRecord dischargeRecord = new DischargeRecord(patientId); // Create record by ID
        dischargeStack.push(dischargeRecord); // Push the stack
    }

    public void processTreatment() {
        TreatmentRequest request = null ;
        if (priorityQueue.size() > 0) { // Firstly, dequeue from priority
            request = priorityQueue.dequeue();
        } else if (normalQueue.size() > 0) { // then, dequeue from normal
            request = normalQueue.dequeue();
        } else {
            return;
        }
        addDischargeRecord(request.getPatientId()); // add stack to discharge
    }
    public void sortPatients() { // sort with bubble sort
        Patient[] array = new Patient[allPatients.size()];
        Node temp = allPatients.head;
        int i=0;
        while (temp!=null) {
            array[i] = temp.data;
            i++;
            temp = temp.next;
        }
        for (int a=0; a<array.length-1; a++) {
            for (int b=0;b<array.length-a-1;b++) {
                if (array[b].severity < array[b+1].severity) {
                    Patient temp1 = array[b];
                    array[b] = array[b+1];
                    array[b+1] = temp1;
                }
            }
        }
        for (int k=0; k<array.length; k++) {
            Patient patient = array[k];
            System.out.println("ID:" + patient.id + " Sev:" + patient.severity + " Name:" + patient.name);
        }
    }

    public void printSystemState() {   // Printing current system state

        System.out.println("Patient List:");
        System.out.println("----------------");
        allPatients.printPatientList();
        System.out.println();

        System.out.println("Patient Normal Queue:");
        System.out.println("----------------");
        normalQueue.printQueue();
        System.out.println();
        System.out.println("Patient Priority Queue:");
        System.out.println("----------------");
        priorityQueue.printQueue();
        System.out.println();

        System.out.println("Discharge Stack:");
        System.out.println("----------------");
        dischargeStack.printStack();
    }


}
