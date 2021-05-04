package Concrete;

import Abstract.SalesService;

public class SalesManager implements SalesService{

	@Override
	public void sellGame(Player player, Game game, Campaign campaign) {
		System.out.println(
				player.getFirstName() +" "+player.getLastName() +" adl� oyuncu, "+
						game.getName()+" adl� oyunu "+game.getDiscountedPrice(campaign)+ " TL kar��l���nda sat�n ald�.");
	}

	@Override
	public void retunOfGameSale(Player player, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
