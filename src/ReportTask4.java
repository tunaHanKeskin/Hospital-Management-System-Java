/**
 * DATA STRUCTURES PROJECT REPORT: HOSPITAL MANAGEMENT SYSTEM
 * * 1. INTRODUCTION
 * This project is a hospital management simulation. It manages patients from
 * registration to discharge. I used Linked Lists, Queues, Stacks, and HashMaps
 * to make the system work correctly and fast.
 * * 2. DESIGN AND DATA STRUCTURES
 * * - Patient Registration (PatientList):
 * I used a Singly Linked List to store patients. It is good because we can
 * easily add new patients to the end.
 * * - Treatment Management (TreatmentQueue):
 * I used a Queue (FIFO - First In First Out). To solve the "Priority Challenge",
 * I used two separate queues: one for Emergency (Priority) and one for Normal.
 * The system always checks the Emergency queue first.
 * * - Discharge History (DischargeStack):
 * I used a Stack (LIFO - Last In First Out). This is perfect for discharge
 * history because we can see the last discharged patient at the top.
 * * - Quick Lookup (HashMap):
 * I used a HashMap to find patients using their ID. This makes searching
 * very fast.
 * * 3. ALGORITHMS AND COMPLEXITY
 * * - Searching (HashMap): The complexity is O(1). We find patients instantly.
 * * - Sorting (Bubble Sort): I used Bubble Sort to rank patients by severity.
 * The complexity is O(n^2). It works well for a few patients but can be
 * slow for very large lists.
 * * - Priority Treatment: Since I used two queues, adding and removing patients
 * is still O(1), which is very efficient.
 * * 4. PERFORMANCE ANALYSIS
 * If we use a "Heap-based Priority Queue" instead of two queues, it would be
 * more professional. A heap keeps the most urgent patient at the top
 * automatically with O(log n) complexity.
 * * 5. CONCLUSION
 * This project showed me how to use different data structures together.
 * Choosing the right structure (like Stack for history or Queue for waiting)
 * makes the software much better.
 * * GitHub Link: https://github.com/tunaHanKeskin/Hospital-Management-System-Java
 */