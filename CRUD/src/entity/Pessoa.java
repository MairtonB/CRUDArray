package entity;

public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idade;
	private String cargo;
	private Double salario;

	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, Integer idade,String cargo,Double salario) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade +  ", cargo="+ cargo + ", salario="+ salario +"]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}

	

