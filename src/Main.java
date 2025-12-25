//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PatientList list = new PatientList();  // I created list and
// I added 5 person info
        list.addPatient(new Patient("Ali", 32, 8654567, 2));
        list.addPatient(new Patient("Mehmet ", 55,3456795,4));
        list.addPatient(new Patient("Ayşe", 24 ,4567880,6));
        list.addPatient(new Patient("Selim", 23 , 5678098, 9));
        list.addPatient(new Patient("Turgay",  12, 4364758, 7));
        System.out.println("line");

        list.printPatientList();
        list.removePatient(5678098);
        list.findPatient(4364758);
        list.printPatientList();


    }
}
