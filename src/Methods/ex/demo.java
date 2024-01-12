package Methods.ex;

public class demo {
    public static void main(String[] args) {

        int number = 1234;
        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sumEven += currentDigit;
            } else {
                sumOdd += currentDigit;
            }
            number /= 10;
        }
        System.out.printf("%d %d", sumEven, sumOdd);


    }
}
