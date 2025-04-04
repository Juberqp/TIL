public class java10 {
    public static void main(String[] args){
        int[][] mathscores = new int[2][3];

        /*만약 학생 수가 다르다면?
        int[][] mathscores = new int[2][];
        mathscores[0] = new int[2];
        mathscores[1] = new int[3];
        */

        for(int i=0; i<mathscores.length; i++){
            for(int j=0; j<mathscores[i].length; j++){
                System.out.println("mathscores["+i+"]["+j+"]: "+mathscores[i][j]);
            }
        }
        System.out.println();

        //변경
        mathscores[0][0] = 80;
        mathscores[0][1] = 83;
        mathscores[0][2] = 85;
        mathscores[1][0] = 86;
        mathscores[1][1] = 90;
        mathscores[1][2] = 92;

        int p = 0;
        int sum = 0;
        for(int i=0; i<mathscores.length; i++){
            p += mathscores[i].length;
            for(int j=0; j<mathscores[i].length; j++){
                sum += mathscores[i][j];
            }
        }

        double avg = (double) sum / p;
        System.out.println("전체 학생의 수학 평균 점수: "+avg);
    }
}
