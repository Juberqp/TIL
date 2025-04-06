public class car {
    int gas;

    //메소드
    void setcar(int gas){
        this.gas = gas;
    }

    //리턴값 있음
    boolean isLeftgas() {
        if (gas == 0){
            System.out.println("가스가 없습니다.");
            return false;
        } else {
            System.out.println("가스가 남아 있습니다.");
            return true;
        }
    }

    void run(){
        while(true){
            if(gas>0){
                System.out.println("달립니다. 가스 잔량: "+gas);
                gas--;
            } else {
                System.out.println("멈춥니다. 가스 잔량: "+gas);
                break;
            }
        }
    }
}
