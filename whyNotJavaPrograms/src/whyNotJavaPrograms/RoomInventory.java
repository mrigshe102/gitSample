package whyNotJavaPrograms;

import java.util.Date;

public class RoomInventory {
	String roomCode;
	Date startDate;
	Date endDate;
	int minGuests;
	int maxGuests;
	int price;
	String priceModel;
		
	public RoomInventory(String roomCode, Date startDate, Date endDate, int minGuests, int maxGuests, int price,
			String priceModel) {
		super();
		this.roomCode = roomCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.minGuests = minGuests;
		this.maxGuests = maxGuests;
		this.price = price;
		this.priceModel = priceModel;
	}
	public RoomInventory() {
		// TODO Auto-generated constructor stub
	}
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getMinGuests() {
		return minGuests;
	}
	public void setMinGuests(int minGuests) {
		this.minGuests = minGuests;
	}
	public int getMaxGuests() {
		return maxGuests;
	}
	public void setMaxGuests(int maxGuests) {
		this.maxGuests = maxGuests;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPriceModel() {
		return priceModel;
	}
	public void setPriceModel(String priceModel) {
		this.priceModel = priceModel;
	}

}
