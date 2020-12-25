/*
 * 
- Author: Dom(Abdullah) Arishi
- Date: 02/14/2020
- input: one input choosing a character by the user
- Output: the output would show who the winner whether it's the user or the computer
- Description: By using the random methods, I created a game between the computer and the
user.
*/
 package game1;
 
import java.util.Scanner;
import java.util.Random;
public class game {


    static Scanner sc = new Scanner(System.in);

    public static String cpuMove;
    public static int rounds = 0;
    public static int userwin = 0;
    public static int cpuwin = 0;
    public static int count_of_user_win = 0;
    public static int count_of_cpu_win = 0;
    public static int userChar;
    public static int cpu_char;
    public static String userWin = "YOU WON";
    public static String cpuWin = "Computer WON";


    public static void GameRules() {
        System.out.println("\n********** RULES **********\n" +
                "\n* Songesand beats Kullen, Gödishus\n" +
                "* Kullen beats Derflürg, Koppang\n\n" +
                "* Derflürg beats Songesand, Gödishus\n\n" +
                "* Gödishus beats Koppang, Kullen\n\n" +
                "* Koppang beats Songesand, Derflürg\n\n");
        System.out.println("\n********** RULES **********\n");
    }

    public static void start_game() {
        while (true) {

            System.out.println("Do you want to start the game choose 'y' or 'n'");
            String YesNo = sc.nextLine();
            while (!(YesNo.equals("n")) && !(YesNo.equals("y"))) {
            	System.out.println("please enter y or n");
                YesNo = sc.nextLine();
            }
            if (YesNo.equals("y") || YesNo.equals("y")) {
                System.out.println("GAME START");
                System.out.println();
                rounds++;
                GameRules();
                userChar();
                cpu_char();
                int user = userChar;
                int cpu = cpu_char;
                if (user == 1 && (cpu == 3 || cpu == 4)) {
                    System.out.println("YOU WIN");
                    userwin++;
                } else if (user == 2 && (cpu == 3 || cpu == 4)) {
                    System.out.println("YOU WIN");
                    userwin++;
                } else if (user == 3 && (cpu == 2 || cpu == 4)) {
                    System.out.println("YOU WIN");
                    userwin++;
                } else if (user == 4 && (cpu == 2 || cpu == 5)) {
                    System.out.println("YOU WIN");
                    userwin++;
                } else if (user == 5 && (cpu == 1 || cpu == 3)) {
                    System.out.println("YOU WIN");
                    userwin++;
                } else if (user == cpu) {
                    System.out.println("Computer  WIN");
                    cpuwin++;
                } else {
                    System.out.println("Computer  WIN");
                    cpuwin++;
                }
                System.out.println("-----------------------------------------------");
                rounds++;

            } else {
                System.out.println("Round played: " + rounds / 2);
                System.out.println("User wins " + userwin);
                System.out.println("cpu wins: " + cpuwin);
                System.out.println("Exit");
                break;
            }
        }
    }

    public static int userChar() {
        System.out.println(" 1. Godishus   2. Derfurg   3. Kullun  4. Koppang   5. Songesand");
        System.out.println("Pick a number: ");
        userChar = sc.nextInt();

        while (true) {
            while (userChar != 1 && userChar != 2 && userChar != 3 && userChar != 4 && userChar != 5) {
                System.out.println("Invalid character");
                System.out.println("1. Godishus   2. Derfurg   3. Kullun  4. Koppang   5. Songesand");
                System.out.println("Pick a number again: ");
                userChar = sc.nextInt();
            }
            if (userChar >= 1 && userChar <= 5) {
                if (userChar == 1) {
                    System.out.println("Your Character: " + "Godishus");
                    return userChar;
                } else if (userChar == 2) {
                    System.out.println("Your Character: " + "Derflurg");
                    return userChar;

                } else if (userChar == 3) {
                    System.out.println("Your Character: " + "Kullen");
                    return userChar;
                } else if (userChar == 4) {
                    System.out.println("Your Character: " + "Koppang");
                    return userChar;
                } else if (userChar == 5) {
                    System.out.println("Your Character: " + "Songesand");
                    return userChar;
                }

            }
        }
    }

    public static int cpu_char() {
        Random rand = new Random();
        cpu_char = rand.nextInt(5) + 1;
        if (cpu_char == 1) {
            System.out.println("Computer character: " + "Godishus");
            return cpu_char;
        } else if (cpu_char == 2) {
            System.out.println("Computer character: " + "Derflurg");
            return cpu_char;
        } else if (cpu_char == 3) {
            System.out.println("Computer character: " + "Kullen");
            return cpu_char;
        } else if (cpu_char == 4) {
            System.out.println("Computer character: " + "Koppang");
            return cpu_char;
        } else if (cpu_char == 5) {
            System.out.println("Computer character: " + "Songesand");
            return cpu_char;
        }
        return cpu_char;
    }

    public static void main(String[] args) {
        start_game();
        //System.out.println();
    }
}