public class If {
    public static void main(String[] args) {
        int first_value = 10;
        if (6 == 6) {
            System.out.println("6 = 6 ? - " + "It`s correct");
        }
        if (5 < 4) {
            System.out.println("It`s correct");
        } else {
            System.out.println("It`s incorrect");
        }
        if (first_value >= 11) {
            System.out.println("CORRECT");
        } else if (first_value >= 20) {
            System.out.println("CORRECT >= 20");
        } else {
            System.out.println("DEFAULT");
        }
    }
}
