public class java13 {
    public static void main(String[] args){
        car car1 = new car();
        System.out.println("car1.company : "+car1.company);
        System.out.println();

        car car2 = new car("자가용");
        System.out.println("car2.company : "+car2.company);
        System.out.println("car2.model : "+car2.model);
        System.out.println();

        car car3 = new car("자가용", "빨강");
        System.out.println("car3.company : "+car3.company);
        System.out.println("car3.model : "+car3.model);
        System.out.println("car3.color : "+car3.color);
        System.out.println();

        car car4 = new car("자가용", "빨강", 200);
        System.out.println("car4.company : "+car4.company);
        System.out.println("car4.model : "+car4.model);
        System.out.println("car4.color : "+car4.color);
        System.out.println("car4.maxspeed : "+car4.maxspeed);
        System.out.println();
    }
}

