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
        ArrayStack operatorStack = new ArrayStack();
        ArrayStack digitStack = new ArrayStack();
        return result;
    }
}