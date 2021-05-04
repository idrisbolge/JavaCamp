package Concrete;

import Abstract.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" oyunu ba�ar� ile eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" oyunu ba�ar� ile g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" oyunu ba�ar� ile silindi..");
		
	}

	
}
