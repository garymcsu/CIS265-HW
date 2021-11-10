public class BrownsPlayer {
    private String lastName;
    private int number;
    private String position;
    private int age;
    private String height;
    private String weight;
    private int yearsPro;
    private String college;

    public BrownsPlayer(String lastName, int number, String position, int age, String height, String weight, int yearsPro, String college) {
        this.lastName = lastName;
        this.number = number;
        this.position = position;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.yearsPro = yearsPro;
        this.college = college;
    }

    @Override
    public String toString() {
        return "BrownsPlayer{" +
                "lastName='" + lastName + '\'' +
                ", number=" + number +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", yearsPro=" + yearsPro +
                ", college='" + college + '\'' +
                '}';
    }
}
