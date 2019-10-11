import java.util.Scanner;
public class Question_7 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int intInput, numSides, dieRollResult, total;
        String yOrN;
        do {
            System.out.print("How many dice do you want to roll? ");
            intInput = Integer.parseInt(sc.nextLine());
            System.out.print("How many sides do these dice have? ");
            numSides = Integer.parseInt(sc.nextLine());
            System.out.print("\nYou rolled:");
            total = 0;
            for (int i = 0; i < intInput; i ++) {
                dieRollResult = rollDie(numSides);
                total += dieRollResult;
                System.out.print(" " + dieRollResult);
            }
            System.out.println("\nTotal: " + total + "\n");
            System.out.print("Again? [y,n] ");
            yOrN = sc.nextLine();
            if (yOrN.equals("y")) {
                System.out.println("");
            }
        } while (yOrN.equals("y"));
        System.out.println("Good-bye!");
    }

    public static int rollDie(int _numSides) {
        return (int) (Math.random() * _numSides + 1);
    }
}