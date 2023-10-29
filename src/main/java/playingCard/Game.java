package playingCard;

public class Game {
    private Card[] deck = new Card[52];

    public Game(){
        initiateGame();
    }

    public Card drawCard(){
        Card card = deck[0];
        for (int i = 0; i < deck.length; i++) {
            if(i != deck.length-1){
                deck[i] = deck[i+1];
            }else deck[i] = card;
        }
        return card;
    }

    private void initiateGame(){
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (deck.length/4); j++) {
                switch (i){
                    case 0 -> deck[counter] = new Card('S',j);
                    case 1 -> deck[counter] = new Card('H',j);
                    case 2 -> deck[counter] = new Card('D',j);
                    case 3 -> deck[counter] = new Card('C',j);
                }
                counter++;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (Card card: deck) {
            string.append(card).append("\n");
        }
        return string.toString().trim();
    }
}
