public class Card{

    private String name;
    private int tier;
    private String suit;
    private int id;

    public Card(String name0, int tier0, String suit0, int id0){

        name = name0;
        tier = tier0;
        suit = suit0;
        id = id0;

    }
    public String toString(){

        String result = "";
        if(tier == 1){

            result = "Ace of "+suit;

        }
        if(tier == 11){

            result = "Jack of "+suit;

        }
        else if(tier == 12){

            result = "Queen of "+suit;

        }
        else if(tier == 13){

            result = "King of "+suit;

        }
        else{

            result = (tier+1)+" of "+suit;

        }
        return result;

    }

}