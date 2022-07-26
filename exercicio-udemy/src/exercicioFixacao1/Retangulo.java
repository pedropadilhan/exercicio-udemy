package exercicioFixacao1;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
		}
}