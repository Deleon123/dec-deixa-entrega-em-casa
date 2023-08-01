package control;
import model.Admin;
import dao.AdminDAO;
import java.sql.SQLException;


public class CtrlCadAdmin {

	public Admin PesquisaAdmin(String usuario) throws SQLException {
			
		
		AdminDAO uDAO = new AdminDAO();
			Admin u = uDAO.SelectAdmin(usuario);
			return u;
			}	
}
