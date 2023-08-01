package control;

import java.sql.SQLException;

import model.Cliente;
import model.Loja;
import dao.ClienteDAO;
import dao.LojaDAO;

public class CtrlCadLoja {
	public int InsereLoja(String nome, String cnpj, String endereco, String usuario, String senha, String razaosocial) {
		
		Loja l = new Loja();

		l.setNome(nome);

		l.setCnpj(cnpj);

		l.setEndereco(endereco);

		l.setUsuario(usuario);

		l.setSenha(senha);
		
		l.setRazaosocial(razaosocial);
		
		LojaDAO cDAO = new LojaDAO();

		int res = cDAO.InsertLoja(l);

		return res;

}


public Loja PesquisaLoja(String usuario) throws SQLException {
	
	
		LojaDAO uDAO = new LojaDAO();
		Loja u = uDAO.SelectLoja(usuario);
		return u;
		}

public int AlteraLoja(String usuario, String cnpj, String nome, String endereco, String razaosocial) {

	
	Loja u = new Loja();
	u.setCnpj(cnpj);
	u.setNome(nome);
	u.setUsuario(usuario);
	u.setEndereco(endereco);
	u.setRazaosocial(razaosocial);
LojaDAO uDAO = new LojaDAO();
int res = uDAO.UpdateLoja(u);
return res;
}

public int ResetSenhaLoja(String usuario){
	Loja u = new Loja();
	u.setUsuario(usuario);
	LojaDAO uDAO = new LojaDAO();
	int res = uDAO.UpdateSenhaLoja(u);
	return res;
}
public int ExcluiUsuario(String usuario) {
LojaDAO uDAO = new LojaDAO();
Loja u = new Loja();
u.setUsuario(usuario);
int res = uDAO.deleteLoja(u);
return res;
}

}