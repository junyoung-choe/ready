package four;
import java.util.Scanner;

class Day{
    private String work;
    public void set(String work) { this.work = work; }
    public String get(){ return work; }
    public void show(){
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }



}

class MonthSchedule {
    Scanner scanner = new Scanner(System.in);
    int date;
    String day[];

    public MonthSchedule(int dayday) {
        day = new String[dayday];
    }

    public void input(int date) {
        System.out.print("할일(빈칸없이입력)?");
        day[date] = scanner.next();
    }

    public void view(int date) {
        System.out.println(date + "일의 할일은 " + day[date] + "입니다");
    }

    public void finish() {
        System.out.print("프로그램을 종료합니다.");
        System.exit(0);
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        int date;
        int number; // 입력 1 보기 2 끝내기 3
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            number = scanner.nextInt();
            if (number == 1) {
                System.out.print("날짜(1~30)>>");
                date = scanner.nextInt();
                input(date);
            } else if (number == 2) {
                System.out.print("날짜(1~30)>>");
                date = scanner.nextInt();
                view(date);
            } else {
                finish();
            }
        }
    }
}
public class exam07 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();

    }
}
