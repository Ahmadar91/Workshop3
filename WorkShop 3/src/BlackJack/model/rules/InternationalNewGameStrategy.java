package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.Dealer;
import BlackJack.model.Player;
import BlackJack.model.Card;

class InternationalNewGameStrategy implements INewGameStrategy {

	public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
		for (int i = 0; i < 2; i++) {
			dealPlayer(a_deck, a_player);
			dealDealer(a_deck, a_dealer);
		}
		return true;
	}

	public void dealPlayer(Deck a_deck, Player a_player) {
		Card c = a_deck.GetCard();
		c.Show(true);
		a_player.DealCard(c);
	}

	public void dealDealer(Deck a_deck, Dealer a_dealer) {
		Card c = a_deck.GetCard();
		c.Show(true);
		a_dealer.DealCard(c);
	}
}