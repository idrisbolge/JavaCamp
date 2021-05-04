package Abstract;

import Concrete.Campaign;
import Concrete.Game;
import Concrete.Player;

public interface SalesService {
	void sellGame(Player player,Game game, Campaign campaign);
	void retunOfGameSale(Player player,Game game, Campaign campaign);
}
