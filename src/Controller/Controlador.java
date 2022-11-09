package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Dao.FucionarioDaoService;

import model.Pessoa;

public class Controlador {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = null;
		
		
		Pessoa p=new Pessoa();
		
		FucionarioDaoService fS=new FucionarioDaoService();
		Scanner inputNum=new Scanner(System.in);
		Scanner input =new Scanner(System.in);
		
		int opcion;
		String servico="serviço";
		String admi="administrativo";
		String geren="gerente";
		
		do {
			System.out.println("\n#####################################");
			System.out.println("1_CADASTRAR NUEVO FUNCIONARIO");
			System.out.println("2_ LISTAR POR NOMES E CRACHAS");
			System.out.println("3_INFORMACOES COMPLETA DO FUNCIONARIO");
			System.out.println("4_LISTAR TODOS OS FUNCIONARIOS");
			System.out.println("######################################\n");
			
			opcion=input.nextInt();
			
			switch (opcion) {
			
			case 1:
			System.out.println("Digite o primer sobrenome");
			String nome=input.next();
			
			System.out.println("Digite sua data de nacimento\n");
			String niver=input.next();
			
			
				
				try {
					d2 = sdf.parse(niver);
					
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			System.out.println("digite idade");
			int idade=inputNum.nextInt();
			
			System.out.println("\nDIGITE UMA OPÇAO DE FUNÇAO");
			System.out.println("1_ Serviços geral");
			System.out.println("2_adminitrativo");
			System.out.println("3_gerencia\n");
			opcion=inputNum.nextInt();
			
			if(opcion==1) {
				p.setCargo(servico);
			}else if(opcion==2) {
				p.setCargo(admi);
			}else if(opcion==3) {
				p.setCargo(geren);
			}
			
			p.setNome(nome);
			p.setIdade(idade);
			p.setAniversario(d2);
			
			
			
			fS.save(p);
			
			break;
			case 2:
				
				fS.buscar();
				
				break;
			
			case 3:
			
				System.out.println("digite o cracha");
				int num=input.nextInt();
				fS.funcionario(num);
			
			break;
			
			case 4:
				fS.listar();
				
				break;
			
			default:
				System.out.println("");
				
			}	
			
		}while(opcion !=0);
	}
		

}
