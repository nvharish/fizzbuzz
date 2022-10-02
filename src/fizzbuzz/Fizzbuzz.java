/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author harish
 */
class Result {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

public class Fizzbuzz {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String fileName = "input.txt";
        Scanner sc = new Scanner(new File(fileName));
        int n, t = 1;
        while (sc.hasNextInt()) {
            System.out.println("#####Test case " + t++ + "#####");
            n = sc.nextInt();
            Result.fizzBuzz(n);
        }
    }

}
