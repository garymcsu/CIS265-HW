import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) throws IOException {
        File hrFile = new File("heartRate/HR.txt");
        Scanner reader = new Scanner(hrFile);
        int goodDataCount = 0;
        int badDataCount = 0;
        while (reader.hasNext()) {
            try {
                int data = reader.nextInt();
                if(data < 0) {
                    throw new HRIllegalValueException("");
                } else{
                    goodDataCount++;
                }
            } catch (InputMismatchException e) {
                badDataCount++;
                reader.next();
            } catch (HRIllegalValueException e){
                System.out.println("HRIllegalValueException: cannot be negative");
                badDataCount++;
            }
        }
        System.out.println("Good Data " + goodDataCount);
        System.out.println("Bad Data " + badDataCount);
    }
}

class HRIllegalValueException extends Exception{
    HRIllegalValueException(String message){
        super(message);
    }
}