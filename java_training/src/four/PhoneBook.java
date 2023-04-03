package four;
import java.util.Scanner;

class Phone{
    String name;
    String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

}
public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    int number_people;
    int bk;
    String check_name;
    String name;
    String tel;
    String sentence_sum;
    Phone phone[];            // phone클래스 전체 래퍼런스 생성 갯수를 아직 모르니 이것만 생성
    public void run(){        // 또한 여기에 생성해놔야 아래 메소드에서 다 사용이 가능하다.
        System.out.print("인원수>>");
        number_people = scanner.nextInt();
        phone = new Phone[number_people];                          // 각 객체의 래퍼런스 생성
        for(int i = 0; i<number_people; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            sentence_sum = scanner.next();
            name = sentence_sum.substring(0,3);
            tel = sentence_sum.substring(3,11);
            System.out.println(name + tel);
            phone[i] = new Phone(name, tel);                         // 객체 생성
        }
        while (true){
            bk = 0;
            System.out.print("검색할 이름>>");
            check_name = scanner.next();
            for (int i = 0; i<number_people; i++) {
                if ((phone[i].name).equals(check_name)) {
                    System.out.println(phone[i].name + "의 번호는 " + phone[i].tel +
                            " 입니다.");
                    bk = 1;
                }
            }
            if (bk == 1) continue;
            if (check_name.equals("그만")) System.exit(0);
            else System.out.println(check_name + " 이 없습니다");
        }
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}
