public class DeckOfCards{

    /*
    1: Spades
    2: Hearts
    3: Diamonds
    4: Clubs
    */
    private Card[] deck0;

    public DeckOfCards(){

        deck0 = new Card[52];
        int id = 0;
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 13; j++, id++){

                deck0[id] = new Card(j+1, i+1);

            }

        }

    }
    public String toString(){

        String result = "";
        for(int i = 0; i < 52; i++){

            result += deck0[i].toString()+"\n";

        }
        return result;

    }
    public void shuffle(){

        for(int i = 0; i <= 50; i++){



        }

    }

}