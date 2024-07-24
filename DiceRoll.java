public class DiceRoll {
    public static void main(String[] args) {
        int roll;
        int[] diceRolls = new int[20];
        int totalRolls = 0;

        // Sample the rolls
        for (int count = 0; count < 1000; count++) {
            roll = (int)(Math.random() * 20) + 1;
            diceRolls[roll - 1] += 1;
        }

        // Run a report
        for (int index = 0; index < diceRolls.length; index++) {
            System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
            totalRolls += diceRolls[index];
        }

        System.out.println("Total rolls were: " + totalRolls);
        System.out.println("Program by Your Name");
    }
}
