public class java09 {
    public static void main(String[] args){
        int[][] scores = {
            {80, 90, 96},
            {76, 88}
        };

        System.out.println("1차원 배열의 길이(반의 수): "+scores.length);
        System.out.println("2차원 배열의 길이(1반 학생 수): "+scores[0].length);
        System.out.println("2차원 배열의 길이(2반 학생 수): "+scores[1].length);

        System.out.println("첫번째 반 3번째 학생 점수: "+scores[0][2]);
        System.out.println("두번째 반 2번째 학생 점수: "+scores[1][1]);

        //첫번째 반 평균 구하기
        int sum1 = 0;
        for(int i=0; i<scores[0].length; i++){
            sum1 += scores[0][i];
        }
        double avg1 = (double) sum1 / scores[0].length;
        System.out.println("1반 평균: "+avg1);

        //두번째 반 평균 구하기
        int sum2 = 0;
        for(int i=0; i<scores[1].length; i++){
            sum2 += scores[1][i];
        }
        double avg2 = (double) sum2 / scores[1].length;
        System.out.println("2반 평균: "+avg2);

        //반 전체 평균
        int total = 0;
        int p = 0;
        for(int i=0; i<scores.length; i++){ //2번 반복
            p += scores[i].length; //1반, 2반 길이 저장
            for(int j=0; j<scores[i].length; j++){ 
                total += scores[i][j];
            }
        }
        double avg3 = (double) total / p;
        System.out.println("전체 평균: "+avg3);


    }
}
