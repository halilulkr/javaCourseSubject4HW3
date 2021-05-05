package Entities;

import java.time.LocalDate;

import Abstract.CampaignService;
import Abstract.Entity;

public class Campaign implements Entity{

	private int id;
	private int discountPercent;
	private LocalDate startTimeOfCampaign;
	private LocalDate endTimeOfCampaign;
	
	public Campaign() {
		
	}

	public Campaign(int id, int discountPercent, LocalDate startTimeOfCampaign, LocalDate endTimeOfCampaign) {
		super();
		this.id = id;
		this.discountPercent = discountPercent;
		this.startTimeOfCampaign = startTimeOfCampaign;
		this.endTimeOfCampaign = endTimeOfCampaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public LocalDate getStartTimeOfCampaign() {
		return startTimeOfCampaign;
	}

	public void setStartTimeOfCampaign(LocalDate startTimeOfCampaign) {
		this.startTimeOfCampaign = startTimeOfCampaign;
	}

	public LocalDate getEndTimeOfCampaign() {
		return endTimeOfCampaign;
	}

	public void setEndTimeOfCampaign(LocalDate endTimeOfCampaign) {
		this.endTimeOfCampaign = endTimeOfCampaign;
	}
}