package five;

class TV {
    protected int size;

    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {return size;}
}

class IPTV extends ColorTv {
    String address;

    public IPTV(String address, int size, int color) {
        super(size, color);                //super는 항상 맨 첫줄에 사용한다.
        this.address = address;
    }

    public void printProperty() {
        System.out.println("나의 " + address + "주소의" + getSize() + "인치 " + color + "컬러");
    }


}
public class ColorTv extends TV{
    int color;

    public ColorTv(int size, int color) {
        super(size);                    // this.size = size 하지 않는 이유는 부모 클래스에서 private로 선언했기 때문에 생성자나 메소드로 접근해야한다.
        this.color = color;
    }

    public void printProperty(){
        System.out.println(getSize() + "인치 " + color + "컬러");
    }
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
        /*
        ColorTv myTv = new ColorTv(32, 1024);
        myTv.printProperty();
         */
    }
}
