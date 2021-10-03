import java.util.Scanner;

public class Evaluate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a expression: ");
        String input = scanner.nextLine();
        int result = expression(input);
        System.out.println(result);
    }

    public static int expression(String str) {
        int result = 0;
        char plus = '+';
        char minus = '-';
        char multiply = '*';
        ArrayStack operatorStack = new ArrayStack();
        ArrayStack digitStack = new ArrayStack();
        for (char ch: str.toCharArray()){
            if(ch == plus || ch == minus || ch == multiply){
                try {
                    operatorStack.push(ch);
                } catch (StackFullException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(ch);
        }
        return result;
    }
}