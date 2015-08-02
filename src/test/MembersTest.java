package test;

import main.Questions.ID5191526374178816.Members;
import main.Questions.ID5191526374178816.MyGroup;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MembersTest {

    @Test
    public void test_find_all_members(){

        Map<String,HashSet<String>> groupMembers = new HashMap<String, HashSet<String>>();
        groupMembers.put("G1", new HashSet<String>(Arrays.asList( "G2","G3","G6")));
        groupMembers.put("G2", new HashSet<String>(Arrays.asList("G4","U2")));
        groupMembers.put("G3", new HashSet<String>(Arrays.asList( "G3","G5")));
        groupMembers.put("G4", new HashSet<String>(Arrays.asList("U1","G1")));
        groupMembers.put("G5", new HashSet<String>(Arrays.asList("U2","G6")));
        groupMembers.put("G6", new HashSet<String>(Arrays.asList("U3")));

        Members members = new Members();
        Map<String, MyGroup> actual =  members.getMyGroupsList(groupMembers);

        Map<String, MyGroup> expected = new HashMap<String, MyGroup>();
        MyGroup g1=new MyGroup("G1");
        MyGroup g2=new MyGroup("G2");
        MyGroup g3=new MyGroup("G3");
        MyGroup g4=new MyGroup("G4");
        MyGroup g5=new MyGroup("G5");
        MyGroup g6=new MyGroup("G6");
        expected.put("G1",g1);
        expected.put("G2",g2);
        expected.put("G3", g3);
        expected.put("G4",g4);
        expected.put("G5", g5);
        expected.put("G6",g6);

        //G1
        g1.MemberOf.put("G4",g4);
        g1.MemberOf.put("G2", g2);
        g1.MemberOf.put("G1", g1);
        g1.Members.put("G2", g2);
        g1.Members.put("G4", g4);
        g1.Users.add("U1");
        g1.Members.put("G1", g1);
        g1.Users.add("U2");
        g1.Members.put("G3", g3);
        g1.Members.put("G5", g5);
        g1.Users.add("U3");
        g1.Members.put("G6",g6);


        //G2
        g2.MemberOf.put("G1",g1);
        g2.MemberOf.put("G4", g4);
        g2.MemberOf.put("G2", g2);
        g2.Members.put("G4", g4);
        g2.Users.add("U1");
        g2.Members.put("G2", g2);
        g2.Members.put("G4", g4);
        g2.Users.add("U1");
        g2.Members.put("G1", g1);
        g2.Users.add("U2");
        g2.Members.put("G3", g3);
        g2.Members.put("G5", g5);
        g2.Users.add("U3");
        g2.Members.put("G6",g6);

        //G3
        g3.MemberOf.put("G3",g3);
        g3.MemberOf.put("G1",g1);
        g3.MemberOf.put("G4", g4);
        g3.MemberOf.put("G2", g2);
        g3.Members.put("G3", g3);
        g3.Members.put("G5", g5);
        g3.Users.add("U2");
        g3.Members.put("G6", g6);
        g3.Users.add("U3");

        //G4
        g4.MemberOf.put("G2",g2);
        g4.MemberOf.put("G4", g4);
        g4.MemberOf.put("G1", g1);
        g4.Users.add("U1");
        g4.Members.put("G2", g2);
        g4.Members.put("G4", g4);
        g4.Members.put("G1", g1);
        g4.Users.add("U2");
        g4.Members.put("G3", g3);
        g4.Members.put("G5", g5);
        g4.Users.add("U3");
        g4.Members.put("G6",g6);


        //G5
        g5.MemberOf.put("G3",g3);
        g5.MemberOf.put("G1",g1);
        g5.MemberOf.put("G4", g4);
        g5.MemberOf.put("G2", g2);
        g5.Users.add("U2");
        g5.Members.put("G6", g6);
        g5.Users.add("U3");


        //G6
        g6.MemberOf.put("G5",g5);
        g6.MemberOf.put("G1",g1);
        g6.MemberOf.put("G3",g3);
        g6.MemberOf.put("G4", g4);
        g6.MemberOf.put("G2", g2);
        g6.Users.add("U3");

        for(Map.Entry<String,MyGroup> exp:expected.entrySet()){
            MyGroup myGroup = actual.get(exp.getKey());
            assertEquals(exp.getValue().Identity, myGroup.Identity);
            assertEquals(exp.getValue().Users,myGroup.Users);
            assertTrue(mapsAreEqual(exp.getValue().MemberOf,myGroup.MemberOf));
            assertTrue(mapsAreEqual(exp.getValue().Members,myGroup.Members));
        }

    }

    public boolean mapsAreEqual(Map<String, MyGroup> mapA, Map<String, MyGroup> mapB) {

        try{
            for (String k : mapB.keySet())
            {
                if (!mapA.get(k).Identity.equals(mapB.get(k).Identity)) {
                    return false;
                }
            }
            for (String y : mapA.keySet())
            {
                if (!mapB.containsKey(y)) {
                    return false;
                }
            }
        } catch (NullPointerException np) {
            return false;
        }
        return true;
    }

}