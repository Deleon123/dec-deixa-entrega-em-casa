package dao;
import model.Cliente;
import model.Loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO {

public ClienteDAO(){ };

public int InsertCliente(Cliente u){
	Conexao con = new Conexao();
	
	
	 if(u.isClientetrue()){
		 String sql = "INSERT into cliente(nome, idade, endereco, usuario, senha) "
		 + "values ( '"+ u.getNome()+"','"+ u.getIdade()+"','" + u.getEndereco()+ "','"+ u.getUsuario() + "','" + u.getSenha()+"')";
		 int res = con.executaSQL(sql);
		 return res;
	 } else {
		 String sql = "INSERT into entregador(nome, idade, endereco, usuario, senha) "
		+ "values ( '"+ u.getNome()+"','"+ u.getIdade()+"','" + u.getEndereco()+ "','"+ u.getUsuario() + "','" + u.getSenha()+"')";
		 int res = con.executaSQL(sql); 
		 return res;
	 }

}

public int alterCliente(Cliente u){
	Conexao con = new Conexao();

	 if(u.isClientetrue()){
		 String sql = "UPDATE cliente set nome = " +u.getNome()+ ", idade = "+ u.getIdade() + ", endereco = " + u.getEndereco()+ ", usuario = "+ u.getUsuario() + ", senha = " + u.getSenha()+" where usuario = " + u.getUsuario();
		 int res = con.executaSQL(sql);
		 return res;
	 } else {
		 String sql = "UPDATE entregador set nome = " +u.getNome()+ ", idade = "+ u.getIdade() + ", endereco = " + u.getEndereco()+ ", usuario = "+ u.getUsuario() + ", senha = " + u.getSenha()+" where usuario = " + u.getUsuario();
		 int res = con.executaSQL(sql); 
		 return res;
	 }

	
}

public int deleteCliente(Cliente u){
	Conexao con = new Conexao();

	 if(u.isClientetrue()){
		 String sql = "delete from cliente where usuario = '" +u.getUsuario()+"';";
		 int res = con.executaSQL(sql);
		 return res;
	 } else {
		 String sql = "delete from entregador where usuario = '" +u.getUsuario()+"';";
		 int res = con.executaSQL(sql); 
		 return res;
	 }

	
	
}

public Cliente SelectCliente (String id_usuario, boolean clientetrue) throws SQLException {


	if(clientetrue){
	Cliente u = new Cliente();
	Conexao con = new Conexao();
	String sql = "SELECT * from cliente "+
		"where usuario = '"+id_usuario+"';";
	ResultSet res = con.executaBusca(sql);
	res.next();
	u.setSenha(res.getString("senha"));
	u.setIdade(res.getInt("idade"));
	u.setNome(res.getString("nome"));
	u.setEndereco(res.getString("endereco"));
	u.setUsuario(res.getString("usuario"));
	return u;
	}
	else{
		Cliente u = new Cliente();
		Conexao con = new Conexao();
		String sql = "SELECT * from entregador "+
			"where usuario = '"+id_usuario+"';";
		ResultSet res = con.executaBusca(sql);
		res.next();
		u.setSenha(res.getString("senha"));
		u.setIdade(res.getInt("idade"));
		u.setNome(res.getString("nome"));
		u.setEndereco(res.getString("endereco"));
		u.setUsuario(res.getString("usuario"));
		return u;
	}


};

public int UpdateCliente (Cliente u) {
Conexao con = new Conexao();
if(u.isClientetrue()){
String sql = "UPDATE cliente set nome = '" +u.getNome()+"', idade ='"+u.getIdade()+"', endereco = '"+u.getEndereco()+"' where usuario ='"+u.getUsuario()+"';";
int res = con.executaSQL(sql);
return res;
}
else{
	String sql = "UPDATE entregador set nome = '" +u.getNome()+"', idade ='"+u.getIdade()+"', endereco = '"+u.getEndereco()+"' where usuario ='"+u.getUsuario()+"';";
			int res = con.executaSQL(sql);
			return res;
}
}


public int UpdateSenhaCliente (Cliente u) {
Conexao con = new Conexao();
if(u.isClientetrue()){
String sql = "UPDATE cliente set senha = '123' where usuario ='"+u.getUsuario()+"';";
int res = con.executaSQL(sql);
return res;
}
else{
	String sql = "UPDATE entregador set senha = '123' where usuario ='"+u.getUsuario()+"';";
	int res = con.executaSQL(sql);
	return res;
		}
}

public ArrayList<Cliente> ListarCliente(String nome, boolean eae) throws
SQLException{
Conexao con = new Conexao();
ArrayList<Cliente> listaUsuario = new ArrayList<>();

if(eae){
String sql = "SELECT * from cliente "+
"where UPPER(nome) LIKE UPPER('%"+ nome +"%');";
ResultSet res = con.executaBusca(sql);
while (res.next()) {
Cliente usuario = new Cliente();
usuario.setNome(res.getString("nome"));
usuario.setIdade(res.getInt("idade"));
usuario.setEndereco(res.getString("endereco"));
usuario.setUsuario(res.getString("usuario"));
usuario.setSenha(res.getString("senha"));

listaUsuario.add(usuario);
}
}
else{
	String sql = "SELECT * from entregador "+
			"where UPPER(nome) LIKE UPPER('%"+ nome +"%');";
	ResultSet res = con.executaBusca(sql);

	while (res.next()) {
		Cliente usuario = new Cliente();
		usuario.setNome(res.getString("nome"));
		usuario.setIdade(res.getInt("idade"));
		usuario.setEndereco(res.getString("endereco"));
		usuario.setUsuario(res.getString("usuario"));
		usuario.setSenha(res.getString("senha"));

		listaUsuario.add(usuario);

}


}
return listaUsuario;





}
}
