import java.util.Calendar;

//책에 없는 부분
enum Week { 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class java03 {  
    public static void main(String[] args){
        Week today = null;

        //캘린더 얻기
        Calendar cal = Calendar.getInstance();

        //오늘 요일 얻기
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            default: today = Week.SATURDAY; break;   
        }

        //열거 타입 응용
        if(today == Week.SUNDAY){
            System.out.println("열심히 놉시다.");
        } else {
            System.out.println("열심히 공부합시다.");
        }
    }
}
