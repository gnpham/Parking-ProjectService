package model.bean;

public class CarParking {
	private String owner_name;
	private String parking_id;
	private String parking_name;
	private String area_name;
	private int empty_slot;
	private String open_time;
	private String close_time;
	private double longtitude;
	private double latitude;
	private String parking_type_name;
	private String address;
 

	public CarParking() {
	}


	public CarParking(String owner_name, String parking_id, String parking_name, String area_name, int empty_slot,
			String open_time, String close_time, double longtitude, double latitude, String parking_type_name,
			String address) {
		super();
		this.owner_name = owner_name;
		this.parking_id = parking_id;
		this.parking_name = parking_name;
		this.area_name = area_name;
		this.empty_slot = empty_slot;
		this.open_time = open_time;
		this.close_time = close_time;
		this.longtitude = longtitude;
		this.latitude = latitude;
		this.parking_type_name = parking_type_name;
		this.address = address;
	}


	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}


	public String getParking_id() {
		return parking_id;
	}


	public void setParking_id(String parking_id) {
		this.parking_id = parking_id;
	}


	public String getParking_name() {
		return parking_name;
	}


	public void setParking_name(String parking_name) {
		this.parking_name = parking_name;
	}


	public String getArea_name() {
		return area_name;
	}


	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}


	public int getEmpty_slot() {
		return empty_slot;
	}


	public void setEmpty_slot(int empty_slot) {
		this.empty_slot = empty_slot;
	}


	public String getOpen_time() {
		return open_time;
	}


	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}


	public String getClose_time() {
		return close_time;
	}


	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}


	public double getLongtitude() {
		return longtitude;
	}


	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public String getParking_type_name() {
		return parking_type_name;
	}


	public void setParking_type_name(String parking_type_name) {
		this.parking_type_name = parking_type_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

}