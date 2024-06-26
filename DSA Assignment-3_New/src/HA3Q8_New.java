/*In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking
out of it. On peg a is a stack of n disks, each larger than the next, so that the smallest is on the
top and the largest is on the bottom. The puzzle is to move all the disks from peg a to peg c,
moving one disk at a time, so that we never place a larger disk on top of a smaller one. See
Figure 1 for an example of the case n = 4. Write a recursive program using Java for solving
the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the sub-problem of moving all
but the nth disk from peg a to another peg using the third as “temporary storage.”) */
import java.util.*;
public class HA3Q8_New{
    public static void TowerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
            return;
        }
        TowerOfHanoi(n - 1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk " + n + " from peg " + fromPeg + " to peg " + toPeg);
        TowerOfHanoi(n - 1, auxPeg, toPeg, fromPeg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of discs : ");
        int n = sc.nextInt();
        TowerOfHanoi(n, 'A', 'C', 'B');
    }
}
