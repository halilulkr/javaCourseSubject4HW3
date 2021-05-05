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
			System.out.println("Oyunu baþarýyla satýn aldýn. Keyifli zamanlar geçirmen dileðiyle");
		}else {
			System.out.println("Oyun satýn alma iþlemi baþarýsýz oldu. (18 yaþ sýnýrý uygulamasý)");
		}
		
	}
	
	@Override
	public void discountInfo(Game game) {
		System.out.println(client.getFirstName() + " sana güzel haberlerimiz var. \n" + campaign.getStartTimeOfCampaign() + "-" +
	campaign.getEndTimeOfCampaign() + " tarihleri arasýnda " + game.getGameName() + " oyununa %" + campaign.getDiscountPercent() + "indirim var.");
		
	}
	
	@Override
	public void giveBack(Game game) {
		System.out.println("Oyun iade talebin alýnmýþtýr. Oyunun fiyatý : " + game.getGamePrice() + "TL en kýsa sürede ücret hesabýna yansýtýlacaktýr.");
		
	}
}
