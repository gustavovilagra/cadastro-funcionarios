package Dao;

import java.util.List;
import java.util.Optional;

import model.Funcionario;
import model.Pessoa;

public interface FuncionarioDao {
	
	public void save(Pessoa pessoa);
	
	public void buscar();
	
	public void funcionario(int num);
	
	public void listar();
	
	
	

}
