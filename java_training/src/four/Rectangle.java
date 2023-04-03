package four;

public class Rectangle {
    int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public float sqaure(){ // 사각형 넓이 리턴
        return width * height;
    }

    public void show(){
        System.out.println("(" + x + "," + y + ") 에서 크기가 " + width + "X" + height + "인 사각형");
    }
    public boolean contains(Rectangle r){
        if (x<r.x && y<r.y){
            if (x+height<r.x+r.height && y+width< r.y+r.height) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 : " + s.sqaure());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if(t.contains(t))
            System.out.println("t는 t을 포함합니다.");
    }
}
