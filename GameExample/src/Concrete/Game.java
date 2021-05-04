package Concrete;

public class Game {
	private int id;
	private String name;
	private String description;
	private double price;
	private int campaignId ;
	private double discountedPrice;
	
	
	Campaign campaign;
	
	public Game() {

	}
	
	public Game(int id, String name, String description, double price, int campaignId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getDiscountedPrice(Campaign campaign) {
		return price-(price*campaign.getDiscountRate()/100);
	}
	
	
	
	
	
	
}
