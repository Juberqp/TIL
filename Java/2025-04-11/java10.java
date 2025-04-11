//중첩 인터페이스
class Button{
    //인터페이스
    public static interface ClickListener{
        void onClick();
    }

    //private ClickListener 생성
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}

public class java10 {
   public static void main(String[] args){
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();

   } 
}
