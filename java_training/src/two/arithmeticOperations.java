package two;
import java.util.Scanner;

public class arithmeticOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        int operand1 = scanner.nextInt();
        String operator = scanner.next();
        int operand2 = scanner.nextInt();
        int result = 0;

        if (operator.equals("+")){
            result = operand1 + operand2;
        }else if (operator.equals("-")){
            result = operand1 - operand2;
        }else if (operator.equals("*")){
            result = operand1 * operand2;
        }else if (operator.equals("/")){
            result = operand1 / operand2;
        }else if (operator.equals("%")){
            result = operand1 % operand2;
        }
        System.out.println(operand1 + operator + operand2 +
                "의 결과는" + result );
    }
}
