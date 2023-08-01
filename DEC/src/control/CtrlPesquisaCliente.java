package control;
import dao.*;
import model.*;

import java.sql.SQLException;
import java.util.ArrayList;



	public class CtrlPesquisaCliente {
		
		
		public ArrayList<Cliente> PesquisaCliente(String nome, boolean eae) throws SQLException {
		ClienteDAO uDAO = new ClienteDAO();
		ArrayList<Cliente> listaCliente =
		uDAO.ListarCliente(nome,eae);
		return listaCliente;
		
		
		
		}
	}

