package five;
import java.util.Scanner;

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("---다시 그립니다. ");
        draw();
    }
}
class Oval implements Shape{
    int height; // 높이
    int width; // 너비
    Oval(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public void draw() {
        System.out.println(height +"X"+ width + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return (width/2)*(height/2)*PI;
    }
}
class Rect implements Shape{
    int height; // 높이
    int width; // 너비

    Rect(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println(height +"X"+ width + " 크기인 사각형");
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
public class Circle implements Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("반지름이 " + radius + "인 언입니다.");

    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());

        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for(int i = 0; i < list.length; i++) list[i].redraw();
        for(int i = 0; i< list.length; i++) System.out.println("면적은 " + list[i].getArea()); // 업캐스팅으로 자식의 overide 된 메소드를 호출한다.
    }

}
