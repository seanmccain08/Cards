import java.util.*;
class Main {
    public static void main(String[] args) {

    /*
    1: Spades
    2: Hearts
    3: Diamonds
    4: Clubs
    */
        Scanner scan = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        boolean playing = true;

        while(playing){

            System.out.println("1. View Deck\n2. Shuffle Deck\n3. Deal all cards...\n4. Deal a specified amount of cards...\n5. Quit");
            int choice = scan.nextInt();
            switch(choice){

                case 1:
                    System.out.println(deck.toString());
                    break;

                case 2:
                    deck.shuffle();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:

                    System.out.println("Are you sure you want to quit?");
                    break;

                default:
                    System.out.println("Please make a valid choice.");
                    break;

            }

        }

    }
}