package four;

import java.util.Scanner;

class Sitting {
    String s[];                         // 여기에 선언을 해 놓아야 사용이 가능하다.

    public Sitting() {                  // 생성자에 초기화를 진행하는게 good
        s = new String[10];
    }
}

public class Reservation {
    Scanner scanner = new Scanner(System.in);
    int option; // 예약 조회 취소 끝내기
    int select; // s a b
    int number; // 1~10
    String name; // 입력이름
    Sitting sitting[] = new Sitting[3];

    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        for (int i = 0; i < 3; i++) {
            sitting[i] = new Sitting();
            for (int j = 0; j < 10; j++) {
                sitting[i].s[j] = "---";
            }
        }
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    book();
                    break;
                case 2:             //조회
                    search();
                    break;
                case 3:            //취소
                    cencel();
                    break;
                case 4:              //끝내기
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public void book() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        select = scanner.nextInt();
        show(select);
        System.out.print("이름>>");
        name = scanner.next();
        System.out.print("번호>>");
        number = scanner.nextInt();
        sitting[select-1].s[number] = name;
        System.out.println("추가가 완료되었습니다.");
    }

    public void search() {
        show(1);
        show(2);
        show(3);
        System.out.println("조회가 완료되었습니다.");
    }

    public void cencel() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        select = scanner.nextInt();
        show(select);
        System.out.print("이름>>");
        name = scanner.next();
        for (int i = 0; i < 10; i++) {
            if ((sitting[select-1].s[i]).equals(name)) {
                sitting[select-1].s[i] = "---";
                System.out.println("취소가 완료되었습니다.");
                return;
            }
        }
        System.out.println("취소를 실패했습니다.");
    }

    public void show(int select) {
        String seperate = null;
        switch (select) {
            case 1:
                seperate = "S";
                break;

            case 2:
                seperate = "A";
                break;
            case 3:
                seperate = "B";
                break;

            default:
                break;
        }
        System.out.print(seperate + ">>");
        for (int i = 0; i < 10; i++) {
            System.out.print(sitting[select-1].s[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Reservation reservation = new Reservation();
        reservation.run();
    }

}
