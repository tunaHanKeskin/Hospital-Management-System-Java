public class MainStack {

    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();

        // ad 5 leaved patient
        stack.push(new DischargeRecord(123456789));
        stack.push(new DischargeRecord(234567890));
        stack.push(new DischargeRecord(345678901));
        stack.push(new DischargeRecord(456789012));
        stack.push(new DischargeRecord(567890123));

        //  (pop )
        System.out.println("Processing dis charged patients");
        stack.pop();
        stack.pop();


        System.out.println("\nRemaining discharge records:");
        stack.printStack();
    }
}
