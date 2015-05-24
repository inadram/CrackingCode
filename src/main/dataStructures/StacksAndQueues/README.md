1.  Describe how you could usea single array to implement three stacks. [ [one][101] ]
2.  How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time. [ [two][102] ]
3.  Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds somethreshold. Implement a data structureSetOf Stacks that mimics this. SetOf Stacks should be composed of several stacks and should create a newstackoncethe previous oneexceedscapacity. SetOfStacks.push() and SetOfStacks.pop() shouldbehaveidenticallytoasinglestack(thatis,popO should return the same values as it would if there were just a single stack).
    FOLLOW UP
    Implement a function popAt(int index) which performs a pop operation on a specific sub-stack. [ [three][103] ]

[101]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/One
[102]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Two
[103]:https://github.com/inadram/CrackingCode/tree/master/src/main/dataStructures/StacksAndQueues/Three
