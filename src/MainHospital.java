public class MainHospital {
    public static void main(String[] args) {
        HospitalSystem hospitalSystem = new HospitalSystem();

        // add 10 patients
        hospitalSystem.addPatient(new Patient("Ahmet" , 34,234567345,8));
        hospitalSystem.addPatient(new Patient("Ayşe" , 45,234567345,5));
        hospitalSystem.addPatient(new Patient("Mehmet" , 13,234567345,10));
        hospitalSystem.addPatient(new Patient("Turgay" , 56,234567345,1));
        hospitalSystem.addPatient(new Patient("Fatih" , 47,234567345,7));
        hospitalSystem.addPatient(new Patient("Rıza" , 78,234567345,9));
        hospitalSystem.addPatient(new Patient("Beril" , 15,234567345,3));
        hospitalSystem.addPatient(new Patient("Buse" , 23,234567345,2));
        hospitalSystem.addPatient(new Patient("Beyza" , 16,234567345,4));
        hospitalSystem.addPatient(new Patient("Ali" , 43,234567345,6));


        // Treatment requests: 5 normal, 3 priority
        hospitalSystem.addTreatmentRequest(1, false);
        hospitalSystem.addTreatmentRequest(3, true);
        hospitalSystem.addTreatmentRequest(5, false);
        hospitalSystem.addTreatmentRequest(8, true);
        hospitalSystem.addTreatmentRequest(2, false);
        hospitalSystem.addTreatmentRequest(4, false);
        hospitalSystem.addTreatmentRequest(6, true);
        hospitalSystem.addTreatmentRequest(7, false);

        // 2 discharge
        hospitalSystem.addDischargeRecord(10);
        hospitalSystem.addDischargeRecord(9);

        // Process 4 treatments
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();

        hospitalSystem.printSystemState();
    }
}
