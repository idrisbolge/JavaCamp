package Concrete;

import Abstract.SalesService;

public class SalesManager implements SalesService{

	@Override
	public void sellGame(Player player, Game game, Campaign campaign) {
		System.out.println(
				player.getFirstName() +" "+player.getLastName() +" adlý oyuncu, "+
						game.getName()+" adlý oyunu "+game.getDiscountedPrice(campaign)+ " TL karþýlýðýnda satýn aldý.");
	}

	@Override
	public void retunOfGameSale(Player player, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
