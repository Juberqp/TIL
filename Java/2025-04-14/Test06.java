//리소스 자동 닫기
//파일을 읽던 중 에러가 날 시 finally에서 닫기를 호출하거나
//try-with-respources 블록을 사용한다.

//try-with-respources를 사용하기 위해선 implements AutoCloseable가 필수
class MyResource implements AutoCloseable{
    private String name;

    MyResource(String name){
        this.name = name;
        System.out.printf("[MyResource(%s) 열기]\n", name);
    }

    public String read1(){
        System.out.printf("[MyResource(%s) 읽기]\n", name);
        return "100";
    }

    public String read2(){
        System.out.printf("[MyResource(%s) 읽기]\n", name);
        return "abc";
    }

    //AutoCloseable의 메소드 오버라이딩
    //예외 여부와 상관 없이 무조건 실행, 열린 파일을 닫는 용도
    @Override
    public void close() throws Exception {
        System.out.printf("[MyResource(%s) 닫기]\n", name);
    }
}

public class Test06 {
    public static void main(String[] args){
        try(MyResource res = new MyResource("A")){
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e){
            System.out.println("예외 처리: "+e.getMessage());
        }
        System.out.println();

        try(MyResource res = new MyResource("A")){
            String data = res.read2();
            //NumberFormatException 발생
            int value = Integer.parseInt(data);
        } catch (Exception e){
            System.out.println("예외 처리: "+e.getMessage());
        }

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        
        //res1이 먼저 void close() 실행, 다음 res2가 실행
        try(res1; res2){
            String data1 = res1.read1();
            String data2 = res2.read2();
        } catch (Exception e){
            System.out.println("예외 처리: "+e.getMessage());
        }
    }
}
