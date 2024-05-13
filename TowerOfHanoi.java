/*
* This program recreates the Tower of Hanoi game.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-05-12
*/

import java.util.Scanner;

/**
* This is the Main class.
*/
final class TowersOfHanoi {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private TowersOfHanoi() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Solves the Towers of Hanoi puzzle recursively.
     * 
     * @param ndisks The number of disks to move.
     * @param startPeg The peg from which to move the disks.
     * @param endPeg The peg to which to move the disks.
     */
    public static void hanoi(int ndisks, int startPeg, int endPeg) {
        if (ndisks == 1) {
            System.out.println("Move disk 1 from peg " + startPeg + " to peg " + endPeg);
        } else {
            hanoi(ndisks - 1, startPeg, 6 - startPeg - endPeg);
            System.out.println("Move disk " + ndisks + " from peg " + startPeg + " to peg " + endPeg);
            hanoi(ndisks - 1, 6 - startPeg - endPeg, endPeg);
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Towers of Hanoi program\n");
        System.out.print("How many disks would you like in your tower (1->): ");
        int numberOfDisks = scanner.nextInt();
        
        if (numberOfDisks <= 0) {
            System.out.println("Invalid input.");
        } else {
            hanoi(numberOfDisks, 1, 3);
        }
        
        System.out.println("\nDone.");
    }
}
