package Concrete;

import Abstract.EDevletService;

public class EdevletManager implements EDevletService{

	@Override
	public boolean checkValidation(Player player) {
		if(player.getIdentityNumber().length() == 11 )
			return true;
		return false;
	}

}
