/* Read 2 integer values (A and B). After that, the program should show a message "Multiple" or "Not Multiple", indicating whether the values read are multiples of each other. Please note: the numbers must be able to be typed into ascending or descending order. */

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the value of A: ");
        int A = sc.nextInt();
        System.out.print("Insert the value of B: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Multiples");
        } else {
            System.out.println("Not Multiples");
        }

        sc.close();
    }
}
