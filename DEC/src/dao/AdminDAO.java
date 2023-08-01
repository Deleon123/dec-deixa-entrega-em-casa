package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;

public class AdminDAO {
	public Admin SelectAdmin (String usuario) throws SQLException {


		Admin u = new Admin();
		Conexao con = new Conexao();
		String sql = "SELECT * from admin "+
			"where usuario = '"+usuario+"';";
		ResultSet res = con.executaBusca(sql);
		res.next();
		u.setSenha(res.getString("senha"));
		u.setUsuario(res.getString("usuario"));
		return u;

}
}
