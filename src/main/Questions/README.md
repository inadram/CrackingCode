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
    
[101]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5665972218232832
[102]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID4809209524781056
[103]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5191526374178816
[104]:https://github.com/inadram/CrackingCode/tree/master/src/main/Questions/ID5085262709260288
    