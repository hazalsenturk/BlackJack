import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    private List<String> playerCards;
    private List<String> dealerCards;
    private SingleStandard52Deck deck = new SingleStandard52Deck();
    private int playerScore;
    private int dealerScore;

    /**
     * Constructor for BlackJack
     */
    public BlackJack() {
        playerCards = new ArrayList<>();
        dealerCards = new ArrayList<>();
    }

    /**
     * Method to choose the optimal ace.
     * If 1 is randomly picked form the deck, depending on the total of the hand it will be either 1 or 11.
     * if with 11 the total is over 21, it will be 1.
     *
     * @param score the hand of the player or dealer
     */
    public int optimalAce(int score){
        if(score + 11 > 21){
            return 1;
        } else {
            return 11;
        }
    }

    /**
     * Update lists of cards based on if it is dealer or player.
     *
     * @param attendant
     * @param card
     */
    public void updateAttendant(String attendant, String card){
        if(attendant.equals("player")){
            playerCards.add(card);
        } else {
            dealerCards.add(card);
        }

    }

    /**
     * Method to draw a card from the deck.
     * 11 is the value of the K.
     * 12 is the value of the Q.
     * 13 is the value of the J.
     *
     * K, Q, J considered as 10.
     *
     * @param score the hand of the player or the dealer
     * @return the card drawn
     */
    public int getCard(String attendant, int score) {
        Random rand = new Random();
        Integer rank =rand.nextInt(1,13);
        int count = deck.getCards().get(rank);
        if (count > 0) {
            deck.getCards().put(rank, count - 1);
            if(rank == 11 || rank == 12 || rank == 13){
                if (rank == 11) {
                    updateAttendant(attendant, "K");
                } else if (rank == 12) {
                    updateAttendant(attendant, "Q");
                } else {
                    updateAttendant(attendant, "J");
                }
                return 10;
            } else if( rank == 1){
                updateAttendant(attendant, "A");
                return optimalAce(score);
            }
            updateAttendant(attendant, rank.toString());
            return rank;
        } else {
            return getCard(attendant, score);
        }
    }


    /**
     * Method to start the game.
     * The player and the dealer are dealt 2 cards.
     * The player can choose to hit or stand.
     * If the player hits, he is dealt another card.
     * If the player stands, the dealer is dealt cards until he reaches 17.
     * The player wins if he has a higher score than the dealer.
     * The dealer wins if he has a higher score than the player.
     * If the player and the dealer have the same score, it is a tie.
     *
     * @return void
     */
    public void play() {

        deck.prepareDeck();

        Integer playerCard1 = (Integer)getCard("player",playerScore);
        Integer playerCard2 = getCard("player",playerScore);
        Integer dealerCard1 = getCard("dealer",dealerScore);
        Integer dealerCard2 = getCard("dealer",dealerScore);
        System.out.println();


        playerScore = playerCard1 + playerCard2;
        dealerScore = dealerCard1 + dealerCard2;

        System.out.println("Player has: " + playerCards+ "=" + playerScore);
        System.out.println("Dealer has: " + dealerCards.get(0) + " and a hidden card");

        boolean isPlaying = true;

        while(isPlaying){
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Would you like to hit or stand? h/s");
            String answer = scanner.nextLine();
            if(answer.equals("h")){

                int playerCard3 = getCard("player", playerScore);
                playerScore += playerCard3;
                System.out.println("Player has: " + playerCards + "=" + playerScore);
                if(playerScore > 21){
                    System.out.println("You lose!");
                    System.out.println("Dealer has: " + dealerCards + "=" + dealerScore);
                    return;
                } else if(playerScore == 21){
                    System.out.println("BlackJack. You win!");
                    System.out.println("Dealer has: " + dealerCards + "=" + dealerScore);
                    isPlaying = false;
                }
            } else if(answer.equals("s")) {
                break;
            }else{
                System.out.println("invalid argument. Try again.");
            }
        }

        if(playerScore != 21){



        while(dealerScore < 17){
            System.out.println();
            System.out.println("The dealer gets a new card.");
            int dealerCard3 = getCard("dealer", dealerScore);
            dealerScore += dealerCard3;
        }

        System.out.println("Dealer has: " + dealerCards + "=" + dealerScore);
        System.out.println("The dealer's total is: " + dealerScore);

        if(dealerScore > 21){
            System.out.println("The dealer busts! You win!");
        } else if(dealerScore > playerScore){
            System.out.println("The dealer wins!");
        } else if(dealerScore < playerScore){
            System.out.println("You win!");
        } else {
            System.out.println("It's a tie!");

        }

    }}
}
