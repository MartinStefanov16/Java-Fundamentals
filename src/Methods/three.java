package Methods;

public class three {
    public static void main(String[] args) {


        System.out.println(getMax(10, 20));

    }

    public static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }
}
