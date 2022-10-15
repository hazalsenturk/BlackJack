/**
 * Creates an interface for the game with logo and rules.
 */
public class GameInterface {
    private final String logo = """
                 _     _            _    _            _   \s
                | |   | |          | |  (_)          | |  \s
                | |__ | | __ _  ___| | ___  __ _  ___| | __
                | '_ \\| |/ _` |/ __| |/ / |/ _` |/ __| |/ /
                | |_) | | (_| | (__|   <| | (_| | (__|   <\s
                |_.__/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_\\
                                       _/ |               \s
                                      |__/                \s""";


    public GameInterface() {
    }

    public void printRules() {
        System.out.println(logo);
        System.out.println("Welcome to BlackJack!\nThe dealer will deal you two cards.You can choose to hit or stand.");
        System.out.println("If you go over 21, you lose. If you get 21, you win. If you get closer to 21 than the dealer, you win.");
        System.out.println("Good luck!");
    }
}
