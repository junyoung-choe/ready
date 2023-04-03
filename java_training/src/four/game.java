package four;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
        int number = scanner.nextInt();
        String name[] = new String[number];

        for(int i = 0; i < number; i++) {  // 이름을 입력받는다
            System.out.print((i + 1) + "번째 참가자의 이름을 입력하세요>>");
            name[i] = scanner.next();
        }


        int i = 0;
        String word = "아버지";
        int lastIndex;    //마지막 인덱스 확인
        char firstChar;  // 첫글자
        char lastChar;   // 마지막 글자
        System.out.println("시작하는 단어는 아버지입니다.");

        while (true){
            if (i == number)
                i = 0;
            lastIndex = word.length() - 1;
            lastChar = word.charAt(lastIndex);
            System.out.print(name[i] + ">>");
            word = scanner.next();
            firstChar = word.charAt(0);
            if (firstChar != lastChar){
                System.out.println(name[i] + "이 졌습니다");
                break;
            }
            i++;
        }
        scanner.close();
    }
}
