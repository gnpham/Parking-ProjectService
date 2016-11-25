package model.bo;

import java.util.ArrayList;

import model.bean.CarParking;
import model.dao.CarParkingDAO;

public class CarParkingBO {
	CarParkingDAO CP_DAO = new CarParkingDAO();
	public ArrayList<CarParking> getListCP(){
		return CP_DAO.getListPK();
	}
	public static CarParking getCarParking(double longtitude, double latitude) {
		return null;
	}
}
