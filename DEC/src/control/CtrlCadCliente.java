package control;

import java.sql.SQLException;

import model.Cliente;
import dao.ClienteDAO;

public class CtrlCadCliente {
	public int InsereUsuario(String nome, int idade, String endereco, String usuario, String senha, boolean clientetrue) {
		
		Cliente u = new Cliente();

		u.setNome(nome);

		u.setIdade(idade);

		u.setEndereco(endereco);

		u.setUsuario(usuario);

		u.setSenha(senha);
		
		u.setClientetrue(clientetrue);
		
		ClienteDAO uDAO = new ClienteDAO();

		int res = uDAO.InsertCliente(u);

		return res;

}
	public Cliente PesquisaCliente(String usuario, boolean clientetrue) throws SQLException {
			
		
		ClienteDAO uDAO = new ClienteDAO();
			Cliente u = uDAO.SelectCliente(usuario, clientetrue);
			return u;
			}	


public int AlteraCliente(String usuario, int idade, String nome, String endereco, boolean clientetrue) {

	
	Cliente u = new Cliente();
	u.setClientetrue(clientetrue);
u.setNome(nome);
u.setUsuario(usuario);
u.setEndereco(endereco);
u.setIdade(idade);
ClienteDAO uDAO = new ClienteDAO();
int res = uDAO.UpdateCliente(u);
return res;
}

public int ResetSenhaCliente(String usuario, boolean clientetrue){
	Cliente u = new Cliente();
	u.setUsuario(usuario);
	u.setClientetrue(clientetrue);
	ClienteDAO uDAO = new ClienteDAO();
	int res = uDAO.UpdateSenhaCliente(u);
	return res;
}
public int ExcluiUsuario(String usuario, boolean clientetrue) {
ClienteDAO uDAO = new ClienteDAO();
Cliente u = new Cliente();
u.setUsuario(usuario);
u.setClientetrue(clientetrue);
int res = uDAO.deleteCliente(u);
return res;
}

}