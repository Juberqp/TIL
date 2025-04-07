package 챕터6문제풀이;

public class memberservice {
    String id = "hong";
    String password = "12345";

    boolean login(String id, String password){
        if(this.id == id && this.password == password){
            return true;
        } else {
            return false;
        }
    }

    void logout(String id){
        System.out.println(id+"님이 로그아웃 했습니다.");
    }
}
