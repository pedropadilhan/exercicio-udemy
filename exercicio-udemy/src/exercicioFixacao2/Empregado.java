package exercicioFixacao2;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	// void pq n�o retorna nad
	// o metodo recebe o parametro porcentagem para utilazar na conta
	public void aumentarSalario(double porcentagem) {
	     salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	//toString cria uma representa��o string do objeto que pode ser chamado na main economizando espaço de codigo
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
		}
	
}
