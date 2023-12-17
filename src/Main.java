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
        int players = 0;

        while(playing){

            System.out.println("1. Create a deck...\n2. View Deck\n3. Shuffle Deck\n4. Deal all cards...\n5. Deal a specified amount of cards...\n6. View hand...\n7. Burn top card\n8. Flip a card\n9. Show top card\n10. Quit...");
            int choice = scan.nextInt();
            switch(choice){

                case 1:
                    deck = new DeckOfCards();
                    DeckOfCards.clearHands();
                    break;

                case 2:
                    System.out.println(deck.toString());
                    break;

                case 3:
                    System.out.println("How many times do you want to shuffle?");
                    choice = scan.nextInt();
                    if(choice < 0){

                        choice = 0;

                    }
                    for(int i = 0; i < choice; i++){

                        deck.shuffle();

                    }
                    if(choice == 1){

                        System.out.println("Successfully shuffled the deck "+choice+" time.");

                    }
                    else{

                        System.out.println("Successfully shuffled the deck "+choice+" times.");

                    }
                    break;

                case 4:
                    System.out.println("How many players? (2-4)");
                    players = scan.nextInt();
                    deck.deal(players);
                    break;

                case 5:
                    System.out.println("How many players? (2-4)");
                    players = scan.nextInt();
                    System.out.println("How many cards would you like to deal for each player?");
                    int cards = scan.nextInt();
                    deck.deal(players, cards);
                    break;

                case 6:
                    System.out.println("Whose hand would you like to view?\n1. Player 1\n2. Player 2\n3. Player 3\n4. Player 4\n5. Show All");
                    System.out.println(deck.showHand(scan.nextInt()));
                    break;

                case 7:
                    deck.burn();
                    break;

                case 8:
                    deck.flip();
                    break;

                case 9:
                    System.out.println(deck.getTopCard()+"\n");
                    break;

                case 10:
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