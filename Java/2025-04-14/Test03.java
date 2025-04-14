//다중 예외
public class Test03 {
    public static void main(String[] args){
        String[] array = {"100", "1oo"};

        for(int i=0; i<=array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.printf("array[%d]: %d\n", i, value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨: "+e.getMessage()); //배열 인덱스 보다 큰 값이 들어감
            } catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음: "+e.getMessage()); //숫자 변환이 안됨
            }
        }
    }
}
