package api;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.bo.CheckLoginBO;

@Path("/account")
public class LoginAPI {
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_XML)
	public String getTaiKhoan(@FormParam("username") String username,
		      @FormParam("password") String password) {
		CheckLoginBO checkLoginBO = new CheckLoginBO();
		if (checkLoginBO.isValidUser(username, password))
			return "Dang nhap thanh cong !";
		return "Ten dang nhap hoac mat khau sai ! Moi nhap lai";
	}
}
