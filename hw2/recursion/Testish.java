public class Testish {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1) {
                String input = args[0];
                elfish(input);
            } else if(args.length == 2){

            }
        } else {
            System.out.println("Please provide one or two strings");
        }
    }

    public static void elfish(String input){
        //TODO make recursive method
    }
//        if (input.contains("e") && input.contains("l") && input.contains("f")) {
//            System.out.println(input + " is elfish");
//        } else {
//            System.out.println(input + " is not elfish");
//        }
//    }
}