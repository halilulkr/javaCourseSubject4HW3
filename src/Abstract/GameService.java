package Abstract;

import Entities.Campaign;
import Entities.Client;
import Entities.Game;

public interface GameService {

	void discountInfo(Game game);
	void purchase(Game game);
	void giveBack(Game game);
}
