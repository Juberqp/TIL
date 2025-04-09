package test;

abstract class Shape{
    double width, height;
    
    Shape(){
    }

    Shape(double width, double height){
        if(width <= 0.0 || height <= 0.0){
            System.out.println("가로와 세로는 0보다 커야 합니다!");
            this.width = 1;
            this.height = 1;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    abstract double getArea();

    void printArea(){
        System.out.printf("%s의 넓이: %.1f%n", getClass().getSimpleName(), getArea());
    }
}

class Rectangle extends Shape{
    Rectangle(double width, double height){
        super(width, height);
    }
    @Override
    double getArea(){
        return width * height;
    }
}
class Triangle extends Shape{
    Triangle(double width, double height){
        super(width, height);
    }
    @Override
    double getArea(){
        return width * height / 2;
    }
}

//파일 이름이 뭐 어때서 그래... 그냥 테스트 문제니까 이렇게 적었어.
public class test04 {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(10, 20);
        Triangle tri = new Triangle(10, 20);
        Rectangle invalidRect = new Rectangle(0, -5); // 0 이하 값 테스트

        rect.printArea();
        tri.printArea();
        invalidRect.printArea();
    }
}
