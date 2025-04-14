//예외 처리
public class Test01 {
    public static void printLength(String data){
        try{
            int result = data.length(); //null 일 경우 오류 발생
            System.out.println("문자 수: "+result);
        } catch (NullPointerException e) {
            //예외 정보를 얻는 방법 3가지.
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
        } finally {
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args){
        System.out.println("시작");
        printLength("ThisisJava");
        printLength(null);
        System.out.println("종료");
    }
}
