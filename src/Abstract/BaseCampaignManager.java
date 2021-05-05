package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void changeDiscountPercent(Campaign campaign) {
		System.out.println("�ndirim oran� de�i�tirilmi�tir.");
		
	}
	
	@Override
	public void changeStartTimeOfCampaign(Campaign campaign) {
		System.out.println("Kampanya ba�lang�� tarihi de�i�tirilmi�tir.");
		
	}

	@Override
	public void changeEndTimeOfCampaign(Campaign campaign) {
		System.out.println("Kampanya biti� tarihi de�i�tirilmi�tir.");
		
	}
}
