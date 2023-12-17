import java.sql.Array;
import java.util.ArrayList;

public class DeckOfCards{

    /*
    1: Spades
    2: Hearts
    3: Diamonds
    4: Clubs
    */
    private ArrayList<Card>deck0;
    public static ArrayList<Card>hand1 = new ArrayList<Card>();
    public static ArrayList<Card>hand2 = new ArrayList<Card>();
    public static ArrayList<Card>hand3 = new ArrayList<Card>();
    public static ArrayList<Card>hand4 = new ArrayList<Card>();
    public static ArrayList<Card>discardPile = new ArrayList<Card>();
    public static ArrayList<Card>flippedPile = new ArrayList<Card>();

    public DeckOfCards(){

        deck0 = new ArrayList<Card>(52);
        int id = 0;
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 13; j++, id++){

                deck0.add(new Card(j+1, i+1));

            }

        }

    }
    public String toString(){

        String result = "Top\n_________\n";
        if(deck0.size() == 0){

            result+="The whole deck has already been dealt.";

        }
        else {
            for (int i = 0; i < deck0.size(); i++) {

                result += deck0.get(i).toString() + "\n";

            }
        }
        return result+"_________\nBottom\n";

    }

/* Shuffling explanation:

    The shuffle method works by going through a loop in which 'i' will equal each index of the deck of cards.

    each go through of the loop selects a random index from the rest of the deck to swap it with using a temp variable.

    example:
    the first index of the deck is 0 -- the ace of spades. The last index is 51 -- the king of clubs.
    on the first round of the loop, the random index ends up being 51.
    the king of clubs is stored into temp, then index 51 is set to be the ace of spades.
    Finally, index 0 is set to be temp -- the king of clubs.

 */
    public void shuffle(){

        if(deck0.size() < 52){

            System.out.println("Cards have been dealt. To shuffle, create a new deck.");

        }
        else {
            for (int i = 0; i < 52; i++) {

                int rand = (int) (Math.random() * 51 + 1);
                Card temp = deck0.get(rand);
                deck0.set(rand, deck0.get(i));
                deck0.set(i, temp);

            }
        }

    }
    public void deal(int players){

        switch(players){

            case 2:
                for(int i = 0, player = 0; i<52; i++){

                    if(player == 0){

                        player = 1;
                        hand1.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else{

                        player = 0;
                        hand2.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            case 3:
                for(int i = 0, player = 0; i<52; i++){

                    if(player == 0){

                        player = 1;
                        hand1.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else if(player == 1){

                        player = 2;
                        hand2.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else{

                        player = 0;
                        hand3.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            case 4:
                for(int i = 0, player = 0; i<52; i++){

                    if(player == 0){

                        player = 1;
                        hand1.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else if(player == 1){

                        player = 2;
                        hand2.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else if(player == 2){

                        player = 3;
                        hand3.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else{

                        player = 0;
                        hand3.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            default:
                System.out.println("Please enter a valid amount of players.");

        }

    }

    public void deal(int players, int cards){

        switch(players){

            case 2:
                if(cards > deck0.size()/2){

                    System.out.println("Not enough cards in the deck!");
                    break;

                }
                for(int i = 0, player = 0; i<cards*2; i++){

                    if(player == 0){

                        player = 1;
                        hand1.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else{

                        player = 0;
                        hand2.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            case 3:
                if(cards > deck0.size()/3){

                    System.out.println("Not enough cards in the deck!");
                    break;

                }
                for(int i = 0, player = 0; i<cards*3; i++){

                    if(player == 0){

                        player = 1;
                        hand1.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else if(player == 1){

                        player = 2;
                        hand2.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else{

                        player = 0;
                        hand3.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            case 4:
                if(cards > deck0.size()/4){

                    System.out.println("Not enough cards in the deck!");
                    break;

                }
                for(int i = 0, player = 0; i<cards*4; i++){

                    if(player == 0){

                        player = 1;
                        hand1.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else if(player == 1){

                        player = 2;
                        hand2.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else if(player == 2){

                        player = 3;
                        hand3.add(deck0.get(0));
                        deck0.remove(0);

                    }
                    else{

                        player = 0;
                        hand4.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            default:
                System.out.println("Please enter a valid amount of players.");

        }

    }
    public String showHand(int x){

        String result = "";
        switch(x){

            case 1:
                if(hand1.size() == 0){

                    return "Player 1 has no cards yet.";

                }
                else{
                    result+="\nPlayer 1:";
                    for(int i = 0; i < hand1.size(); i++){

                        result = result + "\n" +hand1.get(i).toString();

                    }
                }
                break;

            case 2:
                if(hand2.size() == 0){

                    return "Player 2 has no cards yet.";

                }
                else{
                    result+="\nPlayer 2:";
                    for(int i = 0; i < hand2.size(); i++){

                        result = result + "\n" +hand2.get(i).toString();

                    }
                }
                break;

            case 3:
                if(hand3.size() == 0){

                    return "Player 3 has no cards yet.";

                }
                else{
                    result+="\nPlayer 3:";
                    for(int i = 0; i < hand3.size(); i++){

                        result = result + "\n" +hand3.get(i).toString();

                    }
                }
                break;

            case 4:
                if(hand4.size() == 0){

                    return "Player 4 has no cards yet.";

                }
                else{
                    result+="\nPlayer 4:";
                    for(int i = 0; i < hand4.size(); i++){

                        result = result + "\n" +hand4.get(i).toString();

                    }
                }
                break;

            case 5:
                if(hand1.size() == 0){

                    result+="\nPlayer 1 has no cards yet.";

                }
                else{
                    result+="\nPlayer 1:";
                    for(int i = 0; i < hand1.size(); i++){

                        result = result + "\n" +hand1.get(i).toString();

                    }
                }
                result+="\n";
                if(hand2.size() == 0){

                    result+="\nPlayer 2 has no cards yet.";

                }
                else{
                    result+="\nPlayer 2:";
                    for(int i = 0; i < hand2.size(); i++){

                        result = result + "\n" +hand2.get(i).toString();

                    }
                }
                result+="\n";
                if(hand3.size() == 0){

                    result+="\nPlayer 3 has no cards yet.";

                }
                else{
                    result+="\nPlayer 3:";
                    for(int i = 0; i < hand3.size(); i++){

                        result = result + "\n" +hand3.get(i).toString();

                    }
                }
                result+="\n";
                if(hand4.size() == 0){

                    result+="\nPlayer 4 has no cards yet.";

                }
                else{
                    result+="\nPlayer 4:";
                    for(int i = 0; i < hand4.size(); i++){

                        result = result + "\n" +hand4.get(i).toString();

                    }
                }
                break;

            default:
                return "Please make a valid choice";

        }
        return result+"\n";
    }
    public static void clearHands(){

        hand1 = new ArrayList<Card>();
        hand2 = new ArrayList<Card>();
        hand3 = new ArrayList<Card>();
        hand4 = new ArrayList<Card>();
        discardPile = new ArrayList<Card>();
        flippedPile = new ArrayList<Card>();

    }
    public void burn(){

        Card temp = deck0.get(0);
        discardPile.add(temp);
        deck0.remove(0);
        System.out.println("Burned the top card.");

    }
    public void flip(){

        Card temp = deck0.get(0);
        flippedPile.add(temp);
        deck0.remove(0);
        System.out.println("Successfully flipped the new top card: the "+flippedPile.get(flippedPile.size()-1).toString()+"!\n");

    }
    public String getTopCard(){

        return "Top card: " + flippedPile.get(flippedPile.size()-1).toString();

    }
}