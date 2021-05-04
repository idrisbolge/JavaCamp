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
			System.out.println("Kullan�c� do�rulanamad�.");
	}

	@Override
	public void update(Player player) {
		if(eDevletService.checkValidation(player))
			System.out.println("\"Oyuncu g�ncellendi.\"");
		
		else 
			System.out.println("Kullan�c� do�rulanamad�.");
	
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi.");

	}

}
