package Concrete;

import Abstract.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "adl� kampanya olu�turuldu.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ "adl� kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ "adl� kampanya silindi.");
		
	}

}
