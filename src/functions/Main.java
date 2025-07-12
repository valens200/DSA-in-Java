package functions;

public class Main {
    public static void main(String[] args) {

        System.out.println(addNNumbers(1, 2, 3));

    }

    public static int addNNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
