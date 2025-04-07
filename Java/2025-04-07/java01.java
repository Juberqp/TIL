//final 필드
public class java01{
    public static void main(String[] args){
        korean k1 = new korean("123456-1234567", "김자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //수정 불가
        //k1.nation = "usa";
        //k1.ssn = "usa";
        k1.name = "usa";

    }
}