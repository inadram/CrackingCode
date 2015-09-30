package main.KnowledgeBase.Three;

public class Final {
    final int some_final_int=10;
     int some_int=10;
    public void update(){
        some_int=11;
//      some_final_int=11;
    }
    public final void  some_final_method(){}
    public void some_method(){}

    public void finalize(){

    }
}

class Sub_final extends Final{
    public void some_method(){}
//  public void some_final_method(){}
}

final class Full_final{}

//class Sub_full_final extends Full_final{}

