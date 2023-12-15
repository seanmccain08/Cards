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

        String result = "";
        if(deck0.size() == 0){

            result+="The whole deck has already been dealt.";

        }
        else {
            for (int i = 0; i < deck0.size(); i++) {

                result += deck0.get(i).toString() + "\n";

            }
        }
        return result;

    }
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
                if(cards > deck0.size()){

                    System.out.println("Not enough cards in the deck!");

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
                        hand3.add(deck0.get(0));
                        deck0.remove(0);

                    }

                }
                break;

            default:
                System.out.println("Please enter a valid amount of players.");

        }

    }

}