package sandbox;

interface soundmaker{
    void makesound();
}

class Dog implements soundmaker{
    @Override
    public void makesound(){
        System.out.println("멍멍!");
    }
}

class Cat implements soundmaker{
    @Override
    public void makesound(){
        System.out.println("야옹!");
    }
}

class Cow implements soundmaker{
    @Override
    public void makesound(){
        System.out.println("음메!");
    }
}

public class test01{
    public static void main(String[] args){
        soundmaker[] s = {new Dog(), new Cat(), new Cow()};

        for(soundmaker i : s){
            i.makesound();
        }
    }
}