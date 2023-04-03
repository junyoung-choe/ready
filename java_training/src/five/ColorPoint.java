package five;

class Point{
    private int x,y;

    public Point(){};

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) { this.y = y; }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
}

class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public void moveUp(){
        z++;
    }
    public void moveDown(){
        z--;
    }
    public void move(int x, int y){
        setX(x);
        setY(y);
    }
    public void move(int x, int y, int z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public String toString(){
        return ("(" + getX() + "," + getY() + "," + z +")의 점." );

    }
}
class PositivePoint extends Point {
    public PositivePoint(){  }
    public PositivePoint(int x, int y) {
        super(x,y);
        if(x < 0)
            setX(0);
        if (y < 0)
            setY(0);
    }
    public void move(int x, int y) {
        if (x > 0 && y > 0) {
            setX(x);
            setY(y);
        }
    }
    public String toString(){
        return ("(" + getX() + "," + getY() + ")의 점" );
    }

}
public class ColorPoint extends Point {
    private String color;
    public ColorPoint(){
        super(0,0);
        color = "BLACK";
    }
    public ColorPoint(int x,int y){
        setX(x);
        setY(y);
    }
    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return (color + "색의 (" + getX() + "," + getY() + ")의 점" );
    }


    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10,10);
        cp.setX(5);
        cp.setY(5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");

        Point3D p = new Point3D(1,2,3);
        System.out.println(p.toString() + "입니다.");
        p.moveUp();
        System.out.println(p.toString() + "입니다.");
        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");
        p.move(100,200,300);
        System.out.println(p.toString() + "입니다.");

        PositivePoint pp = new PositivePoint();
        pp.move(10, 10);
        System.out.println(pp.toString() + "입니다.");

        pp.move(-5, 5);
        System.out.println(pp.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
