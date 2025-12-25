public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;

    public TreatmentRequest(int patientId) {
        //Stores the patient ID and the arrival time.
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); //Sistem saatini milisaniye cinsinden alır.
    }
    public int getPatientId() {
        return patientId;
    }
    //Returns the arrival time.
    public long getArrivalTime() {
        return arrivalTime;
    }
    //Used to print the object in a readable format on the console.
    @Override
    public String toString(){
        return "Patient ID:" + patientId + "Arrival Time:" + arrivalTime;
    }
}

