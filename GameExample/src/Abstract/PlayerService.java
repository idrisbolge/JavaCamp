package Abstract;
import Concrete.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player player);
	void delete(Player player);
}
