package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.CarParking;


public class CarParkingDAO {
	public Connection con;

	// Ket noi co so du lieu
	public CarParkingDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://mariadb49368-carparking.jelastic.tsukaeru.net/parking_project", "root", "SOKcsd75872");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_project", "root", "");
			System.out.println("Connect success !");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found !" + e);
		} catch (SQLException e) {
			System.out.println("Connect fail !" + e);
		}
	}

	// Lay danh sach nha xe
	public ArrayList<CarParking> getListPK() {
		try{
			Statement st = con.createStatement();			
			String sql = "SELECT po.name, p.parking_id, p.parking_name, a.area_name, p.open_time, "
					+ "p.close_time, p.empty_slots, p.longtitude, p.latitude, pt.parking_type_name, "
					+ "p.address, (6371*acos(cos(radians(16.074235))*cos(radians(p.latitude))*cos(radians(p.longtitude)"
					+ "-radians(108.151851))+sin(radians(16.074235))*sin(radians(p.latitude)))) "
					+ "AS distance from parking as p INNER JOIN parkingowners AS po "
					+ "ON p.owner_id = po.owner_id INNER JOIN area AS a "
					+ "ON p.area_id = a.area_id INNER JOIN parkingtype AS pt "
					+ "ON p.parking_type_id = pt.parking_type_id HAVING distance < 1 ORDER BY distance";
			ResultSet rs = st.executeQuery(sql);
			ArrayList<CarParking> result = new ArrayList<CarParking>();
			CarParking pk;
			while(rs.next())
			{
				pk = new CarParking();
				pk.setOwner_name(rs.getString(1));
				pk.setParking_id(rs.getString(2));
				pk.setParking_name(rs.getString(3));
				pk.setArea_name(rs.getString(4));
				pk.setOpen_time(rs.getString(5));
				pk.setClose_time(rs.getString(6));
				pk.setEmpty_slot(rs.getInt(7));
				pk.setLongtitude(rs.getDouble(8));
				pk.setLatitude(rs.getDouble(9));
				pk.setParking_type_name(rs.getString(10));
				pk.setAddress(rs.getString(11));
				result.add(pk);
			}
			return result;
		}catch(SQLException e){
			System.out.println("Select list pk error !"+e);			
		}
		return null;
	}

}
