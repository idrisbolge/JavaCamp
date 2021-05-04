import Concrete.Campaign;
import Concrete.CampaignManager;
import Concrete.EdevletManager;
import Concrete.Game;
import Concrete.GameManager;
import Concrete.Player;
import Concrete.PlayerManager;
import Concrete.SalesManager;

public class Main {

	public static void main(String[] args) {
		
		PlayerManager playerManager = new PlayerManager(new EdevletManager());
		Player player = new Player(1,"Ýdris","Bölge","12345678910","1998");
		
		playerManager.add(player);
		
		GameManager gameManager = new GameManager();
		Game game = new Game(1,"Oyun 1","Oyunun açýklamasý",15,1);
		
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1,"Kampanya 1 ",50);
		
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sellGame(player, game, campaign);
		
		
	}

}
