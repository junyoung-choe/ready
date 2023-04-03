package four;
import java.util.Scanner;

class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public  void show() {
        System.out.println("(" + x +"," + y + ")" + radius );
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];                     // 래퍼러스만 c, c[0], c[1], c[2] 세개가 생성된다
        for (int i = 0; i < c.length ; i++){
            System.out.println("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);           // 여기서 각 객체가 생성된다.

        }
        for(int i = 0; i < c.length; i++){
            c[i].show();
        }
        scanner.close();
    }
}
