import java.util.Scanner;
import java.util.Stack;

class Bracket {
    public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("PLease input something to test:  ");
        String s= sc.next();

        System.out.println("Input :"+s);

        System.out.println();

        System.out.print("Output : ");

        BracketChecker(s);
    }

    public static void BracketChecker(String input) {

//       make object of Stack class
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) // for loop to through the each index in the entered string
        {
            char character = input.charAt(i); // new variable to check each index in the character
            switch (character) {
                case '{':
                case '[':
                case '(':
                    stack.push(character); // pushing the opening chars
                    break;

                case '}': // closing chars
                case ']':
                case ')':
                    if (!stack.isEmpty()) // if stack not empty,
                    {
                        char pop = stack.pop(); // pop and check
                        if ((character == '}' && pop != '{') || (character == ']' && pop != '[')
                                || (character == ')' && pop != '('))
                        {
                            System.out.println(i+1);
                            return;
                        }
                    } else
                        System.out.println(i+1);
                    break;
                default: // don't do anything on other characters
                    break;
            }
        }
        if(stack.isEmpty()) { // checking if stack is empty print success
            System.out.println("Success");
        }
        if (!stack.isEmpty()) // if not empty print out the  num of index
            System.out.println(input.length());
    }
}

