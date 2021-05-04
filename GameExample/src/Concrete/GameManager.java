package Concrete;

import Abstract.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" oyunu baþarý ile eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" oyunu baþarý ile güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" oyunu baþarý ile silindi..");
		
	}

	
}
