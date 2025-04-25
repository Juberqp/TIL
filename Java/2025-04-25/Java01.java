//Properties
//설정 값을 저장하는 기능으로 표준화
//String String

import java.util.Properties;

public class Java01{
    public static void main(String[] args) throws Exception{
        //Properties 생성
        Properties properties = new Properties();

        //Java01.class 와 동일한 ClassPath에 있는 database 로드
        properties.load(Java01.class.getResourceAsStream("database.properties"));

        //값 불러오기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        //출력
        System.out.println("driver: "+driver);
        System.out.println("url: "+url);
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.println("admin: "+admin);
    }
}