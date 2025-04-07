public class earth {
    //전역 클래스 변수 / 값이 절대 변하지 않음
    static final double earth_rodius = 6400;

    static final double earth_surface_area;

    //복잡한 상수는 정적 블록으로 초기화
    static{
        earth_surface_area = 4 * Math.PI * earth_rodius * earth_rodius;
    }
}
