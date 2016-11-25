/*
 * Author NguyenPham
 * */
package model.bo;

import model.dao.AccountDAO;

public class CheckLoginBO {

	AccountDAO TK_DAO = new AccountDAO();
	public boolean isValidUser(String username, String password) {
		
		return TK_DAO.isExistUser(username,password);
	}

}
