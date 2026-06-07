public class StringFormatApp {
    public static void main(String[] args) {
    String name = args[0];
    int age = Integer.parseInt(args[1]);
    float height = Float.parseFloat(args[2]);
    System.out.printf("name: %-10s %1$s Age: %2$d Height: %3$f", name, age, height);
  }
}