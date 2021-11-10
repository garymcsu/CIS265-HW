import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        AVLTreeMap map = new AVLTreeMap();
        // write your code here
        File file = new File("broster.txt");
        if (!file.isFile()) {
            System.out.println(file.getPath() + " does not exist or is not a valid file");
            System.exit(1);
        }

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] fields = line.split("\t+");
                System.out.println(fields.length);
                BrownsPlayer player = new BrownsPlayer(fields[0], Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), fields[4], fields[5], Integer.parseInt(fields[6]), fields[7]);
                map.put(player, player);
            }
            reader.close();
            System.out.println(map.toString());
        } catch (FileNotFoundException e) {
            System.out.println(file.getPath() + " does not exist");
        }
    }
}
