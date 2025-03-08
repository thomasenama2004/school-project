import java.util.Random;

public class SchoolProject {
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(10);
    System.out.println("Generated number: " + num);
  }
}
