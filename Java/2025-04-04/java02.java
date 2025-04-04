public class java02 {
    public static void main(String[] args){
        int[] a = null;
        //a[0] = 10; 에러

        String str = null;
        //System.out.println("총 문자 수: "+str.length()); 에러

        String hobby = "여행";
        hobby = null; //버려짐

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: "+kind2);
    }
}
