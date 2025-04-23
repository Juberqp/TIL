//join()
//다른 스레드 실행
class SumThread extends Thread{
    private long sum;

    public long getSum(){
        return sum;
    }

    public void setSum(long sum){
        this.sum = sum;
    }

    @Override
    public void run(){
        for(int i=1; i<=100; i++){
            sum+=i;
        }
    }
}

public class Java06 {
    public static void main(String[] args){
        SumThread st = new SumThread();

        st.start();
        try{
            st.join(); //st 종료 전까지 main 스레드 일시정지.
        } catch (InterruptedException e){
        }

        System.out.println("1~100의 합: "+st.getSum()); //run()이 끝나면 실행됨
    }
}
