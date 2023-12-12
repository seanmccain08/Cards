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
        System.out.println(deck.toString());
        System.out.println("Deck initialized!");
        boolean playing = true;

        while(playing){

            System.out.println("1. Shuffle Deck\n2. View deck\n3. Deal all cards...\n4. Deal a specified amount of cards...\n5. Quit");
            int choice = scan.nextInt();
            switch(choice){

                case 1:
                    break;

                case 2:
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