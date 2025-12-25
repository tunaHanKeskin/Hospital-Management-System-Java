/*

Task-2

Why did we use a queue?
A queue works as first-in, first-out (FIFO). This means the first patient who comes will be treated first.
        In this task, we put patients in the treatment order. A queue is fair, organized, and works like real life.

Why did we use a queue instead of a stack?
A stack works with LIFO (Last-In, First-Out). A queue works with FIFO (First-In, First-Out).
This means in a stack, the last patient added is treated first. In a queue, the first patient added is treated first.
If we used a stack, the first patient would wait a long time, and the last patient would be treated immediately.
Using a queue is fair and works like real hospitals. Also, a stack is not suitable for real life. (enqueue and dequeue
take O(1) time. This means the time doesn’t change if there are more patients. Printing all patients or searching for a
patient takes O(n) time.

Conclusion
Using a queue keeps the treatment order fair and works like real life.
Linked list and queue are fast and flexible. If we use a stack, the first patients wait a long time and are treated
last.The order becomes wrong. Linked list and queue still work fast even if the number of patients increases.Performance
doesn't decrease.

*/