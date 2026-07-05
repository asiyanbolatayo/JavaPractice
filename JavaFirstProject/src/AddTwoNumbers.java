
public class AddTwoNumbers {

    public AddTwoNumbers() {
        int x = 56;
        int y = 48;
        int sum = x + y;

        System.out.printf("The sum of %d and %d is %d%n", x, y, sum);

        double a = 10.54, b = 2.547;
        System.out.printf("The multiplication of %f and %f is %f%n", a, b, a * b);

        int c = 10, d = 2;
        double e = (double) c / d;
        System.out.printf("The division of %d and %d is %f%n", c, d, e);
    }

    public static void testExclusiveOROperator() {
        byte x = 0b01100000;
        byte y = 0b00111000;
        System.out.printf("The xor of %d and %d is %d%n", x, y, (byte)(x ^ y));
    }
}
