public class java04test {
    public static void main(String[] args){
        int[] array = {1, 5, 3, 8, 2};
        
        int big = 0;
        for(int i : array){
            if(big < i) big = i;
        }
        System.out.println("배열에 가장 큰 수: "+big);
    }
}
