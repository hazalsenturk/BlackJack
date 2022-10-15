import java.io.IOException;
import java.util.Scanner;

public class BlackJackDriver {

    public static String userInput(){

        System.out.println("Would you like to play? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("y") || input.equals("n")){
            return input;
        }else {
            System.out.println("Invalid input try again");
            return userInput();
        }

    }

    public static void game(String input) {
        if(input.equals("y")){
            BlackJack blackJack = new BlackJack();
            blackJack.play();
        }else if(input.equals("n")){
            System.out.println("Goodbye!");
            System.exit(0);
        }else{
            System.out.println("Invalid input. Try again.");
        }
    }

    /**
     * Main method to run the game.
     * @param args
     */
    public static void main(String[] args) {

        GameInterface gameInterface = new GameInterface();
        gameInterface.printRules();

        while(true){
            String answer = userInput();
            game(answer);
        }
    }
}
