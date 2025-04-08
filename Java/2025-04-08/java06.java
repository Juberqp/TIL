//접근자 protected
public class java06 extends a{
    public void method(){
        //자식 또는 같은 패키지만 사용 가능
        a mya = new a();
        mya.field = "value";
        mya.method();
    }
}
