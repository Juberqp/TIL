//가변 길이 매개변수
//여러개의 값을 입력하면 리스트로 저장함
public class java02 {
    public static void main(String[] args){
        computer mycom = new computer();

        int result1 = mycom.sum(1, 2, 3);
        System.out.println("result1: "+result1);

        int result2 = mycom.sum(1, 2, 3, 4, 5);
        System.out.println("result2: "+result2);

        int[] comlist = {1, 2, 3, 4, 5};
        int result3 = mycom.sum(comlist);
        System.out.println("result3: "+result3);
        
        int result4 = mycom.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result4: "+result4);
    }
}
