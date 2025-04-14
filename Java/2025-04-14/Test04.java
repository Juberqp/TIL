//예외 처리의 우선순위
//예외도 클래스다.
public class Test04 {
    public static void main(String[] args){
        String[] array = {"100", "1oo"};

        for(int i=0; i<=array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.printf("array[%d]: %d\n", i, value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: "+e.getMessage());
            } catch (Exception e) {
                System.out.println("실행에 문제가 있습니다."); //상위 예외 클래스는 아래 작성
            }
        }
    }
}
