package 챕터6문제풀이;

public class shopservice {
    private static shopservice myshop = new shopservice();
    //클래스가 생성되면 자동으로 생성자가 실행되는데 생성자가 private라서 실행 불가.
    //그러니 정적으로 접근해야함.
    private shopservice(){
    }

    public static shopservice getInstance(){
        return myshop;
    }
}
