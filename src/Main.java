import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random number: " + randomNumber);
    }
}