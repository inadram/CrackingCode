package main.Questions.ID5191526374178816;

import java.util.*;

public class Members {

    Map<String, MyGroup> groupList = new HashMap<String, MyGroup>();

    public Map<String, MyGroup> getMyGroupsList(Map<String, HashSet<String>> groupMembers) {
        for (Map.Entry<String, HashSet<String>> groupMember : groupMembers.entrySet()) {
            MyGroup myGroup = createMyGroup(groupMember.getKey());
            findMyGroupMembers(groupMembers, groupMember, myGroup);

        }
        return groupList;
    }

    private void findMyGroupMembers(Map<String, HashSet<String>> groupMembers, Map.Entry<String, HashSet<String>> groupMember, MyGroup myGroup) {
        Queue<HashSet<String>> subGroupMembersQueue = new LinkedList<HashSet<String>>();
        HashSet<String> visited = new HashSet<String>();

        subGroupMembersQueue.add(groupMember.getValue());

        while (subGroupMembersQueue.size() > 0) {

            HashSet<String> subGroupMembers = subGroupMembersQueue.remove();

            for (String subGroupMember : subGroupMembers) {
                if (isaGroup(groupMembers, subGroupMember)) {
                    if (!visited.contains(subGroupMember)) {
                        visited.add(subGroupMember);
                        subGroupMembersQueue.add(groupMembers.get(subGroupMember));
                    }

                    MyGroup subMyGroup = createMyGroup(subGroupMember);
                    subMyGroup.MemberOf.put(myGroup.Identity, myGroup);
                    groupList.put(subMyGroup.Identity, subMyGroup);
                    myGroup.Members.put(subMyGroup.Identity, subMyGroup);
                } else {
                    myGroup.Users.add(subGroupMember);
                }
            }

        }
        groupList.put(myGroup.Identity, myGroup);
    }

    private boolean isaGroup(Map<String, HashSet<String>> groupMembers, String subGroupMember) {
        return groupMembers.containsKey(subGroupMember);
    }

    private MyGroup createMyGroup(String key) {
        if (!groupList.containsKey(key)) {
            MyGroup myGroup = new MyGroup(key);
            groupList.put(key, myGroup);
        }
        return groupList.get(key);
    }
}
