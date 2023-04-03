package five;
import java.util.Scanner;

interface Stack{     // 접근제어문이 기본으로 추상이다
    int length();    // 현재 스택에 저장된 개수 리턴
    int capacity();  // 스택의 전체 저장 가능한 개수 리턴
    String pop();    // 스택의 top에 실수 저장
    boolean push(String val);  // 스택의 top에 저장된 실수 리턴
}


public class StringStack implements Stack{
    @Override
    public int length() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public String pop() {
        return null;
    }

    @Override
    public boolean push(String val) {
        return false;
    }

    public static void main(String[] args) {
        int size;
        String sentence[];
        String check;
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택에 저장 공간의 크기 입력 >>");
        size = scanner.nextInt();
        sentence = new String[size];
        int i = 0;

        while(true) {
            System.out.print("문자열 입력 >> ");
            check = scanner.next();
            if (check.equals("그만")){
                break;
            }else if(i == size){
                System.out.println("스택이 꽉 차서 푸시 불가");
            }
            else {
                sentence[i] = check;
                i++;
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝 : " );
    }
}
