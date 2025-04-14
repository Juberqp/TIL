//printStackTrace
public class Test02 {
    public static void main(String[] args){
        try{
            Class.forName("Test01");
            System.out.println("Test01 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();

        try{
            Class.forName("Test99");
            System.out.println("Test99 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
