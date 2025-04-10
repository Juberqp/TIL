package sandbox;

abstract class User{
    String name;
    int affection = -1;

    abstract void interact(String action);
}

//호감도 오름
class Otaku extends User{
    @Override
    void interact(String action){
        if("딸기케이크 사주기".equals(action)){
            affection += 50;
        } else if("칭찬하기".equals(action)){
            affection += 10;
        } else if("돈 주기".equals(action)){
            affection += 5;
        } else if("바보라고 하기".equals(action)){
            affection -= 5;
        } else if("자랑하기".equals(action)){
            affection -= 10;
        }

        if(affection > 100) affection=100;
        else if(affection < 0) affection=0;
    }
}

//호감도 내려감
class Loser extends User{
    @Override
    void interact(String action){
        if("딸기케이크 사주기".equals(action)){
            affection += 1;
        } else if("칭찬하기".equals(action)){
            affection -= 5;
        } else if("돈 주기".equals(action)){
            affection -= 10;
        } else if("바보라고 하기".equals(action)){
            affection -= 20;
        } else if("자랑하기".equals(action)){
            affection -= 50;
        }

        if(affection > 100) affection=100;
        else if(affection < -1) affection=-1;
    }
}

class Mesugaki{
    void check_affection(User user){
        if(null == user){
            return;
        }
        if(user.affection == 100){
            System.out.println("오빠~♡ 정말 사랑해!");
        } else if(user.affection >= 50){
            System.out.println("흥! 그래도 좀 봐줄 만하네, 오빠~♡");
        } else if(50 > user.affection && user.affection >= 0){
            System.out.println("풉ㅋ 오빠는 그냥 변태 허접이야~♡");
        } else if(user.affection < 0){
            System.out.println("으악! 기분 나빠! 저리 가, 찐따 오빠!");
        }
    }
}

public class test02 {
    public static void main(String[] args){
        Otaku otaku = new Otaku();
        Loser loser = new Loser();
        Mesugaki mesugaki = new Mesugaki();
        //현재 호감도
        System.out.println("[현재 호감도]");
        System.out.print("오빠: ");
        mesugaki.check_affection(otaku);
        System.out.print("찐따: ");
        mesugaki.check_affection(loser);

        otaku.interact("칭찬하기");
        loser.interact("칭찬하기");

        //현재 호감도
        System.out.println("[현재 호감도]");
        System.out.print("오빠: ");
        mesugaki.check_affection(otaku);
        System.out.print("찐따: ");
        mesugaki.check_affection(loser);

        otaku.interact("딸기케이크 사주기");
        loser.interact("딸기케이크 사주기");

        //현재 호감도
        System.out.println("[현재 호감도]");
        System.out.print("오빠: ");
        mesugaki.check_affection(otaku);
        System.out.print("찐따: ");
        mesugaki.check_affection(loser);

        otaku.interact("딸기케이크 사주기");
        loser.interact("딸기케이크 사주기");

        //현재 호감도
        System.out.println("[현재 호감도]");
        System.out.print("오빠: ");
        mesugaki.check_affection(otaku);
        System.out.print("찐따: ");
        mesugaki.check_affection(loser);
    }
}
