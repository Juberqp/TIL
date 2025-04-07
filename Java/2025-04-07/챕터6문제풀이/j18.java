//싱글톤
package 챕터6문제풀이;

public class j18 {
    public static void main(String[] args){
        shopservice obj1 = shopservice.getInstance();
        shopservice obj2 = shopservice.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
    }
}
