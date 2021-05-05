package Abstract;

import Entities.Campaign;
import Entities.Client;
import Entities.Game;

public abstract class BaseGameManager implements GameService{

	Client client = new Client();
	Campaign campaign = new Campaign();
	Game game = new Game();
	
	@Override
	public void purchase(Game game) {
		if(18 <= client.getAge()) {
			System.out.println("Oyunu ba�ar�yla sat�n ald�n. Keyifli zamanlar ge�irmen dile�iyle");
		}else {
			System.out.println("Oyun sat�n alma i�lemi ba�ar�s�z oldu. (18 ya� s�n�r� uygulamas�)");
		}
		
	}
	
	@Override
	public void discountInfo(Game game) {
		System.out.println(client.getFirstName() + " sana g�zel haberlerimiz var. \n" + campaign.getStartTimeOfCampaign() + "-" +
	campaign.getEndTimeOfCampaign() + " tarihleri aras�nda " + game.getGameName() + " oyununa %" + campaign.getDiscountPercent() + "indirim var.");
		
	}
	
	@Override
	public void giveBack(Game game) {
		System.out.println("Oyun iade talebin al�nm��t�r. Oyunun fiyat� : " + game.getGamePrice() + "TL en k�sa s�rede �cret hesab�na yans�t�lacakt�r.");
		
	}
}
