public class java09 {
    public static void main(String[] args){
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바를\" 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t자바";
        System.out.println(str);

        System.out.println("나는\n");
        System.out.println("자바를\n");
        System.out.println("배웁니다");

        str = """
        ----------------
        뚜땨야
        나는 자바 고수가
        될거야.
        ----------------   
            """;
        System.out.println(str);
    }
}
