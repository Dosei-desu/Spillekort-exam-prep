package playingCard;

public class Card {
    private char colour; //(S)pades, (H)earts, (D)iamonds, (C)lubs
    private int value; //0-12

    public Card(char colour, int value){
        //ensures always capital letters
        if(colour == 'S' || colour == 'H' || colour == 'D' || colour == 'C') {
            this.colour = Character.toUpperCase(colour);
        } else this.colour = 'S';
        //ensures everything within 1-11 is added +1
        if(value > 0 && value < 13){
            this.value = value+1;
        }else{
            this.value = 0;
        }
    }

    public char getColour(){
        return colour;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        switch (value){
            case 0 -> string.append("Ace of ");
            case 11 -> string.append("Jack of ");
            case 12 -> string.append("Queen of ");
            case 13 -> string.append("King of ");
            default -> string.append(value).append(" of ");
        }
        switch (colour){
            case 'S' -> string.append("Spades");
            case 'H' -> string.append("Hearts");
            case 'D' -> string.append("Diamonds");
            case 'C' -> string.append("Clubs");
        }
        return string.toString().trim();
    }
}
