//중첩 인터페이스로 람다 구현하기
//물론 보통 이렇게 안함, 보기 어렵고, 재사용성도 낮고 구림

class Button{
    //인터페이스
    @FunctionalInterface
    static interface ClickListener{
        void onClick();
    }

    //필드
    private ClickListener clickListener;

    //메소드
    void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    void click(){
        this.clickListener.onClick();
    }
}

public class Java03 {
    public static void main(String[] args){
        //Ok 버튼 객체
        Button button1 = new Button();

        button1.setClickListener(() -> {
            System.out.println("Ok 버튼을 눌렀습니다.");
        });

        //버튼 클릭
        button1.click();

        //cancel 버튼 객체
        Button button2 = new Button();

        button2.setClickListener(() -> {
            System.out.println("cancel 버튼을 눌렀습니다.");
        });

        //버튼 클릭
        button2.click();
    }
}
