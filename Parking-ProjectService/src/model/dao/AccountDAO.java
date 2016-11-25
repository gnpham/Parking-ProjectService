package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AccountDAO {
	private Connection con;

	// Ket noi co so du lieu
	public AccountDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://mariadb49368-carparking.jelastic.tsukaeru.net/parking_project", "root", "SOKcsd75872");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_project", "root", "");
			System.out.println("Connect success !");
		} catch (ClassNotFoundException e) {
			System.out.println("Can not found" + e);
		} catch (SQLException e) {
			System.out.println("Coonect fail !");
		}
	}

	public boolean isExistUser(String username, String password) {
		try {
			Statement st = con.createStatement();
			String sql = "select * from account where account_name = '" + username + "' and password = '" + password
					+ "'";
			
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Select error !" + e);
		}
		return false;

	}
}
