package main.Questions.ID5191526374178816;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MyGroup
{
    public String Identity;

    public Map<String, MyGroup> MemberOf;

    public Map<String, MyGroup> Members;

    public HashSet<String> Users;

    public MyGroup(String name)
    {
        this.Identity = name;
        this.MemberOf = new HashMap<String, MyGroup>();
        this.Members = new HashMap<String, MyGroup>();
        this.Users = new HashSet<String>();
    }
}
