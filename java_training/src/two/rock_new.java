package two;
import java.util.Scanner;
import java.util.Random;

public class rock_new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String r[] = {"가위", "바위", "보"}; // String c[] = new String[3];
        String reciever;
        while (true){
            int n = (int)(Math.random()*3) ;
            System.out.print("가위 바위 보 !>>");
            reciever = scanner.next();
            if (r[n].equals(reciever)){
                System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 비겼습니다." );
            }else if (reciever.equals("가위")){
                if (n == 1){
                    System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 컴퓨터가 이겼습니다." );
                } else {
                    System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 사용자가 이겼습니다." );
                }
            }else if (reciever.equals("바위")){
                if (n == 0){
                    System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 사용자가 이겼습니다." );
                } else {
                    System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 컴퓨터가 이겼습니다." );
                }
            }else if (reciever.equals("보")){
                if (n == 0){
                    System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 컴퓨터가 이겼습니다." );
                } else {
                    System.out.println("사용자 = " + reciever + " , 컴퓨터 = " + r[n] + " , 사용자가 이겼습니다." );
                }
            } else {
                break;
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
