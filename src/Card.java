public class Card{

    private String name;
    private int tier;
    private int suit;
    private boolean inDeck;

    public Card(int tier0, int suit0){

        tier = tier0;
        suit = suit0;
        inDeck = true;
        name = "";
        if(tier == 1){

            name+="Ace of ";

        }
        else if(tier == 11){

            name+="Jack of ";

        }
        else if(tier == 12){

            name+="Queen of ";

        }
        else if(tier == 13){

            name+="King of ";

        }
        else{

            name+= tier+" of ";

        }
        if(suit == 1){

            name+="Spades";

        }
        else if(suit == 2){

            name+="Hearts";

        }
        else if(suit == 3){

            name+="Diamonds";

        }
        else{

            name+="Clubs";

        }

    }
    public String toString(){

        return name;

    }

}