package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;
import model.Loja;

public class LojaDAO {

public LojaDAO(){ };


public int InsertLoja(Loja l){
	Conexao con = new Conexao();
	String sql = "INSERT into loja(nome, cnpj, endereco, usuario, senha, razao_social) "
			+ "values ( '"+ l.getNome()+"','"+ l.getCnpj()+"','" + l.getEndereco()+ "','"+ l.getUsuario() + "','" + l.getSenha()+"','"+ l.getRazaosocial()+"')";
	int res = con.executaSQL(sql);
	return res;
}
public Loja SelectLoja (String id_usuario) throws SQLException {


	Loja u = new Loja();
	Conexao con = new Conexao();
	String sql = "SELECT * from loja "+
		"where usuario = '"+id_usuario+"';";
	ResultSet res = con.executaBusca(sql);
	res.next();
	u.setSenha(res.getString("senha"));
	u.setCnpj(res.getString("cnpj"));
	u.setNome(res.getString("nome"));
	u.setEndereco(res.getString("endereco"));
	u.setUsuario(res.getString("usuario"));
	u.setRazaosocial(res.getString("razao_social"));
	
	return u;
	}

public int UpdateLoja (Loja u) {
Conexao con = new Conexao();
String sql = "UPDATE loja set nome = '" +u.getNome()+"', cnpj ='"+u.getCnpj()+"'+', razao_social ='"+u.getRazaosocial()+"', endereco = '"+u.getEndereco()+"' where usuario ='"+u.getUsuario()+"';";
int res = con.executaSQL(sql);
return res;
}
public int UpdateSenhaLoja (Loja u) {
Conexao con = new Conexao();
String sql = "UPDATE loja set senha = '123' where usuario ='"+u.getUsuario()+"';";
int res = con.executaSQL(sql);
return res;
}

public int deleteLoja(Loja u){
	Conexao con = new Conexao();

	String sql = "delete from loja where usuario = '" +u.getUsuario()+"';";
	 int res = con.executaSQL(sql);
	 return res;
}

public ArrayList<Loja> ListarLoja(String nome) throws
SQLException{
Conexao con = new Conexao();
ArrayList<Loja> listaLoja = new ArrayList<>();
String sql = "SELECT * from loja "+
"where UPPER(nome) LIKE UPPER('%"+ nome +"%');";
ResultSet res = con.executaBusca(sql);
while (res.next()) {
Loja loja = new Loja();
loja.setCnpj(res.getString("cnpj"));
loja.setNome(res.getString("nome"));
loja.setEndereco(res.getString("endereco"));
loja.setUsuario(res.getString("usuario"));
loja.setSenha(res.getString("senha"));
loja.setRazaosocial(res.getString("razao_social"));
listaLoja.add(loja);
}
return listaLoja;


}

}