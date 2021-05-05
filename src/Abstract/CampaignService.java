package Abstract;

import Entities.Campaign;

public interface CampaignService {

	void changeDiscountPercent(Campaign campaign);
	void changeStartTimeOfCampaign(Campaign campaign);
	void changeEndTimeOfCampaign(Campaign campaign);
}