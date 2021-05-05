package Main;

import java.time.LocalDate;

import Abstract.BaseGameManager;
import Abstract.ClientCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.ClientManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Client;
import Entities.Game;

public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		game.setGameId(1);
		game.setGameName("Payday");
		game.setGamePrice(95.7);
		game.setGameGenre("Crime");
		
		Client client = new Client();
		client.setFirstName("Halil");
		client.setLastName("Ülker");
		client.setNationalityId("1234567");
		client.setYearOfBirth(1995);
		client.setPassword("asd123");
		
		Campaign campaign = new Campaign();
		campaign.setId(3);
		campaign.setDiscountPercent(35);
		campaign.setStartTimeOfCampaign(null);
		campaign.setEndTimeOfCampaign(null);
		
		
		GameManager gameManager = new GameManager();
		gameManager.purchase(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.changeDiscountPercent(campaign);
		
		MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
		ClientManager clientManager = new ClientManager(mernisServiceAdapter);
		clientManager.signUp(client);
		
		
	}

}
