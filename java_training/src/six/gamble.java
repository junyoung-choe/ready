package six;
import java.util.Scanner;

class Person {
    private String name;
    Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class gamble {
    Scanner scanner = new Scanner(System.in);
    Person[] person;
    String name;
    int people_number;
    int n = 0;
    int[] a = new int[3];

    public void run(){
        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        people_number = scanner.nextInt();
        person = new Person[people_number];
        for (int i = 0; i < people_number; i++){
            System.out.print(1+i + "번째 선수 이름>>");
            name = scanner.next();
            person[i] = new Person(name);
        }
        while (true){
            if (n == people_number)
                n = 0;
            for (int i = 0; i<3; i++) {
                a[i] = (int) (Math.random() * 3 + 1);
            }
            System.out.print(person[n].getName()+ ":");
            scanner.next();

            System.out.print("       " + a[0] + "   " + a[1] + "   " +
                    a[2]);
            if (a[0] ==  a[1] && a[1] == a[2]) {
                System.out.println("   " + person[n].getName() + "님이 이겼습니다 !");
                break;
            } else
                System.out.println("아쉽군요 !");
            n++;
        }
    }
    public static void main(String[] args) {
        gamble gamble = new gamble();
        gamble.run();
    }

}
