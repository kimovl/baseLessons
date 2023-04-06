import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some integer value");
        int value = scanner.nextInt();
        /*while (value != 5) {
            System.out.println("Please, input 5 to stop");
            value = scanner.nextInt();
        }
        System.out.println("Congrat, you enter 5");*/
        do {
            System.out.println("Please, input 5 to stop");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Congrat, you enter 5");
    }
}
