package two;
import java.util.Scanner;
import java.util.Random;

public class card {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            Random r = new Random();
            int k = r.nextInt(100); // 0-99 까지의 임의의 정수 생성
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println("0-99");
            int i = 1;
            int input;
            char anwser;
            while (true) {
                System.out.print(i + ">>");
                i++;
                input = scanner.nextInt();
                if (input == k){
                    System.out.println("맞았습니다.");
                    System.out.print("다시 하시겠습니까? (y/n) >>");
                    anwser = scanner.next().charAt(0);
                    if (anwser == 'y'){
                        break;
                    } else {
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    }
                } else if(input < k){
                    System.out.println("더 높게");
                    continue;
                } else {
                    System.out.println("더 낮게");
                    continue;
                }
            }

        }
        /*
        while(true){
            System.out.print(i + ">>");
            i++;
            input = scanner.nextInt();
            if (input == k){
                System.out.println("맞았습니다.");
                System.out.print("다시 하시겠습니까? (y/n) >>");
                anwser = scanner.next().charAt(0);
                if (anwser == 'y'){
                    System.out.println("맞았습니다.");
                } else {
                    break;
                }
            } else if(input < k){
                System.out.println("더 높게");
                continue;
            } else {
                System.out.println("더 낮게");
                continue;
            }
        }
            */
    }
}
