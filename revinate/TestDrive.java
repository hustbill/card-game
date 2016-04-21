import java.util.List;

public class TestDrive{
    
    public static void main(String[] args) {
         Deck deck = new Deck();
         Card card = deck.drawFromDeck();
         int i = 52;

         System.out.println(card.toString());   
        
    }
}