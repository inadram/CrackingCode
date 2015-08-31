1.  Given a string representing relative path write a function which normalizes this path (i.e. replaces ".."). 
    Example: 
    input: \a\b\..\foo.txt 
    output: \a\foo.txt [[ID5665972218232832][101]]

2.  You are given an array representing integer. Write a function which increments this integer. 
    Example: input [1,2,3] (represents 123) -> output [1,2,4]  [[ID4809209524781056][102]]
    
3.  Write a program in that determines the members and parents of nested groups without using recursion. 
    
    These are the requirements. 
    
    1. A group can have 0 or more members. 
    2. A group can be member of one or more groups 
    3. A group can be member of itself. 
    4. If there is a path from a group either directly or through multiple hops, then that user is considered as member of the group. 
    5. A group can have users or groups as members 
    
    EX: Input looks like this
    
    ```
    var groupMembers = new Dictionary<string, HashSet<string>>
                {
                    {  "G4", new HashSet<string> { "U1","G1"} },
                    {  "G1", new HashSet<string> { "G2","G3","G6"} },
                    {  "G3", new HashSet<string> { "G3","G5"} },
                    {  "G2", new HashSet<string> { "G4","U2"} },
                    {  "G5", new HashSet<string> { "U2","G6"} },
                    {  "G6", new HashSet<string> { "U3"} },
                };
    ```            
    Signature of function is:
    
    
    private List<MyGroup> FindMembers(Dictionary<string, HashSet<string>> groupMembers)
    You need to make sure that you take care of cycles in the graph and not go into infinite recursion. 
    
    Output should look like a list of groups where a group is as follows.
    
    ```
    private class MyGroup
        {
            public string Identity { get; set; }
    
            public Dictionary<string, MyGroup> MemberOf { get; set; }
    
            public Dictionary<string, MyGroup> Members { get; set; }
    
            public HashSet<string> Users { get; set; }
    
            public MyGroup(string name)
            {
                this.Identity = name;
                this.MemberOf = new Dictionary<string, MyGroup>();
                this.Members = new Dictionary<string, MyGroup>();
                this.Users = new HashSet<string>();
            }
    }
    ```
    Each group object should contain all the groups it's a memberOf (directly or indirectly), all the groups that are it's members (directly or indirectly) and all users that are it's members. [[ID5191526374178816][103]]
    
4.  Find how many numbers of length n are there such that each number is at least 4 smaller/greater than the number before and after it. 
    
    Eg: if n = 5, such numbers are 39518, 15951, etc.  [[ID5085262709260288][104]]
    
5.  Write a function called deepCopy that takes an object and creates a deep copy of it. 
    
    var newObj = deepCopy(obj); 
    
    (can't use JSON, can't use prototype) [[ID6304195600711680][105]]
    
6.  You have k lists of sorted integers. Find the smallest range that includes at least one number from each of the k lists. 
    
    For example, 
    List 1: [4, 10, 15, 24, 26] 
    List 2: [0, 9, 12, 20] 
    List 3: [5, 18, 22, 30] 
    
    The smallest range here would be [20, 24] as it contains 24 from list 1, 20 from list 2, and 22 from list 3. [[ID16759664][106]] 
       
7. Given an array of integers. Find two disjoint contiguous sub-arrays such that the absolute difference between the sum of two sub-array is maximum. 
   * The sub-arrays should not overlap. 
   
   eg- [2 -1 -2 1 -4 2 8] ans - (-1 -2 1 -4) (2 8), diff = 16 
   
   I gave him o(n^2) algorithm but he was not satisfied.[[ID19286747][107]]
   
       
8.Give you an array which has n integers,it has both positive and negative integers.Now you need sort this array in a special way.After that,the negative integers should in the front,and the positive integers should in the back.Also the relative position should not be changed. 
  eg. -1 1 3 -2 2 ans: -1 -2 1 3 2. 
  o(n)time complexity and o(1) space complexity is perfect.[[ID5201559730257920][108]]
  
       
    
[101]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5665972218232832
[102]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID4809209524781056
[103]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5191526374178816
[104]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5085262709260288
[105]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID6304195600711680
[106]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID16759664
[107]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID19286747
[108]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5201559730257920
    