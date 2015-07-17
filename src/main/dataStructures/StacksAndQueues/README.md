1.  Describe how you could usea single array to implement three stacks. [ [one][101] ]
2.  How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time. [ [two][102] ]
3.  Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. Implement a data structureSetOf Stacks that mimics this. SetOf Stacks should be composed of several stacks and should create a newstackoncethe previous oneexceedscapacity. SetOfStacks.push() and SetOfStacks.pop() shouldbehaveidenticallytoasinglestack(thatis,popO should return the same values as it would if there were just a single stack).
    FOLLOW UP
    Implement a function popAt(int index) which performs a pop operation on a specific sub-stack. [ [three][103] ]
4. In the classic problem of the Towers of Hanoi, you have 3 towers and Ndisks of different sizes which can slide on to any tower.The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints:
   (1) Only one disk can be moved at a time.
   (2) A disk is slid off the top of one tower onto the next tower.
   (3) A disk can only be placed on top of a larger disk.
   Write a program to move the disks from the first tower to the last using stacks [ [four][104] ]
5. Implement a MyQueue class which implements a queue using two stacks. [ [five][105] ]
6. Write a program to sort a stack in ascending order (with biggest items on top). You may use at most one additional stack to hold items, but you may not copy the elements into any other data structure (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty. [[six][106]]   
   

[101]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/One
[102]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Two
[103]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Three
[104]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Four
[105]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Five
[106]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Six
