package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void changeDiscountPercent(Campaign campaign) {
		System.out.println("Ýndirim oraný deðiþtirilmiþtir.");
		
	}
	
	@Override
	public void changeStartTimeOfCampaign(Campaign campaign) {
		System.out.println("Kampanya baþlangýç tarihi deðiþtirilmiþtir.");
		
	}

	@Override
	public void changeEndTimeOfCampaign(Campaign campaign) {
		System.out.println("Kampanya bitiþ tarihi deðiþtirilmiþtir.");
		
	}
}
