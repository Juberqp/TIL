//제네릭 메소드
class Box <T>{
    private T t;

    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}

public class Java01{
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
    public static void main(String[] args){
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("문자열");
        String stringValue = box2.get();
        System.out.println(stringValue);
    }
}