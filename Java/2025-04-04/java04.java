public class java04 {
    public static void main(String[] args){
        String ssn = "9506241230123";

        //문자 추출
        char sex = ssn.charAt(6);
        switch(sex){
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }

        //문자 길이
        int length = ssn.length();
        if(length == 13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 다릅니다.");
        }

        //문자 대체
        String oldstr = "자바 문자열을 불변입니다. 자바 문자열은 String입니다.";
        String newstr = oldstr.replace("자바", "Java");
        System.out.println(oldstr);
        System.out.println(newstr);

        //문자열 잘라내기
        ssn = "880815-1234567";
        String firstnum = ssn.substring(0, 6);
        String lastnum = ssn.substring(7);
        System.out.println(firstnum);
        System.out.println(lastnum);

        //문자열 찾기
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바"); //위치 탐색
        if(location != -1){
            System.out.println("자바와 관련된 책이다.");
        } else {
            System.out.println("자바와 관련된 책이 아니다.");
        }

        boolean r = subject.contains("자바"); //포함 여부
        if(r == true){
            System.out.println("자바와 관련된 책이다.");
        } else {
            System.out.println("자바와 관련된 책이 아니다.");
        }

        //쪼개기
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] tokens = board.split(",");

        //나눔
        System.out.println("번호: "+tokens[0]);
        System.out.println("제목: "+tokens[1]);
        System.out.println("내용: "+tokens[2]);
        System.out.println("성명: "+tokens[3]);
        System.out.println();
    }
}
