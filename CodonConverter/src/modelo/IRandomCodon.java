package modelo;

import java.util.ArrayList;

public interface IRandomCodon {

	public boolean inserir(String px);

	public boolean alterar(String px);

	public boolean excluir(String px);

	public ArrayList<String> mostrar();
}
