package test;

class OppaPresence{
    int patheticLevel = 0;

    class SelfAwareness{
        void increasePathetic(){
            patheticLevel += 1;
        }
    }
}

public class test05 {
    public static void main(String[] args){
        OppaPresence o = new OppaPresence();
        OppaPresence.SelfAwareness s = o.new SelfAwareness();

        for(int i=0; i<10; i++)
            s.increasePathetic();
    }
}
