package two;
import java.util.Scanner;

public class rock {
    public static void Comparation(String a, String b){

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");

        System.out.print("철수>> ");
        String chol = scanner.next();

        System.out.print("영희>> ");
        String young = scanner.next();

        int win = 0;

        if(chol.equals(young)){
            win = 3;
        } else if(chol.equals("가위")){
            if(young.equals("바위")){
                win = 2;
            } else {
                win = 1;
            }
        } else if (chol.equals("바위")) {
            if (young.equals("보")) {
                win = 2;
            } else {
                win = 1;
            }
        } else if (chol.equals("보")) {
            if (young.equals("가위")) {
                win = 2;
            } else {
                win = 1;
            }
        }

        switch (win){
            case(3):
                System.out.println("비겼습니다.");
                break;
            case(1):
                System.out.println("철수가 이겼습니다.");
                break;
            case(2):
                System.out.println("영희가 이겼습니다.");
        }
        /*
        if(chol.equals("가위") && young.equals("가위")){
            System.out.print("비겼습니다.");
        }
        else if (chol.equals("가위") && young.equals("바위")){
            System.out.print("영희가 이겼습니다.");
        }
        else if (chol.equals("가위") && young.equals("보")){
            System.out.print("철수가 이겼습니다.");
        }
        else if (chol.equals("바위") && young.equals("가위")){
            System.out.print("철수가 이겼습니다.");
        }
        else if (chol.equals("바위") && young.equals("바위")){
            System.out.print("비겼습니다.");
        }
        else if (chol.equals("바위") && young.equals("보")){
            System.out.print("영희가 이겼습니다.");
        }
        else if (chol.equals("보") && young.equals("가위")){
            System.out.print("영희가 이겼습니다.");
        }
        else if (chol.equals("보") && young.equals("바위")){
            System.out.print("철수가 이겼습니다.");
        }
        else if (chol.equals("보") && young.equals("보")){
            System.out.print("비겼습니다.");
        }
        */
        scanner.close();
    }
}
