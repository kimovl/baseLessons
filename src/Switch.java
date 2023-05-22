import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //switch for no usage else if x3+
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("You day of birth");
                break;
            case 7:
                System.out.println("You go to school");
                break;
            case 18:
                System.out.println("You end your school");
                break;
            default:
                System.out.println("Wrong age for info)");
        }
    }
}
