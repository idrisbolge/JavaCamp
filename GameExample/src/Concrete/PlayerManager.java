package Concrete;
import Abstract.EDevletService;
import Abstract.PlayerService;

public class PlayerManager implements PlayerService{

	
	EDevletService eDevletService;
	
	public PlayerManager(EDevletService eDevletService) {
		this.eDevletService = eDevletService;
	}
	
	
	@Override
	public void add(Player player) {
		
		if(eDevletService.checkValidation(player))
			System.out.println("Oyuncu eklendi.");
		
		else 
			System.out.println("Kullanýcý doðrulanamadý.");
	}

	@Override
	public void update(Player player) {
		if(eDevletService.checkValidation(player))
			System.out.println("\"Oyuncu güncellendi.\"");
		
		else 
			System.out.println("Kullanýcý doðrulanamadý.");
	
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi.");

	}

}
