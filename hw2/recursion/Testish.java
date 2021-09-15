public class Testish {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length <= 1) {
                String input = args[0];
                if (elfish(input)) {
                    System.out.println(input + " is Elfish");
                } else {
                    System.out.println(input + " is not Elfish");
                }
            } else {
                String x = args[0];
                String word = args[1];
                if (xish(x, word)) {
                    System.out.println(word + " is " + x + "ish");
                } else {
                    System.out.println(word + " is not " + x + "ish");
                }
            }
        } else {
            System.out.println("Please provide one or two strings");
        }
    }


    public static boolean elfish(String word) {
        return xish("elf", word);
    }

    public static boolean xish(String x, String word) {
        if (x.isEmpty()) {
            return true;
        }
        if (word.isEmpty()) {
            return false;
        } else if (word.contains(String.valueOf(x.charAt(0)))) {
            int charIndex = word.indexOf(x.charAt(0));
            String firstPart = word.substring(0, charIndex);
            String secondPart = word.substring(charIndex + 1);
            String newWord = firstPart.concat(secondPart);
            String newX = x.substring(1);
            return xish(newX, newWord);
        } else {
            return false;
        }
    }
}