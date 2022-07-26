package exercicioFixacao2;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	// void pq não retorna nad
	// o metodo recebe o parametro porcentagem para utilazar na conta
	public void aumentarSalario(double porcentagem) {
	     salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	//toString cria uma representação string do objeto
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
		}
	
}
