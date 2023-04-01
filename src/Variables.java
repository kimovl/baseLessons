public class Variables {
    public static void main(String[] args) {
        int myInt;
        myInt = 55;
        short myShort = 555;
        long myLong = 55555555;

        double myDouble = 2.2;//64 bit
        float myFloat = 2.2f;//32 bit

        char myChar = 'a';
        boolean myBoolean = true;

        byte myByte = 33;//-128~127
        System.out.println("int - " + myInt + ", short - " + myShort + ", long - " + myLong);
        System.out.println("double - " + myDouble + ", float - " + myFloat);
        System.out.println("byte - " + myByte);
    }
}
