/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsandproducts;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;
import java.util.Scanner;

/**
 *
 * @author lefty
 */
public class SumsAndProducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("How many numbers do you want to add and multiply? ");
        Scanner keyboard = new Scanner(System.in);
        int numberOfNumbers = keyboard.nextInt();
        double sum = 0, product = 1, smallest = MAX_VALUE, largest = MIN_VALUE;
        boolean largerThanTen = false;

        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.println("Can I have number "+i+", please:");
            double number = keyboard.nextDouble();

            sum = sum + number;
            product = product * number;
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            if (number > 10) {
                largerThanTen = true;
            }
        }

        System.out.println("Sum=" + sum);
        System.out.println("Product=" + product);
        System.out.println("Largest=" + largest);
        System.out.println("Smallest=" + smallest);
        System.out.println("Any of the numbers larger than 10? " + largerThanTen);

    }

}
