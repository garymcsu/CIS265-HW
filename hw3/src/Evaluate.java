import java.util.Scanner;

public class Evaluate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a expression: ");
        String input = scanner.nextLine();
        int result = expression(input);
// your implementation
// obtain user's input from keyboard
// invoke method expression() to get the result and print it out
    }

    public static int expression(String str) {
        int result = 0;
        ArrayStack operatorStack = new ArrayStack();
        ArrayStack digitStack = new ArrayStack();
        // return the value
        return result;
    }
//        ArrayStack st = new ArrayStack(10);
//        try {
//            st.push("A");
//            st.push("B");
//            st.push("C");
//
//        } catch (StackFullException ex) {
//            System.out.println("Oops...");
//        }
//        System.out.println("top(): " + st.top());
//        System.out.println("size: " + st.size());
//        System.out.println("isEmpty(): " + st.isEmpty());
//        System.out.println("pop(): " + st.pop());
//
//        try {
//            st.push("AAA");
//            st.push("BBB");
//            st.push("CCC");
//            st.push("DDD");
//            st.push("EEE");
//            st.push("FFF");
//            st.push("GGG");
//            st.push("HHH");
//            st.push("III");
//            st.push("JJJ");
//            st.push("KKK");
//
//        } catch (StackFullException ex) {
//            System.out.println("push error...");
//        }
//
//        System.out.println("pop(): " + st.pop());
//        System.out.println("size(): " + st.size());
//        System.out.println("pop(): " + st.pop());

//    }
}