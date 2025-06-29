package JavaIO;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        // Printing to the console
        PrintStream output = System.out;
        output.println("Printing to the console");

        // Getting inputs form the console

        Scanner input = new Scanner(System.in);
        output.println(input.nextLine()); // scanning texts
        output.println(input.nextDouble()); // sannning doubles
        output.println(input.nextInt()); // sannning integers
        output.println(input.nextBoolean()); // sannning booleansn
        output.println(input.nextLong()); // sannning long numbers
    }

}
