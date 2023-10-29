import playingCard.Game;

public class Main {
    public static void main(String[] args) {
        Game cardGame = new Game();
        System.out.println(cardGame);
        System.out.println("""
                ---------------------------
                You drew the top card in the deck.
                The card was: '"""+
                cardGame.drawCard()+"""
                '
                ---------------------------""");
        System.out.println(cardGame);
    }
}
