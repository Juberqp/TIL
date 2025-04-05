public class java11 {
    public static void main(String[] args){
        korean k1 = new korean("박자바", "011225-1234567");

        //k1 데이터
        System.out.println("1nation : " + k1.nation);
        System.out.println("1name : " + k1.name);
        System.out.println("1ssn : " + k1.ssn);
        System.out.println();

        korean k2 = new korean("김자바", "011225-7654321");

        //k1 데이터
        System.out.println("2nation : " + k2.nation);
        System.out.println("2name : " + k2.name);
        System.out.println("2ssn : " + k2.ssn);
        System.out.println();

    }
}
