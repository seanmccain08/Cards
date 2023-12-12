public class DeckOfCards{

    /*
    1: Spades
    2: Hearts
    3: Diamonds
    4: Clubs
    */
    private Card[][] deck0;

    public DeckOfCards(){

        deck0 = new Card[4][13];
        int id = 0;
        for(int i = 1; i < 5; i++){

            for(int j = 1; j < 14; j++, id++){

                if(i == 1){

                    deck0[i-1][j-1] = new Card(j+" of Spades", j, "Spades", id);

                }
                else if(i == 2){

                    deck0[i-1][j-1] = new Card(j+" of Hearts", j, "Hearts", id);

                }
                else if(i == 3){

                    deck0[i-1][j-1] = new Card(j+" of Diamonds", j, "Diamonds", id);

                }
                else{

                    deck0[i-1][j-1] = new Card(j+" of Clubs", j, "Clubs", id);

                }

            }

        }

    }
    public String toString(){

        String result = "";
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 13; j++){

                result += deck0[i][j].toString()+"\n";

            }

        }
        return result;

    }
    public void shuffle(){



    }

}