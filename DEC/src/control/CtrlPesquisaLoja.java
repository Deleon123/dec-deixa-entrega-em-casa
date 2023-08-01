package control;

import java.sql.SQLException;
import java.util.ArrayList;
import dao.*;
import model.*;

public class CtrlPesquisaLoja {
public ArrayList<Loja> PesquisaLoja(String
nome) throws SQLException {
LojaDAO uDAO = new LojaDAO();
ArrayList<Loja> listaLoja =
uDAO.ListarLoja(nome);
return listaLoja;
}
}
