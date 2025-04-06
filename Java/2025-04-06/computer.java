public class computer {
    int sum(int ... values){
        int sum = 0;

        for(int i : values){
            sum += i;
        }

        return sum;
    }
}
