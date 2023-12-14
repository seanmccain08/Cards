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

            System.out.println("1. Create a deck...\n2. View Deck\n3. Shuffle Deck\n4. Deal all cards...\n5. Deal a specified amount of cards...\n6. Quit");
            int choice = scan.nextInt();
            switch(choice){

                case 1:
                    deck = new DeckOfCards();
                    break;

                case 2:
                    System.out.println(deck.toString());
                    break;

                case 3:
                    deck.shuffle();
                    break;

                case 4:
                    System.out.println("How many players? (2-4)");
                    choice = scan.nextInt();
                    deck.deal(choice);
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Are you sure you want to quit?");
                    System.out.println("1. Yes\n2. No");
                    choice = scan.nextInt();
                    if (choice == 1) {

                        playing = false;
                        System.out.println("Quitting...");
                        break;

                    }
                    else{

                        break;

                    }

                default:
                    System.out.println("Please make a valid choice.");
                    break;

            }

        }

    }
}