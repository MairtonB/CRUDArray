package controll;

import java.util.Scanner;

import entity.Pessoa;

public class ControlPessoaArray {

	private Pessoa[] pessoas;

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public Boolean vetorVazio() {
		if (this.pessoas.length == 0) { 
			System.out.println("Array Vazio!!!");
			return true;
		} else {
			return false;
		}

	}

	public void adicionarPessoaVazio(Integer n, Pessoa... p) {
		if (n == 0) {
			System.out.println("Adicao invalida!!!");
		} else {
			this.pessoas = new Pessoa[n];
			int i = 0;
			for (Pessoa x : p) {
				if (i > (this.pessoas.length - 1)) {
					throw new ArrayIndexOutOfBoundsException("Numero de registros excede o tamanho do Array!!!");
				} else {
					this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getIdade(),x.getCargo(),x.getSalario());
					i++;
				}
			} 
		}
	}

	public void adicionarPessoa(Integer n, Pessoa... p) {
		if (this.pessoas.length == 0) {
			System.out.println("Necessario criar o Array primeiro!!!");
		} else {
			int i = 0;
			while ((i < this.pessoas.length) && (this.pessoas[i] != null)) {
				i++;
			}
			if (i > (this.pessoas.length - 1)) {
				System.out.println("Array cheio!!!");
			} else {
				if ((this.pessoas.length - i) < n) {
					System.out.println("Numero de registros excede o tamanho do Array!!!");
				} else {
					for (Pessoa x : p) {
						this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getIdade(),x.getCargo(),x.getSalario());
						i++;
					}
				}
			}
		}
	}
	
//	public void adicionarUmaPessoa(Integer id, String nome, Integer idade,Integer tamanhoArray){ 
//		if (this.pessoas.length == 0) {
//			System.out.println("Necessario criar o Array primeiro!!!");
//		} else {
//			int i = 0;
//			while ((i < this.pessoas.length) && (this.pessoas[i] != null)) {
//				i++;
//			}
//			if (i > (this.pessoas.length - 1)) {
//				System.out.println("Array cheio!!!");
//			} else {
//				if ((this.pessoas.length - i) < n) {
//					System.out.println("Numero de registros excede o tamanho do Array!!!");
//				} else {
//					new Pessoa(id,nome,idade);
//					for (Pessoa x : p) {
//						this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getIdade());
//						i++;
//					}
//				}
//			}
//		}
//	}
	
	
	
	public void listarPessoa() {

		if (!vetorVazio()) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if (pessoas[i] != null) {
				System.out.println(i + " : " + pessoas[i]);
				} else {
				System.out.println(i + " : Espaco vazio");
				}
			}
		}
	}

	public void atualizarPessoa(Pessoa p) {
		int achado = 0;
		if (!vetorVazio()) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if ((this.pessoas[i] != null) && (this.pessoas[i].getId().equals(p.getId()))) {
					this.pessoas[i] = p;
					achado++;
				}
			}
		}
		if (achado == 0) {
			System.out.println("Pessoa nao encontrada!!!");
		}
	}
	
	// metodo que recebe pessoa e remove do array
	public void removerPessoa(Pessoa p) {
		int achado = 0;
		if (!vetorVazio()) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if ((this.pessoas[i] != null) && (this.pessoas[i].getId().equals(p.getId()))) {
					achado++;
					for (int j = i; j < this.pessoas.length; j++) {
						if (this.pessoas[j] != null)
						pessoas[j] = pessoas[j + 1];
					}
				}
			}
		}
		if (achado == 0) {
			System.out.println("Pessoa nao encontrada!!!");
		}
	}

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(01, "Mairton", 29,"analista",8000.0);
		Pessoa p2 = new Pessoa(02, "Deyvith", 30,"analista",8200.0);
		Pessoa p3 = new Pessoa(03, "Tony", 30,"analsita senior",10000.0);
		

		ControlPessoaArray cp = new ControlPessoaArray();
		// cp.adicionarPessoaVazio(10, p1, p2, p3);
		cp.adicionarPessoaVazio(10, p1, p2, p3);
//		cp.adicionarPessoa(2, p1, p2);
	// cp.removerPessoa(new Pessoa(12, null, null));
//	 cp.atualizarPessoa(new Pessoa(03, "Kenny", 22));
		
		
		Scanner in = new Scanner(System.in);
		int menu;
		
		
		boolean val = false;
		while(val == false) { // Enquanto "val"for "false" o while vai ficar fazendo loop, mas quando se tornar "true" ele vai parar
//            int opc = esc.menu();
//            val = esc.escolher(opc);
//			System.out.println("Digite 1 para cadastrar");
//			System.out.println("Digite 2 alterar cadastro");
//			System.out.println("Digite 3 para listar todos");
//			System.out.println("Digite 4 para deletetar pessoa");
			
			System.out.println("-----------------------------------------" + "\n" + 
	                 "BEM VINDO AO SISTEMA DE FUNCION??RIOS" + "\n" +
	                 "-----------------------------------------" + "\n" +
	                 "DIGITE A OP????O DESEJADA: " + "\n" +
	                 "[1] Para cadastrar funcion??rio" + "\n" + 
	                 "[2] Para alterar funcion??rio" + "\n" + 
	                 "[3] Para listar funcion??rios" + "\n" +
	                 "[4] Para deletar funcion??rio" + "\n" +
	                 "[5] Para SAIR" + "\n" +
	                 "-----------------------------------------");
			menu = Integer.parseInt(in.nextLine());
			
			switch(menu) {
			  case 1:
				 System.out.println("Digeite ID");
				 int id = Integer.parseInt(in.nextLine());
				 System.out.println("Digite o nome");
				 String nome = String.valueOf(in.nextLine());
				 System.out.println("Digeite idade");
				 int idade = Integer.parseInt(in.nextLine());
				 System.out.println("Digite o cargo");
				 String cargo = String.valueOf(in.nextLine());
				 System.out.println("Digeite salario");
				 Double sal = Double.parseDouble(in.nextLine());
				 
				 cp.adicionarPessoa(1, new Pessoa(id,nome,idade,cargo,sal));
				 cp.listarPessoa();
			    // code block
				 val = false;
				 break;
			  case 2:
				 System.out.println("Digeite ID");
				 int idUpdate = Integer.parseInt(in.nextLine());
				 System.out.println("Digite o nome");
				 String nomeUpdate = String.valueOf(in.nextLine());
				 System.out.println("Digeite idade");
				 int idadeUpdate = Integer.parseInt(in.nextLine());
				 System.out.println("Digite o cargo");
				 String cargoUpdate = String.valueOf(in.nextLine());
				 System.out.println("Digeite salario");
				 Double salUpdate = Double.parseDouble(in.nextLine());
				 
				 cp.atualizarPessoa(new Pessoa(idUpdate,nomeUpdate,idadeUpdate,cargoUpdate,salUpdate));
				 cp.listarPessoa();
			    // code block
				 val = false;
				break; 
			  case 3:			  
				  System.out.println("entrou em listar todos");
				  cp.listarPessoa();
				  val = false;
				  break;
			  case 4:
				  System.out.println("Digite id da Pessoa para deletar");
				  int idDelete = Integer.parseInt(in.nextLine());
				  cp.removerPessoa(new Pessoa(idDelete, null, null,null,null));
				  cp.listarPessoa();
			    // code block
				  val = false;
				  break;
			  case 5:
				  System.out.println("VOC?? SAIU!");
				  val = true;
				  break;
			  default:
			    // code block
			}
        }
		
		// aqui tem o menu inicial
		
	}
}