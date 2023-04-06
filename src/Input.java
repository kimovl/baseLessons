import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input something: ");
        String str = scanner.nextLine();//line for something from console and have methods for int double etc.
        System.out.println("Your input is: " + str);
    }
}
