/**
 * DATA STRUCTURES PROJECT REPORT: TASK 3 - DISCHARGE MANAGEMENT
 * * 1. OBJECTIVE
 * The goal of Task 3 was to manage discharged patients using a Stack
 * data structure. This represents the history of processed patients.
 * * 2. DATA STRUCTURE CHOICE: STACK
 * I chose a Stack because hospital discharge records follow the
 * LIFO (Last-In-First-Out) principle. The last patient to leave
 * the hospital should be the first one visible in the history records.
 * * 3. IMPLEMENTATION DETAILS
 * - DischargeRecord: A class to store the ID of the discharged patient.
 * - DischargeStack: A custom stack implementation using Nodes.
 * - push(): Adds a new record to the top of the stack.
 * - pop(): Removes the most recent record.
 * - peek(): Shows the latest record without removing it.
 * * 4. COMPLEXITY ANALYSIS
 * - Push Operation: O(1). We only add a node to the 'top'.
 * - Pop Operation: O(1). We only remove the 'top' node.
 * - Search Operation: O(n). To find a specific record, we might
 * need to go through the whole stack.
 * * 5. CONCLUSION
 * Using a Stack is the most efficient way to track history. It
 * provides instant access to the latest data, which is essential
 * for hospital administrative records.
 */