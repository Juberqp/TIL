public class java12 {
    public static void main(String[] args){
        //배열 복사
        int[] str1 = {1, 2, 3};
        int[] str2 = new int[5];

        for(int i=0; i<str1.length; i++){
            str2[i] = str1[i];
        }

        for(int i=0; i<str2.length; i++){
            System.out.print(str2[i]+", ");
        }
        System.out.println();

        //또는
        String[] name1 = {"java", "c++", "python"};
        String[] name2 = new String[5];

        System.arraycopy(name1, 0, name2, 0, name1.length);

        for(int i=0; i<name2.length; i++){
            System.out.print(name2[i]+", ");
        }
    }
}
