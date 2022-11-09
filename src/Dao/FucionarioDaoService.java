package Dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import model.Funcionario;
import model.Pessoa;

public class FucionarioDaoService implements FuncionarioDao{
	List<Funcionario>lista=new ArrayList<>();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public void save(Pessoa pessoa) {
		
		Funcionario f=new Funcionario();
		Pessoa p=new Pessoa();
		int num=(int)(Math.random()*100);
		
		
		p.setNome(pessoa.getNome());
		p.setAniversario(pessoa.getAniversario());
		p.setIdade(pessoa.getIdade());
		p.setCargo(pessoa.getCargo());
		
		
		
		if(p.getCargo()=="serviço") {
			f.setCracha(num);
			f.setSalario(1400.00);
			f.setFeriasMensais(116);
			f.setPessoa(p);
			
			lista.add(f);
			System.out.println("\n Funcionario guardado com sucesso\n");
			
			
			
		}else if(p.getCargo()=="administrativo") {
			f.setCracha(num);
			f.setSalario(2600.00);
			f.setFeriasMensais(216);
			f.setPessoa(p);
			
			lista.add(f);
			System.out.println("\n Funcionario guardado com sucesso\n");
			
			
		}else if(p.getCargo()=="gerente") {
			f.setCracha(num);
			f.setSalario(4500.00);
			f.setFeriasMensais(375);
			f.setPessoa(p);
			
			lista.add(f);
			System.out.println("\n Funcionario guardado com sucesso\n");
			
			
		}
		
		
	}

	@Override
	public void buscar() {
		for(int i=0;i<lista.size();i++) {
				System.out.println("NOME : "+lista.get(i).getPessoa().getNome());
				System.out.println("NUMERO DO CRACHA :"+lista.get(i).getCracha());
			}
		}
	

	@Override
	public void funcionario(int num) {
		int i;
		for( i=0;i<lista.size();i++) {
			if(lista.get(i).getCracha()==num) {
				System.out.println("**************************");
				System.out.println("Funcionario :"+lista.get(i).getPessoa().getNome());
				System.out.println("Idade :"+lista.get(i).getPessoa().getIdade());
				System.out.println("Funçao :"+lista.get(i).getPessoa().getCargo());
				System.out.println("aniversario :"+sdf.format(lista.get(i).getPessoa().getAniversario()));
				System.out.println("Salario: "+lista.get(i).getSalario());
				System.out.println("Valor de ferias por mes: "+lista.get(i).getFeriasMensais());
				System.out.println("**************************");
			}
				
			}
		
		
	}

	@Override
	public void listar() {
		for(int i=0;i<lista.size();i++) {
			System.out.println("******************************");
			System.out.println("FUNCIONARIO Nº DO CRACHA :"+lista.get(i).getCracha());
			System.out.println("Nome :"+lista.get(i).getPessoa().getNome());
			System.out.println("Idade :"+lista.get(i).getPessoa().getIdade());
			System.out.println("Funçao :"+lista.get(i).getPessoa().getCargo()+"\n");
			System.out.println("*******************************");
			
		}
		
		
	}

}
