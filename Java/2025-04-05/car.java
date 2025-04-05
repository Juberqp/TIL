public class car {
    String company = "현대 자동차";
    String model = "그랜저";
    String color = "검정";

    boolean start;
    int maxspeed = 350;
    int speed;

    //일반 생성자 = 비효율적
    /*
    car(){
    }

    car(String model){
        this.model = model;
    }

    car(String model, String color){
        this.model = model;
        this.color = color;
    }

    car(String model, String color, int maxspeed){
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
    */

    //체인 라이트닝 = 효율적
    //방식 위 2개 생성자가 맨 아래 생성자를 가르킴
    car(){
    }

    car(String model){
        this(model, "검정", 350);
    }

    car(String model, String color){
        this(model, color, 350);
    }

    car(String model, String color, int maxspeed){
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
}
