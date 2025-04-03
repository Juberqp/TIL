public class java03 {
    public static void main(String[] args){
        int charCode = 'A';

        if ((65 <= charCode) & (charCode <= 90)){
            System.out.println("대문자군요.");
        }

        if ((97 <= charCode) & (charCode <= 122)){
            System.out.println("소문자군요.");
        }

        if ((48 <= charCode) & (charCode <= 57)){
            System.out.println("0~9 숫자군요.");
        }

        //----------------------------------------------

        int value = 6;

        if((value%2==0) | (value%3==0)){
            System.out.println("2 또는 3의 배수군요.");
        }

        boolean r = (value%2==0) || (value%3==0);
        if(!r){
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
        
    }
}
