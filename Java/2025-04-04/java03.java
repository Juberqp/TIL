public class java03 {
    public static void main(String[] args){
        String strvar1 = "홍길동";
        String strvar2 = "홍길동";

        if (strvar1 == strvar2){
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if(strvar1.equals(strvar2)){
            System.out.println("strvar1과 strvar2 문자열은 같음");
        }

        String strvar3 = new String("홍길동");
        String strvar4 = new String("홍길동");

        if (strvar3 == strvar4){
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if(strvar3.equals(strvar4)){
            System.out.println("strvar1과 strvar2 문자열은 같음");
        }

        String hobby = "";
        if (hobby.equals("")){
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
