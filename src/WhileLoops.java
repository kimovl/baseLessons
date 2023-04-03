public class WhileLoops {
    public static void main(String[] args) {
        boolean bool_value = true;//5>2
        System.out.println("first boolean value - " + bool_value);
        int value = 5;
        bool_value = value > 1;
        /*while (value > 5) {
            System.out.println("Hello");//infinite cycle
        }*/
        while (value < 10) {
            System.out.println("Hello");
            value += 1;
        }
    }
}
